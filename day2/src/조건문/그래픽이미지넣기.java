package ���ǹ�;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �׷����̹����ֱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame f = new JFrame();
		f.setTitle("�ι�° �׷���");
		f.setSize(1000,1000);
		
		JButton button = new JButton("\uC774\uBBF8\uC9C0\uB123\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ �����̱���.");
				Random r = new Random();
				//0->����, 1->����, 2->��
				int computer = r.nextInt(3);
				if(computer == 0) { //����
					System.out.println("�����.");
				}else if(computer == 1) { //����
					System.out.println("��ǻ�� ��.");
				}else {
					System.out.println("���� ��.");
				}
			}
		});
		button.setIcon(new ImageIcon("D:\\suhminjoo_java\\day2\\\uAC00\u315C\uC774.jpg"));
		f.getContentPane().add(button, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("\uBC14\uC704");
		btnNewButton.setIcon(new ImageIcon("D:\\suhminjoo_java\\day2\\22.jpg"));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("\uBCF4");
		btnNewButton_1.setIcon(new ImageIcon("D:\\suhminjoo_java\\day2\\\uBCF4\uC790\uAE30.jpg"));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		
		f.setVisible(true);		
	}

}
