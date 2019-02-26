package com.lin;

public class Family {
	protected String name;
	protected int age;
	private float weight;
	private float height;

	public Family(String name, int age) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;

	}

	public void print() {
		System.out.print(name + "\t" + age + "\t" + weight + "\t" + height);
	}

	public void setWeight() {
		if (weight >= 0) {
			this.weight = weight;
		}

	}

	public void setHeight() {
		if(height>=0) {
			this.height = height;
		}

	}
}
