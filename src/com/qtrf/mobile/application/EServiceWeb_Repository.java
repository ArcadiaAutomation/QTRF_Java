package com.qtrf.mobile.application;


import java.util.Hashtable;

public class EServiceWeb_Repository {

	Hashtable<String,String> table = new Hashtable<String,String>();
	Hashtable<String,String> typeTable = new Hashtable<String,String>();
	public EServiceWeb_Repository()
	{
		table.put("package", "jksta.wifiportal");
		table.put("activity", "jksta.wifitool.MainActivity");
		table.put("waitActivity", "any");
		table.put("wifiToggle", "wifi_toggle");
		typeTable.put("wifiToggle", "id");
		table.put("connecting", "connect_progressbar");
		typeTable.put("connecting", "id");
		table.put("connected", "wifi_profile");
		typeTable.put("connected", "id");
		table.put("ssid", "Name_textView");
		typeTable.put("ssid", "id");
	}
	
}
