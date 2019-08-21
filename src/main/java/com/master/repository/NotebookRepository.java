package com.master.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.master.entities.Notebook;

@Repository
public interface NotebookRepository extends JpaRepository<Notebook, Integer>{
	
	@Query("SELECT * FROM NOTEBOOK")
	Collection<Notebook> findAllNotebooks();
	
	@Modifying
	@Transactional
	@Query("DELETE FROM NOTEBOOK b WHERE idnotebook =: id")
	boolean deleteNotebookById(@Param("id") Integer id);
	
	@Modifying
	@Transactional
	@Query("INSERT INTO NOTEBOOK (description, idnotebook, idstudent, name) VALUES "
			+ "(:description, :idnotebook, :idstudent, :name)")
	boolean addNewNotebook(@Param("description") String description, @Param("idnotebook") Integer idnotebook, @Param("idstudent") Integer idstudent,
					   @Param("name") String name);
	
	@Query("SELECT * FROM NOTEBOOK s WHERE s.idstudent =: id")
	 Collection<Notebook> findAllNotebooks_idStudent();

	
	
}
