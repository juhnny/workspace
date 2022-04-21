import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Java에서 배열은 객체임
		
		//int형 3칸 배열객체와 int형 배열 참조변수 생성
		int[] arr = new int[3]; 
		//int arr[] 이렇게 C언어처럼 표기할 수도 있지만 오마주일 뿐 사용하진 않는다.
		
		
		//참조변수의 자료형을 쓰는 곳엔 대괄호 안에 크기를 넣으면 안됨.
//		int[3] arrr; //에러
		
		//C언어에서와 마찬가지로 만들 때를 제외하면 배열을 통째로 대입하거나 출력할 수 있는 방법은 없다.
		//참조변수를 출력하면?
		//println의 기능. 참조변수를 출력하면 자동으로 참조변수가 참조하는 객체의 .toString() 기능이 발동함.
		System.out.println(arr); //I@6504e3b2 : Int형 배열이고 @ 뒤는 주소의 해시값
		//java의 모든 객체는 하나도 빠짐없이 toString() 메소드를 갖고 있음. 내가 만드는 객체들도 자동 생성.
		
		//모든 Java의 객체는 멤버변수를 쓰레기값으로 두는 걸 허용하지 않음. 자동으로 초기화된다는 뜻.
		//0에 해당하는 값으로 초기화됨. int명 0, double이면 0.0, boolean이면 false, 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
//		System.out.println(arr[3]); //예외
		
		//배열 요소에 값 대입
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		//자바에서의 배열은 객체. 객체란 변수와 함수(메소드)를 가지고 있음
		//자바의 멤버변수 중에 배열의 길이값을 가지고 있는 멤버가 있음
		//length
		System.out.println(arr.length);
		
		//출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//초기화
		int[] arr2 = new int[] {100, 200, 300}; //초기화를 할 때는 대괄호 안에 갯수를 쓰지 않는다. 그러니 더 많이 넣거나 적게 넣는 것도 없다.
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		//초기화도 안 하고 갯수 지정도 없으면 에러
		
		//변수값으로도 초기화 가능
		int aa = 11, bb = 22;
		int[] arr6 = new int[] {aa, bb, 33, aa + 10, bb * 2};
		for(int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i]);
		}
		
		//배열 초기화 시 축약표현도 제공
		int[] arr7 = {50, 60, 70}; //new int[] 생략된 것
		
		//배열의 갯수 지정 시 변수로 지정하는 것도 가능(C에서는 안 됐던 것)
		int k = 3;
		int[] arr3 = new int[k];
		
		//배열 크기를 사용자로부터 키보드 입력 받아 지정하는 것도 가능
		
		Scanner scan = new Scanner(System.in);
//		int len;
//		System.out.print("Enter array size: ");
//		len = scan.nextInt();
//		int[] arr4 = new int[len];
//		for(int i = 0; i < arr4.length; i++) {
//			System.out.print(arr4[i] + ",");
//		}
//		System.out.println();
		
		//심지어 배열 개수 0개 짜리도 만들 수 있음
		int[] arr5 = new int[0];
		System.out.println(arr5.length);
//		System.out.println(arr5[0]); //에러
		
		//배열 참조변수끼리의 대입
		double[] arr8 = new double[] { 1.1, 2.2, 3.3};
		double[] arr9 = arr8; //같은 객체를 가리킴
		for(int i = 0; i < arr9.length; i++) {
			System.out.println(arr9[i]+", ");
		}
		
		//배열 복사
		double[] arr10 = new double[arr8.length]; //길이가 같은 다른 객체 생성
		for(int i = 0; i < arr10.length; i++) {
			arr10[i] = arr8[i];
		}

		
		//참조형 변수의 배열
		String s1, s2, s3;
		s1 = new String();
		s2 = new String();
		s3 = new String();
		//위 구조를 배열로 만들어보자.
		
		//new Class명[크기]
		//new String[3]; String의 배열이 아니라 String형 참조변수의 배열(8바이트 * 3)을 만듦. 주의!
		//배열 객체 안에 객체 자체를 갖고 있게 하는 문법은 없다. 
		String[] sArr = new String[3]; //String형 배열 참조변수(8바이트)에 넣음
		//String형 배열은 배열 객체다. String의 기능을 갖고 있지 않다.
		int[] arr11 = new int[3]; //기본형 변수의 배열과 동일하다.
		
		System.out.println(sArr); //java.lang.String;@2acf57e3
		System.out.println(sArr[0]); //null
		
		sArr[0] = new String("apple");
		sArr[1] = new String("computer");
		sArr[2] = "iPhone";
		
		System.out.println(sArr[0].toString()); //점을 찍으면 그 참조변수가 가리키는 객체의 멤버를 불러온다.
		System.out.println(sArr[1]);//toString()을 자동으로 불러오는 print의 기능 사용
		System.out.println(sArr[2]);
		
		System.out.println(sArr[0].length());
		System.out.println(sArr[1].length());
		System.out.println(sArr[2].length());
		
		System.out.println(sArr[2].charAt(1));

		//참조형변수 배열도 초기화 가능
		//기본형 배열을 참고
		int[] aaa = new int[] {10, 20, 30};
		String[] sss = new String[] {new String("Hello"), new String("My"), new String("Friend")};
		String[] sss2 = new String[] {"Hello", "My", "Friend"}; //String 선언의 축약형
		String[] sss3 = {"Hello", "My", "Friend"}; //배열 선언의 축약형
		
		//다른 클래스 참조변수들도 배열로..
		//Random 객체 생성 예시
		Random rnd = new Random(); //객체 생성 때는 생성자 즉 괄호 필요. 이를 통해 객체를 만들었다는 걸 알 수 있다.
		
		//Random 참조변수의 배열. 
		Random[] rrr = new Random[3]; //new Random[3]; Random형 참조변수의 배열을 만드는 것. 오른쪽 항은 배열 객체를 new 한 것

		rrr[0] = new Random();
		rrr[1] = new Random();
		rrr[2] = new Random();
		
		System.out.println(rrr[0].nextInt(100)); //0~99
		
		//초기화
		Random[] rrr2 = new Random[] {new Random(), new Random(), new Random()};
		
		//사용자 정의 클래스도 물론 가능
		//아래 Student 클래스 정의 있음
		Student[] stus = new Student[3]; //오른쪽은 배열, 왼쪽은 그 배열의 참조변수임을 잊지 말자.
		stus[0] = new Student();
		stus[1] = new Student();
		stus[2] = new Student();
		
		stus[0].name = "Sam";
		
		//향상된 for문. 다른 언어에서는 foreach문이라고 부르고 java에서도 다들 그렇게 부른다.
		int[] nums = new int[10];
		nums[0] = 1;
		nums[1] = 2;
		//... 이걸 언제 다?
		
		for(int i = 0; i < nums.length; i++) {
			int t = nums[i];
			System.out.println(t);
		}
		
		//위 for문을 줄인 것이 향상된 for문
		//for(임시 변수 : 배열){}
		//무조건 0번부터 끝번까지. 제어하려면 기본 for문 써야.
		for(int t : nums) { //t는 각 요소 하나 하나
			System.out.println(t);
		}
		
		int n = 1;
		for(int t: nums) {
			t = n++;
		}
		for(int t: nums) {
			System.out.println(t);
		}
		
		
		
		
		//배열의 클래스 이름은 뭐지?
		 
		System.out.println(arr10.getClass().getMethods());
		
		
	}
}

class Student{
	String name;
	int kor;
	int eng;
}
