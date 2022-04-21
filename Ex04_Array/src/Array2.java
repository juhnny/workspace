import java.util.Scanner;
import java.util.ArrayList;

public class Array2 {
	
	public static void main(String[] args) {
		
		//2차원 배열객체
		//new int[2][3] //int[3] 객체의 주소를 2개 가진 참조변수 배열. [int[3], int[3]]
		//int[][] arr //int형 배열의 참조변수의 배열의 참조변수
		int[][] arr = new int[2][3];
		
		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 2;
		
		arr[1][0] = 10;
		arr[1][1] = 11;
		arr[1][2] = 12;
		
		//점(.)이 어느 객체의 배열인지를 주의깊게 보자.
		System.out.println(arr.length); //2
		System.out.println(arr[0].length); //3

		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				System.out.println(arr[i][k]);
			}
		}
		
		//심지어 길이가 다른 배열을 참조하는 배열도 가능
		//어차피 참조변수의 배열이니까 각 참조변수가 무슨 배열을 가리키든 상관없음
		int[][] aaa = new int[3][]; //int[] 참조변수 3개짜리 배열
		aaa[0] = new int[3];
		aaa[1] = new int[5];
		aaa[2] = new int[10];
		//aaa[2] = new double[10]; //자료형은 참조변수의 자료형과 일치해야 함
		
		for(int i = 0; i < aaa.length; i++) {
			for(int k = 0; k < aaa[i].length; k++) {
				System.out.print(aaa[i][k]+",");
			}
			System.out.println();
		}
		

		//참조형 변수의 2차원 배열
		String[][] sss = new String[2][3];
		sss[0][0] = "Apple";
		sss[0][1] = "Computer";
		sss[0][2] = "iPhone";
		
		sss[1][0] = "MS";
		sss[1][1] = "Co.";
		sss[1][2] = "Windows";
		
				
		//2차원 배열의 초기화
		int[][] aaa2 = new int[][] {new int[] {10, 20}, new int[] {30, 40, 50}};
		//개발자들은 아래와 같은 형태로 축약하길 선호
		int[][] aaa3 = {
				{10, 20},
				{100, 200, 300, 400},
				{-1, -2, -3, -4}
		};
		
		for(int[] t : aaa3) {
			for(int n : t) {
				System.out.print(n+",");
			}
		System.out.println();
		}
		
		//열의 길이가 일정한 2차원 배열의 초기화
		int[][] aaa4 = new int[][] {{1, 2}, {3, 4}, {5, 6}};
		
		//열의 길이가 일정하지 않은 2차원 배열의 초기화
		int[][] aaa5 = new int[][] {{1}, {2, 3}, {4, 5, 6}};
		
		
		//Scan 받아서 그 칸수만큼 2차원 배열 만들기
		Scanner scan = new Scanner(System.in);
		int story;
		
		System.out.print("Input story: ");
		story = scan.nextInt();
		int[][] fff = new int[story][];
		
		for(int i = 0; i < fff.length; i++) {
				System.out.print("Input rooms: ");
				int t = scan.nextInt();
				fff[i] = new int[t];
		}
		
		//이건 불가능. foreach문에서 : 왼쪽 항목은 배열의 각 요소의 값을 가져온 또 다른 변수이지 그 요소 자체는 아니다. 그러니 아래에서 t에 값을 대입할 수는 없다.
		//foreach문을 대입에 활용하는 건 불가
//		for(int[] t : fff) {
//			System.out.print("Input rooms: ");
//			int rooms = scan.nextInt();
//			t = new int[3];
//		}
		
		for(int[] t: fff) {
			for(int r: t) {
				System.out.print(r+",");
			}
			System.out.println();
		}
		
		//3, 4, 5...차원 배열도 똑같음
		int[][][] arrr = new int[2][][];
		
		arrr[0] = new int[2][];
		arrr[1] = new int[3][];
		
		arrr[0][0] = new int[2];
		arrr[0][1] = new int[2];
		
		arrr[1][0] = new int[2];
		arrr[1][1] = new int[3];
		arrr[1][2] = new int[] {120, 121, 122, 123}; //초기화
		
		arrr[0][0][0] = 10;
		arrr[0][0][1] = 20;
		
		System.out.println(arrr[1][2][2]);
		System.out.println("------------");
		
		
		//ArrayList 클래스
		
		//한번 만들어진 배열 객체의 길이(요소 개수)는 변경할 수 없음!
		//그래서 생각보다 활용도가 제한적. 대량의 리스트를 저장하고 수정하기가 난감
		//길이를 늘이고 줄일 수 있는 배열은 없을까? 해서 만든 게 ArrayList
		//앱 개발에 String 다음으로 많이 쓰는 클래스		

		ArrayList<String> list = new ArrayList<String>(); //String을 사용하는 ArrayList 생성
		
		//list의 길이를 알 수 있음
		System.out.println(list.size());
		
		//요소 추가
		list.add(new String("aaa"));
		list.add(new String("bbb"));
		list.add("ccc");
		System.out.println(list.size());
		
		//index
		String s1 = list.get(1);
		System.out.println(s1);
		
		//요소 삭제
		list.remove(1);
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		//ArrayList는 참조형만 요소로 가질 수 있음.
		//즉, 기본형 자료형(boolean, ... , double)은 사용 불가
//		ArrayList<int> list2 = new ArrayList<int>(); //에러. 
		
		//그래서 Wrapper 클래스(기본형 자료형을 감싸는 클래스)를 사용해 한계 극복
//		Integer m = new Integer(10); //문법에는 맞으나 권장하지 않는(deprecated) 표현
		Integer m = 10;
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(10);
		list3.add(20);
		
		System.out.println(list3.get(1));
		
		
		
	}
}
