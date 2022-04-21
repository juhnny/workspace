
public class Synchronized {

	public static void main(String[] args) {
		
		//����ȭ(Synchronized) ó���� ���� �н�
		//Thread�� Ư¡�� ����(�񵿱�, Asynchronzed) �۾��̰� �װ��� �ӽ������� ���� �� ����ȭ
		//����ȭ �� �κ��� �ʹ� �������� ������ ����� �ǹ̰� ����ȴ�.
		
		//�Ա� ����� ���� Account Ŭ������ �������. ������ ��� ����.
		Account acc1 = new Account();
//		acc1.add(500); //main �����忡�� �۾�
		
		//Account Ŭ������ �̿��� thread�� ����ϴ� Ŭ������ �������.
		//������ ���� ���¿� �� ���� ���ÿ� �Ա��ϴ� ��츦 ������.
		AccountByThread abt1 = new AccountByThread(acc1);
		AccountByThread abt2 = new AccountByThread(acc1);
		abt1.start();
		abt2.start();
		
		//<������>
		//�Ա� �۾��� �����մϴ�.
		//�Ա� �۾��� �����մϴ�.
		//���� �ܾ�: 0 by Thread-1
		//���� �ܾ�: 0 by Thread-0
		//100�� �Ա� �� �ܾ�: 200 by Thread-0
		//100�� �Ա� �� �ܾ�: 200 by Thread-1
		
		//Thread ������ ���忡�� ���� �ܾ��� 0������ ���ڱ� 200���� �Ǵ� �̻��� ��Ȳ.
		//�̸� �ذ��ϱ� ���� ����ȭ�� �ʿ��ϴ�.
		
		//��� 1. �޼ҵ� ��°�� ����ȭ
		//����ȭ�� �ʿ��� �޼ҵ� �̸� �տ� synchronized Ű���� �߰�
		
		//��� 2. �޼ҵ� �� ���ϴ� �κи� ����ȭ
		//����ȭ�� �ʿ��� ���� synchronized �� �߰�
	}
}

class Account{
	int money = 0;
	
	//�Ա� ���
//	void add(int m) {
//		System.out.println("�Ա� �۾��� �����մϴ�.");
//		System.out.println("���� �ܾ�: "+money +" by "+ Thread.currentThread().getName());
//		money += m;
//		//�Ա� ó���� �ɸ��� �ð�
//		try {Thread.sleep(1000);} 
//		catch (InterruptedException e) {}
//		System.out.println(m+"�� �Ա� �� �ܾ�: "+money+" by "+ Thread.currentThread().getName());
//	}
	
	//��� 1. �޼ҵ带 ������ ����ȭ
	//�Ա� ���
//	synchronized void add(int m) {
//		System.out.println("�Ա� �۾��� �����մϴ�.");
//		System.out.println("���� �ܾ�: "+money +" by "+ Thread.currentThread().getName());
//		money += m;
//		//�Ա� ó���� �ɸ��� �ð�
//		try {Thread.sleep(1000);} 
//		catch (InterruptedException e) {}
//		System.out.println(m+"�� �Ա� �� �ܾ�: "+money+" by "+ Thread.currentThread().getName());
//	}
	
	//��� 2. �޼ҵ� �� ���ϴ� �κи� ����ȭ
	//�Ա� ���
	void add(int m) {
		//synchronized�� ���� ������ ���� �����忡�� ���ÿ� ����ȴ�.
		System.out.println("�Ա� �۾��� �����մϴ�.");
		
		//this��ü(Account)�� �ٸ� �����尡 �ǵ帱�� �̸� ���� �� - ����ȭ �Ǵ� ����
		//mutex: mutual exclusion ��ȣ ����. ������ �Ǵ� �����ڿ��� ���ش�.
		synchronized (this) {
			System.out.println("���� �ܾ�: "+money +" by "+ Thread.currentThread().getName());
			money += m;
			//�Ա� ó���� �ɸ��� �ð�
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
			System.out.println(m+"�� �Ա� �� �ܾ�: "+money+" by "+ Thread.currentThread().getName());
		}
	}
}

class AccountByThread extends Thread{
	
	Account acc; //������ ���� Ŭ������ ���
	
	//constructor
	AccountByThread(Account acc){
		this.acc = acc;
	}
	
	//�Ա� ���
	public void run() {
		//���� ������� ����� �޼ҵ� 
		acc.add(100);
	}	
}

