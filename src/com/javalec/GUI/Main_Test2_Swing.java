package com.javalec.GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main_Test2_Swing {
	public static void main(String[] args) {
		MakeComp makeComp = new MakeComp();
		makeComp.pack();
		makeComp.setVisible(true);
	}
}



class MakeComp extends JFrame implements ActionListener{
	
	
	JPanel jPanle;
	JLabel jLable;
	JButton jButton;
	JButton jButtonExit;
	JTextField jTextFiled;
	JComboBox<String> jComboBox;
	JCheckBox jCheckBox;
	String[] items = {"A", "B", "C"};
	JLabel jLableBlank;
	
	public MakeComp() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jPanle = (JPanel)getContentPane();
		jPanle.setLayout(new FlowLayout());
		jLable = new JLabel("Lable");
		jButton = new JButton("Button");
		jTextFiled = new JTextField(20);
		jComboBox = new JComboBox<String>(items);
		jCheckBox = new JCheckBox("CheckBox");
		jLableBlank = new JLabel();
		jButtonExit = new JButton("EXIT");
		
		jPanle.add(jLable);
		jPanle.add(jButton);
		jPanle.add(jTextFiled);
		jPanle.add(jComboBox);
		jPanle.add(jCheckBox);
		jPanle.add(jLableBlank);
		jPanle.add(jButtonExit);
		
		jLable.setPreferredSize(new Dimension(50, 50));
		jButton.setPreferredSize(new Dimension(100, 50));
		jTextFiled.setPreferredSize(new Dimension(300, 50));
		jComboBox.setPreferredSize(new Dimension(50, 50));
		jCheckBox.setPreferredSize(new Dimension(100, 50));
		jLableBlank.setPreferredSize(new Dimension(200, 50));
		jButtonExit.setPreferredSize(new Dimension(100, 50));
		
		
		jButton.addActionListener(this);
		jButtonExit.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButton) {
			jLable.setText(jTextFiled.getText());
		} else if(e.getSource() == jButtonExit) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}
	
}