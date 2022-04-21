import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AboutSet {

	public static void main(String[] args) {
		
		//Set
		//�������̽�. ��� �� ���� ����, index ����, �ߺ� �Ұ�
		
		//�������̽��̹Ƿ� ���� ��� �Ұ�
//		Set<String> set = new Set<String>();
		
		//Set �迭 Ŭ����: HashSet, TreeSet, LinkedHashSet
		HashSet<String> set = new HashSet<String>();
		
		//��� �߰�
		set.add(new String("aaa"));
		set.add("bbb");
		set.add("ccc");
	
		set.add("aaa"); // �ߺ������ʹ� ���� -> �̰� Set�� ��� ����
		
		//��� ����
		System.out.println(set.size() +": "+ set.toString()); //��ҵ��� ����� ������� ������ ����. hash �˰����� ���� ��������� ������ ����
		
		//��� �� ��������
		//index ��ȣ�� �����Ƿ� .get(index) �޼ҵ尡 ����
		//��� �����͵��� ���������� �ҷ����� ���� ����
		//���1. for each�� ���. �⺻ for���� �ε����� ��� ��� �Ұ�
		for(String t : set) {
			System.out.println(t);
		}
		
		System.out.println("-----------���1-----------\n");
		
		//���2. iterator(�ݺ���) �̿�
		System.out.println(set.iterator());
		Iterator<String> data = set.iterator();
//		System.out.println(data.next()); //Iterator�� next() �޼ҵ�� �� ��Ҹ� ������� ��ȯ
//		System.out.println(data.next());
//		System.out.println(data.next());
////		System.out.println(data.next()); //�� �̻� ��Ұ� ������ NoSuchElementException
//		
//		System.out.println(data.hasNext()); //hasNext()�� ���� ���� �ִ��� ������ true/false ��ȯ
		
		while(data.hasNext()) {
			System.out.println(data.next());
		}
		
		System.out.println("-----------���2-----------\n");
		
		//���3. �迭�� ��ȯ�Ͽ� �ε�����ȣ�� �����ϱ�
		String[] arr= new String[set.size()]; //�� �迭�����
		set.toArray(arr);//arr�̶�� �迭�� set�� ��Ұ����� ����
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		//��Ұ��� Ȯ���غ��� �ʹٸ�
		System.out.println( Arrays.toString(arr) );
		
		System.out.println("-----------���3-----------\n");
		
		
		//TreeSet
		//HashSet�� ������ ���
		//�����Ͱ� �̸� �������� ����
		TreeSet<String> tree = new TreeSet<String>();
		
		//LinkedHashSet
		//�����͸� ����� ������� ����
		LinkedHashSet<String> linked = new LinkedHashSet<>();
		
		
		
	}
}