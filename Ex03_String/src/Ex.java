import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
//		����1
//		���α׷� ����ڷκ��� �ϳ��� ���ܾ�(String)�� �Է� �޾ƶ�. �׸��� �� �Էµ� �ܾ
//		���ٿ� �ѹ���(character)�� ��½��� ���ƶ�. ��, ����� �� �� ���ڿ� 1�� ������ ���ڰ�
//		��µǵ��� �غ���.
//
//		 ���� ���, "Array"��� �ܾ �ԷµǸ� 
//		 B
//		 s
//		 s
//		 b
//		 z
		
//		System.out.println("sdfsf");
//		
		Scanner scan = new Scanner(System.in);
//		System.out.println("Input a word");
//		String str = scan.next();
//
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println((char)(str.charAt(i) + 1));
//		}
		

//		����2.
//		2���� String ���������� �����ض�. �׷����� ���α׷� ����ڷκ��� ���ܾ �Է� �޾Ƽ�
//		String���� �� �ϳ��� �����Ѵ�. �� ���� ���� �ϳ��� String ���������� ����� ���ܾ
//		�������� ����� String ��ü�� ���� �����غ���.
//		������ ������ ����� ���������� Ȯ���ϱ� ���ؼ� ����غ���.
//		�������, "Hello" �� �Է��ϸ� "olleH"�� ��µǾ�� �Ѵ�.
		
//		String s1 = new String();
//		String s2 = new String();
//		
//		System.out.println("Enter a word");
//		s1 = scan.next();
//		for (int i = s1.length() -1 ; i >= 0; i--) {
//			s2 = s2 + s1.charAt(i);
//		}
//		System.out.println(s2);


//		����3.
//		���α׷� ����ڷκ��� ���ܾ��� �Է� �޴´�. �׸��� ���� �Է� ���� ���ܾ �����ϴ� 
//		���� �߿��� �ƽ�Ű �ڵ��� ���� ���� ū ���ڸ� ã�Ƽ� ����ϴ� ���α׷��� �ۼ��غ���.
//		���� �� �Էµ� ���ܾ "LOVE"��� �� �߿��� �ƽ�Ű �ڵ� ���� ���� ū ���ڴ� V
//		�̹Ƿ� V�� ��µǾ�� �Ѵ�.
		
//		String str = scan.next();
//		char ch = '\0';
//		
//		for(int i = 0; i < str.length(); i++) {
//			ch = (str.charAt(i) > ch)? str.charAt(i):ch;
//		}
//		
//		System.out.println(ch);
		

//		����4.
//		����ڷκ��� ���ڿ��� �ϳ� �Է¹޴´�. �׸��� �� ���� ����Ͻÿ�.
//		�ٸ�, �Էµ� ���ڿ��� ���鹮�ڰ� �ִٸ� �����ϰ� ����Ͻÿ�.
//		���ڿ��� �߰��� ���鹮�ڰ� �־ ���������� �����ؾ��Ѵ�.

//		String str = scan.nextLine();
//		System.out.println(str.replace(' ','\0')); //Ȥ��
//		System.out.println(str.replace(" ","")); 

//		����5.
//		����ڷκ��� ��ȭ��ȣ�� �Է¹޵� ù3�ڸ�, �ι�° 3~4�ڸ�, ����° 4�ڸ� ���ڸ� ���ε���
//		�Է� �޾Ƽ� �ϳ��� ���ڿ��� ���ļ� �����ϰ� ����Ͻÿ�. ��, ���̿� '-'�� �����ڸ� ������ �Ѵ�.
//
//		��)  
//		  ù��° �ڸ� �Է�(3�ڸ�) : 010
//		  �ι�° �ڸ� �Է�(3~4�ڸ�) : 12345
//		  [�߸� �Է��ϼ̽��ϴ�. 3~4�ڸ��� ���ڸ� �Է°����մϴ�.]
//		  �ι�° �ڸ� �Է�(3~4�ڸ�) : 1234
//		  ����° �ڸ� �Է�(4�ڸ�) : 567a
//		  [�߸� �Է��ϼ̽��ϴ�. 3~4�ڸ��� ���ڸ� �Է°����մϴ�.]
//		  ����° �ڸ� �Է�(4�ڸ�) : 5678 
//
//		  �Էµ� ��ȭ��ȣ�� [ 010-1234-5678 ] �Դϴ�.
		
		//���������� �߸� �Է����� ���� �ɷ����� ��ĺ��� �� �Է����� �� break �Ŵ� ������� �غ���. �װ� �� ����. ���� ��� �߸��� ��츦 ������� ������ �� �ִ�.
		//��Ȳ�� ���� �� ���� ����� �ִ� �� ����.
		
//		String s1, s2, s3, snum;
//		int num;
//		
//		while(true) {
//			System.out.print("ù���� �ڸ� �Է�(3�ڸ�) :");
//			s1 = scan.next();
//			num = Integer.parseInt(s1);
//
//			if(s1.length() != 3) {
//				System.out.println("Wrong number");
//				continue;
//			}
//
//			if(num < 0) {
//				System.out.println("Wrong number");
//				continue;
//			}
//			
//			break;
//		}
//		System.out.println("ù��° �ڸ�: "+s1);
//		
//		while(true) {
//			System.out.print("�ι�° �ڸ� �Է�(3~4�ڸ�) :");
//			s2 = scan.next();
//			num = Integer.parseInt(s2);
//
//			if(s2.length() > 4 || s2.length() < 3) {
//				System.out.println("Wrong number");
//				continue;
//			}
//
//			if(num < 0) {
//				System.out.println("Wrong number");
//				continue;
//			}
//			
//			break;
//		}
//		System.out.println("�ι�° �ڸ�: "+s2);
//		
//		while(true) {
//			System.out.print("����° �ڸ� �Է�(3�ڸ�) :");
//			s3 = scan.next();
//			num = Integer.parseInt(s3);
//
//			if(s3.length() != 4) {
//				System.out.println("Wrong number");
//				continue;
//			}
//
//			if(num < 0) {
//				System.out.println("Wrong number");
//				continue;
//			}
//			
//			break;
//		}
//		System.out.println("����° �ڸ�: "+s3);
//		
//		snum = s1 + "-" + s2 + "-" + s3;
//		System.out.println("\n�Էµ� ��ȭ��ȣ�� [ "+snum+" ] �Դϴ�.");

		
		/*** �ٸ� ��� ***/
//		while(true) {
//			System.out.print("ù��° �ڸ� �Է�(3�ڸ�) : ");
//			s1= scan.next();
//			
//			int i;
//			for(i=0; i<s1.length(); i++) {
//				char ch= s1.charAt(i);
//				if( ch<'0' || ch>'9') break;				
//			}
//			
//			if(i==3) break;			
//			else System.out.println("[�߸� �Է��ϼ̽��ϴ�. 3�ڸ��� ���ڸ� �Է°����մϴ�.");
//		}
	
//		����6.
//		����ڷκ��� �̸����ּҸ� �Է¹޾ƶ�. ��, �����ּҴ� @�� �����Ͽ� ���ϼ����ּұ��� ��� �Է¹޾ƾ���.
//		�Է¹��� �����ּҿ��� @�տ� �ִ� ���θ����̸��� @�ڿ� �ִ� ���ϼ����ּҸ� ���� �и��Ͽ� �����ϰ� ����Ͻÿ�.
//
//		��)
//		  ���� �ּ� �Է�(@����) : 96kite
//		  [�߸� �Է��ϼ̽��ϴ�. @���� ���ϼ����ּұ��� ��� �Է��ϼž� �մϴ�.]
//
//		  ���� �ּ� �Է�(@����) : 96kite@hanmail.net
//
//		  �Էµ� �����ּҸ� : 96kite
//		  ���ϼ��� �̸� : hanmail.net
		 
//		String s, id, serv;
//		int index;
//		
//		while(true) {
//			System.out.print("���� �ּ� �Է�(@����) :");
//			s = scan.next();
//			index = s.indexOf('@');
//			
//			if(index == -1) {
//				System.out.println("�߸� �Է��ϼ̽��ϴ�. @���� ���ϼ��� �ּұ��� ��� �Է��ϼž� �մϴ�.");
//				continue;
//			}
//			
//			break;
//		}
//		
//		System.out.println("���� �ּ� �Է�(@����) :"+s);
//		
//		id = s.substring(0, index);
//		serv = s.substring(index + 1, s.length());
//		System.out.println("�Էµ� �����ּҸ�: "+id);
//		System.out.println("���ϼ��� �̸�: "+serv);
		
		//������ @�� ������ �� s.contains("@"), ���ڿ��� ���� �� s.split("@")�� �Ẹ��
//		

//		����7.
//		����ڷκ��� �н����带 ���ڿ��� �Է¹޾� �����ϵ� ������ ��Ģ�� ��Ű�� ������ �ٽ� �Է��ϵ��� �Ͻÿ�.
//		��Ģ1. ������, ����, Ư�����ڸ� ȥ���Ͽ� 8�ڸ� �̻����� ����.
//		��Ģ2. ������, ���ڸ� ����� ��� 10�ڸ� �̻����� ����.
//		��Ģ3. ������ �Ǵ� ���� �Ǵ� Ư������ �ܵ� ��븸���δ� ���� �Ұ�.
//
//		�Էµ� �н����尡 ��Ģ�� �´��� Ȯ���ϱ� ���� ����غ��ÿ�.

		//�����̽��� ����
		//���ʹ� ������
		//
		
//		isInt('1');
//		isInt('a');
//		isInt('=');
//
//		isChar('1');
//		isChar('A');
//		isChar('f');
//		isChar('!');
//		
//		isSpecial('1');
//		isSpecial('@');
//		isSpecial('s');

		String pw;
		while(true) {
			System.out.print("\n��й�ȣ�� �Է��ϼ���(8�ڸ� �̻�): ");
			pw = scan.next();
			int leng = pw.length();
			
			if(leng < 8) {
				System.out.println("8�ڸ� �̻��̾�� �մϴ�.");
				continue;
			}
			
			//������ ���� ���� ����
			//����, ���ĺ�, Ư������ ���� ī��Ʈ
			int notCh = 0;
			char ch; 
			int cntInt = 0, cntChar = 0, cntSpec = 0; 
			
			for(int i = 0; i < leng; i++) {
				ch = pw.charAt(i);
				System.out.println(ch);
				if(ch < 32 || ch > 126) {
					System.out.println("�Է� �������� ���� ���ڰ� �ֽ��ϴ�.");
					notCh = 1;
					break;
				}
				
				if(isInt(ch)) cntInt++; //������ ������ cnt�� ī��Ʈ
				if(isChar(ch)) cntChar++; //���ĺ��� ������ cnt�� ī��Ʈ
				if(isSpecial(ch)) cntSpec++; //Ư�������� ������ cnt�� ī��Ʈ
			}
			if(notCh == 1) continue;
			
			//���
			if(cntInt == leng ||
				cntChar == leng ||
				cntSpec == leng) {
					System.out.println("������ �Ǵ� ���� �Ǵ� Ư�����ڸ� �ܵ� ����� �� �����ϴ�.");
					continue;
			}

			if(cntSpec == 0 && leng < 10) {
				System.out.println("Ư������ ������ �� 10�ڸ� �̻��̾�� �մϴ�.");
				continue;			
			}
				
			break;
		}
		
		System.out.println("\\n�н����尡 �ùٸ��� ����� �����ϴ�.");		 		
		System.out.println("PW: "+pw);

		
	}//main()

	static boolean isInt(char a) {
		if (a >= 48 && a <= 57) {
			System.out.println("int");
			return true;
		} else {
			System.out.println("no int");
			return false;
		}
	}

	static boolean isChar(char a) {
		if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
			System.out.println("char");
			return true;
		} else {
			System.out.println("no char");
			return false;
		}
	}

	static boolean isSpecial(char a) {
		if ((a >= 32 && a <= 47) || (a >= 58 && a <= 64) || (a >= 91 && a <= 96) || (a >= 123 && a <= 126)) {
			System.out.println("special");
			return true;
		} else {
			System.out.println("no special");
			return false;
		}
	}
}
