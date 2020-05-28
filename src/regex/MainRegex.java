package regex;

import java.util.regex.*;

public class MainRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String target = "a7 b@ z#9";
		
		String seekingMatchFor1 = "[abc]";
		String seekingMatchFor2 = "[^abc]";
		String seekingMatchFor3 = "[a-z]";
		String seekingMatchFor4 = "[0-9]";
		String seekingMatchFor5 = "[a-zA-Z0-9]";
		String seekingMatchFor6 = "[^a-zA-Z0-9]";
		
		
		String seekingMatchFor7 = "\\d"; // Digits only
		String seekingMatchFor8 = "\\D"; // except Digits
		String seekingMatchFor9 = "\\w"; // only alphaNumerics characters
		String seekingMatchFor10 = "\\W"; // except alphaNumerics characters
		String seekingMatchFor11 = "\\s"; // only spaces
		String seekingMatchFor12 = "\\S"; // except spaces
		String seekingMatchFor13 = "."; // all characters
		
		// random inputs
		String r = "aa";
		String t = "aaa";
		
		r = "a+"; // Here we consider the sequence of 'a' as a single match i.e. atleast 1 'a' or more than one 'a' is considered as a single match
		t = "aaaa"; 
		t = "aaaba";

		Pattern p = Pattern.compile(r);
		Matcher m = p.matcher(t);
		
		while(m.find()) {
			System.out.println(m.start() + " -------- " + m.group());
		}
	}

}
