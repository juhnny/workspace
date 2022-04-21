
public class Student extends Person{
	//name, age º¸À¯
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public Student() {
		super(); //»ý·« °¡´É
		this.major = ""; //null·Î ³öµÎ±â ½È¾î. ºó ¹®ÀÚ¿­ °´Ã¼ ÇÒ´ç
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println(major);
	}
	
}