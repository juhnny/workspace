import java.util.Scanner;

public class Ex02_Read_Test {
	
	public static void main(String args[]) {
		
//		����8.
//		����ڷκ��� ���� �������� �Է¹޾Ƽ� ������ ����Ͽ� ����ϴ� ���α׷��� �ۼ�����.
//		��, ���� ������(r)�� �Ǽ�(double��)�� �ԷµǸ� ��µ� ��� �Ǽ������� �Ͽ��� �Ѵ�.
//		������ ����ϴ� ���� ������ ����.
//
//		 3.14*r*r
		
//		System.out.print("Enter a radius: ");
//		Scanner scan = new Scanner(System.in);
//		double r = scan.nextDouble();
//		
//		System.out.println("r : "+r);
//		System.out.println("����: "+(3.14*r*r));
		
//		����1.
//		���α׷� ����ڷκ��� ���� ������ �ϳ� �Է� �޾Ƽ�, �� ����ŭ "Hello World!"��
//		����ϴ� ���α׷��� �ۼ��غ���.
		
//		System.out.println("Enter a positive integer");
//		int a1 = scan.nextInt();
//		
//		for (int i = 0; i < a1; i++) {
//			System.out.println("Hello World!");
//		}
 
//		����2.
//		���α׷� ����ڷκ��� ���� ������ �ϳ� �Է� ���� ����, �� ����ŭ 3�� ����� ���
//		�ϴ� ���α׷��� �ۼ��� ����. ���� ��� 5�� �Է¹޾Ҵٸ�, 3 6 9 12 15�� ����ؾ�
//		�ϰ� 3�� �Է¹޾Ҵٸ�, 3 6 9 �� ����ؾ� �Ѵ�.
//		Scanner scan1 = new Scanner(System.in);
//		System.out.println("enter a num");
//		int num = scan1.nextInt();
//		for(int i = 1; i <= num; i++) {
//			System.out.print(3 * i+" ");
//		}
//		System.out.println();
//		
//		int i = 1;
//		while(i<=num) {
//			System.out.print(3*i+" ");
//			i++;
//		}
 
//		����3.
//		���α׷� ����ڷκ��� ����ؼ� ������ �Է¹޴´�. �׸��� �� ���� ����ؼ� ����
//		������. �̷��� �۾��� ���α׷� ����ڰ� 0�� �Է��� ������ ��ӵǾ�� �ϸ�, 
//		0�� �ԷµǸ� �Էµ� ��� ������ ���� ����ϰ� ���α׷��� �����Ѵ�.
		
		Scanner scan2 = new Scanner(System.in);
//		int num = 0, total=0;
//		while(true) {
//			System.out.println("Input a number: ");
//			num = scan2.nextInt();
//			total += num;
//			if(num == 0) break;
//		}
//		System.out.println("total: "+total);
		
//		num = 1;
//		for(;num!=0;) {
//			System.out.println("Input a num");
//			num = scan2.nextInt();
//			total += num;
//		}
//		System.out.println("total: "+total);
		
//		num = 0;
//		for(;;) {
//			System.out.println("Input a num");
//			num = scan2.nextInt();
//			total += num;
//			if(num==0) break;
//		}
//		System.out.println("total: "+total);
		
//		����4.
//		���α׷� ����ڷκ��� �Է� ���� ���ڿ� �ش��ϴ� �������� ����ϵ�, �������� 
//		����ϴ� ���α׷��� �ۼ��� ����.
//		int dan;
//		Scanner scan3 = new Scanner(System.in);
//		System.out.println("Enter dan: ");
//		dan = scan3.nextInt();
		
//		int i = dan, k = 9;
//		while(i != 0) {
//			System.out.println(i+" x "+k+" = "+(i*k));
//			k--;
//			if(k == 0) {
//				i--;
//				k = 9;
//				System.out.println();
//			}
//		}
		
//		for(int j = dan; j > 0; j--) {
//			for(int l = 9; l > 0; l--) {
//				System.out.println(""+j+" x "+l+" = "+(j*l));
//			}
//			System.out.println();
//		}


//		����5.
//		���α׷� ����ڷκ��� �Է� ���� ������ ����� ����ϴ� ���α׷��� �ۼ��ϵ�
//		���� �� ���� ������ �������Ѿ� �Ѵ�.
//		  - ���� �� ���� ������ �Է��� ������ ���α׷� ����ڿ��� ���´�. �׸��� �� ��
//		    ��ŭ ������ �Է� �޴´�.
//		  - ��հ��� �Ҽ��� ���ϱ��� ��µǵ��� �Ѵ�.
		
		
//		int sum = 0;
//		Scanner scan4 = new Scanner(System.in);
//		
//		System.out.print("Input cnt: ");
//		int cnt = scan4.nextInt();
//		
//		for(int i = 0; i < cnt; i++) {
//			System.out.print("Input num: ");
//			sum = sum + scan4.nextInt();
//		}
//		System.out.println("Average is: "+(double)sum/(double)cnt);


//		����6.
//		���α׷� ����ڷκ��� �� 5���� ������ �Է� �޾Ƽ�, �� ���� ���� ����ϴ� ���α׷�
//		�� �ۼ��غ���. ��, �Ѱ��� ������ �ִ�. ������ �ݵ�� 1 �̻��̾�� �Ѵ�. ���࿡ 
//		1 �̸��� ���� �ԷµǴ� ��쿡��, �̸� �Է����� �������� �ʰ� �� �Է��� �䱸�ؾ�
//		�Ѵ�. �׷��� �ᱹ 1 �̻��� ���� 5���� ��� �Է� ���� �� �ִ� ���α׷��� �ϼ��ؾ�
//		�Ѵ�.

//		Scanner scan = new Scanner(System.in);
//		int sum = 0;
//		System.out.println("Input 5 numbers(not less than 1) ");
//		
//		for(int i = 0 ; i < 5; i++) {
//			System.out.println("Number: ");
//			int num = scan.nextInt();
//			if(num >= 1) sum += num;
//			else {
//				System.out.println("Not less than 1");
//				i--;
//			}
//		}
//		
//		System.out.println("\nTotal is "+sum);

//		����7.
//		�Ʒ��� ����� ���̴� ���α׷��� �ۼ��غ���.
//		 *
//		 o *
//		 o o *
//		 o o o *
//		 o o o o *
//
//		 �����, �� 5�࿡ ���ļ� ����� �̷������, ���� ������ ������ 'o'���ڰ� �����Ѵٴ�
//		Ư¡�� ������� �ݺ����� ��ø�� �����ϸ� �ȴ�.
		
//		//while�� �غ���
//		int i = 0;
//		int k = 0;
//		while(true) {
//			if(i< k) {
//				System.out.print("o ");
//				i++;
//			} else if(i == k) {
//				System.out.println("*");
//				i = 0;
//				k++;
//			}
//			
//			if(k==5) break;
//		}
		
		//for�� �غ���
//		for(int i = 0; i < 5; i++) {
//			for(int k = 0; k < i; k++) {
//				System.out.print("o ");
//			}
//			System.out.println("*");
//		}

//		����8.
//		1�̻� 100�̸��� ���� �߿��� 7�� ����� 9�� ����� ����ϴ� ���α׷��� �ۼ��� ����.
//		��! 7�� ����̸鼭 ���ÿ� 9�� ����� ������ �ѹ��� ����ؾ� �Ѵ�.

//		for(int i = 1; i < 100; i++) {
//			if((i % 7 == 0) || (i % 9 == 0)) System.out.print(i+" ");
//		}

//		����9.
//		�� ���� ������ �Է� �޾Ƽ� �� ���� ���� ����ϴ� ���α׷��� ������ ����. ��, ������
//		ū ������ ���� ���� �� ����� ����ؾ� �Ѵ�. ���� �� �Էµ� �� ���� ������ 
//		������� 12�� 5��� 7�� ��µǾ�� �ϰ�, �Էµ� �� ���� ������ ������� 4�� 16�̶��
//		12�� ��µǾ�� �Ѵ�. ��, ��� ����� ������ 0 �̻��� �Ǿ�� �Ѵ�.

//		int m, n;
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("Input number 1: ");
//		m = scan.nextInt();
//		System.out.print("Input number 2: ");
//		n = scan.nextInt();
//		
//		if(m >= n ) {
//			System.out.println("m - n = "+(m-n));
//		} else {
//			System.out.println("n - m = "+(n-m));
//		}
		
		
//		����10.
//		���� 9���� ������ if~else�� ����Ͽ� �ذ��Ͽ��°�? �̸� if~else�� �ƴ� ���׿����ڸ�
//		�̿��Ͽ� ������ ����. 

//		int result = (m >= n)? m-n:n-m;
//		System.out.println("Result is "+result);

//		����11.
//		�������� ����ϵ� ¦�� ��(2��, 4��, 6��, 8��)�� ��µǵ��� �Ѵ�. ���� 2���� 2*2����,
//		4���� 4*4����, 6���� 6*6����, 8���� 8*8������ ��µǵ��� �غ���. �̸� �ذ��ϱ� 
//		���� break�� continue���� ����غ���.(�Ƚᵵ ���α׷����� ���������� �����ϴ� �ǹ̿���
//		�����غ���)
		
//		int dan = 2, n = 0;
//		while(true) {
//			if(dan % 2 == 0) {
//				System.out.println(""+ dan+" x "+n+" = "+(dan * n));
//				n++;
//			} else {
//				dan++;
//				continue;
//			}
//			
//			if(n > dan) {
//				System.out.println();
//				dan++;
//				n = 1;
//			}
//			
//			if(dan > 8) break;
//		}
		


	}
}
