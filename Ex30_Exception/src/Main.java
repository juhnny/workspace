import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//�ڹ� ���α׷����� �ǵ����� ���� ��Ȳ�� ���� ��
		//1. ���� Error: �������� �Ұ�
		//2. ���� Exception: ���� ��(Run Time) ������ �߻�
		
		//��ǥ���� Exception ���
		//1. ����ڰ� �߸��� �����͸� �Է��ϴ� ���: ���� �Է� ��Ȳ�� ���ڸ� �Է�
		//2. �����ڰ� �����̳� ����� �߸��� ���: �迭�� �ε�����ȣ ����, 0���� �������ϴ� ���
		//3. ��Ʈ��ũ�� �ϵ���� ����(�ϵ��ũ�� �������� ����, Ư�� ����Ʈ�� ���� ����): URL �̽�, ���� �ҷ�
		//4. �������� ��ŷ�� ���� ����(�𵵽� ����)
		
		System.out.println("����ó���� ���� �˾ƺ��ô�.");
		//������ �������� �ȵ����� ���ܴ� ������ ������ ������ �߻�
		//���� �߻� �������� �������� Ȯ���� �� �ִ�.
		//���ܰ� �߻��ϸ� ���α׷��� �ű⼭ �ٿ�Ǵ� ����

		//����ó���� ���ܴ� �߻������� �׷� ���� �ٿ���� �ʵ��� �ϴ� ����
		//���ܰ� �߻��ص� �� ���� ��ɹ����� ����Ǵ� ���� Ȯ���� �� �ִ�.
		
		System.out.println(123);
//		int; //error. �������� �Ұ�. � �ڵ嵵 ������ ����
		System.out.println(10/2);
//		System.out.println(10/0); //���� �߻�. �ڹٿ��� 0 �������� �Ұ�. double ���꿡���� ����(Infinity)
		
		//if���� ����ϸ� ���� ��Ȳ�� ���ذ� ���� �ִ�. �̰͵� ������ ���� ó��.
		int a = 10;
		if(a != 0) System.out.println(a/2);
		//������ � ��Ȳ���� if������ �˻��� �� ���� ��찡 �ִ�. ��) ���̹��� ���� �ٿ�
		//�̷� ��� ����ó������ ����. ���α׷����� �ʼ� ����
		
		//try-catch
		//if-else�� ���
		
		//0 ������ ����
		int n = 0;
		
		try {
			System.out.println("10 / n = "+10/n); //���� �߻� ���ɼ��� �ִ� �ڵ�
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�."); //���ܰ� �߻��ϸ� ����� �ڵ�. �� �ڵ� ��ü���� �߿��� �� �� ���� ��ɵ��� ������ ����ȴٴ� ���̴�. 
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		//�迭�� �ε��� ��ȣ ����
		int[] arr = new int[] {10, 20, 30};
		int id = 3;
//		System.out.println(arr[id]); //���� �߻�

		try { 
			System.out.println(arr[id]); 
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		};
		
		//null ���� ����
		String s = null;
		try {
			System.out.println(s);
		} catch(NullPointerException e) {
			System.out.println(e);
		}
		
		//�߸��� ������ �Է�
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");

		try {
			num = scan.nextInt(); //try ��� ����.
								// ���� ����ڰ� 'A' ���� �߸��� �����͸� ������?
			System.out.println("num: "+num);
		} catch(InputMismatchException e) {
			System.out.println("������ �Է� ����");
//			System.out.println(num); //�����Ⱚ�� num�� �����ϹǷ� ����
		}
		
		//����! �� ������... try�� �ȿ��� scan �Է��� �޾Ƽ� catch�� �ȿ��� �װ��� ����Ϸ� �ϸ� num�� ���� �����Ⱚ�̹Ƿ� ������ �߻��� ���̴�.
		//catch�� �ȿ��� try�� ���п� ������ �޴� ������ ���� �ʴ� �� ����. �׷� ������� try�� �ȿ� ������.
		
		//5. ���ڷ� �ٲ� �� ���� �����͸� ���ڷ� �ٲٰ��� �� ��
		String s2;
//		s2 = scan.next(); //scan �޾Ҵٰ� ġ��
//		s2 = "123";
		s2 = "12a";
		
		try { 
			int numb = Integer.parseInt(s2);
			System.out.println(numb + 100);
		} catch(NumberFormatException e) {
			System.out.println("���� ��� ���ڿ��� �Է� ����");
		}
		
		//Try������ �߻��� �� �ִ� ���ܰ� �ϳ��� �ƴ� ���
		//��) �� ���� �Է¹޾� �������� �ϴ� ���α׷�
		
		int num1, num2;
		try {
			num1 = scan.nextInt(); //InputMismatchException�� �߻��� ���� �ְ�
			num2 = scan.nextInt();
			System.out.println(num1 / num2); //ArithmaticException�� �߻��� ���� �ִµ�
		} catch(InputMismatchException e) { //catch �� �� �ִ� ���� ��Ȳ�� �ϳ� ���̸� �������� Ŀ���� �ȵȴ�.
			System.out.println("������ �Է� ����"); 
		}
		
		//�̷� �� try-catch���� ��ø���� �� ���� ������.. �ʹ� ������
		try {
			
			try {
				
			}catch(ArithmeticException e) {
				
			}
		}catch(InputMismatchException e) {
			
		}
		
		//������ ���� catch(multiple catch)�� �����ϴ�.
		try {
			
		} catch(InputMismatchException e) {
			//���� ó��1
		} catch(ArithmeticException e) {
			//���� ó��2
		}
		
		//������ ���� catch�������� catch �� ���๮�� ���� ����� �ϴµ�..
		//���� �׷� �� ���� �Ѱ��� ������� ó���� �Ŷ��.. ��� ���� Ŭ�������� �θ��� Exception Ŭ������ ��ĳ���� �Ѵ�.
		
		try {
			
		} catch(Exception e) { 
			
		}
		
		//�� �� �Ϻ� ��츸 �ٸ��� ó���ϰ� ������..
		
		try {
			
		} catch(ArithmeticException e) { 
			
		} catch(Exception e) {
			
		} //catch(InputMismatchException e) { 
			//Exception���� catch�� �ڿ� �ٸ� ���� Ŭ������ ����ϸ� Unreachable catch block ���� 
		//}
		
		
		//���� ���� �߻����ο� ��� ���� ������ �ؾ� �� ���� �ִٸ�?
		//��) �޸� ����, �ܺ�(����, ����)���� ������ �����ؾ� �ϴ� ���
		//finally
		try {
			System.out.println(10/0);
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally�� ������ ����");
		}
		
		//�׷� �׳� try-catch �ڿ� ���๮ ���� �Ŷ� ���� �޶�?
		//�ڵ� �ؼ��� ����
		//try-catch�� ���õ� ������� ������������ �� �� �ִ�. try�� �� �ϰ� �ƴ����� ������ �� �ִ�.
		//�׷��� finally�� ���ִ� ���� ��ȣ�ȴ�.
		
		//��� ���� �߻� �� ������ �ൿ�� �� �ϴ� ��쵵 ����. 
		//catch���� �Ķ���ͱ����� �� ��� �ϱ� ������ ������.. 
		//�� �� finally�� ���� ������ �� �ִ�.
		try {
			
		} finally {
			
		}
		
		
		//Exception Ŭ�������� ũ�� ���� �� ������ ����
		//1. Checked Exception
		//���������� ����ó���� �ϵ��� �����ϴ� ���. �� �ϸ� error�� ���� ���ִ�.(throw �޼ҵ� ����)
		//��Ʈ��ũ�� ��������¿� ���õ� ���ܵ�
//		URL url = new URL("http://www.google.com"); //�и� ���� �����ϰ�, ���Ŀ� �´� �ּ�����..
													//Unhandled exception type MalformedURLException - �߸��� �ּҸ� ���� ��쿡 ���� ���ܰ� �ٷ����� �ʾҴ�.
													//try-catch�� ������ throw�� �߰������ �Ѵ�.
		try {
			URL url = new URL("http://www.google.com"); //����� �� ����
//			URL url2 = new URL("www.google.com");	//�߸��� ����
			
			System.out.println("�������� �ּ�");
		} catch (Exception e) {
			System.out.println("�߸��� �ּ�");
		}		
		
		//2. Unchecked Exception
		//����ó���� �ٷ����� �ʾƵ� ���� ��ü�� ������ ���� ���ܵ�. 
//		ArithmeticException
//		NullPointerException
//		InputMismatchException
//		NumberFormatException
		
		
		
		System.out.println("\n���α׷� ����"); //����ó���� �� �ƴٸ� �� ������ ���� ���̴�. ���α׷��� �ٿ��Ű�� �ʴ� ���� ����ó���� ����!
		
	}
}
