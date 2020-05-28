package thisAndSuperKeywordsInConstructor;

public class Child extends Parent{
	
	

	public Child(int rollNo, String name, int age) {
		super(rollNo, name);
		this.age = age;
		System.out.println("Inside Parameter Child");
	}

	public Child() {
		this(23, "Manish", 37);
		System.out.println("Inside Default Child");
	}
	
	
	int age;
}
