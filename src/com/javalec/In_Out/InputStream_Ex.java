package com.javalec.In_Out;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStream_Ex {
	public static void main(String[] args) {
		
		InputStream is = null;
		
		try {
			is = new FileInputStream("/Users/user/eclipse_workspace/Java_practice1/src/com/javalec/In_Out/in_out.txt");
			while (true) {
				int i = is.read();
				System.out.println("데이터 : " + i);
				if(i == -1) break;
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(is != null) is.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
}
  