package com.javalec.network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConnection_Ex {
	public static void main(String[] args) {
		new URLConEx();
	}
}



class URLConEx {
	public URLConEx() {
		String code = null;
		
		System.out.print("웹 주소를 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		String address = in.next();
		
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();
			BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter fw = new FileWriter("/Users/user/eclipse_workspace/Java_practice1/src/com/javalec/network/file.html");
			
			while((code = webData.readLine()) != null) {
				fw.write(code);
			}
			System.out.println("The END");
			
			fw.close();
			webData.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}