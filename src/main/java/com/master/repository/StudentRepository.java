package com.master.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.master.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	@Query("SELECT * FROM STUDENT")
	 Collection<Student> findAllStudents();
	
	@Modifying
	@Transactional
	@Query("DELETE FROM STUDENT b WHERE idstudent =: id")
	 boolean deleteStudentById(@Param("id") Integer id);
	
	@Modifying
	@Transactional
	@Query("INSERT INTO STUDENT (address, idstudent, jmbg, name, phonenumber, surname) VALUES "
			+ "(:address, :idstudent, :jmbg, :name, :phonenumber, :surname)")
	 boolean addNewStudent(@Param("address") String address, @Param("idstudent") Integer idstudent, @Param("jmbg") String jmbg,
						@Param("name") String name, @Param("phonenumber") String phonenumber, @Param("surname") String surname);
	
	@Query("SELECT * FROM STUDENT s WHERE s.idstudent =: id")
	 Student findStudentById(@Param("id") Integer id);
	
}
