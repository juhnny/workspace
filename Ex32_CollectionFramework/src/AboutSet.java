import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AboutSet {

	public static void main(String[] args) {
		
		//Set
		//인터페이스. 요소 간 순서 없음, index 없음, 중복 불가
		
		//인터페이스이므로 직접 사용 불가
//		Set<String> set = new Set<String>();
		
		//Set 계열 클래스: HashSet, TreeSet, LinkedHashSet
		HashSet<String> set = new HashSet<String>();
		
		//요소 추가
		set.add(new String("aaa"));
		set.add("bbb");
		set.add("ccc");
	
		set.add("aaa"); // 중복데이터는 무시 -> 이게 Set의 사용 목적
		
		//요소 개수
		System.out.println(set.size() +": "+ set.toString()); //요소들이 저장된 순서대로 돼있지 않음. hash 알고리즘에 의해 나름대로의 순서로 저장
		
		//요소 값 가져오기
		//index 번호가 없으므로 .get(index) 메소드가 없음
		//요소 데이터들을 순차적으로 불러오는 것은 가능
		//방법1. for each문 사용. 기본 for문은 인덱스가 없어서 사용 불가
		for(String t : set) {
			System.out.println(t);
		}
		
		System.out.println("-----------방법1-----------\n");
		
		//방법2. iterator(반복자) 이용
		System.out.println(set.iterator());
		Iterator<String> data = set.iterator();
//		System.out.println(data.next()); //Iterator의 next() 메소드는 각 요소를 순서대로 반환
//		System.out.println(data.next());
//		System.out.println(data.next());
////		System.out.println(data.next()); //더 이상 요소가 없으면 NoSuchElementException
//		
//		System.out.println(data.hasNext()); //hasNext()는 다음 값이 있는지 없는지 true/false 반환
		
		while(data.hasNext()) {
			System.out.println(data.next());
		}
		
		System.out.println("-----------방법2-----------\n");
		
		//방법3. 배열로 변환하여 인덱스번호로 제어하기
		String[] arr= new String[set.size()]; //빈 배열만들기
		set.toArray(arr);//arr이라는 배열에 set의 요소값들을 복사
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		//요소값만 확인해보고 싶다면
		System.out.println( Arrays.toString(arr) );
		
		System.out.println("-----------방법3-----------\n");
		
		
		//TreeSet
		//HashSet과 사용법은 비슷
		//데이터가 이름 기준으로 정렬
		TreeSet<String> tree = new TreeSet<String>();
		
		//LinkedHashSet
		//데이터를 저장된 순서대로 저장
		LinkedHashSet<String> linked = new LinkedHashSet<>();
		
		
		
	}
}
