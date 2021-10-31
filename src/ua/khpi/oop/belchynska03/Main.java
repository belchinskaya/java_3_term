package ua.khpi.oop.belchynska03;
/**
 * Ввести декілька рядків. Розбити на дві групи: рядки, довжина яких менша за середню; рядки, довжина яких не менше середньої. Вивести рядки та їх довжину по групах.
 * @author Kate Belchynska
 *
 */
public final class Main {
	/**
	 * Строки для викоання завдання
	 */
	private static final String STR1 = "Hello";
	private static final String STR2 = "my";
	private static final String STR3 = "dear";
	private static final String STR4 = "friend";
	

	


	
	private Main() {
		
	}
	public static void main(String[] args) {
		Find_string m = new Find_string();
		StringBuilder str1 = new StringBuilder(STR1);
		StringBuilder str2 = new StringBuilder(STR2);
		StringBuilder str3 = new StringBuilder(STR3);
		StringBuilder str4 = new StringBuilder(STR4);
		

		int quantity = 4;
		
		int avarage_length = m.average_length(str1.length(), str2.length(), str3.length(), str4.length(), quantity);
		
		StringBuilder max_str[] = new StringBuilder[10];
		StringBuilder min_str[] = new StringBuilder[10];
		int pos_min = 0;
		int pos_max = 0;
		
		m.find_group(str1, avarage_length, 0, 0, min_str, max_str);
		m.find_group(str2, avarage_length, 1, 1, min_str, max_str);
		m.find_group(str3, avarage_length, 2, 2, min_str, max_str);
		m.find_group(str4, avarage_length, 3, 3, min_str, max_str);
		
		System.out.println("Strings whith length bigger than average\n");
		for(int i = 0; i < 4; i++) {
			if(max_str[i] != null) {
				System.out.println(max_str[i] + "\n");
			}
			
		}
		System.out.println("Strings whith length smaller than average\n");
		for(int i = 0; i < 4; i++) {
			if(min_str[i] != null) {
			System.out.println(min_str[i] + "\n");
			}
		}
		
       
    }
}

class Find_string {
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
}
