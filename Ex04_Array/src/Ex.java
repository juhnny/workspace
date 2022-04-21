import java.util.Scanner;
import java.util.Random;



public class Ex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//문제 1.
//길이가 5인 int형 배열을 선언해서 프로그램 사용자로부터 총 5개의 정수를 입력 받자.
//그리고 입력이 끝나면 다음의 내용을 출력하도록 예제를 작성해보자.
//  - 입력된 정수 중에서 최대값
//  - 입력된 정수 중에서 최소값
//  - 입력된 정수의 총 합
//
//단, 반드시 입력을 완료한 상태에서 '최대값'과 '최소값' 그리고 '총합'을 계산해야 한다.
		
//		int[] arr = new int[5];
//		int max, min, sum = 0;
//		
//		System.out.println("Enter 5 numbers");
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println("Number"+(i+1)+": ");
//			arr[i] = scan.nextInt();
//			
//		}
//		
//		max = arr[0];
//		min = arr[0];
//		for(int t : arr) {
//			max = (max < t)? t:max;
//			min = (min > t)? t:min;
//			sum += t;
//		}
//		
//		System.out.println("max: "+max);
//		System.out.println("min: "+min);
//		System.out.println("sum: "+sum);

//문제 2.
//아래와 같이 학생들의 성적을 받아서 평균을 구하는 프로그램을 작성해보자.
//
//실행결과 예시)
//
// 학생의 수를 입력하시오 : 2
//
// 학생 1의 성적을 입력하세요 : 20
// 학생 2의 성적을 입력하세요 : 110
// 잘못된 성적입니다. 다시 입력하시오.
// 학생 2의 성적을 입력하세요 : 30
// 
// 성적 평균은 25.0 입니다.
	
//		int numStu;
//		int sum = 0;
//		
//		System.out.println("How many students?");
//		numStu = scan.nextInt();
//		int[] arr = new int[numStu];
//		
//		for(int i = 0; i < numStu; i++) {
//			System.out.print("학생 "+(i+1)+"의 성적을 입력하세요: ");
//			int t = scan.nextInt();
//			if(t >= 0) arr[i] = t; //다음엔 100보다 큰 경우도 걸러내자.
//			else 
//				{
//				System.out.println("잘못된 성적입니다. 다시 입력하시오.");
//				i--;
//				continue;
//				}
//			sum += t;
//		}
//
//		System.out.println("성적 평균은 "+(double)sum/(double)arr.length+"입니다.");
		

//문제 3.
//입력값들의 분포를 시각적으로 볼 수 있는 히스토그램을 만드는 프로그램을 작성하시오.
//이 프로그램은 1부터 100이하의 정수 10개를 읽어야 하고, 1-10,11-20 등의 범위에 드는
//값들의 횟수를 아래와 같이 출력하여야 한다.
//
//  1 - 10 : ****
// 11 - 20 : **
// 21 - 30 : *
// 31 - 40 : **
// ..........
// ..........
		
//		//임의 배열
//		int[] arr = new int[] {1, 14, 19, 40, 60, 70, 80, 88, 99, 100};
//		
//		for(int start = 1; start < 100; start += 10) {
//			int end = start + 9;
//			System.out.print(start+" - "+end+": ");
//		
//			for(int t : arr) {
//				if(t >= start && t <= end) System.out.print("*");
//			}
//			System.out.println();
//		}
		

//문제 4,
//배열을 이용하여 간단한 극장 예약 시스템을 작성하여 보자. 아주 작은 극장이라서 좌석이
//10개밖에 안 된다. 사용자가 예약을 하려고 하면 먼저 좌석 배치표를 보여준다. 즉, 예약이
//끝난 좌석은 1로, 예약이 안된 좌석은 0으로 나타낸다.
//
//
// 좌석을 예약하시겠습니까( 1(Y) 또는 0(N) )?  1
//
// 현재의 예약 상태는 다음과 같습니다.
// -----------------------
// 좌석 번호 :  1  2  3  4  5  6  7  8  9  10
// -----------------------
// 예약 상태 :  0  0  0  0  0  1  1  1  0   1
//
// 몇번째 좌석을 예약하시겠습니까? 6
// 죄송합니다. 이미 예약된 좌석입니다. 다른 좌석을 선택해 주세요.
// 
// 몇번째 좌석을 예약하시겠습니까? 1
// 1번 좌석 예약되었습니다.
//
// 좌석을 예약하시겠습니까( 1(Y) 또는 0(N) )?  0
// 예약을 종료합니다. 
		
//		while
//			예약 스위치
//			while
//				좌석 번호 입력
//				if 0 예약처리
		
//		int[] reserv = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//		
//		while(true) {
//			System.out.print("좌석을 예약하시겠습니까? (1(Y) 또는 0(N))?");
//			switch(scan.nextInt()) {
//			case 1:
//				System.out.println("현재의 예약 상태는 다음과 같습니다.");
//				System.out.println("-----------------------------");
//				System.out.println("좌석 번호: 1 2 3 4 5 6 7 8 9 10");
//				System.out.println("-----------------------------");
//				System.out.print("예약 상태: ");
//				for(int t: reserv) {
//					System.out.print(t+" ");
//				}
//				System.out.println("\n");
//				
//				while(true) {
//					System.out.print("몇 번 좌석을 예약하시겠습니까?");
//					int seat = scan.nextInt();
//					if(reserv[seat - 1] == 1) {
//						System.out.println("죄송합니다. 이미 예약된 좌석입니다. 다른 좌석을 선택해 주세요.");
//						break;
//					} else if(reserv[seat -1] == 0) {
//						System.out.println(seat+"번 좌석 예약되었습니다.\n");
//						reserv[seat -1] = 1;
//						break;
//					} else {
//						System.out.println("잘못 입력하셨습니다. 좌석 번호를 입력해주세요.");
//					}
//				}
//				break;
//			case 0:
//				System.out.println("예약을 종료합니다.");
//				break;
//			}
//		}
		

//문제 5.
//첫번째 배열 arr1은 {10, 20, 30, 40, 50}의 정수형 요소값을 가지고 있다.
//두번째 배열 arr2은 { 1,  2 ,  3  ,  4 ,  5 }의 정수형 요소값을 가지고 있다.
//세번째 배열 arr3의 요소값은 arr1의 요소와 arr2의 요소값을 차례로 덧셈한
//결과를 저장하도록 프로그래밍 해보자. 단 arr2의 요소는 역순으로 더해지도록 하자.
//즉, arr1의 0번 요소와 arr2의 4번 요소를 더해서 arr3의 0번 요소에 대입하도록 해야한다.
//arr3의 1번 요소에는 arr1의 1번 요소와 arr2의 3번 요소가 더해져야 한다는 것이다.
//
//이렇게 arr3의 요소값을 모두 대입하고 그 값을 차례대로 출력해보자.

//		int[] arr1 = new int[]{10, 20, 30, 40, 50};
//		int[] arr2 = new int[] {1, 2, 3, 4, 5};
//		int[] arr3 = new int[5];
//		for(int i = 0; i < arr3.length;i++) {
//			arr3[i] = arr1[i] + arr2[4 - i];
//		}
//		
//		for(int t: arr3) {
//			System.out.print(t+"\t");
//		}
		
//문제 6.
//길이가 25인 정수형 배열을 만들어라. 그리고 이 배열의 각 요소에 1부터 25까지 25개의 정수값이
//Random하게 저장되도록 프로그래밍 하시오. 단, 배열안에 저장된 Random값은 중복된 숫자가
//있으면 안된다. 값들이 제대로 대입되어 있는지 알아보기 위해 1줄에 5개씩 5줄로 각 배열의 요소를
//인덱스 순서대로 출력해보자.
		
//		Random rnd = new Random();
//		
//		int[] arr = new int[25];
//		
//		for(int i = 0; i < arr.length; i ++) {
//			arr[i] = rnd.nextInt(25) + 1;
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+"\t");
//			if(i%5 == 4) System.out.println();
//		}
//		System.out.println();
		
//문제 7.
//위의 6번 문제를 가로 5, 세로 5인 2차원 배열로 만들어 보자.

//		int[][] arr2 = new int[5][5];
//
//		for(int i = 0; i < arr2.length;i++) {
//			for(int k = 0; k < arr2[i].length; k++) {
//				arr2[i][k] = rnd.nextInt(25) + 1;
//				System.out.print(arr2[i][k]+"\t");
//			}
//			System.out.println();
//		}
		
		
//문제 8.
//사용자로부터 정수형 숫자 하나를 입력받자. 이 입력된 숫자 만큼의 String 배열을 만들어보자.
//배열을 만들었다면 사용자로 부터 배열의 길이 만큼 문자열을 입력받아 저장하도록 프로그래밍 해보자.
//입력된 문자열들이 잘 저장되어 있는지 확인하기 위해 배열의 각 요소들을 차례로 출력해보자.
//단, 출력은 foreach 문을 이용해보자.

//		int len;
//		System.out.print("Input length of an array: ");
//		len = scan.nextInt(); 
//		scan.nextLine(); //Scanner의 next() ~ nextDouble() 메소드는 개행문자('\n') 바로 전까지만 읽어오므로 버퍼에 개행문자가 남아있다.
//		//nextLine()만 이와 다르게 개행문자까지 읽어오므로 nextInt() 다음에 쓴 nextLine()은 개행문자 하나만 읽어온 채 끝난다. 
//		//그래서 이처럼 개행문자를 하나 읽어오고 소모되는 nextLine()을 추가로 둬야 한다.
//		
//		String[] arr = new String[len];
//		for(int i = 0; i < len; i++) {
//			System.out.print("Enter a string: ");
//			arr[i] = scan.nextLine(); 
//		}
//		
//		for(String t: arr) {
//			System.out.println(t);
//		}
		
//문제 9.
//어느 교육원의 Java Programming 성적을 저장하는 프로그램을 만들어보다.
//교육원의 Java Programming은 3개 반으로 운영되고 있다. 단, 각 반의 인원수는 서로 다를 수 있다.
//프로그램 사용자가 3개반의 성적을 입력하기 전에 해당 반의 인원수를 입력할 수 있도록 하고 그 인원수
//만큼 성적을 넣으면 다음 반의 인원수를 입력하는 방식으로 3개반의 모든 성적을 입력해보자.
//모든 성적 입력이 끝났으면 그 값들을 출력해보고 각 반의 평균도 같이 계산되도록 해보자.
//
//실행 예)
//
// [1반] 인원 수 입력 : 3
// [1반 1번] : 80
// [1반 2번] : 70
// [1반 3번] : 60
// 
// [2반] 인원 수 입력 : 4
// [2반 1번] : 90
// [2반 2번] : 80
// [2반 3번] : 80
// [2반 4번] : 60
//
// [3반] 인원 수 입력 : 5
// [3반 1번] : 90
// [3반 2번] : 80
// [3반 3번] : 70
// [3반 4번] : 40
// [3반 5번] : 60
		
//
// --- Java Programming 성적표 ----
// [1반]  80  70  60   [평균 : 70.0]            
// [2반]  90  80  80  60   [평균 : 77.5]
// [3반]  90  80  70  40  60  [평균 : 68.0]
// -----------------------
// 전체평균 :  71.67
// 최 우수반 [2반]  
		
//		int[][] arr = new int[3][];
//		int stus;
//		for(int i = 0; i < 3; i++) {
//			System.out.print("["+(i+1)+"반] 인원 수 입력: ");
//			stus = scan.nextInt();
//			arr[i] = new int[stus];
//			
//			for(int k = 0; k < stus; k++) {
//				System.out.print("["+(i+1)+"반 "+(k+1)+"번] : ");
//				arr[i][k] = scan.nextInt();
//			}
//			System.out.println();
//		}
//		
//		int sum = 0;
//		for(int i = 0; i < 3; i++) {
//			System.out.print("["+(i+1)+"반] ");
//			for(int k = 0; k < arr[i].length; k++) {
//				System.out.print(arr[i][k]+"  ");
//				sum += arr[i][k];
//			}
//			System.out.println("[평균: "+((double)sum/arr[i].length)+"]");
//			sum = 0;
//		}

//
//
//
//문제 10.
//5*5크기의 Metrix에 나선형으로 숫자를 출력하는 프로그램을 작성해 보자.
//가로가 5, 세로가 5인 matrix에 1부터 25까지의 숫자를 나선형으로 저장하는 프로그램으로
//2차원 배열 int buf[][]에 아래의 결과처럼 나오도록 각 배열요소에 값을 저장하는 프로그램
//이다.
//
//  01  16  15  14  13
//  02  17  24  23  12
//  03  18  25  22  11
//  04  19  20  21  10
//  05  06  07  08  09
//
// 배열의 값을 출력하는 함수는 아래와 같다. 이 함수는 변경하지 못한다.
		
//for(int i =0; i<5; i++)
//{
//        for(int j=0;j<5;j++)
//        {
//             System.out.printf("%03d \t", buf[i][j]);
//        }
//        System.out.println();
//   }
//}
//   
		int[][] buf = new int[5][5];
		
		int y = 0, x = 0, dy = 1, dx = 0, cnt = 0;
		for(int i = 1; i <= 25; i++) {
			buf[y][x] = i;
			System.out.println("dy: "+dy+" dx: "+dx);
			
			if(y + dy < 0 || y + dy > 4 || x + dx < 0 || x + dx > 4 ||
				buf[y+dy][x+dx] != 0) {
				switch(cnt%4) {
				case 0:
					dy = 0; dx = 1;
					break;
				case 1:
					dy = -1; dx = 0;
					break;
				case 2:
					dy = 0; dx = -1;
					break;
				case 3:
					dy = 1; dx = 0;
					break;
				}
				cnt++;
			}
			y += dy; x += dx;
		}
		
		//출력
		for(int i =0; i<5; i++) {
	        for(int j=0;j<5;j++) {
	             System.out.printf("%03d \t", buf[i][j]);
	        }
	        System.out.println();
		}
		
		

	}
}
