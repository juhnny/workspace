
public interface Unit {

	public abstract void attack();
	void move(); //�ڵ� public abstract
	
}

class Marine implements Unit, Heal{
	@Override
	public void attack() {
		System.out.println("���� ����� ����!");
	}
	
	@Override
	public void move() {
		System.out.println("���� �ɾ �̵�");	
	}

	@Override
	public void heal() {
		System.out.println("���� ü�� �ڵ� ȸ��");
		
	}
}

class Medic implements Unit, Heal{
	@Override
	public void attack() {
		System.out.println("�޵��� ���� ����");	
	}
	
	@Override
	public void move() {
		System.out.println("�޵� �ɾ �̵�");	
	}

	@Override
	public void heal() {
		System.out.println("�޵� ü�� �ڵ� ȸ��");
	}
}

class Tank implements Unit{
	@Override
	public void attack() {
		System.out.println("������ �߻��� ����");	
	}

	@Override
	public void move() {
		System.out.println("��ũ ������ �̵�");	
	}
	
}

