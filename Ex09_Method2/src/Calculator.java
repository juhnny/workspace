
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
		if (b == 0) { //0������ �������� ���ƺ��� ������...
			System.out.println("parameter 2 cannot be 0");
//			return; //Java���� �޼ҵ��� ����Ÿ���� void�� �ƴѵ� return ���� �� �� ���� ����. ����. ���� ó�� ����� ���� �ٽ� �غ���.
		}

		return (double) a / b;
	}

	//0������ �������� ���ƺ����� �Ʒ�ó�� �������� ����. 
	//return�� if�� �ȿ��� ������ return�� �߻����� �ʴ� ��찡 ���� �� �־ �����Ϸ����� ���� ��.
//	double devide2(int a, int b) {
//		if (b != 0) {
//			return (double) a / b;
//		} 
//	}

	//���ڿ� �����͸� �޾Ƽ� int�� �ٲ㼭 ��������� �ִ� ��ɸ޼ҵ�
	int sum(String s1, String s2) {
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		return a + b;
	}
	
	//�������� ���� �޼ҵ�
	int sumN(int... n) {
		System.out.println(n); //[I@76ccd017 //int�� �迭�� ������������ �� �� �ִ�. ��, int... �� ���ڸ� �迭�� �޴� ��.
		int sum = 0;
		for(int t : n) {
			sum += t;
		}
		return sum;
	}
}
