import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		
		//Java에서 GUI로 프로그램을 만들 수 있는 클래스들의 모음(API)은 크게 세 종류
		// 1. AWT : 운영체제의 GUI 테마에 따라 모양이 만들어짐
		// 2. Swing: Java에서 만든 디자인
		// 2-2. Java FX: Android처럼 화면을 만드는 언어는 따로 FXML 언어를 사용하고, 
		//				버튼 클릭 같은 동작에 대한 코드만 Java로 작성하는 방식. 문법이 둘로 나눠진다는 게 특징
		//				요즘 대세지만 추가적인 프로그램 설치 필요
		
		//GUI 맛보기로 Swing 사용해보기
		//1. 최상위 컨테이너 생성
		JFrame frame = new JFrame("Hello");
		frame.setTitle("Hi");
		frame.setSize(500, 300);
		
		//2. 컴포넌트 추가
		JButton btn1 = new JButton();
		btn1.setText("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		
		//컨테이너에 컴포넌트 추가
		frame.add(btn1);
		frame.add(btn2, BorderLayout.NORTH);
		frame.add(btn2, BorderLayout.WEST); //컴포넌트를 중복해 add하면 마지막 것만 실행되는 듯
		frame.add(btn3, BorderLayout.EAST);
		
		//LayoutManager 배치관리자 설정
		//대표적으로 FlowLayout, BorderLayout 등..
		//기본값은 BorderLayout. NORTH, SOUTH, RIGHT, LEFT, CENTER 다섯 방향으로 배정 가능. 기본은 CENTER
		
		//FlowLayout으로 새로이 설정하고자 함.
		// * FlowLayout : 컴포넌트들을 그냥 옆으로 배치시킴.
		frame.setLayout( new FlowLayout() );
		
		//JLabel - 글씨를 보여주는 컴포넌트
		JLabel label1 = new JLabel("I'm Label1");
		frame.add(label1);
		
		//JTextField - 사용자로부터 글씨 입력받는 컴포넌트
		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField(20); //20글자 정도 보이는 사이즈. 언어에 따라 다름. 20자 넘어가도 입력 가능		
		frame.add(tf1);
		frame.add(tf2);
		
		//이미지 전용 컴포넌트는 없음
		//대신 JLabel에 아이콘 이미지를 보여주는 기능이 있는데 이를 활용
		ImageIcon icon = new ImageIcon("aaa/airplane.jpg");
		JLabel imgLabel1 = new JLabel(icon);  
//		frame.add(imgLabel1);
		
		//리사이징 방법
		//JLabel은 Image를 못 보여주고 ImageIcon만 보여줄 수 있다. ImageIcon이 Image라는 객체를 갖고 있고 이를 보여줄 수 있다.
		//ImageIcon 객체 안에 있는 Image 객체(실제 이미지를 갖고 있음) 가져오기
		Image img = icon.getImage();
		//한번 만들어진 Image 객체의 이미지 사이즈는 바꿀 수 없다. 
		//Image가 가진 이미지를 리사이징한 새로운 Image 객체를 만들어 할당
//		img = im.getScaledInstance(100, 100, Image.SCALE_SMOOTH); //width, height, scaling algorithm
//		Image img2 = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH); //width, height, scaling algorithm
		img = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH); //width, height, scaling algorithm
//		ImageIcon icon2 = new ImageIcon(img2);
//		JLabel imgLabel2 = new JLabel(icon2);
		frame.add(imgLabel1);

		
		//3. 최상위 컨테이너를 보여지도록 설정
		//int를 인수로 넣어 동작방식을 결정한다. 숫자로만 써서는 어떤 속성인지 알기 어려우므로 매크로 상수를 이용한다.
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //창을 닫아도 안 닫힘
//		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);		//기본값. 창을 닫아도 프로세스?는 종료되지 않음
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//dispose()를 발동시켜 해당 객체를 메모리에서 지운다고.. 
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//창을 닫으면(하나만 닫아도) 프로그램 전체가 종료
		
		System.out.println(JFrame.DO_NOTHING_ON_CLOSE); //0
		System.out.println(JFrame.HIDE_ON_CLOSE);		//1
		System.out.println(JFrame.DISPOSE_ON_CLOSE); 	//2
		System.out.println(JFrame.EXIT_ON_CLOSE);		//3
		frame.setVisible(true);
		
		JFrame frame2 = new JFrame("Another window");
		frame2.setSize(400, 400);
		frame2.setVisible(true);

		
	}
}
