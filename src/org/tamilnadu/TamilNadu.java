package org.tamilnadu;

import org.kerala.Kerala;

public class TamilNadu extends Kerala {
	
	int a = 10, b = 20;
	
	
	public void tamilLanguage() {
		System.out.println("TamilLanguage");
		
	}
	private void tnpopulation() {
		System.out.println("\nTN Population: 10 Crores");
	}
		
	public static void main(String[] args) {
		
		TamilNadu tn = new TamilNadu();
		tn.tamilLanguage();
		tn.tnpopulation();
		System.out.println(tn.a);
		System.out.println(tn.b);
	
		
	}

}
