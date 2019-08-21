package com.master.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.master.entities.Student;
import com.master.service.ClassroomService;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {


	@Autowired
	ClassroomService classroomService;
	
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String ping() {
		return "Hello World we have pinged you!";
	}
	
	@RequestMapping(value = "/addNewStudent", method = RequestMethod.POST)
	public String addNewStudent(@ModelAttribute("student") Student student) {
		classroomService.save(student);
		return "New student has been added!";
	}
	
	@GetMapping("/index")                     // it will handle all request for /welcome
    public String SpringBootHello() {
        return "INDEX";           // welcome is view name. It will call welcome.jsp
    }
	 
}
