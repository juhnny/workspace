import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class Main2 {

	public static void main(String[] args) {
		
		//throws
		//���� ���ѱ�� ����. ��ź ������ ���� ����
		
		//�Ʒ� �۾��� �Լ��� ���� �Ѵٰ� �غ���.
		int x = 10/2;
		System.out.println(x);
		
		//�� ���� ���޹޾� ������� �����ϴ� �޼ҵ�
		//0 ������ ���ܰ� �߻��� ���� ����ȴ�. ������ �ƹ� ���� ó���� ���� �޼ҵ� 
//		x = devide(10, 0);//���ܰ� ����Ǵ� �ڵ� 
		
		//�޼ҵ� �ȿ��� ���� ó���� �غ���
		//���ܸ� try-catch �غ��Ƶ� ���� ��Ȳ���� ���� return�� �� ������ ���� �� ���� ��찡 �ִ�.
		x = devideWithTryCatch(10, 0); 
		
		//�޼ҵ忡�� ���ܸ� throw�� ó��
		//�޼ҵ忡�� ���� ����ó�� ���� ���� �������� ���� ��ü�� ������ ��
		try {
			x = devideWithThrows(10, 0); 
		} catch(Exception e) {
			System.out.println("�޼ҵ尡 ���� Exception ��ü�� ���⼭ �޾� ó��");
		}
		
		//throws�� �� �Ѱ��� Exception�� ������ Checked Exception�� ���ٸ� ... 
		//�ʼ������� ����ó���� �ؾ� ��.
		try {
			aaa();
		}catch(MalformedURLException e) {
			e.printStackTrace(); //�츮�� ���� ���� ���� �߻� ���� ���
		}
		
		//�̷� �͵� �����ϴ�. ������ ������ ~
		try {
			bbb();
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		//throws�� Exception ��ü�� �����ϴ� �޼ҵ带 ����� ���� Checked Exception�� ���޵� �� Unchecked Exception�� ���޵� �� �� �� �����Ƿ� 
		//�ݵ�� �޾Ƽ� ����ó���� ����� �Ѵ�.
		x = devideWithThrows(10, 2); //���� ���� ���
//		x = devideWithThrowsAll(10, 2); //�Ȱ��� ������ ������ Exception�� ��ȯ�ϹǷ� �ݵ�� ����ó�� �ʿ�
		
		try {
			x = devideWithThrowsAll(10, 2); 
			System.out.println(x);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\n���α׷� ����");
	}///main()
	
	
	static int devide(int a, int b) {
			return a/b;			
	}
	
	static int devideWithTryCatch(int a, int b) {
		try {
			return a/b;			
		} catch (Exception e) {
//			return ??? //void �޼ҵ尡 �ƴϴϱ� return�� �ϱ� �ؾ߰ڴµ� �� ���������� �ָ�... 
			return 0; //�ӽ� ����
		}
	}
	
	//�޼ҵ忡�� ���� ����ó�� ���� ���� �׳� �������� ���� ��ü�� ������~ 
	//���ǹ����� �߻��ϴ� Exception�� ������ �� �ִ� Exception�� throw�ؾ� �Ѵ�.
	//ArithmeticException�� �߻��ߴµ� MalformedURLException�� throw�ϸ� �ȵȴ�.
	static int devideWithThrows(int a, int b) throws ArithmeticException { 
		return a/b;			
	}
	
	//Checked Exception�� ���ѱ�� �޼ҵ�
	static void aaa() throws MalformedURLException{
		URL url= new URL("www.daum.net");
	}
	
	//���Ѱ��� ���ܸ� �ٽ� ���ѱ��
	static void bbb() throws MalformedURLException{
		aaa();
		System.out.println("bbb");
	}
	
	//���Ѱ��� ���ܸ� �ٽ� ���ѱ��
	static int devideWithThrowsAll(int a, int b) throws Exception { 
		return a/b;			
	}

	
}
