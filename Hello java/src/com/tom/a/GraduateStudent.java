package com.tom.a;

import com.tom.Student;

public class GraduateStudent extends Student {
	public GraduateStudent() {
		super("", 0);
	}
	public void main(String[] args) {
		Student stu = new Student("Tom",90);
		stu.setScore(100);
	}

}
