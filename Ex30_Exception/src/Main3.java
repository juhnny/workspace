
public interface Main3 {
	public static void main(String[] args) {
		
		// throw : �ڵ带 ���ؼ� ������ ���ܸ� �ߵ�!! [ throws�� �ٸ� ]
		
		//������ ���ܰ� �ƴ����� ������ ���ܻ�Ȳ�̶�� ����� ������..
		try {
			System.out.println("aaa");
			//������ ���ܸ� ������ ������.. -��, catch������ �̵��ϰ� ������
			throw new Exception();
			
		}catch(Exception e) {
			System.out.println("���ܹ߻�!!");			
		}
		System.out.println();
		
		//[Ȱ�� ��]
		//�޼ҵ忡�� ����� ��û������.. ������ ����� ������ �ʾ�����..�Ҷ�
		//��, ���� ������ ������ "���ܻ�Ȳ"�̶�� �ν� ������...�Ҷ�!
		//java���� ������� ������� �ؼ� [����]��� �Ǵ����� ����.!
		int n;
		
		try {
			//n= aaa(10, 5);
			n= aaa(10, 15);
			System.out.println("n:"+n);
			
		}catch(Exception e) {
			System.out.println("������� ������ �ȵ�!");
			System.out.println(e.getMessage());
		}
		

	}
	
	//������ ExceptionŬ������ �����Ͽ� ���
	static int aaa(int a, int b) throws MyException{
		if(a<b) {
//			throw new Exception("������ ����:���� �Ⱦ�!!"); //������ �ڽ��� throws �ϰ� ���ִµ� �θ� throw�϶�� �� �� ����. 
			throw new MyException("Hi~~"); //class�� ������ Exception ������ ����� ���
		}
		
		return a-b;		
	}

} 


//������ Exception Ŭ���� ���� ����
class MyException extends Exception{	
	//�����޽����� ���޹޴� ������
	public MyException(String msg) {
		super(msg);	 //�θ� Ŭ���� Exception�� �����ڸ� Ȱ��. Exception ��ü�� .getMessage() �޼ҵ忡�� �� String�� ����
	}
}
