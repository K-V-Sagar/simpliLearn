package packageB;

import packageA.publicClassA;

public class publicClassB {
	public static void main(String[] args) {
		System.out.println("Package B -> Public Class");
		
		//below throws error as default class scope is within package
		//defaultClassA obj3 = new defaultClassA();
		
		publicClassA obj3 = new publicClassA();
		obj3.displayPublic();
		}

}
