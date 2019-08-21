package com.master.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.master.entities.Professor;
import com.master.entities.Student;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{

	@Query("SELECT * FROM PROFESSOR")
	 Collection<Professor> findAllProfessors();
	
	@Modifying
	@Transactional
	@Query("DELETE FROM PROFESSOR b WHERE idprofessoor =: id")
	 boolean deleteProfessorById(@Param("id") Integer id);
	
	@Modifying
	@Transactional
	@Query("INSERT INTO STUDENT (address, faculty, idprofessoor, name, professortitle, surname) VALUES "
			+ "(:address, :faculty, :idprofessoor, :name, :professortitle, :surname)")
	 boolean addNewProfessor(@Param("address") String address,  @Param("faculty") String faculty, @Param("idprofessoor") Integer idprofessoor,
						@Param("name") String name, @Param("professortitle") String professortitle, @Param("surname") String surname);
	
	@Query("SELECT * FROM PROFESSOR s WHERE s.idprofessoor =: id")
	 Student findProfessorById(@Param("id") Integer id);
	
}
