package com.master.crud;

public class SubjectCrud {

	public /*List<Subject>*/ void getAllSubjects(){
		return;
	}

	public Boolean addNewSubject(int id){ //id should be from professor or student. Who ever is adding new Subject
		return true;
	}
	
	public Boolean deleteSubject(int subjectId){
		return true;
	}
	
	public Boolean makeSubjectPublic(int subjectId, int professorId){
		return true;
	}
	
	public /*List<Students>*/ void getStudentsfromSubject(int subjectId) {
		return;
	}
	
	public /*Professor*/ void getProfessorfromSubject(int subjectId) {
		return;
	}

	public /*List<Subject>*/ void findAllPublicSubjects() {
		return;
	}
	
	
}
