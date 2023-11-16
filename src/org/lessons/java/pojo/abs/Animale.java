package org.lessons.java.pojo.abs;

public abstract class Animale {
	
	private String name;

	
	public Animale(String name) {
		setName(name);
	}
	
	public void dormi() {
		System.out.println("Zzzzz");
	}
	//ABSTRACTS
	public abstract void verso();
	public abstract void mangia();
	
	// GETTER & SETTERS
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + getName() ;
	}
	
}
