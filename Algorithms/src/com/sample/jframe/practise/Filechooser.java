package com.sample.jframe.practise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;

public class Filechooser extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Filechooser() {
		JMenuItem menu = new JMenuItem("Open File");
		menu.addActionListener(this);
		
	}
	

	public static void main(String[] args) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("aaa");
	}

}
