package pack.one;

public class Main {

	public static void main(String[] args) {
		
		Second sec = new Second();
		sec.show();
		
		//���� �� ��¥�� �ڵ尡 �ִµ� Second��� Ŭ�������� Third�� �ٲٰ� �ʹٸ�?
		//.java ���ϸ�� Ŭ������� �� Ŭ������ �̿��� ��� �ڵ带 �� �ٲ�� �ϴµ�?
		//���� Package Explorer���� .java ���� ��Ŭ�� -> Refactor -> Rename
		//Update references üũ�ϸ� �� Ŭ������ ������ �ڵ�鵵 �ѹ��� �� ������
		//üũ �� �ϸ� ���ϸ�� Ŭ������ �ٲ�
		
		pack.two.Fourth fou = new pack.two.Fourth();
		fou.show();
		
		//���� �� ��¥�� �ڵ尡 �ִµ� pack.two��� ��Ű������ pack.three�� �ٲٰ� ������?
		//pack.two��� ��Ű����� �� ���� ��Ű����� �� ��Ű���� �̿��� �ڵ带 �� �ٲ�� �ϴµ�?
		//���� Package Explorer���� pack.two ��Ű���� ��Ŭ�� -> Refactor -> Rename
		//���� ��Ű���� �����ؼ� �̸��� �����ϰ� ������ Rename subpackages üũ
		//Update references üũ�ϸ� �� ��Ű���� ������ �ڵ�鵵 �ѹ��� �� ������
		//üũ �� �ϸ� ��Ű���� �ٲ�
		
	}
}
