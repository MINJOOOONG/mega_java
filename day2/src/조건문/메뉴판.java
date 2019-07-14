package Á¶°Ç¹®;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ¸Þ´ºÆÇ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("¸Þ´ºÆÇ");
		f.setSize(1800,1000);
		
		JButton btnNewButton = new JButton("\uC6B0\uB3D9");
		btnNewButton.setBackground(new Color(218, 112, 214));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("¿ìµ¿À» ´­·¶±º¿ä!");
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\suhminjoo_java\\day2\\\uC6B0\uB3D9.jpg"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("\uC9EC\uBF55\r\n");
		btnNewButton_1.setBackground(new Color(0, 0, 205));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Â«»ÍÀ» ´­·¶±º¿ä!");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\suhminjoo_java\\day2\\\uC9EC\uBF55.jpg"));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uC9DC\uC7A5\r\n");
		btnNewButton_2.setBackground(new Color(0, 100, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Â¥ÀåÀ» ´­·¶±º¿ä!");
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\suhminjoo_java\\day2\\\uC9DC\uC9F1.jpg"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		f.setVisible(true);

	}

}
