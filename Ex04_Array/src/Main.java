import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Java���� �迭�� ��ü��
		
		//int�� 3ĭ �迭��ü�� int�� �迭 �������� ����
		int[] arr = new int[3]; 
		//int arr[] �̷��� C���ó�� ǥ���� ���� ������ �������� �� ������� �ʴ´�.
		
		
		//���������� �ڷ����� ���� ���� ���ȣ �ȿ� ũ�⸦ ������ �ȵ�.
//		int[3] arrr; //����
		
		//C������ ���������� ���� ���� �����ϸ� �迭�� ��°�� �����ϰų� ����� �� �ִ� ����� ����.
		//���������� ����ϸ�?
		//println�� ���. ���������� ����ϸ� �ڵ����� ���������� �����ϴ� ��ü�� .toString() ����� �ߵ���.
		System.out.println(arr); //I@6504e3b2 : Int�� �迭�̰� @ �ڴ� �ּ��� �ؽð�
		//java�� ��� ��ü�� �ϳ��� �������� toString() �޼ҵ带 ���� ����. ���� ����� ��ü�鵵 �ڵ� ����.
		
		//��� Java�� ��ü�� ��������� �����Ⱚ���� �δ� �� ������� ����. �ڵ����� �ʱ�ȭ�ȴٴ� ��.
		//0�� �ش��ϴ� ������ �ʱ�ȭ��. int�� 0, double�̸� 0.0, boolean�̸� false, 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
//		System.out.println(arr[3]); //����
		
		//�迭 ��ҿ� �� ����
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		//�ڹٿ����� �迭�� ��ü. ��ü�� ������ �Լ�(�޼ҵ�)�� ������ ����
		//�ڹ��� ������� �߿� �迭�� ���̰��� ������ �ִ� ����� ����
		//length
		System.out.println(arr.length);
		
		//���
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//�ʱ�ȭ
		int[] arr2 = new int[] {100, 200, 300}; //�ʱ�ȭ�� �� ���� ���ȣ �ȿ� ������ ���� �ʴ´�. �׷��� �� ���� �ְų� ���� �ִ� �͵� ����.
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		//�ʱ�ȭ�� �� �ϰ� ���� ������ ������ ����
		
		//���������ε� �ʱ�ȭ ����
		int aa = 11, bb = 22;
		int[] arr6 = new int[] {aa, bb, 33, aa + 10, bb * 2};
		for(int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i]);
		}
		
		//�迭 �ʱ�ȭ �� ���ǥ���� ����
		int[] arr7 = {50, 60, 70}; //new int[] ������ ��
		
		//�迭�� ���� ���� �� ������ �����ϴ� �͵� ����(C������ �� �ƴ� ��)
		int k = 3;
		int[] arr3 = new int[k];
		
		//�迭 ũ�⸦ ����ڷκ��� Ű���� �Է� �޾� �����ϴ� �͵� ����
		
		Scanner scan = new Scanner(System.in);
//		int len;
//		System.out.print("Enter array size: ");
//		len = scan.nextInt();
//		int[] arr4 = new int[len];
//		for(int i = 0; i < arr4.length; i++) {
//			System.out.print(arr4[i] + ",");
//		}
//		System.out.println();
		
		//������ �迭 ���� 0�� ¥���� ���� �� ����
		int[] arr5 = new int[0];
		System.out.println(arr5.length);
//		System.out.println(arr5[0]); //����
		
		//�迭 �������������� ����
		double[] arr8 = new double[] { 1.1, 2.2, 3.3};
		double[] arr9 = arr8; //���� ��ü�� ����Ŵ
		for(int i = 0; i < arr9.length; i++) {
			System.out.println(arr9[i]+", ");
		}
		
		//�迭 ����
		double[] arr10 = new double[arr8.length]; //���̰� ���� �ٸ� ��ü ����
		for(int i = 0; i < arr10.length; i++) {
			arr10[i] = arr8[i];
		}

		
		//������ ������ �迭
		String s1, s2, s3;
		s1 = new String();
		s2 = new String();
		s3 = new String();
		//�� ������ �迭�� ������.
		
		//new Class��[ũ��]
		//new String[3]; String�� �迭�� �ƴ϶� String�� ���������� �迭(8����Ʈ * 3)�� ����. ����!
		//�迭 ��ü �ȿ� ��ü ��ü�� ���� �ְ� �ϴ� ������ ����. 
		String[] sArr = new String[3]; //String�� �迭 ��������(8����Ʈ)�� ����
		//String�� �迭�� �迭 ��ü��. String�� ����� ���� ���� �ʴ�.
		int[] arr11 = new int[3]; //�⺻�� ������ �迭�� �����ϴ�.
		
		System.out.println(sArr); //java.lang.String;@2acf57e3
		System.out.println(sArr[0]); //null
		
		sArr[0] = new String("apple");
		sArr[1] = new String("computer");
		sArr[2] = "iPhone";
		
		System.out.println(sArr[0].toString()); //���� ������ �� ���������� ����Ű�� ��ü�� ����� �ҷ��´�.
		System.out.println(sArr[1]);//toString()�� �ڵ����� �ҷ����� print�� ��� ���
		System.out.println(sArr[2]);
		
		System.out.println(sArr[0].length());
		System.out.println(sArr[1].length());
		System.out.println(sArr[2].length());
		
		System.out.println(sArr[2].charAt(1));

		//���������� �迭�� �ʱ�ȭ ����
		//�⺻�� �迭�� ����
		int[] aaa = new int[] {10, 20, 30};
		String[] sss = new String[] {new String("Hello"), new String("My"), new String("Friend")};
		String[] sss2 = new String[] {"Hello", "My", "Friend"}; //String ������ �����
		String[] sss3 = {"Hello", "My", "Friend"}; //�迭 ������ �����
		
		//�ٸ� Ŭ���� ���������鵵 �迭��..
		//Random ��ü ���� ����
		Random rnd = new Random(); //��ü ���� ���� ������ �� ��ȣ �ʿ�. �̸� ���� ��ü�� ������ٴ� �� �� �� �ִ�.
		
		//Random ���������� �迭. 
		Random[] rrr = new Random[3]; //new Random[3]; Random�� ���������� �迭�� ����� ��. ������ ���� �迭 ��ü�� new �� ��

		rrr[0] = new Random();
		rrr[1] = new Random();
		rrr[2] = new Random();
		
		System.out.println(rrr[0].nextInt(100)); //0~99
		
		//�ʱ�ȭ
		Random[] rrr2 = new Random[] {new Random(), new Random(), new Random()};
		
		//����� ���� Ŭ������ ���� ����
		//�Ʒ� Student Ŭ���� ���� ����
		Student[] stus = new Student[3]; //�������� �迭, ������ �� �迭�� ������������ ���� ����.
		stus[0] = new Student();
		stus[1] = new Student();
		stus[2] = new Student();
		
		stus[0].name = "Sam";
		
		//���� for��. �ٸ� ������ foreach���̶�� �θ��� java������ �ٵ� �׷��� �θ���.
		int[] nums = new int[10];
		nums[0] = 1;
		nums[1] = 2;
		//... �̰� ���� ��?
		
		for(int i = 0; i < nums.length; i++) {
			int t = nums[i];
			System.out.println(t);
		}
		
		//�� for���� ���� ���� ���� for��
		//for(�ӽ� ���� : �迭){}
		//������ 0������ ��������. �����Ϸ��� �⺻ for�� ���.
		for(int t : nums) { //t�� �� ��� �ϳ� �ϳ�
			System.out.println(t);
		}
		
		int n = 1;
		for(int t: nums) {
			t = n++;
		}
		for(int t: nums) {
			System.out.println(t);
		}
		
		
		
		
		//�迭�� Ŭ���� �̸��� ����?
		 
		System.out.println(arr10.getClass().getMethods());
		
		
	}
}

class Student{
	String name;
	int kor;
	int eng;
}
