package com.codingNinjas.codingNinjasApp;

public class PaidCourse implements Course{
	
	String courseName;
	Instructor courseInstructor;
	UserList userList;

	
	public PaidCourse(Instructor instructor,UserList userList) {
		this.courseInstructor = instructor;
		this.userList = userList;
	}
	
	@Override
	public void setCourseDetails(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public UserList getUserList() {
		return this.userList;
	}

	@Override
	public Instructor getInstructor() {
		return this.courseInstructor;
	}

	@Override
	public String getCourseName() {
		return this.courseName;
	}
	
}
