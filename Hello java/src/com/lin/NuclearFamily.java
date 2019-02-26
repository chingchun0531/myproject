package com.lin;

public class NuclearFamily extends Family {
	public NuclearFamily() {
		super("", 0,0,0);

	}

	public void main(String[] args) {
		Family fam = new Family("Jack",18, 65, 175);
		fam.setHeight(68);
		fam.setWeight(180);

	}

}
