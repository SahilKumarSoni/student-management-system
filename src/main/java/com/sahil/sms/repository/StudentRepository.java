package com.sahil.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sahil.sms.entity.Student;

//@Repository --> here it is not necessary because JpaRepository has Repository annotation in SimpleRepository class
public interface StudentRepository extends JpaRepository<Student, Long>{

}
