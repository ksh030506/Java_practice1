package com.javalec.GUI;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;

public class MakeBtnMain {
	public static void main(String[] args) {
		MakeBtn btn = new MakeBtn();
		
		//btn.pack();
		btn.setSize(new Dimension(200, 200));
		btn.setVisible(true);
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		btn.setVisible(false);
		btn.disable();    //자원해제
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.exit(0);
		
	}
}


class MakeBtn extends Frame {

	public MakeBtn() {
		Button btn = new Button("Button");
		add(btn);
	}
}