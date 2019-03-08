package com.practice.designPatterns.proxy;

import java.util.Scanner;

public class ProxyRunner {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	String site = scanner.next();
	
	NetworkSetting network = new NetworkSetting();
	ISP isp = network.getInternet();
	System.out.println(isp.getResource(site));
	}
}
