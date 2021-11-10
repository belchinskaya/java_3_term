
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
		
		
		
		Menu menu = new Menu();
		
	      menu.menu();
    }
}

class Find_string {
	
	
	public Object get_str_from_console;
	public String string1;
	public String string2;
	public String string3;
	public String string4;
	
	public StringBuilder str1;
	public StringBuilder str2;
	public StringBuilder str3;
	public StringBuilder str4;
	
	StringBuilder max_str[] = new StringBuilder[10];
	StringBuilder min_str[] = new StringBuilder[10];
	
	final int quantity = 4;
	public void print_group(){
		
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
		System.out.println("Print 4 strings for making task:\n");
		Scanner scanner = new Scanner(System.in);
		string1 = scanner.nextLine();
		string2 = scanner.nextLine();
		string3 = scanner.nextLine();
		string4 = scanner.nextLine();
		
		str1 = new StringBuilder(string1);
		str2 = new StringBuilder(string2);
		str3 = new StringBuilder(string3);
		str4 = new StringBuilder(string4);
		
	}
	
	/**
	 * вивід на екран введених коритсувачем даних
	 */
	public void show_strings() {
		System.out.println("You printed strings:\n" + str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n");
	}
}

class Menu{

	Find_string m = new Find_string();
	String command;
	int printed_num;
	
	
	
	public void menu(){
		
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press:\n 1 - to input your data,\n 2 - to show your input data,\n 3 - to make the task,\n 4 - to stop the program\n");
	    
		
		command = scanner.nextLine();
	
		
	    switch (command) {
	        case "1":
	        	m.get_str_from_console();
	            menu();
	            break;
	        case "2": 
	        	m.show_strings();
	        	menu();
	            break;
	        case "3":
	        	int average = m.average_length(m.str1.length(), m.str2.length(), m.str3.length(), m.str4.length(), m.quantity);
	        	m.find_group(m.str1, average, 0, 0, m.min_str, m.max_str);
	    		m.find_group(m.str2, average, 1, 1, m.min_str, m.max_str);
	    		m.find_group(m.str3, average, 2, 2, m.min_str, m.max_str);
	    		m.find_group(m.str4, average, 3, 3, m.min_str, m.max_str);
	    		m.print_group();
	        	menu();
	            break;
	        case "4":  
	            break;
	        case "-d":
	        	
	        	break;
	        	
	        case "-h":
	        	System.out.println("Автор: Катерина Бельчинська\n\nІндивідуальне завдання: Ввести декілька рядків.\n"
	        			+ "Розбити на дві групи: рядки, довжина яких менша за середню; рядки, довжина яких не менше середньої.\n"
	        			+ "Вивести рядки та їх довжину по групах.\n\n" + "В ході виконання даної програми взаємодія з програмним забезпеченням виконується через меню та обрані користувачем команди.\n\n");
	        	menu();
	        	break;
	        default: System.out.println("\nYou enter incorrect number. Try one more time\n");
	            menu();
	    }
	}
    
	
	
}
