import javax.swing.JButton;
import javax.swing.JFrame;

//나만의 Frame을 만들어보자
public class MyFrame extends JFrame{
	
	//MyFrame의 기본적인 형태를 생성자 메소드에서 처리
	public MyFrame(){
//		this.setSize(500, 500); //this는 생략 가능. setSize()는 상속받아 보유중인 메소드니까. 이하 생략 
		setSize(300, 300); 
		JButton btn = new JButton("btn");
		add(btn);
		
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setVisible(true);
	}
	
	//main()
	public static void main(String[] args) {
		//
		new MyFrame(); 
		new MyFrame();
	}
}
