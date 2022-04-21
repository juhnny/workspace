import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AboutMap {

	public static void main(String[] args) {
		
		//Map
		//�������̽�. key-value ��(�ĺ���-������)���� �ڷḦ ����
		
		//�������̽��̹Ƿ� ���� ���� �Ұ�
//		Map<String, String> map1 = new Map<String, String>(); 
		
		//Map�� ������ ���� Ŭ������
		//HashMap, TreeMap, LinkedHashMap - �� �� ������ Ư¡�� Set ������ 3���� ����.
		//+ HashTable(HashMap�� ����. ��, ��Ƽ�����忡�� ����ȭ ����)
		
		HashMap<String, String> map = new HashMap<String, String>(); //<key Ÿ��, value Ÿ��>
		
		//��� �߰�
		map.put("Name", "Kim");
		map.put("ID", "abcd");
		map.put("PW", "1234");
		
		map.put("PW", "4567"); //���� Ű�� �ٸ� �����͸� �Է��ϸ� ���� �����
		
		map.put("Home", null); //������ null�Է� ����. �翬�Ѱ�..
		
		//��� ����
		System.out.println(map.size());
		
		//��� �� ��������
		System.out.println(map.get("Name"));
		System.out.println(map.get("ID"));
		System.out.println(map.get("PW"));
		
		System.out.println(map);
		
		//��� �����ϱ�
		map.remove("Name");
		System.out.println(map);
		System.out.println();
		
		//��� ���������� �����ϱ�
		//index�� �����Ƿ� �Ϲ� for�� ��� �Ұ�
		//foreach���� ���������� ������� ����
//		for(String t: map) { } //Can only iterate over an array or an instance of java.lang.Iterable
		
		//��� 1. �ϴ�, key���� Set���� ��ȯ�ϴ� �޼ҵ� ���
		Set<String> keys = map.keySet();
		//��� 1-1. Ű ���� �̿��Ͽ� for each������ ����
		for(String key: keys) {
			System.out.println(key +": "+ map.get(key));
		}
		System.out.println("-----��� 1-1 -----\n");

		//��� 1-2. key���� ������ Set ��ü�� Iterator�� �̿�
		Iterator<String> data = keys.iterator();
		while(data.hasNext()) {
			String key = data.next();
			System.out.println(key +": "+ map.get(key));
		}
		System.out.println("-----��� 1-2 -----\n");
		
		
		//��� 2. Map�� ��� ��ü(Entry Ŭ���� ��ü)�� Set���� ������
		Set<Entry<String, String>> entries = map.entrySet();
		for(Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() +": "+ entry.getValue());
		}
		System.out.println("-----��� 2-----\n");
		
		
		//�⺻ �ڷ����� key(�ĺ���)�� ����ϰ� �ʹٸ�.. wrapper Ŭ���� �̿�
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(0, "aaa");
		map2.put(1, "bbb");
		map2.put(2, "ccc");
		
		for(int i = 0; i < map2.size(); i++) {
			System.out.println(map2.get(i));
		}
		
	
	}
}