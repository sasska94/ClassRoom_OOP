package com.master.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.master.entities.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer>{
	
	@Query("SELECT * FROM NOTE")
	Collection<Note> findAllNotes();
	
	@Modifying
	@Transactional
	@Query("DELETE FROM NOTE b WHERE idnote =: id")
	boolean deleteNoteById(@Param("id") Integer id);
	
	@Modifying
	@Transactional
	@Query("INSERT INTO NOTE (idnote, idnotes, text) VALUES "
			+ "(:idnote, :idnotes, :text)")
	boolean addNewNote(@Param("idnote") Integer idnote, @Param("idnotes") Integer idnotebook, @Param("text") String text);
	

}
