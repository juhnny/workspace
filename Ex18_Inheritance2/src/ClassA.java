
public class ClassA {

	private int a;
	
	void showA() {
		System.out.println("a: "+a);
	}
	
	public ClassA(int a) {
		this.a = a;
		System.out.println("ClassA(int a)");
	}
	
	public ClassA() {
		System.out.println("ClassA()");
	}
}
