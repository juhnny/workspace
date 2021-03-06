import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AboutMap {

	public static void main(String[] args) {
		
		//Map
		//인터페이스. key-value 쌍(식별자-데이터)으로 자료를 저장
		
		//인터페이스이므로 직접 생성 불가
//		Map<String, String> map1 = new Map<String, String>(); 
		
		//Map을 구현한 하위 클래스들
		//HashMap, TreeMap, LinkedHashMap - 이 세 종류의 특징은 Set 하위의 3종과 같다.
		//+ HashTable(HashMap과 같음. 단, 멀티스레드에서 동기화 지원)
		
		HashMap<String, String> map = new HashMap<String, String>(); //<key 타입, value 타입>
		
		//요소 추가
		map.put("Name", "Kim");
		map.put("ID", "abcd");
		map.put("PW", "1234");
		
		map.put("PW", "4567"); //같은 키로 다른 데이터를 입력하면 값이 변경됨
		
		map.put("Home", null); //값으로 null입력 가능. 당연한가..
		
		//요소 개수
		System.out.println(map.size());
		
		//요소 값 가져오기
		System.out.println(map.get("Name"));
		System.out.println(map.get("ID"));
		System.out.println(map.get("PW"));
		
		System.out.println(map);
		
		//요소 제거하기
		map.remove("Name");
		System.out.println(map);
		System.out.println();
		
		//요소 순차적으로 접근하기
		//index가 없으므로 일반 for문 사용 불가
		//foreach문도 문법적으로 허용하지 않음
//		for(String t: map) { } //Can only iterate over an array or an instance of java.lang.Iterable
		
		//방법 1. 일단, key값들 Set으로 반환하는 메소드 사용
		Set<String> keys = map.keySet();
		//방법 1-1. 키 셋을 이용하여 for each문으로 접근
		for(String key: keys) {
			System.out.println(key +": "+ map.get(key));
		}
		System.out.println("-----방법 1-1 -----\n");

		//방법 1-2. key값을 가져온 Set 객체의 Iterator를 이용
		Iterator<String> data = keys.iterator();
		while(data.hasNext()) {
			String key = data.next();
			System.out.println(key +": "+ map.get(key));
		}
		System.out.println("-----방법 1-2 -----\n");
		
		
		//방법 2. Map의 요소 객체(Entry 클래스 객체)를 Set으로 얻어오기
		Set<Entry<String, String>> entries = map.entrySet();
		for(Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() +": "+ entry.getValue());
		}
		System.out.println("-----방법 2-----\n");
		
		
		//기본 자료형을 key(식별자)로 사용하고 싶다면.. wrapper 클래스 이용
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(0, "aaa");
		map2.put(1, "bbb");
		map2.put(2, "ccc");
		
		for(int i = 0; i < map2.size(); i++) {
			System.out.println(map2.get(i));
		}
		
	
	}
}
