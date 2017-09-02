package com.jiangren.j2ee.springjpa.one2one;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import com.jiangren.j2ee.springjpa.one2one.model.Husband;
import com.jiangren.j2ee.springjpa.one2one.model.Wife;
import com.jiangren.j2ee.springjpa.one2one.repository.HusbandRepository;
import com.jiangren.j2ee.springjpa.one2one.repository.WifeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJpaOneToOneApplication implements CommandLineRunner{

	@Autowired
    WifeRepository wifeRepository;

    @Autowired
    HusbandRepository husbandRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaOneToOneApplication.class, args);
	}

	@Override
    public void run(String... arg0) throws Exception {
    	deleteData();
    	saveData();
    	showData();
    }

    @Transactional
    private void deleteData(){
    	wifeRepository.deleteAll();
        husbandRepository.deleteAll();
    }

    @Transactional
    private void saveData(){
    	// Store a wife to DB
        Wife lisa = new Wife("Lisa", new Husband("David"));
        wifeRepository.save(lisa);

        // Store list wifes to DB
        Wife mary = new Wife("Mary", new Husband("Peter"));
        Wife lauren = new Wife("Lauren", new Husband("Phillip"));

        wifeRepository.save(Arrays.asList(mary, lauren));
    }

    @Transactional
    private void showData(){
    	// get All data
    	List<Wife> wifes = wifeRepository.findAll();
        List<Husband> husbands = husbandRepository.findAll();

        System.out.println("===================Wifes:==================");
        wifes.forEach(System.out::println);

        System.out.println("===================Husbands:==================");
        husbands.forEach(System.out::println);
    }
}
