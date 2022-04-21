import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Java������ ���ڿ��� ��ü�� ������. ���ڿ��� ��ü��!
		//�� ���ڿ��� �����θ� ���� ���� �ʰ� ���õ� ��ɵ��� ���� �ִ�.
		//C���� ���ڿ��� �ܼ��� ĳ������ ������ �迭�̾���. 
		//String ��ü�� ���������δ� C������ �Ȱ��� char �迭�̴�.
		//������ ������ 0�� �ʿ�� ���� �ʰ�(���ڿ��� ���� ������ Ŭ���� ��ü������ �����ϰ� �־ ���ʿ�) 
		//���õ� �޼ҵ���� �����ϰ� �ִ�.
		//�ѹ� ������� String ��ü�� value�� ���� �Ҹ�(immutable)
		
		String str1 = new String("Hello");
		//���ڿ� �����ʹ� ���� �߿��ϰ� ���� ���Ǵ� ���̶� ���ǥ���� �����ȴ�.
		String str2 = "Hello"; //�ڵ� new String("Hello"); ��ü�� ������ٴ� �� ���� ����.
		
		//String Ŭ������ ���(�޼ҵ�) ���
		
		//1. length
		//���ڿ� �������� ����(���� ��) ����
		int len = str1.length();
		int len2 = str2.length();
		int len3 = "He".length();
		System.out.println(len);
		System.out.println(len2);
		System.out.println(len3);
		System.out.println();
		
		//2. equals
		//���ڿ����� ��(���� �����̳�)
		System.out.println( str1 == "Hello"); //�ּ� ��. �������� "Hello"��� ���ڿ��� ���� String ��ü�� ���� ����� �� �ּҸ� ��ȯ��
		System.out.println(str1.equals(new String("Hello")));
		System.out.println(str1.equals("Hello"));
		System.out.println(str1.equals(str2));
		System.out.println("Hello".equals(str1));
		System.out.println();
		
		//2-1. ��ҹ��� ��
		System.out.println(str1.equals("hello")); //false
		System.out.println(str1.equalsIgnoreCase("hello")); //true. ��ҹ��� ����
		System.out.println();
		
		//2-2. charAt 
		//���ڿ����� Ư�� ��ġ�� char �ϳ��� ��������(index ���)
		char ch = str1.charAt(0);
		System.out.println(ch);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(4));
//		System.out.println(str1.charAt(5)); //Error. String index out of range
		System.out.println();
		
		for(int i = 0; i < str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
		
		//3. ���ڿ����� �� ���ھ� ��������
		//Scanner���� char �Է±���� ����.
		//System.in�� �� ���ھ� ������ �׷� ���� �Է��� �������ݾ�.
		//�ڹٿ����� ���ڿ��� �Է¹޾Ƽ� �� ���ھ� �������� ����� ���
//		char c;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a string");
//		String str = scan.next();
//		c = str.charAt(0);
//		System.out.println("c: "+c);
//		
//		//����� ǥ����
//		System.out.println("Enter a string");
//		char c2 = scan.next().charAt(1); //�޼ҵ� ü�̴�. �Լ��� ������ �� �ƴ϶� �Լ��� ��ȯ�� ���ڿ� ��ü�� �����ؼ� �Լ��� ȣ���� ��
//		System.out.println("c2: "+c2);

		//4. ���ڿ� �ȿ��� Ư�� ������ index�� ��������
		//indexOf('A'), lastIndexOf('l')
		
		int index = str1.indexOf('e');
		System.out.println(index);
		System.out.println(str1.indexOf('o'));
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.indexOf('A')); // �� ã���� -1
		System.out.println();
		
		//�ڿ������� �˻�
		System.out.println(str1.lastIndexOf('l'));

		
		//4.1. ���ڿ��� ã�� �� �ִ�.
		System.out.println(str1.indexOf("el"));
		System.out.println(str1.indexOf("Hl")); //�� ã���� -1
		System.out.println();
		
		//4.2 ���ϴ� ��ġ���� �˻�
		System.out.println(str1.indexOf('l', 3)); 
		System.out.println(str1.indexOf("lo", 3));
		System.out.println();
		
		//5. contains 
		//Ư�� ���ڿ��� ���ԵǾ� �ִ��� ����(true/false) ����
		String s3 = "�ȳ��ϼ���. �ݰ����ϴ�. 500�� �Դϴ�.";
		boolean b = s3.contains("�ݰ�");
		System.out.println(b);
		System.out.println();
		
		//6. concat 
		//���ڿ� ����
		//����� String ��ü�� �ѹ� ��������� ������ ���� �Ұ�
		String s4 = s3.concat(" ī��� �� �޽��ϴ�."); //"ī��� �ȹ޽��ϴ�."��� ���ο� String ��ü�� ���� s3�� ������ ���ο� String ��ü�� �����.
		System.out.println(s3);
		System.out.println(s4);
		
		//���������� �״�� ����� ���� �ִ�.
		s3 = s3.concat(" ���� ȯ��.");
		System.out.println(s3);
		
		//��� concat�� �ʹ� ���� ������ �� �� ���δ�. ���� ������ +�� ���������.
		s3 = s3 + " �ȳ��� ������.";
		System.out.println(s3);
		System.out.println();
		
		//String�� �ٷ�鼭 concat�̳� + �����ڸ� �ݺ� ����ϸ� ��ü�� �޸𸮿� �Ҵ��ϴ� ���� �ݺ��Ǳ� ������ �����ս����� �δ�Ǵ� ����
		//�׷��� ���ڿ��� �� ���ۿ� ��Ƶ״ٰ� �ѹ��� String ��ü�� ����� �޼ҵ嵵 �ִ�. �Ƹ��� StringBuffer
		
		//�⺻������ ������� ���� ����ٷ� �Ѿ�� �ڵ����� �޸𸮿��� ��������.
		//�ڹٿ����� ���ڿ� ������� Heap ������ ��������ٰ� ���̻� �������� ������ ���� �ٿ��� �����ȴ�.
		//�ڹٿ����� Heap�� ������� ����� Constant Pool�̶�� ������ �д�.
		//��� �����ǰ� �ִ� ���ڿ� ��ü���� Constant pool�� �־ ������� �ʴ´�.
		
		//7. startsWith, endsWith 
		//Ư�� ���ڿ��� ����/������ �� ����
		System.out.println(s3.startsWith("�ȳ�"));
		System.out.println(s3.startsWith("�ݰ�"));
		
		System.out.println(s3.endsWith("������."));
		System.out.println(s3.endsWith("������. "));
		System.out.println();
		
		//8. trim 
		//���ڿ��� ���� ���鹮�ڸ� �������ִ� ���
		String s5 = "   abc   ";
		System.out.println("["+s5+"]");
		s5 = s5.trim(); //���ο� ��ü ���� �� �ּ� ����
		System.out.println("["+s5+"]");
		System.out.println();
		
		//9. toUpperCase, toLowerCase 
		//��ҹ��� ��ȯ
		s5 = s5.toUpperCase();
		System.out.println(s5);
		s5 = s5.toLowerCase();
		System.out.println(s5);
		
		//�� �ѹ��� �Ẹ�� ����
		System.out.println("   Apple   ".trim().concat(" Computer").toUpperCase().endsWith("r"));
		System.out.println();
		
		//10. replace 
		//Ư�� ����/���ڿ� �ٲٱ�
		System.out.println("Android".replace('d', 'r')); //��� ���ڰ� ��ü�ȴ�.
		System.out.println("  ȫ �� ��  ".replace(" ", "")); //���ڿ� �߰� ���� ���ֱ�
		System.out.println();
		
		//11. substring 
		//���ڿ� �߶󳻱�
		System.out.println("abcdefg".substring(2)); //2��° ���ں��� 
		System.out.println("abcdefg".substring(2, 4)); //2�̻� 4�̸� ����
		//�ι�° �Ķ���Ͱ� ���ϰ� �ƴ϶� �̸��� ���� �ι�° �Ķ���Ϳ� length�� �ַ� ���� ����
		System.out.println();
		
		//12. compareTo 
		// ���ڿ����� ��Һ�. ����(sort) �� �� ���
		System.out.println('a'>'b');
		//������ ���ڿ����� �񱳴� ��� ��?
//		System.out.println("abc" > "abb"); //Error. �ּҴ� �񱳿��� �Ұ�
		System.out.println("abc".compareTo("abb")); //1
		System.out.println("abc".compareTo("abd")); //-1
		System.out.println("abc".compareTo("abe")); //-2
		System.out.println("abc".compareTo("ab")); //1    �̰� �� 1�� ���ñ�.
		//A�� B���� �տ� ������ ����, �ڿ� ������ ���
		
		//13. split 
		//Ư�� ���ڿ��� �������� ���ڿ����� �и��ϴ� ���
		String s10 = "apple, berbere,  carrot, dairy ";
		String[] arr = s10.split(",");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].trim());
		} 
		
		//String �迭�� ��ҵ��� ���ļ� �ϳ��� ū ���ڿ��� ����� ����� �ִ�. �װ� �迭 �ð���..
		
		//String Ŭ�������� �̿ܿ��� ���� ���(�޼ҵ�)���� ����
		
		//static method
		//��ü ���� ���� Ŭ���������� �ٷ� ��� ������ �޼ҵ�
		//[Ŭ������.�޼ҵ��]
		
		//��ǥ���� String Ŭ������ static methods
		//1. format(): ���ڿ��� Ư�� �������� ������ִ� ���
		//��ġ System.out.printf()�� ���
		int hour = 15;
		int min = 24;
		int sec = 12;
		System.out.printf("%02d:%02d:%02d\n", hour, min, sec);
		
		//������ �ǹ�������, GUI������ �ܼ�â�� ������� �ʴ´�. 
		//GUI ���α׷������� ���ڿ�(String)�� �����ִ� ��ü(�ȵ���̵忡���� TextView)���� Ư�� �������� �� ���ڿ� ��ü�� ����� ��������� ��
		String data = hour+":"+min+":"+sec; //�̷� ������ String�� ������� �ϴµ�... printfó�� ������ �����ַ���?
		System.out.println(data); 
		
		//format
		data = String.format("%02d:%02d:%02d", hour, min, sec); //String. �ϰ� �� ������ String class�� static ����鸸 ��������. �����ܿ��� s�� �پ��ִ�.
																//�빮�ڷ� �����ϴ� ������ ���� Ŭ�����̰�, Ŭ���� �ڿ� �ٷ� ���� ��´ٴ� �� static ����� ���ڴٴ� ��
		System.out.println(data);
		
		//2. �⺻��(primitive) �ڷ����� String ��ü�� ��ȯ���ִ� ���
		//�⺻���� ���������� ����ȯ�� �� �ȴ�.
		int num = 100;
//		String strnum = (String)num; //����
		String strrr = String.valueOf(num); //100 -> "100"
		System.out.println(strrr);
		System.out.println(strrr.length());
		
		strrr = String.valueOf(3.14);
		System.out.println(strrr);
		
		strrr = String.valueOf(true);
		System.out.println(strrr);
		
		//GUI���� ȭ�鿡 ��µǴ� ��� ����, ���ڴ� String�̴�. 
		//valueOf�� ���� ���� �ʿ��ϴ�. ������ ���ڿ� ��ȯ �����ڸ� �� ���� ����.
		
		strrr = 20000 + "";
		System.out.println(strrr.length());
		
		//�ݴ�� String�� �⺻������ ��ȯ�ϴ� ��쵵 ���� ����.
		//GUI������ ����ڿ��� �Է¹޴� ���鵵 ��� ���ڿ��̴�. 
		//�嵥 String Ŭ�������� �� ����� ����.
		//�� ����� ����ִ� Ŭ��������... 
		//Boolean, Character, Byte, Short, Integer, Long, Float, Double
		//Wrapper Ŭ������� �θ���.
		
		int num2 = Integer.parseInt(strrr);
		System.out.println(num2 * 2);
		
		
//		num2 = Integer.parseInt("abc"); //Error. ���� ������ �ƴ�
		
		double d = Double.parseDouble("3.14");
		System.out.println(d / 2);
		
		//GUI���� ���� �Է¹޾� �����ϱ�
		Scanner scan1 = new Scanner(System.in);
		int numb1, numb2;
		
		System.out.println("Input two numbers");
		String numstr = scan1.next();
		numb1 = Integer.parseInt(numstr);
		
		numstr = scan1.next();
		numb2 = Integer.parseInt(numstr);
		
		numstr = "Total is " + String.valueOf(numb1 + numb2);
		System.out.println(numstr);
		
		
		
		
	}
}
