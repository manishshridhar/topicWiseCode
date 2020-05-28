package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList<>();

		l.add("abcd");
		l.add("Pune");
		l.add("623");
		l.add("Mumbai");
		l.add("10");
		
		System.out.println("Count of Strings containing Digits only are: " +listOf_NumberOnlyString(l));
		System.out.println("Count of Strings containing small Alphabets only are: "+listOf_AlphabaetsOnlyString(l));
	}

	static int listOf_NumberOnlyString(List<String> lst) {
		
		
		//lst.stream().filter(Task1::isStringContainsDigitOnly).forEach(System.out::println);
		return (int) lst.stream().filter(Task1::isStringContainsDigitsOnly).count();
		
		
		
	}
	
	static int listOf_AlphabaetsOnlyString(List<String> lst) {
		
		
		//lst.stream().filter(Task1::isStringContainsAlphabetsOnly).forEach(System.out::println);
		
		return (int) lst.stream().filter(Task1::isStringContainsAlphabetsOnly).count();
		
	}
	
	static boolean isStringContainsDigitsOnly(String target) {	
		Pattern p = Pattern.compile("[^0-9]");
		Matcher m = p.matcher(target);
		
		return !m.find();
		
	}
	
	
	static boolean isStringContainsAlphabetsOnly(String target) {	
		Pattern p = Pattern.compile("[^a-z]");
		Matcher m = p.matcher(target);
		boolean k = m.find();
		return !k;
		
	}
}
