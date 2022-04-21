import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//������ Unit �������̽��� �����ϰ� �߻�޼ҵ� �̸��� ���ϸ� 
		//�������� �� �̸��� ���� ����� �����Ͽ� �� ����(Marine, Medic, Tank)�� Ŭ������ ������
		//������ ������� Ŭ�������� �̿��Ͽ� ��ü ���� �� ���� �˰��� ����
	
		Unit u1 = new Marine();
		u1.attack();
		
		//���� ���ֵ��� �ѹ��� �����ϰ��� ��. 
		//��Ʈ���ϴ� ������ ���ڴ� �ٲ�µ� �迭�� ���̰� �̹� �����Ǿ� ����
		//ArrayList Ŭ������ ����غ���
		//���� �����̳� �ۿ����� �迭���ٴ� ArrayList�� �� ���� ���ٰ�..
		
		//ArrayList�� �迭ó�� Ÿ���� ������� �ϴµ� Marine�̶�� ���� Marine Ÿ�Թۿ� �� �ִ´�.
		//�پ��� ���ֵ��� �ֱ� ���ؼ��� �θ� Ÿ���� �������ָ� �ȴ�.
		ArrayList units0 = new ArrayList(); //Ÿ�� ������ ���ص� ������ ������ ���ִ� �� �����
		ArrayList<Unit> units = new ArrayList<Unit>();
		
		//ArrayList�� ���̸� �˷��ִ� �޼ҵ�, size()
		System.out.println(units.size());
		
		units.add(u1);
		System.out.println(units.size());
		
		units.add(new Marine()); //���� Unit ���������� �־ ����� �ʿ䰡 ����. ArrayList�� ������ �Ŵϱ�.
		units.add(new Tank());
		units.add(new Medic());
		System.out.println(units.size());
		
		System.out.println(units.get(0)); //Marine@1c4af82 ArrayList �� ��Ҵ� ����������
		Unit uni = units.get(0);
		uni.attack();
		
		for(Unit t : units) {
			t.attack();
			t.move();
		}

		//�Ϻ� ���ֿ��Ը� ü�� ȸ�� Heal ����� ������ְ� ������?
		//Heal �������̽��� ���� ����� Marine�� Medic���� ����
		for(Unit t: units) {
			if(t instanceof Marine) ((Marine) t).heal();
			else if(t instanceof Medic) ((Medic) t).heal();
		}
		
		//Heal �������̽��� ����� ����� ���� Heal�� ����ȯ�ؼ� ����ϸ� �ڽ� ��ü���� �������� �ʿ䰡 �����Ƿ� �� ����
		for(Unit t: units) {
			if(t instanceof Heal) ((Heal) t).heal();
		}		
		
		
	}
}
