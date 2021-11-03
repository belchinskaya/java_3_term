
package ua.khpi.oop.belchynska04;

import java.util.Scanner;
/**
 * Ввести декілька рядків. Розбити на дві групи: рядки, довжина яких менша за середню; рядки, довжина яких не менше середньої. Вивести рядки та їх довжину по групах.
 * @author Kate Belchynska
 *
 */
public final class Main {



	
	private Main() {
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Find_string m = new Find_string();
		
		
		Menu menu = new Menu();
		

		int quantity = 4;
		
		StringBuilder str1 = new StringBuilder(m.string1);
		StringBuilder str2 = new StringBuilder(m.string2);
		StringBuilder str3 = new StringBuilder(m.string3);
		StringBuilder str4 = new StringBuilder(m.string4);
		
		int avarage_length = m.average_length(str1.length(), str2.length(), str3.length(), str4.length(), quantity);
		
		StringBuilder max_str[] = new StringBuilder[10];
		StringBuilder min_str[] = new StringBuilder[10];

	
		
		
		m.find_group(str1, avarage_length, 0, 0, min_str, max_str);
		m.find_group(str2, avarage_length, 1, 1, min_str, max_str);
		m.find_group(str3, avarage_length, 2, 2, min_str, max_str);
		m.find_group(str4, avarage_length, 3, 3, min_str, max_str);
		
		System.out.println("Strings whith length bigger than average");
		for(int i = 0; i < 4; i++) {
			if(max_str[i] != null) {
				System.out.println(max_str[i] + "; string length:" + max_str[i].length()  + "\n");
			}
			
		}
		System.out.println("Strings whith length smaller than average\n");
		for(int i = 0; i < 4; i++) {
			if(min_str[i] != null) {
			System.out.println(min_str[i] + "; string length:" + min_str[i].length() + "\n");
			}
		}
		
       
    }
}

class Find_string {
	public Object get_str_from_console;
	public String string1;
	public String string2;
	String string3;
	String string4;

	public void find_group(StringBuilder str, int average_length, int pos_min, int pos_max, StringBuilder min_str[], StringBuilder max_str[]) {

		
		if(str.length() < average_length) {
			get_string( str, pos_min, min_str);
		
		} 
		else { 
			get_string( str, pos_max, max_str);

		}
		
	}
	
	public StringBuilder[] get_string( StringBuilder str, int max_string_value, StringBuilder max_min_str[]) {
		max_min_str[max_string_value] = str;
		return max_min_str;
	}
	public int average_length(int l1, int l2, int l3, int l4, int quantity) {
		int average = (l1 + l2 + l3 + l4) / quantity;
		return average;
	}
	
	public  void get_str_from_console() {
		System.out.println("Print 4 strings for making task:");
		Scanner scanner = new Scanner(System.in);
		string1 = scanner.nextLine();
		string2 = scanner.nextLine();
		string3 = scanner.nextLine();
		string4 = scanner.nextLine();

	}
}

class Menu{
	Scanner scanner = new Scanner(System.in);
	Find_string m = new Find_string();
	
	
	public void menu(){

		System.out.println("Press:\n 1 - to input your data,\n 2 - to show your input data,\n 3 - to make the task,\n 4 - to stop the program");
	    
		int printed_num = scanner.nextInt();

	    switch (printed_num) {
	        case 1:
	        	m.get_str_from_console();
	            menu();
	            break;
	        case 2: 
	        	menu();
	            break;
	        case 3:
	        	menu();
	            break;
	        case 4:  
	        	
	            break;
	        default: System.out.println("\nYou enter incorrect number. Try one more time\n");
	            menu();
	    }
	}
    
	
	
}
