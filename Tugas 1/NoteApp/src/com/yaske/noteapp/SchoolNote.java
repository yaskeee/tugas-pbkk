package com.yaske.noteapp;

public class SchoolNote implements Notes {
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
		return assignment;
	}

	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}

	public SchoolNote(Assignments myAssignment) {
		super();
		this.myAssignment = myAssignment;
	}

	@Override
	public void getDailyNote() {
		// TODO Auto-generated method stub
		System.out.println("Tugas PBKK");
		
	}

	public Assignments getMyAssignment() {
		return myAssignment;
	}

	public void setMyAssignment(Assignments myAssignment) {
		this.myAssignment = myAssignment;
	}
	
	
	

}
