package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 결과넣기그래픽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		f.setTitle("나의 첫 그래픽");
		f.setSize(500,500);
		
		JButton top = new JButton("\uC704\uCABD\uBC84\uD2BC\r\n");
		JButton sub = new JButton("\uC544\uB798\uBC84\uD2BC");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		top.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("top을 누르셨군요.");
				f.setTitle("top을 누르셨군요.");
				sub.setText("top을 누르셨군요.");
			}
		});
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JButton mid = new JButton("\uAC00\uC6B4\uB370\uBC84\uD2BC");
		f.getContentPane().add(mid, BorderLayout.CENTER);
		
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		f.setVisible(true);

	}

}
