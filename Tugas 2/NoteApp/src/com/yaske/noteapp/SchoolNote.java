package com.yaske.noteapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("myAssignment")
public class SchoolNote implements Notes {
	@Autowired
	private Assignments myAssignment;
	
	private String subject;
	private String assignment;
	
	public SchoolNote() {
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAssignment() {
		return "Tugas PBKK 2!";
	}
	
	//@Autowired
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	
	//@Autowired
	public SchoolNote(Assignments myAssignment) {
		super();
		this.myAssignment = myAssignment;
	}

	@Override
	public String getDailyNote() {
		// TODO Auto-generated method stub
		
		return "Tugas PBKK 2";
		
	}

	public Assignments getMyAssignment() {
		return myAssignment;
	}
	//@Autowired
	public void setMyAssignment(Assignments myAssignment) {
		this.myAssignment = myAssignment;
	}
	
	
	

}
