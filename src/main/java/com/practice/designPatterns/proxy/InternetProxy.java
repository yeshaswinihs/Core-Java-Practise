package com.practice.designPatterns.proxy;

public class InternetProxy implements ISP {

	@Override
	public String getResource(String site) {
		this.logRequest(site);

		if (this.isBlockedSite(site)) {
			return "This site is blocked as per company policy";
		}

		NetworkSetting networkSetting = new NetworkSetting();
		return networkSetting.getISP().getResource(site);
	}

	private boolean isBlockedSite(String site) {
		switch (site) {
		case "www.google.com":
			return false;
		case "www.gaming.com":
			return true;
		default:
			return false;
		}
	}

	private void logRequest(String site) {
		System.out.println();

	}

}
