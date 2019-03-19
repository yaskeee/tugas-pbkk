package com.yaske.noteapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(NoteConfig.class);
		
		
		Notes note = context.getBean("schoolNote", Notes.class);
		note.getDailyNote();
//		
		System.out.println(((SchoolNote)note)
				.getMyAssignment().getAssignment());
		
		SchoolNote SNote = (SchoolNote)note;
		
		System.out.println("---------------");
		System.out.println("Subject: " + ((SchoolNote)note).getSubject());
		
		((SchoolNote)note).setSubject("Tugas XML");
		System.out.println("Assignment: " + ((SchoolNote)note).getSubject());

		
		context.close();
		
		
	}

}
