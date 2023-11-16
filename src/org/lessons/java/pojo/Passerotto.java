package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.IVolante;

public class Passerotto extends Animale implements IVolante{

	public Passerotto(String name) {
		super(name);
		
	}
	

	@Override
	public void verso() {
		System.out.println("Cip-Cip");
		
	}

	@Override
	public void mangia() {
		System.out.println("Semini");
		
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}

	@Override
	public void vola() {
		System.out.println(super.getName() + " Sta volando");
	}

}
