//import ��Ű����

import java.util.Scanner;


public class Ex02_Read {
	
	public static void main(String[] args) {

		
		
		//���ڿ� �������������� �񱳿��� �� ����
		//new String�� ��ȯ�� �ּ��ӿ� ����. Ư�� == ���� �� ����
		String str1 = new String("Good");
		String str2 = new String("Good");
		String str3 = "Good";
		String str4 = "Good";
		//new�� ���� String ��ü��� �θ�. "Good"�� ���� ���ڿ� ��� ��ü��� �θ�. 
		//���ڿ� �ڵ��ϼ������ ����ϸ� �����Ϸ��� �Ǵܿ� ������ ��. ���� ���ڿ��� �Է½� ���� ��ü�� ����
		//str1, str2, str3�� ���� �ٸ� ��ü�� �ּ�, str3�� str4�� ���� ��ü�� �ּ�. 
		
		if(str1 == str2) System.out.println(true); else System.out.println(false);
		
		//���ڿ� ��ü �񱳿� 
		
		
		
		
		
		
		
		
		
//		int a = System.in.read();
		
		//System.in�� �Է°��� ������ �� ���ڷ� �޾Ƶ��̱⿡
		//�ٸ� �ڷ������� �Է¹ޱ� �ʹ� �����
		//System.in�� �Է��� �� ���ڵ��� ���ϴ� �ڷ������� ��ȯ���ִ� ��ü�� �ִٸ�?
		//Scanner: System.in�� �Է¹��� �� ���ڵ��� ���ϴ� �ڷ������� ��ȯ���ִ� ��� Ŭ����
		//Scanner ��ü�δ� Ű���� �Է��� �� �޴´�.
		
		Scanner scan = new Scanner(System.in);
//		int aa = scan.nextInt();
//		System.out.println("aa: "+aa);
		
//		double dd = scan.nextDouble();
//		System.out.println("dd: "+dd);
		
//		boolean bb = scan.nextBoolean();
//		System.out.println("bb: "+bb);
		
		//�� ���� �Է� ����� ����.
		//���ڿ��� �Է¹޾� �� �� �� ���ڸ� ������ ��� ���(���� ����)
		//next�� ���⸦ �������� ���ڿ��� ����. ���⸦ �ϸ� ���� �ܾ�� ���� ��ĵ�ؽ�Ʈ�� ��.
		
//		String ss = scan.next();
//		System.out.println("ss: "+ss);
//		
//		String ss2 = scan.next();
//		System.out.println("ss2: "+ss2);
		//���ۿ� ���Ͱ� ���Ƽ� ���� scan.nextLine�� ���� ������..
		//�´�. nextLine()�� ������ next(), .. , nextDouble()�� ���๮�� �������� �޴´�.
		//nextLine()�� ���๮�ڸ� ������ �� ���߱� ������ �� next �ø��� �ڿ��� ���๮�ڸ� �Ծ��� nextLine()�� �ϳ� ���ָ� �ذ�.
		
		//���⸦ �����ؼ� �Է¹޴� ���
		//���ۿ� ���� �� ���� ����ϰ� ������
//		String str = scan.nextLine();
//		System.out.println("str: "+str);
//
//		String str2 = scan.nextLine();
//		System.out.println("str2: "+str2);
		
		//Ex. ����ڿ��� ���� �Է¹޾� ��Ģ����
		System.out.println("Input two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("a: "+a+" b: "+b);
		System.out.println(a+" + "+b+" = "+(a+b));
		
		//2. ������ (C���� ���� ����)
		//C���� ���� �ٸ� ������
		//2.1. �Ǽ��� ���ڿ� ���� ������ ���� ���
		System.out.println(10%3);
		System.out.println(10.5%3.1); //c������ ����
		
		//2.2. ��Ʈ �����ڿ� >>>(����Ʈ ������) �߰�
		int nn = -9;
		System.out.println(nn >> 2); //2ĭ ������ �δ�.��ȣ�� �״��
		System.out.println(nn >>> 2); //2ĭ ������ �δ�. ��ȣ�� �δ�. �� ��Ŀ��� ��ȣ�� ���� �� �����ؼ� ����. �ý��� ���α׷��Ӱ� �ַ� ���
		//�ݴ� ������ ����. 
		
		//3. ��� (C���� ���� ����)
		//3.1. ���ǰ��� 1, 0�� ���������� �ؼ����� ����
		//if(1){} //error
		if(true) {}
		
		//3.2. switch���� int, char �ܿ� String�� �� �� ����
		String sss = "kim";
		switch(sss) {
		case "kim":
			System.out.println("you're kim"); break;
		default:
			System.out.println("you're not kim"); break;
		}
		
		//4. while�� �ٸ� �� ����
		
		//5. for�� �Ȱ���. java���� �߰��� ������ ������ �迭���� �Ұ�

		
	}
}
