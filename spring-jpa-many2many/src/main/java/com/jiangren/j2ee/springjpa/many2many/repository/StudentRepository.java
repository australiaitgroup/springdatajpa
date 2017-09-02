package com.jiangren.j2ee.springjpa.many2many.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiangren.j2ee.springjpa.many2many.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
}
