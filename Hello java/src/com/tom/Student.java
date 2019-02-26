package com.tom;

public class Student {
	protected String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public void print() {
		System.out.print(name + "\t" + score);
	}

	public void setScore(int score) {
		if (score <= 100 && score >= 0) {
			this.score = score;

		}
	}
}
