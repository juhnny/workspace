import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class AboutList {

	public static void main(String[] args) {
	//Collection Ŭ������: �ڷᱸ���� ������ Java API Ŭ������(Collection Framework) - �뷮�� ������ ���� ����
	
	//�迭���� ������ - ���� p.458 ����

	//�迭�� ������
	//�������� ����/���� ���� �������� �����͵��� ��ġ�� �̵��ϴ� �۾��� �ʿ�
	//�������� ������ ���� ����/���� �۾��� ���ٸ� �۾� �ҿ� �ð��� ũ�� ����
	//�迭 ũ��� ������ �Ұ����ϹǷ� �� ū �迭�� �ʿ��ϸ� ���� �����߸� ��
	
	//�迭�� ������ �ذ��ϱ� ���� ������ Ŭ�������� Collection 
	
	//�÷����� �ڷᱸ���� ���� ũ�� �������� ����
	//1. List	: �ڷ���� ����� ������� ����. �ڵ� �ο��� �ε��� ��ȣ�� ������. �ߺ� ���(���� ������ �����͵� ���� ����)
	//2. Set	: �ڷ���� ����� ������� �������� ����. �ε��� ��ȣ ����. "�ߺ� �Ұ�"(�ߺ��� �����͸� ������ �� ���� ������)	��)�ֺ� ������� ���, ȸ�� ���
	//3. Map 	: �ڷ���� ����� ������� �������� ����. �ε��� ��ȣ ��� key��(��������δ� String ���)���� ����. key�� �ߺ� �Ұ�. value�� �ߺ� ����.
	
	//�� �� ��� ��� ������ �������� ������ ������ �̵��� �������̽��̹Ƿ� ���� ��ü ����(new)�� ����ϴ� ���� �ƴ϶�
	//�̵� �������̽����� implement�� ���� Ŭ�������� ����ϴ� ��
	//1. List	: ArrayList, LinkedList, Vector
	//2. Set	: HashSet, TreeSet, LinkedHashSet
	//3. Map	: HashMap, TreeMap, LinkedHashMap, HashTable
	
	//1. List
	//List�� �������̽��̹Ƿ� ���� ��ü ���� �Ұ�
//	new List();
	
	//��ǥ���� ArrayList�� �Ẹ��
	//ArrayList�� ���������� �迭�� �� �迭�� ������ �ٷ�� ���� �޼ҵ��� �̷��� �ִ�. �⺻������ 10ĭ¥�� �迭�� ���������. 
	//�ε��� �߰��� add�ϸ� �� ĭ�� ���� �ڷ� �Ű� ���� �� ĭ�� ���� �ٲ۴�. 
	//�ε��� �߰��� remove�ϸ� �� ����� ������ �� ĭ�� ������ ��ܿ´�. 
	//�迭 ũ�Ⱑ ���ڶ�� �� ū �迭�� �����. �������� �� ĭ�� ũ�� ������� ������ �� �辿 ũ�� ����ٰ�..
	ArrayList<String> list = new ArrayList<String>();
	
	//List�� �������� �ֿ� �޼ҵ��
	//1. ��� ����(ũ��)
//	System.out.println("ũ��: "+ list.size());
	
	//2. ��� �߰�
	String s = new String("AAA");
	list.add(s);
	list.add(new String("BBB"));
	list.add("CCC");
	System.out.println("ũ��: "+ list.size());
	
	//3. ��� �� ����
	String str = list.get(0);
	System.out.println(str);
	System.out.println(list.get(1));
	System.out.println(list.get(2));
	
	//4. ��� ����
	list.remove(1); //"BBB" ����
	System.out.println(list.get(1)); //"CCC"
//	System.out.println(list.get(2)); //exception
	
	//5. Ư�� ��ġ�� ��� �߰�
	list.add(1, "DDD");
	System.out.println(list.get(1));
	System.out.println(list.get(2));
	
	//6. ������ �� �ε��� ��ȣ ��� ��������(�ּ�)�� ����ϴ� �͵� ����
	String s2 = new String("EEE");
	list.add(s2);
	System.out.println("ũ��: "+ list.size());
	list.remove(s2);
	System.out.println("ũ��: "+ list.size());
	
	//7. ��� ��� ����
	list.clear();
	System.out.println("ũ��: "+ list.size());
	
	//�ߺ� �������� ����� Ȯ���غ���
	list.add(new String("AAA"));
	list.add(new String("AAA"));
	list.add(new String("AAA"));
	System.out.println("ũ��: "+ list.size()); 
	
	//8. ����Ʈ�� ����ִ��� �˷��ִ� ��� - boolean ����
	System.out.println(list.isEmpty()); 
	list.clear();
	System.out.println(list.isEmpty());
	
	//2. ��ҿ� Ư�� �����Ͱ� ���ԵǾ� �ִ��� �˷��ִ� ��� - boolean ����
	list.add("ABC");
	System.out.println(list.contains("ABC")); //true
	System.out.println(list.contains("AB")); //false
	
	//10. �ٸ� ����Ʈ�� ��ҵ��� �ѹ��� �߰�
	ArrayList<String> list2 = new ArrayList<>();
	list2.add("aaa");
	list2.add("bbb");
	list2.add("ccc");
	list.addAll(list2);
	System.out.println(list.size());
	
	//List�� ���
	System.out.println(list.toString()); //[ABC, aaa, bbb, ccc] -> �������̵��� toString() �޼ҵ�. 
	
	//10-1. Ư�� ��ġ�� �ٸ� ����Ʈ �߰�
	list.addAll(0, list2);
	System.out.println(list); //[aaa, bbb, ccc, ABC, aaa, bbb, ccc]
	
	//11. Ư�� ��ҵ��� �ѹ��� �����ϱ� - �ٸ� ����Ʈ�� ��ҵ�� ���� ��ҵ��� �ѹ��� ����
	list.removeAll(list2);
	System.out.println(list); //[ABC]
	
	//12. Ư�� ��Ҹ� ����� �����ϱ�
	ArrayList<String> list3 = new ArrayList<String>();
	list3.add("aaa");
	list3.add("bbb");
	list2.retainAll(list3);
	System.out.println(list2);
	
	//13. Ư�� ��ҵ��� '���' ���ԵǾ� �ִ��� �˷��ִ� ���
	System.out.println(list2.containsAll(list3));
	list3.add("ccc");
	System.out.println(list2.containsAll(list3));
	
	//14. Ư�� ��Ұ� �� �� �濡 �ִ��� - int�� ����
	//List �迭���� �ִ� ���
	System.out.println(list3.indexOf("ccc"));
	System.out.println(list3.lastIndexOf("ccc"));

	
	//��ҵ��� ���������� ������
	//���1. for�� ���
	for(int i = 0; i < list3.size(); i++) {
		String t = list3.get(i);
		System.out.println("t: "+t);
	}
	
	//���2. foreach�� ���
	for(String t : list3) {
		System.out.println("t: "+t);
	}
	
	//���3. iterator() �̿�
	
	
	//List�� �迭�� �����ϴ� ���
	//�켱 �� �迭�� �ʿ� - List�� ũ��� ���� ũ���
	String[] arr = new String[list3.size()];
	list3.toArray(arr); //toArray()
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	
	//�迭�� ����Ʈó�� ����ϴ� ���
	System.out.println(Arrays.toString(arr));

	//�迭�� List�� �����ϴ� �����?
	
	//�⺻�� �ڷ����� List�� ��� �Ұ�. ����Ϸ��� wrapper Ŭ���� �ʿ�
//	new ArrayList<int>(); //�Ұ�
	ArrayList<Integer> intList = new ArrayList<Integer>();
	
	//List<>�� ���׸����� �����ڰ� ���� Ŭ������ ��� ����
	
	//LinkedList
	//������� ArrayList�� ���. �������̸� ���� - ����� ����� �߰�,�����ÿ� �ӵ��� ����. ��, Ư����ҿ� �����ϴ� ���� �� ����.
	//ArrayList�� ��� ���������� �迭. �ε��� �߰��� add�ϸ� �� �ڿ� �ִ� ������ �� ĭ�� �о� ��� �Ѵ�. �迭 ũ�Ⱑ ���ڶ�� �� ū �迭�� ����� ���� �����ؾ� �Ѵ�. 
	//����� �߰�, ������ �ʿ��� ������ �� ������ Ư�� ����� �ּҸ� ����ϴ� ���� ����.
	//LinkedList�� ��Ҹ��� previous �ּҿ� next �ּҰ��� �Բ� �����ؼ� ���� ��Ҹ� ����. 
	//����� �߰�, ������ �������� 2000��° ��ҿ� �����Ϸ��� 200�� �ּҸ� Ÿ�� ������. 
	//������ ������ ��ǻ�� ������ ������ �� ����� �ӵ� ���̰� �̹��ϱ� ������ ArrayList�� ���� ���ٰ�..
	
	LinkedList<String> linked = new LinkedList<String>();
	
	linked.add(new String("Lee"));
	linked.add(1, "Park");
	linked.add("Kim");
	
	linked.remove(0);
	System.out.println(linked.size());
	System.out.println(linked.toString());
	System.out.println(linked.getFirst());
	
	//LinkedList���� �ִ� �޼ҵ�
	linked.addFirst("Ko");
	linked.addLast("Hong");
	System.out.println(linked);
	
	
	//Vector
	//ArrayList���� ���� ������� Ŭ����
	//ArrayList���� ���� ������ ����. ���� ����
	//�ٸ� ��: ��Ƽ�������� �� ����ȭó���� �Ǿ� ����. ���ÿ� �۾��� �Ǿ ������ ���� �ʵ���.
	Vector<String> vector = new Vector<String>();
	vector.add("Hi");
	vector.add("Hello");
	System.out.println(vector);
	//��� ����� ���.
	
	
	}
}
