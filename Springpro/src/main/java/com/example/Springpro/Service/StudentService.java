package com.example.Springpro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springpro.Entity.student;
import com.example.Springpro.Repository.StudentRepo;

@Service
public class StudentService {

@Autowired

private StudentRepo studentRepo;

   public student saveDetails (student student){

        return studentRepo.save(student);
   }


}
