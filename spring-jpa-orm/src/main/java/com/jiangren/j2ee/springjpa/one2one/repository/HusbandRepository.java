package com.jiangren.j2ee.springjpa.one2one.repository;

import com.jiangren.j2ee.springjpa.one2one.model.Husband;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HusbandRepository extends JpaRepository<Husband, Integer>{
}
