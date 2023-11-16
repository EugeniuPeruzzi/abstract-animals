package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;

public class Delfino extends Animale {

	public Delfino(String name) {
		super(name);
	
	}

	@Override
	public void verso() {
		System.out.println("Squek-Squek");
		
	}

	@Override
	public void mangia() {
		System.out.println("Animali di piccola taglia, Roditori");
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}

}
