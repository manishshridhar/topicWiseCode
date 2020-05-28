package rough;

public class Test {

	public static void main(String[] args) {
		
		String p = new String("Manish");
		System.out.println("Intern is: "+p.intern().hashCode());
		String s = "Manish";
		String e = s.toUpperCase();
		System.out.println(e);
		System.out.println(e.hashCode());
		System.out.println(s);
		
		//System.out.println(s.replace(s.substring(1,4), "0"));
		
		String k = "Manish";
		
		System.out.println(s.hashCode());
		System.out.println(k.hashCode());
		s = s.replace("a", "a");
		
		System.out.println(s.hashCode());
		System.out.println(k.hashCode());
		
		
		
		
		

	}

}
