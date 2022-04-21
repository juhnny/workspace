
public class Student extends Person{
	//name, age ����
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public Student() {
		super(); //���� ����
		this.major = ""; //null�� ���α� �Ⱦ�. �� ���ڿ� ��ü �Ҵ�
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println(major);
	}
	
}