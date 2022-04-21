import java.util.Scanner;

public class Ex02_Read_Test {
	
	public static void main(String args[]) {
		
//		문제8.
//		사용자로부터 원의 반지름을 입력받아서 면적을 계산하여 출력하는 프로그램을 작성하자.
//		단, 원의 반지름(r)은 실수(double형)로 입력되며 출력도 모두 실수형으로 하여야 한다.
//		면적을 계산하는 식은 다음과 같다.
//
//		 3.14*r*r
		
//		System.out.print("Enter a radius: ");
//		Scanner scan = new Scanner(System.in);
//		double r = scan.nextDouble();
//		
//		System.out.println("r : "+r);
//		System.out.println("면적: "+(3.14*r*r));
		
//		문제1.
//		프로그램 사용자로부터 양의 정수를 하나 입력 받아서, 그 수만큼 "Hello World!"를
//		출력하는 프로그램을 작성해보자.
		
//		System.out.println("Enter a positive integer");
//		int a1 = scan.nextInt();
//		
//		for (int i = 0; i < a1; i++) {
//			System.out.println("Hello World!");
//		}
 
//		문제2.
//		프로그램 사용자로부터 양의 정수를 하나 입력 받은 다음, 그 수만큼 3의 배수를 출력
//		하는 프로그램을 작성해 보자. 예를 들어 5를 입력받았다면, 3 6 9 12 15를 출력해야
//		하고 3을 입력받았다면, 3 6 9 를 출력해야 한다.
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
 
//		문제3.
//		프로그램 사용자로부터 계속해서 정수를 입력받는다. 그리고 그 값을 계속해서 더해
//		나간다. 이러한 작업은 프로그램 사용자가 0을 입력할 때까지 계속되어야 하며, 
//		0이 입력되면 입력된 모든 정수의 합을 출력하고 프로그램을 종료한다.
		
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
		
//		문제4.
//		프로그램 사용자로부터 입력 받은 숫자에 해당하는 구구단을 출력하되, 역순으로 
//		출력하는 프로그램을 작성해 보자.
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


//		문제5.
//		프로그램 사용자로부터 입력 받은 정수의 평균을 출력하는 프로그램을 작성하되
//		다음 두 가지 조건을 만족시켜야 한다.
//		  - 먼저 몇 개의 정수를 입력할 것인지 프로그램 사용자에게 묻는다. 그리고 그 수
//		    만큼 정수를 입력 받는다.
//		  - 평균값은 소수점 이하까지 출력되도록 한다.
		
		
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


//		문제6.
//		프로그램 사용자로부터 총 5개의 정수를 입력 받아서, 그 수의 합을 출력하는 프로그램
//		을 작성해보자. 단, 한가지 조건이 있다. 정수는 반드시 1 이상이어야 한다. 만약에 
//		1 미만의 수가 입력되는 경우에는, 이를 입력으로 인정하지 않고 재 입력을 요구해야
//		한다. 그래서 결국 1 이상의 정수 5개를 모두 입력 받을 수 있는 프로그램을 완성해야
//		한다.

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

//		문제7.
//		아래의 출력을 보이는 프로그램을 작성해보자.
//		 *
//		 o *
//		 o o *
//		 o o o *
//		 o o o o *
//
//		 참고로, 총 5행에 걸쳐서 출력이 이루어지고, 행이 더해질 때마다 'o'문자가 증가한다는
//		특징을 기반으로 반복문의 중첩을 구성하면 된다.
		
//		//while로 해보자
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
		
		//for로 해보자
//		for(int i = 0; i < 5; i++) {
//			for(int k = 0; k < i; k++) {
//				System.out.print("o ");
//			}
//			System.out.println("*");
//		}

//		문제8.
//		1이상 100미만의 정수 중에서 7의 배수와 9의 배수를 출력하는 프로그램을 작성해 보자.
//		단! 7의 배수이면서 동시에 9의 배수인 정수는 한번만 출력해야 한다.

//		for(int i = 1; i < 100; i++) {
//			if((i % 7 == 0) || (i % 9 == 0)) System.out.print(i+" ");
//		}

//		문제9.
//		두 개의 정수를 입력 받아서 두 수의 차를 출력하는 프로그램을 구현해 보자. 단, 무조건
//		큰 수에서 작은 수를 뺀 결과를 출력해야 한다. 예를 들어서 입력된 두 수가 순서에 
//		상관없이 12와 5라면 7이 출력되어야 하고, 입력된 두 수가 순서에 상관없이 4와 16이라면
//		12가 출력되어야 한다. 즉, 출력 결과는 무조건 0 이상이 되어야 한다.

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
		
		
//		문제10.
//		문제 9번의 내용을 if~else를 사용하여 해결하였는가? 이를 if~else가 아닌 삼항연산자를
//		이용하여 구현해 보자. 

//		int result = (m >= n)? m-n:n-m;
//		System.out.println("Result is "+result);

//		문제11.
//		구구단을 출력하되 짝수 단(2단, 4단, 6단, 8단)만 출력되도록 한다. 또한 2단은 2*2까지,
//		4단은 4*4까지, 6단은 6*6까지, 8단은 8*8까지만 출력되도록 해보자. 이를 해결하기 
//		위해 break와 continue문을 사용해보자.(안써도 프로그래밍은 가능하지만 연습하는 의미에서
//		적용해볼것)
		
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
