package org.lessons.java;

import org.lessons.java.pojo.Cane;

public class Main {

	public static void main(String[] args) {
		
		Cane c1 = new Cane("Cane");
		
		System.out.println(c1);
		c1.verso();
		c1.mangia();
		
	}

}
