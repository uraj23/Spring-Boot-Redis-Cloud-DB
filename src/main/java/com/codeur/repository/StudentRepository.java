package com.codeur.repository;

import org.springframework.data.repository.CrudRepository;

import com.codeur.entity.Student;

public interface StudentRepository  extends CrudRepository<Student, Integer>{

}
