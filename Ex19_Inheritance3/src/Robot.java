
public class Robot {

	void move() {
		System.out.println("move @Robot");
	}
}

//���� �ٸ� ���Ͽ� ������ public�� ���� �� ������ �����Ƽ�..
class RobotFly extends Robot {
	//���ο� ��� �߰�
	void fly() {
		System.out.println("fly @Robot");
	}
	
	//��ӹ��� �޼ҵ带 �����ؼ� ���(override)
	//�θ� �޼ҵ尡 �������� �� �ƴ϶� �� �� ���������� �ϳ��� ���̰� �Ǵ� ��. ���������� �������� ������ �Ͱ� ���
	//�̸��� �Ķ���Ͱ� ���ƾ� �������̵�
	//�̸��� �ٸ��� �׳� �ٸ� �޼ҵ�. �Ķ���Ͱ� �ٸ��� �����ε�(�θ��� �޼ҵ�� �ڽ��� �޼ҵ�� ������ �����ε������� �𸣰�����)�� ��
	void move() {
		System.out.println("move @RobotFly");
	}
	
	//��Ŭ������ �ڵ��ϼ������ ����� ���(move���� ġ�� �����̽� ����)
	//annotation�� ����� �ִ� �ּ�. �ּ��� ���� ��ɰ� �� �Ʒ� ����� ��ġ�ؾ� �Ѵ�.
//	@Override 
//	void move() {
//		// TODO Auto-generated method stub
//		super.move();   //�Ϲ������� �θ��� �޼ҵ�� �״�� ����ϰ� ����� �����̴� ��찡 ���Ƽ� �̷��� �����ϴ� ��
//						//�������̵� �� �θ��� �޼ҵ尡 ����� �� �ƴ϶�� ����
//	}
	
	void move(int a) {
		System.out.println("move(int a) @RobotFly");
	}
	
	
}