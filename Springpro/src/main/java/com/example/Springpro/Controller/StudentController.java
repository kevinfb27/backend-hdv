package main.java.com.example.Springpro.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Springpro.Entity.student;
import com.example.Springpro.Service.StudentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class StudentController {
    @Autowired 
    private StudentService studentService;
    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student Student){

        return StudentService.saveDetails(student);
    }
}
