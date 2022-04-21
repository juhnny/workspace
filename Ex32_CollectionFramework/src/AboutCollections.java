import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AboutCollections {

	public static void main(String[] args) {
		
		//Collections Ŭ������ static �޼ҵ� �� ������ ���
		//1. Collections.sort()
		//2. Collections.shuffle()
		
		ArrayList<String> data = new ArrayList<>();
		data.add("monkey");
		data.add("lion");
		data.add("dog");
		data.add("puma");
		
		System.out.println(data.toString()); //������ ������� ���ĵǾ� ����
		
		Collections.sort(data);
		System.out.println(data.toString()); //�̸� ������ ���ĵ�
		
		Collections.shuffle(data);
		System.out.println(data.toString()); //���� ����
		
		//�ڷᱸ������ ���� ������ �� ����
		//1. Stack: FILO(First in last out, �������� - �ϳ��� ž)
		//2. Queue: FIFO(First in first out, ���Լ��� - Ʃ����)
		
		//Stack ������ ������ Ŭ����
		//push()�� pop()�� �˾Ƶ���
		//����� ���÷��̿� â�� �����ǰ� ������� ������ ���� ����
		Stack<String> stack = new Stack<>();
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		System.out.println(stack.toString());
		
		System.out.println(stack.pop()); //���� �������� ���� "ccc"�� ���� ���� ����
		System.out.println(stack.toString()); //pop() �� ������ �����Ͱ� �ϳ��� �������
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		System.out.println();

		//Queue�� ��ٷ� ��ü ���� �� �� - �������̽��� �����ؾ� ��
		//offer()�� poll()�� �˾Ƶ���
		//��ǻ�� ���ۿ��� �ַ� ���. ���� �Է��� ���������� ó���� ��
//		Queue<String> queue = null;
		Queue<String> queue = new LinkedList<>(); 
		queue.offer("AAA");
		queue.offer("BBB");
		queue.offer("CCC");
		System.out.println(queue.toString());
		
		System.out.println(queue.poll()); //���� ó�� ���� "AAA"�� ���� ���� ����
		System.out.println(queue.toString()); //poll() �� ������ �����Ͱ� �ϳ��� �������
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
