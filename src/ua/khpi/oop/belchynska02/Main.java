package ua.khpi.oop.belchynska02;

import java.util.Random;

public class Main {
	public int max_value(int num) {
		int max = 0;
	
		int temp;
		
		while (num != 0) {
			int num1 = num;
			temp = num1 % 10;
	    	if (temp > max) {
	    		  max = temp;
	    	} 
	    	num /= 10;
	    	
	     }
		return max;
	}
	public static void main(String[] args) {
		Main m = new Main();
		final Random random = new Random();
		for(int i = 0; i < 10; i++) {
			int temp = random.nextInt(256) + 100;
			int max = m.max_value(temp);

			System.out.println("-----\nMax value: " + max + ", number: " + temp);
			
		}
		
       
    }
}