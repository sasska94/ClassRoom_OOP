package com.master.service;

import org.springframework.stereotype.Service;

import com.master.entities.Student;
import com.master.repository.StudentRepository;

@Service
public class ClassroomServiceImpl implements ClassroomService {
	
	public static StudentRepository studentRepository = null;

	@Override
	public void save(Student s) {
		// TODO Auto-generated method stub
		try {
			studentRepository.addNewStudent(s.getAddress(), s.getIdstudent(), s.getJmbg(), s.getName(), s.getPhonenumber(), s.getSurname());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
