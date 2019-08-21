package com.master.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.master.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	@Modifying
	@Transactional
	@Query("DELETE FROM BOOK b WHERE idbook =: id")
	boolean deleteBookByid(@Param("id") Integer id);
	
	@Modifying
	@Transactional
	@Query("INSERT INTO BOOK (author, description, idbook, idprofessoor, idstudent, name, publisher) VALUES "
			+ "(:author, :description, :idbook, :idprofessoor, :idstudent, :name, :publisher)")
	boolean insertBook(@Param("author") String author, @Param("description") String description, @Param("idbook") Integer idbook,
					   @Param("idprofessoor") Integer idprofessoor, @Param("idstudent") Integer idstudent, @Param("name") String name, 
					   @Param("publisher") String publisher);
	
	@Query("SELECT * FROM Book")
	Collection<Book> findAllBooks();
	
	@Query("SELECT * FROM BOOK s WHERE s.idstudent =: id")
	 Collection<Book> findAllBooks_idStudent(@Param("id") Integer id);	
	
	@Query("SELECT * FROM BOOK s WHERE s.idprofessoor =: id")
	 Collection<Book> findAllBooks_idProfessor(@Param("id") Integer id);	

}
