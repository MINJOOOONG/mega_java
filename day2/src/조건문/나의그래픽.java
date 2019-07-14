package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 첫 그래픽");
		f.setSize(500,500);
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가운데 버튼을 눌렀군요.");
			}
		});
		btnNewButton.setBackground(new Color(255, 192, 203));
		btnNewButton.setFont(new Font("HY견고딕", Font.BOLD, 34));
		btnNewButton.setForeground(new Color(72, 61, 139));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton button = new JButton("\uC67C\uCABD\uBC84\uD2BC");
		button.setBackground(new Color(250, 128, 114));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		f.getContentPane().add(button, BorderLayout.WEST);
		
		JButton button_1 = new JButton("\uC624\uB978\uCABD\uBC84\uD2BC");
		button_1.setBackground(new Color(250, 128, 114));
		f.getContentPane().add(button_1, BorderLayout.EAST);
		
		JButton btnNewButton_1 = new JButton("\uC544\uB798\uBC84\uD2BC");
		btnNewButton_1.setBackground(new Color(250, 128, 114));
		f.getContentPane().add(btnNewButton_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("\uC704\uCABD\uBC84\uD2BC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("위쪽 버튼을 눌렀군요.");
			
			}
		});
		btnNewButton_2.setBackground(new Color(250, 128, 114));
		f.getContentPane().add(btnNewButton_2, BorderLayout.NORTH);
		
		f.setVisible(true);
	

	}

}
