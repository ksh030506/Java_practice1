package com.javalec.network;

import java.net.InetAddress;
import java.util.Scanner;

public class Host_Main {
	public static void main(String[] args) {
		new InetAdressEx();
	}
}


class InetAdressEx {
	Scanner in;
	
	public InetAdressEx() {
		System.out.print("Host 이름을 입력하세요 : ");
		
		in = new Scanner(System.in);
		try {
			InetAddress intAddress = InetAddress.getByName(in.next());
			
			System.out.println("Computer Name :" + intAddress.getHostName());
			System.out.println("Computer IP : " + intAddress.getHostAddress());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}