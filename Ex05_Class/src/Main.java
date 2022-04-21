import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		//��ü���� ���α׷��� OOP(Object Oriented Programming)
		//��ü ���ַ� ���α׷����� �Ѵ�.
		//��ü: ��(�ʵ� = �������)�� ���(�޼ҵ� = �Լ�)�� ���� ��
		//��ü�� �ڷ����� class��� �θ�
		//�ڹٿ����� Ŭ������ ��ɺ��� 2000�� �� ���� ����� ����
		//�� 2000�� ���� Ŭ������ Java System API��� ��
		//�̷� ��ü���� �ʿ��� �� �������ҿ� �� �ҷ��� ����ϴ� ���� �߿�

		//������ ���� ���ϴ� ����� �� ���� �� ������...
		//����� ���� Ŭ����(�ڷ���)
//		class Robot{
//			void move() {
//				//...
//			}
//			
//			void attack() {
//				//...
//			}
//		}
//		
//		Robot r1 = new Robot();
		
		
		//class �ۼ��� ������ ��ġ
		// 1. ������ .java ���Ͽ� �����
		// 2. �ϳ��� .java �ȿ� ���� ���� class ����
		// 3. � class �ȿ� �� �ٸ� class�� ����
		// 4. �޼ҵ� �ȿ� class ����
		// + 5. �͸� Ŭ����

		//1. ������ ������ ����� - Second.java ���Ͽ� Second Ŭ���� ����
		//�ٸ� �����̾ ���� ���� �ȿ� ������ �˾� ��´�.
		//������ ������ ���� Ŭ���� �� public�� Ŭ������ �ݵ�� ���ϸ�� Ŭ�������� ���ƾ߸� ��
		//�ϳ��� .java �ȿ����� public Ŭ������ �ϳ��� ���� �� �ִ�.
		Second second = new Second();
		
		second.a = 10; //�ʵ忡 �� ����
		second.show(); //�޼ҵ� ȣ��
		
		
		//2. �ϳ��� ���� �ȿ� ���� ���� class ���� - Second.java ���Ͽ� Second2 class ����
		//�ϳ��� .java �ȿ����� public Ŭ������ �ϳ��� ���� �� �ִ�.
		//�ٸ� Ŭ�������� public ���� �����ؾ� �� 
		//���ϸ��� ��� Ŭ������ ���ƾ� �ϴ��� �����Ϸ��� �˾ƾ� �ؼ�
		
		//main �Լ��� �ٸ� ��Ű���� �ִ� .java ���ϵ��� ��ǥ public class �ϳ��� �� Ŭ������ �ʿ��� ���� Ŭ������ ���� ������ �ǰڱ�? 
		//�ٸ� ��Ű���� ������ public���� ������ �� �����ϱ� public ���� Ŭ�������� ������ �ٸ� ��Ű������ ����� ���� ����. 
		
		
		//3. class �ȿ� class ����
		//Inner class
		//�̳�Ŭ������ �ܺο��� �ν��� ������ ���� ����� �� ����
		//Outer class, ������ ��� Second ��ü���� SecondInner ��ü�� ������ �� ����. - ���� 3���� ������ �Ұ�
		//bin\Second$SecondInner.class

//		new Second.SecondInner();
		
		
		//4. �޼ҵ� �ȿ� class ���� - Second.java ������ Second class�� show() �ȿ� SecondLocal class ����
		//���� Ŭ����(Local class) Ȥ�� ���� Ŭ����
		//���������� ���������� ����(�߰�ȣ) �������� �νĵ�
		//����Ŭ������ �ۿ��� �ƿ� �ν����� ���� ����.
		//bin\Second$1SecondLocal.class

//		new Second.;//
		
		
		//5. �͸� Ŭ����
		//��ü ������ �ϸ鼭 �߰�ȣ�� ���� Ŭ������ �ӽ� ������ �� �ִµ� 
		//���������δ� �� Ŭ������ ��ӹ��� subŬ������ ����� ��.
		
		//bin\Main$1.class
		Second2 sec2 = new Second2() {
			void show() {
				System.out.println("anonymous class1");
			}
		};
		sec2.show();
		
		//bin\Main$2.class
		Second2 sec3 = new Second2() {
			void show() {
				System.out.println("anonymous class2");
			}
		};
		sec3.show();
		
	}
}
