package com.jiangren.j2ee.springjpa.one2many.repository;

import com.jiangren.j2ee.springjpa.one2many.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<Company, Integer>{
}
