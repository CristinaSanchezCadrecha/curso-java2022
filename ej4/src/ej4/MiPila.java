package ej4;

import java.util.ArrayList;
import java.util.Collections;

public class MiPila {

	public static void main(String[] args) {
		push();
		pop();
		peek();
		reverse();
	}

	static ArrayList<String> pila = new ArrayList<String>();

	public static void pop() {
		System.out.println("Pop:");
		String last =  pila.remove(pila.size() -1);
		System.out.println(last);
	}

	public static void push() {
		System.out.println("Push:");
		pila.add("Uno");
		pila.add("Dos");
		pila.add("Tres");
		pila.add("Cuatro");
		System.out.println(pila);
	}

	 static void peek() {
		System.out.println("Peek:");
		String last1 =  pila.get(pila.size() -1);
		System.out.println(last1);
	}
	
	 static void reverse() {
		 System.out.println("Reverse:");
		 for (int x = pila.size() -1; x >=0 ; x--) {
				String number = pila.get(x);
				System.out.println(number);
		}

	 }
	
}
