//import newpackage.Student;
//import newpackage.*;

public class Main {
	
	public static void main(String[] args) {
		
		//����� ���� Ŭ������ ����� ���� 
		//���� Ŭ���� �̸��� �� ����� ���� ���� ������
		//�ǵ�ġ �ʰ� Ŭ���� �̸��� �������� ��찡 �ִµ�
		//�̷� ������ �ذ��ϱ� ���� ������ package
		//�������� ���������� ���� ���� �̸��� class�� ����
		
		//�л� �Ż������� �����ϴ� Ŭ������ ���輺���� �����ϴ� Ŭ������ �̸��� �� �� Student�� ���
		//�� ��Ű�� ������ ����� ����
		//Package Explorer���� default package�� ���� ��Ű�� ������ ���ٴ� ��
		//src ���� ��Ŭ�� - New - Package ������ newpackage��� �̸��� �� ��Ű�� ��������
		//��Ű������ ��� �ҹ��ڷ� ���� ���� ����. �빮�� �ϳ��� ����.-> Ŭ���� �̸��� �����ϱ� ����
		//�ܾ��� ������ ��(.)���� ���. ū ������ �տ� ���� ���� ������ �ڿ� ����.
		//��Ű������ ��ġ�� ����. �׷� ������ ��𿡵� ���� ����ũ�� ��Ű������ ���� ��? 
		//���������� ���ͳ� �������� ���ų�(�㸶��ũ�νý��� - com.sun.crypto.provider) ���̵� ���ų�(���� �����)
		//������ ��Ű������ 2�ܾ� �̻��� ����. �� �ܾ�� ������ Ȯ���� ũ�ϱ�.
		//ex) java.time   google.maps   kakao.maps   naver.maps
		//java.time�̶�� ��Ű������ java.time�̶�� �������� �ִ� �� �ƴ϶� java ���� �ȿ� time�̶�� ������ �ִ� ��
		//ex) new aaa.bbb.ccc.Hello.Nice(); ��� ���� aaa ��Ű�� ���� bbb ��Ű�� ���� ccc ��Ű�� ���� Hello Ŭ���� ���� Nice Ŭ����


		//default package�� newpackage ���� �Ʒ� ���� Student Ŭ������ ������
		
		Student stu1 = new Student(); //�׳� �ҷ��� Student�� default package�� �ִ� Student
		stu1.show();
		
		//�ٸ� ��Ű���� Ŭ������ �ҷ����� ��
		//��Ű��.Ŭ����
		newpackage.Student stu2 = new newpackage.Student(); //newpackage�� Student Ŭ����
//		stu2.name; //�ν��� �� �ȴ�. �ٸ� ��Ű���� Ŭ������ public ����� �ҷ��� �� �ִ�.
//		stu2.eng; //private�̶� �ν� �Ұ�
		stu2.show(); //public �����ؼ� �ν� ����
		//C++ó�� �ѹ��� ���� ����� public �ϴ� ������ ����.
		
		//��Ŭ�������� package ��� folder�� �����?
		folder.Student stu3 = new folder.Student();
		stu3.show();
		//���� ����.
		//Ž���⿡�� ���� ������ ����� ��Ŭ�������� �ν��� ���ϳ�.
		
		//default package�� anonymous package��� �ؼ� �̸��� �����Ƿ� �ҷ����� �� �Ұ���
//		new defaultpackage.Student; //�̷� ������ ����.
		//�ٸ� ��Ű������ default package�� Ŭ������ �� ����� ����! 
		//�׷��� �ǹ����� ��Ű�� ���� default package�� ���� ���� ����.
		
		//import
		//newpackage�� Student�� �⺻������ �ϰ� �ʹٸ�?
		//import newpackage.Student;�� �� ���� ���ش�.
		
		//java�� 2000�� ���� Ŭ������(Java System API)�� ��� ��Ű�� �ȿ� ����
		//java.lang ��Ű���� ���� �ʼ����� Ŭ�������� �־ import ��� ���̵� import �Ǿ� ����.
		//�׷��� String Ŭ������ �׳� �� �� �ִ� ��
		new java.lang.String();
		new String();
		//�� ���� class���� ��� ��������� import �ʿ�
		
		//���� �̸��� ���� Ŭ���� ���� ���ÿ� import �ϸ� ����
		
		//import ��Ű����.*;
		//��Ű�� �� Ŭ���� ��θ� import
		
		
		
	}
}
