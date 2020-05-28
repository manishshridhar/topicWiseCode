package regex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();

		l.add("abcd");
		l.add("Pune");
		l.add("623");
		l.add("Mumbai");
		l.add("10");

		Comparator<String> c = (s1, s2) -> s1.length() - s2.length();
		
		Collections.sort(l, c);
		
		System.out.println("Sorted list according to the lenght is: " + l);
		l.remove(0);
		l.remove(l.size() - 1);
		System.out.println("List with removed min and max lenght Strings: " + l);
	}

}
