package ej4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiPila {
	
	private List<String> pila = new ArrayList<String>();


	public String pop() {
		String last =  pila.remove(pila.size() -1);
		return last;
	}

	public void push(String e) {
		pila.add(e);
	}

	public String peek() {
		String last1 =  pila.get(pila.size() -1);
		return last1;
	}
	
	public void reverse() {
		 for (int x = pila.size() -1; x >=0 ; x--) {
				String number = pila.get(x);
				System.out.println(number);
		}

	 }
	
	public List<String> getList(){
		return pila;
	}

	
	
}
