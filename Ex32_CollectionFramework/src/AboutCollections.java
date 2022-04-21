import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AboutCollections {

	public static void main(String[] args) {
		
		//Collections 클래스의 static 메소드 중 유용한 기능
		//1. Collections.sort()
		//2. Collections.shuffle()
		
		ArrayList<String> data = new ArrayList<>();
		data.add("monkey");
		data.add("lion");
		data.add("dog");
		data.add("puma");
		
		System.out.println(data.toString()); //저장한 순서대로 정렬되어 있음
		
		Collections.sort(data);
		System.out.println(data.toString()); //이름 순으로 정렬됨
		
		Collections.shuffle(data);
		System.out.println(data.toString()); //랜덤 정렬
		
		//자료구조에서 가장 유명한 두 가지
		//1. Stack: FILO(First in last out, 선입후출 - 하노이 탑)
		//2. Queue: FIFO(First in first out, 선입선출 - 튜브형)
		
		//Stack 구조를 구현한 클래스
		//push()와 pop()을 알아두자
		//모바일 디스플레이에 창이 생성되고 사라지는 순서가 스택 구조
		Stack<String> stack = new Stack<>();
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		System.out.println(stack.toString());
		
		System.out.println(stack.pop()); //가장 마지막에 넣은 "ccc"가 가장 먼저 나옴
		System.out.println(stack.toString()); //pop() 할 때마다 데이터가 하나씩 사라진다
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		System.out.println();

		//Queue는 곧바로 객체 생성 안 됨 - 인터페이스를 구현해야 함
		//offer()와 poll()을 알아두자
		//컴퓨터 버퍼에서 주로 사용. 여러 입력을 순차적으로 처리할 때
//		Queue<String> queue = null;
		Queue<String> queue = new LinkedList<>(); 
		queue.offer("AAA");
		queue.offer("BBB");
		queue.offer("CCC");
		System.out.println(queue.toString());
		
		System.out.println(queue.poll()); //가장 처음 넣은 "AAA"가 가장 먼저 나옴
		System.out.println(queue.toString()); //poll() 할 때마다 데이터가 하나씩 사라진다
		System.out.println(queue.poll()); 
		System.out.println(queue.toString());
		System.out.println(queue.poll()); 
		System.out.println(queue.toString());
		
		queue.offer("DDD");
		queue.offer("EEE");
		queue.offer("FFF");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
		
	}
}
