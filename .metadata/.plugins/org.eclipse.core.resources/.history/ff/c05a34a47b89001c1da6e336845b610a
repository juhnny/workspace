import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class AboutList {

	public static void main(String[] args) {
	//Collection 클래스들: 자료구조를 구현한 Java API 클래스들(Collection Framework) - 대량의 데이터 관리 목적
	
	//배열과의 차이점 - 교재 p.458 참고

	//배열의 문제점
	//데이터의 삽입/삭제 연산 과정에서 데이터들의 위치를 이동하는 작업이 필요
	//데이터의 개수가 많고 삽입/삭제 작업이 많다면 작업 소요 시간이 크게 증가
	//배열 크기는 변경이 불가능하므로 더 큰 배열이 필요하면 새로 만들어야만 함
	
	//배열의 단점을 해결하기 위해 등장한 클래스들이 Collection 
	
	//컬렉션은 자료구조에 따라 크게 세가지로 구분
	//1. List	: 자료들이 저장된 순서대로 존재. 자동 부여된 인덱스 번호로 구분함. 중복 허용(값이 동일한 데이터들 저장 가능)
	//2. Set	: 자료들이 저장된 순서대로 존재하지 않음. 인덱스 번호 없음. "중복 불가"(중복된 데이터를 넣으면 그 값을 무시함)	예)주변 블루투스 목록, 회원 목록
	//3. Map 	: 자료들이 저장된 순서대로 존재하지 않음. 인덱스 번호 대신 key값(통상적으로는 String 사용)으로 구분. key는 중복 불가. value는 중복 가능.
	
	//위 세 방식 모두 고유한 저장방식을 가지고 있으나 이들은 인터페이스이므로 직접 객체 생성(new)해 사용하는 것이 아니라
	//이들 인터페이스들을 implement한 하위 클래스들을 사용하는 것
	//1. List	: ArrayList, LinkedList, Vector
	//2. Set	: HashSet, TreeSet, LinkedHashSet
	//3. Map	: HashMap, TreeMap, LinkedHashMap, HashTable
	
	//1. List
	//List는 인터페이스이므로 직접 객체 생성 불가
//	new List();
	
	//대표적인 ArrayList를 써보자
	//ArrayList는 참조변수의 배열과 그 배열을 간편히 다루기 위한 메소드들로 이뤄져 있다. 기본적으로 10칸짜리 배열이 만들어진다. 
	//인덱스 중간에 add하면 한 칸씩 값을 뒤로 옮겨 쓰고 그 칸의 값을 바꾼다. 
	//인덱스 중간을 remove하면 뒤 요소의 값들을 한 칸씩 앞으로 댕겨온다. 
	//배열 크기가 모자라면 더 큰 배열을 만든다. 예전에는 한 칸씩 크게 만들었고 지금은 두 배씩 크게 만든다고..
	ArrayList<String> list = new ArrayList<String>();
	
	//List의 공통적인 주요 메소드들
	//1. 요소 개수(크기)
//	System.out.println("크기: "+ list.size());
	
	//2. 요소 추가
	String s = new String("AAA");
	list.add(s);
	list.add(new String("BBB"));
	list.add("CCC");
	System.out.println("크기: "+ list.size());
	
	//3. 요소 값 리턴
	String str = list.get(0);
	System.out.println(str);
	System.out.println(list.get(1));
	System.out.println(list.get(2));
	
	//4. 요소 삭제
	list.remove(1); //"BBB" 삭제
	System.out.println(list.get(1)); //"CCC"
//	System.out.println(list.get(2)); //exception
	
	//5. 특정 위치에 요소 추가
	list.add(1, "DDD");
	System.out.println(list.get(1));
	System.out.println(list.get(2));
	
	//6. 삭제할 때 인덱스 번호 대신 참조변수(주소)를 사용하는 것도 가능
	String s2 = new String("EEE");
	list.add(s2);
	System.out.println("크기: "+ list.size());
	list.remove(s2);
	System.out.println("크기: "+ list.size());
	
	//7. 모든 요소 삭제
	list.clear();
	System.out.println("크기: "+ list.size());
	
	//중복 데이터의 허용을 확인해보기
	list.add(new String("AAA"));
	list.add(new String("AAA"));
	list.add(new String("AAA"));
	System.out.println("크기: "+ list.size()); 
	
	//8. 리스트가 비어있는지 알려주는 기능 - boolean 리턴
	System.out.println(list.isEmpty()); 
	list.clear();
	System.out.println(list.isEmpty());
	
	//2. 요소에 특정 데이터가 포함되어 있는지 알려주는 기능 - boolean 리턴
	list.add("ABC");
	System.out.println(list.contains("ABC")); //true
	System.out.println(list.contains("AB")); //false
	
	//10. 다른 리스트의 요소들을 한번에 추가
	ArrayList<String> list2 = new ArrayList<>();
	list2.add("aaa");
	list2.add("bbb");
	list2.add("ccc");
	list.addAll(list2);
	System.out.println(list.size());
	
	//List의 출력
	System.out.println(list.toString()); //[ABC, aaa, bbb, ccc] -> 오버라이드한 toString() 메소드. 
	
	//10-1. 특정 위치에 다른 리스트 추가
	list.addAll(0, list2);
	System.out.println(list); //[aaa, bbb, ccc, ABC, aaa, bbb, ccc]
	
	//11. 특정 요소들을 한번에 삭제하기 - 다른 리스트의 요소들과 같은 요소들을 한번에 삭제
	list.removeAll(list2);
	System.out.println(list); //[ABC]
	
	//12. 특정 요소만 남기고 삭제하기
	ArrayList<String> list3 = new ArrayList<String>();
	list3.add("aaa");
	list3.add("bbb");
	list2.retainAll(list3);
	System.out.println(list2);
	
	//13. 특정 요소들이 '모두' 포함되어 있는지 알려주는 기능
	System.out.println(list2.containsAll(list3));
	list3.add("ccc");
	System.out.println(list2.containsAll(list3));
	
	//14. 특정 요소가 몇 번 방에 있는지 - int로 리턴
	//List 계열에만 있는 기능
	System.out.println(list3.indexOf("ccc"));
	System.out.println(list3.lastIndexOf("ccc"));

	
	//요소들을 순차적으로 얻어오기
	//방법1. for문 사용
	for(int i = 0; i < list3.size(); i++) {
		String t = list3.get(i);
		System.out.println("t: "+t);
	}
	
	//방법2. foreach문 사용
	for(String t : list3) {
		System.out.println("t: "+t);
	}
	
	//방법3. iterator() 이용
	
	
	//List를 배열로 변경하는 방법
	//우선 빈 배열이 필요 - List의 크기와 같은 크기로
	String[] arr = new String[list3.size()];
	list3.toArray(arr); //toArray()
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	
	//배열을 리스트처럼 출력하는 방법
	System.out.println(Arrays.toString(arr));

	//배열을 List로 변경하는 방법은?
	
	//기본형 자료형은 List로 사용 불가. 사용하려면 wrapper 클래스 필요
//	new ArrayList<int>(); //불가
	ArrayList<Integer> intList = new ArrayList<Integer>();
	
	//List<>의 제네릭에는 개발자가 만든 클래스도 사용 가능
	
	//LinkedList
	//사용방법은 ArrayList와 비슷. 성능차이만 있음 - 요소의 빈번한 추가,삭제시에 속도가 빠름. 단, 특정요소에 접근하는 것은 더 느림.
	//ArrayList는 사실 참조변수의 배열. 인덱스 중간에 add하면 그 뒤에 있는 값들을 한 칸씩 밀어 써야 한다. 배열 크기가 모자라면 더 큰 배열을 만들어 값을 대입해야 한다. 
	//요소의 추가, 삭제에 필요한 연산은 더 많지만 특정 요소의 주소를 계산하는 것은 간단.
	//LinkedList는 요소마다 previous 주소와 next 주소값을 함께 보유해서 전후 요소를 연결. 
	//요소의 추가, 삭제는 빠르지만 2000번째 요소에 접근하려면 200번 주소를 타고 가야함. 
	//하지만 요즘은 컴퓨터 성능이 발전해 두 방식의 속도 차이가 미미하기 때문에 ArrayList를 많이 쓴다고..
	
	LinkedList<String> linked = new LinkedList<String>();
	
	linked.add(new String("Lee"));
	linked.add(1, "Park");
	linked.add("Kim");
	
	linked.remove(0);
	System.out.println(linked.size());
	System.out.println(linked.toString());
	System.out.println(linked.getFirst());
	
	//LinkedList에만 있는 메소드
	linked.addFirst("Ko");
	linked.addLast("Hong");
	System.out.println(linked);
	
	
	//Vector
	//ArrayList보다 먼저 만들어진 클래스
	//ArrayList보다 내부 동작이 같음. 성능 같음
	//다른 점: 멀티스레드일 때 동기화처리가 되어 있음. 동시에 작업이 되어도 문제가 되지 않도록.
	Vector<String> vector = new Vector<String>();
	vector.add("Hi");
	vector.add("Hello");
	System.out.println(vector);
	//사용 방법도 비슷.
	
	
	}
}
