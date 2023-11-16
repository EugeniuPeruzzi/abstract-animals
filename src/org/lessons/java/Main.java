package org.lessons.java;

import org.lessons.java.pojo.Aquila;
import org.lessons.java.pojo.Cane;
import org.lessons.java.pojo.Delfino;
import org.lessons.java.pojo.Passerotto;
import org.lessons.java.pojo.abs.Animale;

public class Main {

	public static void main(String[] args) {
		
		Animale[] a = new Animale[4];
		
		
		Cane c1 = new Cane("Cane");
		Passerotto p1 = new Passerotto("Franco");
		Aquila usa1 = new Aquila("USA");
		Delfino d1 = new Delfino("Flipper");
		
		
		a[0]= c1;
		a[1] = p1;
		a[2] = usa1;
		a[3] = d1;
		
		for (int i=0; i<a.length; i++) {
			
			Animale z = a[i];
			
			System.out.println(z);
			z.verso();
			z.mangia();
			z.dormi();
			System.out.println("\n__________________");
		}
		
	}

}
