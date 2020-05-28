package thisAndSuperKeywordsInConstructor;

public class Parent {
	
	int rollNo;
	String name;
	
	public Parent() {
		System.out.println("Inside default Parent");
	}
	
	public Parent(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		System.out.println("Inside Parameter Parent");
	}

}
