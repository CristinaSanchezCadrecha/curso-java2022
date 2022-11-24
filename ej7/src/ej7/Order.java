package ej7;


public class Order {

	public static void main(String[] args) {
		
		int[] a = new int[] {33, 19, 1, 7, 26, 100, -1, 5}; 
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int tmp = 0;
				if(a[i] > a[j]){
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
			System.out.println(a[i]);
		}	
	 }
}


	 
	 


