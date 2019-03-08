package com.practice.designPatterns.proxy;

public class NetworkSetting {

	public ISP getInternet() {
		return new InternetProxy();
	}

	public ISP getISP() {
		return new Vodafone();
	}

}
