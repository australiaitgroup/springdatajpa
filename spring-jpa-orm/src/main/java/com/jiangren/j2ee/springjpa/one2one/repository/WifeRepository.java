package com.jiangren.j2ee.springjpa.one2one.repository;

import com.jiangren.j2ee.springjpa.one2one.model.Wife;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WifeRepository extends JpaRepository<Wife, Integer>{
}
