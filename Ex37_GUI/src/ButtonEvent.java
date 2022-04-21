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

//��ư�� ���� �� ����� ����ǵ��� �ϴ� �ǽ�
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
		
//		JButton btn1 = new JButton("�۾� ����");
//		add(btn1);
//		JLabel lbl1 = new JLabel("��ī�� ������ ���̸� ���α�");
//		add(lbl1);
		//��ó�� ����� ���������� ��������� �޼ҵ� �ۿ����� ����� �� ����
		//�׷��� ������ ������Ʈ�� ���������� ��������� ���� ���� ����
		btn1 = new JButton("�۾� ����");
		add(btn1);
		lbl1 = new JLabel("��ī�� ������ ���̸� ���α�");
		add(lbl1);
		
		//��ư�� ������ �� lbl1�� ���ִ� �۾� ����
		//��ư�� Ŭ���Ǵ� �׼�(����)�� ��� ������ ��ü�� �����Ͽ� ��ư�� �׼��� ����
		//ActionLister��� �������̽� ��� -> �����ϴ� Ŭ���� �ʿ�
		ClickListener listener = new ClickListener();
		//�� �����ʸ� ��ư���� �ٿ��ش�!!
		btn1.addActionListener(listener);
		//���� btn1�� Ư�� ActionEvent(�⺻���� ��� ������ �׼� ����)�� �߻��ϸ� 
		//listener��� ActionListener ��ü�� �ݹ�޼ҵ��� actionPerformed()�� �����
		
		
		//���� �̹����� ����� ��ư�� ������ �������� �� �̹����� �ٲ�� �غ���
		//������Ʈ�� ������������ ��������� ����� ����.
		icon = new ImageIcon("aaa/pokemon.jpg");
		//�������� �� �̹���
		icon2 = new ImageIcon(icon.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH));
		imgLabel1 = new JLabel(icon);
		btn3 = new Button("Resize Image!");
		
		//Jframe�� �߰�
		add(imgLabel1);
		add(btn3);

		//ActionListener�� �͸� Ŭ������ �����ϴ� �� �� �Ϲ���. �������� �� ����.
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				//���������� �̹����� ����
				imgLabel1.setIcon(icon2); //Ȥ�� ImageIcon�� ���� ������ ���� �Ʒ�ó�� �ٷ� �����ص� �ȴ�.
//				imgLabel1.setIcon(new ImageIcon(icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
			}
		};
		//btn3�� listener2 ����
		btn3.addActionListener(listener2);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lbl1.setText("������ �ߵ��� ������ �ǰ���"); //���⼭ label ���� �ٲٸ� â�� ����� �� �ؽ�Ʈ�� �ٲ�� �� �ƴϴ�. 
											//â�� ������� �� ��ü ����(������ �Լ� ����)�� ���� ���̱� ������ �ؽ�Ʈ�� �ٲ� �� â�� �������.
		
	}//������
	
	//�̳�(���) �޼ҵ�� ActionListener�� ����
	//�̳� Ŭ������ outer class�� ��������� �� ��ó�� ����� �� ���� - ������Ʈ���� ��������� ������ �ϴ� ����
	class ClickListener implements ActionListener{
		//�� �޼ҵ尡 �����ϴ� ��ư�� Ư�� �׼��� �߻��ϸ� �ڵ����� �� �޼ҵ尡 ����� 
		// Callback method - ��ɿ��� ���� call���� �ʾƵ� �̺�Ʈ�� �߻��ϸ� �ü������ ȣ���ϴ� �޼ҵ�
		@Override
		public void actionPerformed(ActionEvent e) {
			if(lbl1.getText().equals("������ �ߵ��� ������ �ǰ���")) {
				lbl1.setText("���� ���� ����� �޶�");
			}else if(lbl1.getText().equals("���� ���� ����� �޶�")){
				System.out.println("hey!");
				lbl1.setText("�츮�� ��� ģ��");
			}
		}
	}
	
	
	public static void main(String[] args) {
		new ButtonEvent();	
	}
}//class ButtonEvent
