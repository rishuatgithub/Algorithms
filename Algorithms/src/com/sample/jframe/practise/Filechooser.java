package com.sample.jframe.practise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Filechooser extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	//JFrame jf;
	JButton jb;
	JTextField tf;
	
	public Filechooser() {
		JFrame jf = new JFrame("File Chooser");
		jb = new JButton("Browse...");
		jb.setBounds(10, 10, 100, 20);
		jb.addActionListener(this);
	
		tf = new JTextField(); 
		tf.setBounds(10, 13, 100, 30);
		
		jf.add(jb);
		jf.add(tf);
		jf.setVisible(true);
		jf.setSize(600, 600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getSource());
		if (e.getSource() == jb) {
			JFileChooser fc = new JFileChooser();
			int returnval = fc.showOpenDialog(jb);
			fc.setDialogTitle("Choose File Location");
			fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			fc.setAcceptAllFileFilterUsed(false);
			
			if(returnval == JFileChooser.APPROVE_OPTION) {
				//String f = fc.getSelectedFile().getPath();
				File f = fc.getCurrentDirectory();
				System.out.println(f.getAbsolutePath());
				tf.setText(f.getAbsolutePath());
			}
		}
		
		
	}

	public static void main(String[] args) {
		new Filechooser();
	}

	

}
