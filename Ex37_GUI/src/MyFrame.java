import javax.swing.JButton;
import javax.swing.JFrame;

//������ Frame�� ������
public class MyFrame extends JFrame{
	
	//MyFrame�� �⺻���� ���¸� ������ �޼ҵ忡�� ó��
	public MyFrame(){
//		this.setSize(500, 500); //this�� ���� ����. setSize()�� ��ӹ޾� �������� �޼ҵ�ϱ�. ���� ���� 
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
