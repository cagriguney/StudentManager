package oop22;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	public void add(Student newStudent) {
		
		for(Student student:students) {
			if(student.getIdentityNumber()==newStudent.getIdentityNumber()) {
				System.out.println("Ayni identity'ye sahip bir ogrenci daha olamaz.");
				return;
			}
			else {
				System.out.println("Ogrenci basariyla eklendi.");
			}
		}
		
		this.students.add(newStudent);
	}
	public void delete(int id) {
		int flag=0;
		Student willDeleted=new Student();
		for(Student student:students) {
			if(student.getId()==id) {
				willDeleted=student;
				flag=1;
				break;
			}
		}
		this.students.remove(willDeleted);
		if(flag==0) {
			System.out.println("ID'si "+id+" olan ogrenci bulunamadi.");
		}
		else {
			System.out.println("ID'si "+willDeleted.getId()+" olan ogrenci silinmistir.");
		}
		
	}
	public void update(Student willUpdate) {
		//int a=this.students.indexOf(students);
		//this.students.set(a, students);
		
		for(Student student:students) {
			if(student.getId()==willUpdate.getId()) {
				student=willUpdate;
			}
		}
		
		System.out.println(willUpdate.getId()+" numarali ogrenci bilgileri basariyla update edilmistir.");
		
	}
	public ArrayList<Student> getAll() {
		return this.students;
	}
	
}
