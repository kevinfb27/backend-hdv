package com.example.Springpro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springpro.Entity.student;

public interface StudentRepo extends JpaRepository<student,Integer>{

}
