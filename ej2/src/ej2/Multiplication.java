package ej2;

public class Multiplication {

	public static void main(String[] args) {
		
		int table ;
		int multiplier;
		
		for (table = 1; table <= 10; table++) {
			System.out.println("\n");
			for (multiplier = 1; multiplier <= 10; multiplier++) {
				int result = table * multiplier;
				System.out.println(table + " X " + multiplier + " = " +  result);
			}    
		}
	}

}
