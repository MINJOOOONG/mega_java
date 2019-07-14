package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 그래픽이미지넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame f = new JFrame();
		f.setTitle("두번째 그래픽");
		f.setSize(1000,1000);
		
		JButton button = new JButton("\uC774\uBBF8\uC9C0\uB123\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가위를 누르셨군요.");
				Random r = new Random();
				//0->가위, 1->바위, 2->보
				int computer = r.nextInt(3);
				if(computer == 0) { //가위
					System.out.println("비겼음.");
				}else if(computer == 1) { //바위
					System.out.println("컴퓨터 승.");
				}else {
					System.out.println("내가 승.");
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
