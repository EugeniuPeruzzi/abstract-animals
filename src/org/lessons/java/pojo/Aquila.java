package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.IVolante;

public class Aquila extends Animale implements IVolante{

	public Aquila(String name) {
		super(name);
		
	}
	

	@Override
	public void verso() {
		System.out.println("What is a Kilometer");
		
	}

	@Override
	public void mangia() {
		System.out.println("Animali di piccola taglia, Roditori");
		
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
