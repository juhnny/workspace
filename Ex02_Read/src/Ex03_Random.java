import java.util.Random;
import java.util.Scanner;

public class Ex03_Random {

	public static void main(String[] args) {
		
		//�������� ����� �������ִ� ��ɵ��� ���� Ŭ����
		//�ڹٿ����� ��ü������ �ݵ�� Heap���� �� �� ����
		//new Ű����� Heap�� ��ü ����
		Random rnd = new Random();
		int n;
		
		n = rnd.nextInt(); //-21�� ~ 21��
		System.out.println(n);
		
		n = rnd.nextInt(50); //50�̸�. 
		System.out.println(n);
		
		//���������� ���ϰ� ������? Ŭ������ ���� ����.
		n = rnd.nextInt(10) + 5; //5~14
		System.out.println(n);
		
		//���� ���߱� ���� (500~ 1000 ����)
//		int com = rnd.nextInt(501) + 500;
//		int me = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("Guess a number: ");
//			me = scan.nextInt();
//			
//			if(me>com) System.out.println("Under");
//			else if(me<com) System.out.println("Over");
//			else {
//				System.out.println("That's it!");
//				break;
//			}
//		}
		
		//boolean��
		boolean bool = rnd.nextBoolean();
		System.out.println(bool);
		
		//double�� 
		double dou = rnd.nextDouble(); //0 �̻� 1 �̸��� ��. ���ؼ� �����
		System.out.println(dou);
		
		dou = rnd.nextDouble() * 10; //0 �̻� 1 �̸��� ��. ���ؼ� �����
		System.out.println(dou);
		
		
		//���� �߱�
		
		//��ǻ���� ���� �����. �ߺ����� �ʴ� �� �ڸ� ���� ���
		int c1 = rnd.nextInt(9) + 1;
		int c2;
		int c3;
		while(true) {
			c2 = rnd.nextInt(10);
			if(c1 != c2) break;
		}
		while(true) {
			c3 = rnd.nextInt(10);
			if((c2 != c3) && (c1 != c3)) break;
		}

		System.out.println("Com: "+c1+c2+c3);
		
		//���� �Է� �ޱ�. �ߺ����� �ʴ� �� �ڸ� ����
		int numb; int m1, m2, m3;
		while(true) {
			System.out.print("input a 3-digit number: ");
			Scanner scan = new Scanner(System.in);
			numb = scan.nextInt();
			
			if(numb < 101 || numb > 987) continue;
			
			m1 = (numb-(numb%100))/100;
//			System.out.println(m1);

			m2 = ((numb % 100) - (numb % 10))/10 ;
//			System.out.println(m2);
			
			m3 = numb % 10;
//			System.out.println(m3);
			
			if(m1 == m2 || m1 == m3 || m2 == m3) continue;
			else break;
		}
		
		//Strike, Ball ��� �� ��� ���
		int str = 0, ball = 0;
		
		if(c1 == m1) str++;
		if(c2 == m2) str++;
		if(c3 == m3) str++;
		if(c1 == m2 || c1 == m3) ball++;
		if(c2 == m1 || c2 == m3) ball++;
		if(c3 == m1 || c3 == m2) ball++;
	
		if(str == 3) System.out.println("Gotcha!!!");
		else System.out.println(str+" Strike "+ball+" Ball");
		
		//������ 9�� �ʰ� Ʈ���� �� �й� ó���ϴ� �͵� �߰��غ���.
		
		
		
		
		

	}
}
