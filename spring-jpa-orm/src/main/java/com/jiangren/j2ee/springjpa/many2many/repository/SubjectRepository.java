package com.jiangren.j2ee.springjpa.many2many.repository;

import com.jiangren.j2ee.springjpa.many2many.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{
}
