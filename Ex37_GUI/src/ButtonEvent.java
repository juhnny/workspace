import java.awt.Button;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//버튼을 누를 때 명령이 실행되도록 하는 실습
public class ButtonEvent extends JFrame{

	JButton btn1;
	JLabel lbl1;
	
	ImageIcon icon;
	ImageIcon icon2;
	JLabel imgLabel1;
	Button btn3;
	
	public ButtonEvent() {
		setTitle("Button Click Event");
		setSize(700, 1000);
		
		setLayout(new FlowLayout());
//		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
//		JButton btn1 = new JButton("글씨 변경");
//		add(btn1);
//		JLabel lbl1 = new JLabel("피카츄 라이츄 파이리 꼬부기");
//		add(lbl1);
		//위처럼 만들면 지역변수로 만들어져서 메소드 밖에서는 사용할 수 없음
		//그래서 가급적 컴포넌트의 참조변수는 멤버변수로 만들 것을 권장
		btn1 = new JButton("글씨 변경");
		add(btn1);
		lbl1 = new JLabel("피카츄 라이츄 파이리 꼬부기");
		add(lbl1);
		
		//버튼을 눌렀을 때 lbl1에 써있는 글씨 변경
		//버튼이 클릭되는 액션(동작)만 듣는 별도의 객체를 생성하여 버튼의 액션을 감시
		//ActionLister라는 인터페이스 사용 -> 구현하는 클래스 필요
		ClickListener listener = new ClickListener();
		//이 리스너를 버튼에게 붙여준다!!
		btn1.addActionListener(listener);
		//이제 btn1에 특정 ActionEvent(기본값은 모든 종류의 액션 포함)가 발생하면 
		//listener라는 ActionListener 객체의 콜백메소드인 actionPerformed()가 실행됨
		
		
		//새로 이미지를 만들어 버튼을 누르면 리사이즈 된 이미지로 바뀌도록 해보자
		//컴포넌트의 참조변수들은 멤버변수로 만들고 오자.
		icon = new ImageIcon("aaa/pokemon.jpg");
		//리사이즈 된 이미지
		icon2 = new ImageIcon(icon.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH));
		imgLabel1 = new JLabel(icon);
		btn3 = new Button("Resize Image!");
		
		//Jframe에 추가
		add(imgLabel1);
		add(btn3);

		//ActionListener는 익명 클래스로 구현하는 게 더 일반적. 가독성도 더 좋다.
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				//리사이즈한 이미지로 변경
				imgLabel1.setIcon(icon2); //혹은 ImageIcon을 새로 만들지 말고 아래처럼 바로 생성해도 된다.
//				imgLabel1.setIcon(new ImageIcon(icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
			}
		};
		//btn3에 listener2 연결
		btn3.addActionListener(listener2);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lbl1.setText("버터플 야도란 피죤투 또가스"); //여기서 label 값을 바꾸면 창이 띄워진 후 텍스트가 바뀌는 게 아니다. 
											//창이 띄워지는 건 객체 생성(생성자 함수 포함)이 끝난 뒤이기 때문에 텍스트가 바뀐 후 창이 띄워진다.
		
	}//생성자
	
	//이너(멤버) 메소드로 ActionListener를 구현
	//이너 클래스는 outer class의 멤버변수를 내 것처럼 사용할 수 있음 - 컴포넌트들을 멤버변수로 만들어야 하는 이유
	class ClickListener implements ActionListener{
		//이 메소드가 감시하는 버튼에 특정 액션이 발생하면 자동으로 이 메소드가 실행됨 
		// Callback method - 명령에서 직접 call하지 않아도 이벤트가 발생하면 운영체제에서 호출하는 메소드
		@Override
		public void actionPerformed(ActionEvent e) {
			if(lbl1.getText().equals("버터플 야도란 피죤투 또가스")) {
				lbl1.setText("서로 생긴 모습은 달라도");
			}else if(lbl1.getText().equals("서로 생긴 모습은 달라도")){
				System.out.println("hey!");
				lbl1.setText("우리는 모두 친구");
			}
		}
	}
	
	
	public static void main(String[] args) {
		new ButtonEvent();	
	}
}//class ButtonEvent
