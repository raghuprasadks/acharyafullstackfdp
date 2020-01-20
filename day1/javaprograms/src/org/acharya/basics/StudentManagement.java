package org.acharya.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentManagement {

	static ArrayList<Student> studList = null;
	public static void main(String[] args) {
		studList = new ArrayList<Student>(); 
		Student raghu = new Student("Raghu","8",100,450);
		studList.add(raghu);
		
		Student ranga = new Student("Ranga","8",101,480);
		studList.add(ranga);
		Student rashmi = new Student("Rashmi","8",102,500);
		studList.add(rashmi);
		/**
		Iterator itr = al.iterator();		
		while(itr.hasNext())
		{
			String name = (String) itr.next();
			System.out.println("Elements in the list are " +name);
		}
		*/
		int max = 0;
		for (int i=0; i<studList.size();i++) {
			Student stud = studList.get(i);
			int marks = stud.marks;
			if (marks > max)
				max = marks;
			System.out.println("Student " +stud.name);
			
		}		
		System.out.println("Maximum marks " +max);
	}

}
