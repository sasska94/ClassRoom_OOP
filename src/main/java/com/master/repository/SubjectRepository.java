package com.master.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.master.entities.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{
	
	 @Query("SELECT * FROM SUBJECT")
	 Collection<Subject> findAllSubjects();
	
	 @Modifying
	 @Transactional
	 @Query("DELETE FROM SUBJECT b WHERE idsubject =: id")
	 boolean deleteSubjectById(@Param("id") Integer id);
	 
	 @Modifying
	 @Transactional
	 @Query("INSERT INTO SUBJECT (description, idsubject, ispublic, subjectname) VALUES "
			+ "(:description, :idsubject, :ispublic, :subjectname)")
	 boolean insertBook(@Param("description") String description, @Param("idsubject") Integer idsubject, @Param("ispublic") Boolean ispublic,
						@Param("subjectname") String subjectname);
	 
	 @Modifying
	 @Query("UPDATE SUBJECT s SET s.ispublic = :ispublic where s.idsubject = :idsubject")
	 void updateUserSetStatusForName(@Param("ispublic") Boolean ispublic, @Param("idsubject") Integer idsubject);

	 @Query("SELECT * FROM SUBJECT s WHERE s.ispublic='true'")
	 Collection<Subject> findAllPublicSubjects();
	 
}
