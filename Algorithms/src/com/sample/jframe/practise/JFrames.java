package com.sample.jframe.practise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jf = new JFrame("Testing Buttons and Frames");
		
		JButton jb = new JButton("Button 1");
		jb.setBounds(0, 10, 100, 20);
		JTextField tf = new JTextField();
		tf.setBounds(0, 20, 100, 30);
		tf.setText("This is a text fields");
		
		jf.add(jb);
		jf.add(tf);
		
		jf.setVisible(true);
		jf.setSize(400, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
