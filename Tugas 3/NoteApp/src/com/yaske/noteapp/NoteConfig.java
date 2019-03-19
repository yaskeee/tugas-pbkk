package com.yaske.noteapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:note.properties")
public class NoteConfig {
	
	@Bean
	public Notes schoolNote() {
		SchoolNote mySchoolNote = new SchoolNote();
		
		return mySchoolNote;
	}
	
	@Bean
	public Assignments reminder() {
		return new Reminder();
	}
	@Bean
	public Notes schoolNote(Assignments myAssignment) {
		SchoolNote mySchoolNote = new SchoolNote(reminder());
		
		return mySchoolNote;
	}

}
