//System Library�� java.base, java.lang ���� ���̺귯������ import���� �ʾƵ� �⺻��. �������� import �ʿ�.
public class Ex01_Print {

		public static void main(String[] args) {
			
			//��±��(�Լ�, �ڹٿ����� Method)�� ���� ��ü���� ��� ��û
			//1. print()
			System.out.print("Hello");
			System.out.print("\n");
			
			System.out.print("Nice\n");
			System.out.print("\n");
			
			System.out.print('A');
			System.out.print("\n");
			
			System.out.print(10);
			System.out.print("\n");
			
			System.out.print(1.1);
			System.out.print("\n");
			
			System.out.print(true); //Java���� true�� 1�� ȣȯ���� �ʴ´�. while(1)�� ����
			System.out.print("\n");
			
			//println
			System.out.println("�� �ٲ�");
			
			//���ڿ��� + ����(���� ������)
			System.out.println(10+20);
			System.out.println("aaa" + "bbb");
			
			//���� �ٸ� �ڷ������� ���� ����
			System.out.println(10 + 3.14); //int -> double
			System.out.println(10 + "aaa"); //int -> string���� �ڵ�����ȯ. string�� double���ٵ� �ڷ����� ũ�� ����
			System.out.println(10 + 20 + "aaa"); ///30aaa
			System.out.println("aaa" + 10 + 20); //aaa1020
			
			System.out.println(5 + "+" + 3 + "=" + (5+3));
			System.out.println(5 + "+" + 3 + "=" + 5+3);
			
			//���������ε� �� ��µ�
			int num = 10;
			double num2 = 3.14;
			System.out.println(num);
			System.out.println(num2);
			System.out.println(num + num2);
			System.out.println(num + " * " + 2 + " = " + num * 2);
			
			//print�� "" �ȿ��� �״�� ��µ��� �ʴ� ���� 2��: ", \
			//C���� �� ������ %�� ������ �ƴ�.
			System.out.println("���� \"ȫ�浿\"�Դϴ�.\\ %");
			
			//C����� printf�� �ִ�. ��¼��ĵ� ����
			System.out.printf("%4d %.3f \n", 10, 1.23456);
			
			//������ �ڷ��� 
			//�ڹٿ��� �ڷ����� �� ����(��� c�� �׷��� ��)
			
			//1. �⺻(����) �ڷ���(primitive) 8��
			//�����͸� �����ϴ� �뵵
			//boolean, byte, char, short, int, long, float, double
			//boolean�� ����
			//byte, char, short, int, long�� ������
			//float, double�� �Ǽ���
			
			//boolean 	1����Ʈ
			//byte 		1����Ʈ New! -128 ~ 127
			//char		2����Ʈ Unicode
			//short		2����Ʈ
			//int		4����Ʈ
			//long		8����Ʈ �� Ŀ��
			//float		4����Ʈ
			//double	8����Ʈ
			
			//2. ���� �ڷ���(reference)
			//String, Random, Scanner, ... �� 4õ ������ class��
			
			
			//������(identifier)�� ��Ģ
			//1. ��ҹ��� ����. ���� ���� ����
			//2. ����� ��� �Ұ�
			//3. ���ڷ� ���� �Ұ�
			//4. Ư�����ڴ� '_'�� '$'�� ���
			
			//���� ���� ����
			
			//������ ���� �� ������ ��
			//�ڷ����� ū ���� ���� �Ϳ� ������ ����
			//c ���� �ٸ� ��
			
			//int b = 3.14;
			//int b; b = 3.14;
			
			double c = 10; //ok
			
			//�� ������ �� ������ ũ��(���� ������ ���� ����)�� ����ؾ� 
			byte by = 127; 
			System.out.println(by);
			//by = 128; //Error
			
			short sh = 32767; //[2 byte: 65,536]
			System.out.println(sh);
			//sh = 32768;
			
			int in = 2100000000; //42�ﰳ
			//in = 2200000000;
			System.out.println(in);

			long lo ;
			//lo = 10000000000; //������ ���� ����: ���ͷ� ����� �޸𸮿� ���� �� C�� �ڹٴ� �������� �⺻������ int�� �����. �׷��� int�� 100���� �� ���ϱ�.
			//���̾ �ٿ��� ���ͷ� ����� long���� ���鵵�� ������� �Ѵ�.
			lo = 10000000000L;
			System.out.println(lo);
			//long lo2 = 10000000000; //�̰� �ʱ�ȭ�ε� �� ����? �޸𸮿� ����� �� ����µ�? �̰� �����Ϸ��� ���� ��
			
			float flo; 
			//flo = 3.14; //�̰͵� ����. �Ǽ��� ����� �⺻���� double���̱� ������ float�� ������ �� ����.
			flo = 3.14f; //���̾�� �ڷ����� �����ش�.
			System.out.println(flo);
			
			double dou;
			dou = 3.14; //���� ����. �Ǽ��� ����� �⺻���� double�̴ϱ�.
			System.out.println(dou);
			
			short z = 10 + 20; //short�� ����� ������ ���� ������ ����� int�ε��� �ڵ����� ����ȯ�� ���ش�? �̰� ������ ����
			System.out.println(z);
			
			short x = 10, y = 20; 
			//z = x + y; //������ short�� ������ �����Ͽ� ������ ���� �ڵ� ����ȯ�� �� ���ش�. �� �̻��� �κ��̶��.
			
			boolean truth = true;
			truth = false;
			System.out.println(truth);
			
			if(truth) System.out.println("it's true");
			
			//���
			//1. ���ͷ� : ������ �״�� - 19, 3.14, 'G', "hello"
			//2. final ���: c�� const ����� ��ü.
			final int cons = 10;
			System.out.println(cons);
			y = 3;
			System.out.println(cons);
			
			
			
		}
}
