package com.javalec.In_Out;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class In_Out_Ex1 {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("/Users/user/eclipse_workspace/Java_practice1/src/com/javalec/In_Out/in_out.txt");
			os = new FileOutputStream("/Users/user/eclipse_workspace/Java_practice1/src/com/javalec/In_Out/in_out_copy.txt");
			
			while (true) {
				int i = is.read();
				if(i == -1) break;
				os.write(i);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(is != null) {
					try {
						is.close();
					} catch (Exception e2) {
						System.out.println(e2.getMessage());
					}
				}
				
				if(os != null) {
					try {
						os.close();
					} catch (Exception e2) {
						System.out.println(e2.getMessage());
					}
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
}
