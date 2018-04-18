package com.sample.jframe.practise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFrameMaster {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame("Practise JFrame");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar jmb = new JMenuBar();
		
		JMenu menu = new JMenu("Menu");
		JMenuItem i1 = new JMenuItem("Menu - 1");
		JMenuItem i2 = new JMenuItem("Menu - 2");
	    
		menu.add(i1);
		menu.addSeparator();
		menu.add(i2);
		
		jmb.add(menu);
		
		
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getSource());
			}
		};
		
		menu.addActionListener(action);
		
		jf.setVisible(true);
		jf.setJMenuBar(jmb);
		jf.setSize(300, 400);
	}

}
