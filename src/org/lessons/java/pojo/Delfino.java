package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.INuotante;

public class Delfino extends Animale implements INuotante {

	public Delfino(String name) {
		super(name);
	
	}

	@Override
	public void verso() {
		System.out.println("Squek-Squek");
		
	}

	@Override
	public void mangia() {
		System.out.println("Pesce");
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}

	@Override
	public void nuota() {
		System.out.println(super.getName() + "Sta nuotando!");
	}

}
