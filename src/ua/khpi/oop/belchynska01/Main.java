package ua.khpi.oop.belchynska01;
public class Main {
	


	public static void main(String[] args) {
    
       long l = 0XA1321893L; /*Номер студентського квитка*/
       final long num = 380673352651L; /*Номер телефону*/
       final int binary = 110011; /*51 у двійковому літералі*/
       final int octal = 05133;  /*2651 у вісімковому літералі*/
       final int a = ((3 - 1) % 26) + 1;
       final char letter = 67;
       
       int odd = 0;
       int even = 0;
       
       
       int value = 0;
       
       for(long i = num; i > 0; i /= 10) {
    	   if (i % 2 == 0) {
    		   even++;
    	   } else {
    		   odd++;
    	   }
       }
       
       for(int i = binary; i > 0; i /= 10) {
    	   value++;
       }
    }
}