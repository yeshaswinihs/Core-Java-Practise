package com.practice.designPatterns.proxy;

public class Vodafone implements ISP {

	@Override
	public String getResource(String site) {
		switch (site) {
		case "www.google.com":
			return "GOOOOOOOOGLE";
		case "www.yahoo.com":
			return "YAAAAHOOOOOO!";
		default:
			return "Not Found!";
		}
	}

}
