import java.util.Scanner;
import java.util.ArrayList;

public class Array2 {
	
	public static void main(String[] args) {
		
		//2���� �迭��ü
		//new int[2][3] //int[3] ��ü�� �ּҸ� 2�� ���� �������� �迭. [int[3], int[3]]
		//int[][] arr //int�� �迭�� ���������� �迭�� ��������
		int[][] arr = new int[2][3];
		
		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 2;
		
		arr[1][0] = 10;
		arr[1][1] = 11;
		arr[1][2] = 12;
		
		//��(.)�� ��� ��ü�� �迭������ ���Ǳ�� ����.
		System.out.println(arr.length); //2
		System.out.println(arr[0].length); //3

		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				System.out.println(arr[i][k]);
			}
		}
		
		//������ ���̰� �ٸ� �迭�� �����ϴ� �迭�� ����
		//������ ���������� �迭�̴ϱ� �� ���������� ���� �迭�� ����Ű�� �������
		int[][] aaa = new int[3][]; //int[] �������� 3��¥�� �迭
		aaa[0] = new int[3];
		aaa[1] = new int[5];
		aaa[2] = new int[10];
		//aaa[2] = new double[10]; //�ڷ����� ���������� �ڷ����� ��ġ�ؾ� ��
		
		for(int i = 0; i < aaa.length; i++) {
			for(int k = 0; k < aaa[i].length; k++) {
				System.out.print(aaa[i][k]+",");
			}
			System.out.println();
		}
		

		//������ ������ 2���� �迭
		String[][] sss = new String[2][3];
		sss[0][0] = "Apple";
		sss[0][1] = "Computer";
		sss[0][2] = "iPhone";
		
		sss[1][0] = "MS";
		sss[1][1] = "Co.";
		sss[1][2] = "Windows";
		
				
		//2���� �迭�� �ʱ�ȭ
		int[][] aaa2 = new int[][] {new int[] {10, 20}, new int[] {30, 40, 50}};
		//�����ڵ��� �Ʒ��� ���� ���·� ����ϱ� ��ȣ
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
		
		//���� ���̰� ������ 2���� �迭�� �ʱ�ȭ
		int[][] aaa4 = new int[][] {{1, 2}, {3, 4}, {5, 6}};
		
		//���� ���̰� �������� ���� 2���� �迭�� �ʱ�ȭ
		int[][] aaa5 = new int[][] {{1}, {2, 3}, {4, 5, 6}};
		
		
		//Scan �޾Ƽ� �� ĭ����ŭ 2���� �迭 �����
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
		
		//�̰� �Ұ���. foreach������ : ���� �׸��� �迭�� �� ����� ���� ������ �� �ٸ� �������� �� ��� ��ü�� �ƴϴ�. �׷��� �Ʒ����� t�� ���� ������ ���� ����.
		//foreach���� ���Կ� Ȱ���ϴ� �� �Ұ�
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
		
		//3, 4, 5...���� �迭�� �Ȱ���
		int[][][] arrr = new int[2][][];
		
		arrr[0] = new int[2][];
		arrr[1] = new int[3][];
		
		arrr[0][0] = new int[2];
		arrr[0][1] = new int[2];
		
		arrr[1][0] = new int[2];
		arrr[1][1] = new int[3];
		arrr[1][2] = new int[] {120, 121, 122, 123}; //�ʱ�ȭ
		
		arrr[0][0][0] = 10;
		arrr[0][0][1] = 20;
		
		System.out.println(arrr[1][2][2]);
		System.out.println("------------");
		
		
		//ArrayList Ŭ����
		
		//�ѹ� ������� �迭 ��ü�� ����(��� ����)�� ������ �� ����!
		//�׷��� �������� Ȱ�뵵�� ������. �뷮�� ����Ʈ�� �����ϰ� �����ϱⰡ ����
		//���̸� ���̰� ���� �� �ִ� �迭�� ������? �ؼ� ���� �� ArrayList
		//�� ���߿� String �������� ���� ���� Ŭ����		

		ArrayList<String> list = new ArrayList<String>(); //String�� ����ϴ� ArrayList ����
		
		//list�� ���̸� �� �� ����
		System.out.println(list.size());
		
		//��� �߰�
		list.add(new String("aaa"));
		list.add(new String("bbb"));
		list.add("ccc");
		System.out.println(list.size());
		
		//index
		String s1 = list.get(1);
		System.out.println(s1);
		
		//��� ����
		list.remove(1);
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		//ArrayList�� �������� ��ҷ� ���� �� ����.
		//��, �⺻�� �ڷ���(boolean, ... , double)�� ��� �Ұ�
//		ArrayList<int> list2 = new ArrayList<int>(); //����. 
		
		//�׷��� Wrapper Ŭ����(�⺻�� �ڷ����� ���δ� Ŭ����)�� ����� �Ѱ� �غ�
//		Integer m = new Integer(10); //�������� ������ �������� �ʴ�(deprecated) ǥ��
		Integer m = 10;
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(10);
		list3.add(20);
		
		System.out.println(list3.get(1));
		
		
		
	}
}
