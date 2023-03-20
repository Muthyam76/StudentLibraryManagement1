package com.example.Student_Library_Management_System.Controllers;


import com.example.Student_Library_Management_System.DTOs.StudentUpdateMobRequestDto;
import com.example.Student_Library_Management_System.Models.Student;
import com.example.Student_Library_Management_System.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String createStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }


    @GetMapping("/getByMail")
    public String getNameByEmail(@RequestParam("email")String email){

        return studentService.findNameByEmail(email);
    }


    @PutMapping("/update_mob")
    public String updateMob(@RequestBody StudentUpdateMobRequestDto studentReqDto){
        return studentService.updateMobNo(studentReqDto);
    }


}
