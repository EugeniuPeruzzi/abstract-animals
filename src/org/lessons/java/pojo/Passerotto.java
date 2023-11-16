package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;

public class Passerotto extends Animale{

	public Passerotto(String name) {
		super(name);
		
	}

	@Override
	public void verso() {
		System.out.println("Cip-Cip");
		
	}

	@Override
	public void mangia() {
		System.out.println();
		
	}

}
