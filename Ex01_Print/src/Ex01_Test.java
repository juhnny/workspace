
public class Ex01_Test {
	
	public static void main(String[] args) {
		
//		���� 1.
//		������ ���� ���·� ������ �̸��� ����ϴ� ���α׷��� �ۼ��� ����.
//		��, System.out.print()�� �ѹ��� ����Ѵ�.
//		 ȫ�浿
//		 ȫ �� ��
//		 ȫ  ��  ��
		
		System.out.print("ȫ�浿\nȫ �� ��\nȫ  ��  ��");
		
//		����2.
//		������ ��°���� ���̵��� ������ �ۼ��غ���. ��, ��µǴ� ���ڵ�(20,123,456)��
//		������ ���� ���·� �����ϸ� ���ڿ�ǥ��" "�� +�� �̿��Ͽ� �Ʒ��� ���� ����ϵ��� ����.
//
//		 �� �̸��� ȫ�浿�Դϴ�.
//		 �� ���̴� 20���̰��.
//		 ���� ��� ���� �������� 123-456 �Դϴ�.
		
		System.out.println("�� �̸��� ȫ�浿�Դϴ�.");
		System.out.println("�� ���̴�"+20+"���̰��.");
		System.out.println("���� ��� ���� �������� "+123+"-"+456+"�Դϴ�.");

//		����3.
//		������ ��°���� ���̵��� ������ �ۼ��غ���. �̹����� ���� ��µǴ� ���ڵ��� ������
//		���� ���·� �����ϸ� ���ڿ�ǥ��" "�� +�� �̿��Ͽ� �Ʒ��� ���� ����ϵ��� ����.
//		�� ������ ����� ���ڸ� ���� �������� ���� �����ڸ� �̿��Ͽ� ����� ��µǵ��� ����.
//
//		 4 * 5 = 20
//		 7 * 9 = 63
		
		System.out.println(4+" * "+5+" = "+(4*5));

//		����4.
//		����3���� ����� �̿��ؼ� ������ 5���� ����غ���.
//
//		 5 * 1 = 5
//		 5 * 2 = 10
//		 5 * 3 = 15
//		 5 * 4 = 20
//		 5 * 5 = 25
//		 5 * 6 = 30
//		 5 * 7 = 35
//		 5 * 8 = 40
//		 5 * 9 = 45
		
		System.out.println("");
		
//		[2-2] �ֹε�Ϲ�ȣ�� ���ڷ� �����ϰ��� �Ѵ�.
//		�� ���� �����ϱ� ���ؼ��� � �ڷ���(data type)�� �����ؾ� �ұ�? 
//		regNo��� �̸��� ������ �����ϰ� �ڽ��� �ֹε�Ϲ�ȣ��
//		�ʱ�ȭ �ϴ� �� ���� �ڵ带 �����ÿ�. 

		String regNo = new String("123456-1234567");
		System.out.println(regNo + '\n');
		
//		[2-5]���� ������� ��°���� ��������. ������ �ִ� ������ ��� ��ȣ �ȿ�������� �����ÿ�
									// �� ����
//		System.out.println(��1�� + ��2��) "12"
//		System.out.println(true + ����) "true"
//		System.out.println(��A' + 'B') "AB"
//		System.out.println('1' + 2)   1�� �ƽ�Ű�� + 2
//		System.out.println('1' + '2')	"12"
//		System.out.println('J' + ��ava��) "Java"
//		System.out.println(true + null)	true
	
		System.out.println("1" + "2"); 
		System.out.println(true + "");
		System.out.println('A' + 'B');  //int������ ���� Ÿ��(byte, char, short)�� �������� �� int�� ��ȯ �� �����
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava\n");
//		System.out.println(true + null); //����. boolean�� ���� ������ ���ǵ����� ����
		
//		[2-6] ���� �� Ű���尡 �ƴ� ���� ��� ���ÿ�
	//	
//			a. if
//			b. True
//			c. NULL
//			d. Class
//			e. System
			
			//����� Java�� Ű���� �� �빮�ڷ� �����ϴ� ���� �ϳ��� ����.
			
		
//		[2-9]���� �� ����ȯ�� ������ �� �ִ� ���� ��� ���ÿ�? ()

//		byte b = 10;
//		char ch = 'A';
//		int i = 100;
//		long l = 1000L;
//		
//		b = (byte)i;  			�ʿ�. ū �ڷ������� ���� �ڷ���
//		ch = (char)b;			���ʿ�? ���� �ڷ������� ū �ڷ����̴ϱ�? ��. char�� ������ �ڷ������δ� ����������ȯ ���� �ʴ´�. 
//		short s = (short)ch;	���ʿ�? ���� �ڷ������� ū �ڷ����̴ϱ�? ��
//		float f = (float)l;		�ʿ�? ����Ʈ�� float�� ������ ǥ�� ������ �� ū��
//		i = (int)ch;			���ʿ�. ���� �ڷ������� ū �ڷ���
		
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
//		b = i;	//4����Ʈ -> 1����Ʈ�̹Ƿ� �ݵ�� ����ȯ �ʿ�
//		ch = b; //1����Ʈ -> 2����Ʈ������ ������ �޶� ����ȯ �ʿ�
//		short s = ch; //�� �� 2����Ʈ���� ������ �޶� ����ȯ �ʿ�
//		float f = l; //float(4byte)�� ������  long(8byte)���� Ŀ�� ���� ����. ��ǻ�� ���迡�� ����Ʈ�� ������� �Ǽ����� ���������� ũ�ٰ� �����Ѵ�.
//		i = ch;	//2����Ʈ -> 4����Ʈ�̹Ƿ� ���� ����
//		
//		System.out.println(b);
//		System.out.println(ch);
//		System.out.println(s);
//		System.out.println(f);
//		System.out.println(i);
		
//		
//		[2-11] ������ ������ �߸� �ʱ�ȭ �� ���� ��� ���ÿ�

//		byte b = 256; //����δ� 127�� �ִ�
//		char c = '';	//null �ʱ�ȭ�� �ǳ�?
//		char answer = 'no'; //�� �����ε�? char�� 2����Ʈ�� �ż� ���� �ǳ�?
//		float f = 3.14; //����� double���� float���� ��ȯ �ʿ�
		double d = 1.4e3f; // double�� �ڵ�����ȯ��
		
//		System.out.println(b);
//		System.out.println(c); //�ݵ�� �� ���� ���� ���� �ʿ�
//		System.out.println(answer); //�ΰ��� ���ڶ� �ȵ�
//		System.out.println(f); 
		System.out.println(d);
		
//		[2-12] ���� ��
//		�޼����� ����η� �˸��� ���� ��� ���ÿ�
//
//		a. public static void main(String[] args)
//		b. public static void main(String args[])
//		c. public static void main(String[] arv)
//		d. public void static main(String[] args)
//		e. static public void main(String[] args)
		
//		1, 2?
		
//		�ؼ�: �迭�� �ǹ��ϴ� ��ȣ�� []�� Ÿ�� �ڿ� �ٿ��� �ǰ� ������ �ڿ� �ٿ��� ��.
//		public�� static�� ��ġ�� �޶� ��.
		
//		[2-13] ���� �� Ÿ�԰� �⺻���� �߸� ����� ���� ��� ���ÿ�
//		b, f ?
		
//		a. boolean - false 
//		b. char - '\u0000'
//		c. float - 0.0
//		d. int - 0
//		e. long - 0
//		f. String - ""
		
//		����: c, e, f
//		�ؼ�: 0.0�� 0.0d�� �⺻���̹Ƿ� float ���� �� 0.0f�� ����� ��. long�� ���������� 0L�̶�� ��� ��. 
//		String�� ������ Ÿ��. ��� ������ Ÿ���� �⺻���� null
		
		
		
	}
}
