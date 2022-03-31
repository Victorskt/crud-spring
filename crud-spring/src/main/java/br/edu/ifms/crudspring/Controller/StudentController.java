package br.edu.ifms.crudspring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.crudspring.model.Student;
import br.edu.ifms.crudspring.services.StudentService;



@Controller
@RequestMapping("/student")
public class StudentController {
   
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String locAll(Model model){
        List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);
        return "index";
    
}
}