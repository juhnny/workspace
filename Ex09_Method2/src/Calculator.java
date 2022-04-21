
public class Calculator {

	int sum(int a, int b) {
		return a + b;
	}

	int substract(int a, int b) {
		return a - b;
	}

	int multiply(int a, int b) {
		return a * b;
	}
	
	double devide(int a, int b) {
		return (double) a / b;
	}

	// Method Overloading
	double sum(double a, double b) {
		return a + b;
	}
	
	double substract(double a, double b) {
		return a - b;
	}
	
	double multiply(double a, double b) {
		return a * b;
	}
	
	double devide(double a, double b) {
		if (b == 0) { //0으로의 나눗셈을 막아보려 했으나...
			System.out.println("parameter 2 cannot be 0");
//			return; //Java에서 메소드의 리턴타입이 void가 아닌데 return 값을 안 쓸 수는 없다. 에러. 예외 처리 방법을 배우고 다시 해보자.
		}

		return (double) a / b;
	}

	//0으로의 나눗셈을 막아보려고 아래처럼 만들어봐도 에러. 
	//return이 if문 안에만 있으면 return이 발생하지 않는 경우가 생길 수 있어서 컴파일러에서 막는 듯.
//	double devide2(int a, int b) {
//		if (b != 0) {
//			return (double) a / b;
//		} 
//	}

	//문자열 데이터를 받아서 int로 바꿔서 산술연산해 주는 기능메소드
	int sum(String s1, String s2) {
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		return a + b;
	}
	
	//가변길이 인자 메소드
	int sumN(int... n) {
		System.out.println(n); //[I@76ccd017 //int형 배열의 참조변수임을 알 수 있다. 즉, int... 는 인자를 배열로 받는 것.
		int sum = 0;
		for(int t : n) {
			sum += t;
		}
		return sum;
	}
}
