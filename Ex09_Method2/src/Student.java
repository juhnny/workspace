
public class Student {

	//Field (�������)
	String name;
	int kor;
	int eng;
	double aver;
	boolean grad;
//	int this; //this�� ���������� ��� �Ұ�
	
	//Method (����Լ�; ���)
	void show() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(aver);
		System.out.println(grad);
	}
	
	//�ʵ� ���� ���޹޾� �Է����ִ� �޼ҵ�
	//�Ķ������ �̸��� �����ϱ� ���� �޾Ƶ־� ������ ������ ���� ������ �� �ִ�.
	//�ٵ� �Ű������� �ʵ���� ��������?
	//��� Ŭ�������� ���� ������ �ʾƵ� �ڵ� ���ԵǴ� ��������� �ִ�. �װ��� this
	//this�� �� �ڽ��� Ŭ������ �ּҸ� ���� �ִ� ��������
	//this�� Ű������ ���� ������ �ƴ� �� int this��� ���������� �� ���� ���� �� ���� �����...�� �ٸ� ����.
	void setField(String name, int kor, int eng, boolean grad) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.aver = (double)(kor + eng)/2;
		this.grad = grad;
		
	}
	
	//�ʵ� �� name���� �����ϱ� ���� �޼ҵ�
	void setName(String name) {
		this.name = name;
	}
	
	//�ʵ� �� kor�� �����ϱ� ���� �޼ҵ�
	void setKor(int kor) {
		this.kor = kor;
		this.aver = (double)(kor + this.eng)/2; //�ش� ��������� �̿��ϴ� �ٸ� ��������鵵 ��������߰ڱ�..
	}
	
	//������ �ʵ� ���� �޼ҵ�� ����
	
	//���� ������ ��ȯ�ϴ� �޼ҵ�
	//�Ű������� �ʵ���� �������� �ʱ� ������ �ʵ带 ����Ű�� ���� this�� �� �ʿ䰡 ����.
	int getTotal() {
		return kor + eng;
	}
	
	//�ʵ� aver�� ���� �� ġ�� ���� ����� �����ִ� �޼ҵ�. getSum()�� Ȱ���غ���.
	double getAverage() {
		return (double)getTotal() / 2;
	}
	
	//�ʱ�ȭ�� ���� Ư���� �Լ�: ������
	
	
	
}
