package com.yaske.noteapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("appconfig.xml");
		
		
		Notes note = context.getBean("myAssignment", Notes.class);
		note.getDailyNote();
		
		System.out.println(((SchoolNote)note)
				.getMyAssignment().getAssignment());
		
		SchoolNote SNote = (SchoolNote)note;
		
		System.out.println("---------------");
		System.out.println("Sunject: " + ((SchoolNote)note).getSubject());
		
		((SchoolNote)note).setSubject("Tugas XML");
		System.out.println("Assignment: " + ((SchoolNote)note).getSubject());

		
		context.close();
		
		
	}

}
