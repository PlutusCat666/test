package com.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//获取本机的InetAddress实例
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("计算机名:" + address.getHostName());
		System.out.println("IP地址:" + address.getHostAddress());
		byte[] bs = address.getAddress();
		System.out.println(Arrays.toString(bs));
		
//		InetAddress address2 = InetAddress.getByName("WIN-01710301038");
		InetAddress address2 = InetAddress.getByName("10.10.40.28");
		System.out.println("计算机名:" + address2.getHostName());
		System.out.println("IP地址:" + address2.getHostAddress());
		
		System.out.println(address);
	}
}
