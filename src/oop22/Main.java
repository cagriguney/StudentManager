package oop22;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student(1,"muzaffer","last",123);
		Student student2=new Student(2,"özgür","lastt",222);
		Student student3=new Student(3,"cagri","lasttt",345);
		StudentManager studentManager= new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		Student student4=new Student(4,"a","b",123);
		studentManager.add(student4);
		
		System.out.println(studentManager.getAll().size());
		
		for(Student students:studentManager.getAll()) {
			System.out.println(students.getIdentityNumber()+" "+students.getFirstName());
		}

		studentManager.delete(2);
		
		for(Student students:studentManager.getAll()) {
			System.out.println(students.getIdentityNumber()+" "+students.getFirstName());
		}
	
		studentManager.delete(11);
		
		for(Student students:studentManager.getAll()) {
			System.out.println(students.getIdentityNumber()+" "+students.getFirstName());
		}
	
		Student student5=new Student(3,"hakan","goktas",2144);
		studentManager.update(student5);
		
		for(Student students:studentManager.getAll()) {
			System.out.println(students.getIdentityNumber()+" "+students.getFirstName());
		}
	}

}
