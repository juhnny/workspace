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
		
		//Java���� GUI�� ���α׷��� ���� �� �ִ� Ŭ�������� ����(API)�� ũ�� �� ����
		// 1. AWT : �ü���� GUI �׸��� ���� ����� �������
		// 2. Swing: Java���� ���� ������
		// 2-2. Java FX: Androidó�� ȭ���� ����� ���� ���� FXML �� ����ϰ�, 
		//				��ư Ŭ�� ���� ���ۿ� ���� �ڵ常 Java�� �ۼ��ϴ� ���. ������ �ѷ� �������ٴ� �� Ư¡
		//				���� �뼼���� �߰����� ���α׷� ��ġ �ʿ�
		
		//GUI ������� Swing ����غ���
		//1. �ֻ��� �����̳� ����
		JFrame frame = new JFrame("Hello");
		frame.setTitle("Hi");
		frame.setSize(500, 300);
		
		//2. ������Ʈ �߰�
		JButton btn1 = new JButton();
		btn1.setText("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		
		//�����̳ʿ� ������Ʈ �߰�
		frame.add(btn1);
		frame.add(btn2, BorderLayout.NORTH);
		frame.add(btn2, BorderLayout.WEST); //������Ʈ�� �ߺ��� add�ϸ� ������ �͸� ����Ǵ� ��
		frame.add(btn3, BorderLayout.EAST);
		
		//LayoutManager ��ġ������ ����
		//��ǥ������ FlowLayout, BorderLayout ��..
		//�⺻���� BorderLayout. NORTH, SOUTH, RIGHT, LEFT, CENTER �ټ� �������� ���� ����. �⺻�� CENTER
		
		//FlowLayout���� ������ �����ϰ��� ��.
		// * FlowLayout : ������Ʈ���� �׳� ������ ��ġ��Ŵ.
		frame.setLayout( new FlowLayout() );
		
		//JLabel - �۾��� �����ִ� ������Ʈ
		JLabel label1 = new JLabel("I'm Label1");
		frame.add(label1);
		
		//JTextField - ����ڷκ��� �۾� �Է¹޴� ������Ʈ
		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField(20); //20���� ���� ���̴� ������. �� ���� �ٸ�. 20�� �Ѿ�� �Է� ����		
		frame.add(tf1);
		frame.add(tf2);
		
		//�̹��� ���� ������Ʈ�� ����
		//��� JLabel�� ������ �̹����� �����ִ� ����� �ִµ� �̸� Ȱ��
		ImageIcon icon = new ImageIcon("aaa/airplane.jpg");
		JLabel imgLabel1 = new JLabel(icon);  
//		frame.add(imgLabel1);
		
		//������¡ ���
		//JLabel�� Image�� �� �����ְ� ImageIcon�� ������ �� �ִ�. ImageIcon�� Image��� ��ü�� ���� �ְ� �̸� ������ �� �ִ�.
		//ImageIcon ��ü �ȿ� �ִ� Image ��ü(���� �̹����� ���� ����) ��������
		Image img = icon.getImage();
		//�ѹ� ������� Image ��ü�� �̹��� ������� �ٲ� �� ����. 
		//Image�� ���� �̹����� ������¡�� ���ο� Image ��ü�� ����� �Ҵ�
//		img = im.getScaledInstance(100, 100, Image.SCALE_SMOOTH); //width, height, scaling algorithm
//		Image img2 = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH); //width, height, scaling algorithm
		img = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH); //width, height, scaling algorithm
//		ImageIcon icon2 = new ImageIcon(img2);
//		JLabel imgLabel2 = new JLabel(icon2);
		frame.add(imgLabel1);

		
		//3. �ֻ��� �����̳ʸ� ���������� ����
		//int�� �μ��� �־� ���۹���� �����Ѵ�. ���ڷθ� �Ἥ�� � �Ӽ����� �˱� �����Ƿ� ��ũ�� ����� �̿��Ѵ�.
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //â�� �ݾƵ� �� ����
//		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);		//�⺻��. â�� �ݾƵ� ���μ���?�� ������� ����
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//dispose()�� �ߵ����� �ش� ��ü�� �޸𸮿��� ����ٰ�.. 
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//â�� ������(�ϳ��� �ݾƵ�) ���α׷� ��ü�� ����
		
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
