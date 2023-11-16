package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;

public class Cane extends Animale{

	public Cane(String name) {
		super(name);
		
	}

	@Override
	public void verso() {
		System.out.println("Bau-Bau");
		
	}

	@Override
	public void mangia() {
		System.out.println("Crocchette, Carne, Ossa");
		
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}
