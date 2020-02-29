package com.javalec.In_Out;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutStream_Ex {
	public static void main(String[] args) {
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("/Users/user/eclipse_workspace/Java_practice1/src/com/javalec/In_Out/in_out.txt");
			String str = "오늘 날씨는 아주 덥씁니다!!!!ㅠㅠ";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(os != null) os.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
}
