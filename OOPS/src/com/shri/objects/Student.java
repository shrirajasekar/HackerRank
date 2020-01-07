package com.shri.objects;

public class Student {

	private String id;
	private String name;
	private int marks;
	private float average;
	
	public Student(String id, String name, int marks, float average) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.average = average;
	}

	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", average=" + average + "]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public float getAverage() {
		return average;
	}


	public void setAverage(float average) {
		this.average = average;
	}
	
	
	
}
