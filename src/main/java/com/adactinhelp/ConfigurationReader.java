package com.adactinhelp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties ps;
	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Program Files\\Cucumber Project\\AdactinDemo\\src\\test\\java\\AdactinProperty\\adactinproperty");
		FileInputStream fis= new FileInputStream(f);
		 ps=new Properties();
		ps.load(fis);
		
		
	}
	public String GetBrowser() {
		String browsername = ps.getProperty("BrowserName");
		return browsername;
		System.out.println(browsername);

	}
	
	public String GetUrl() {
	String url = ps.getProperty("url");
	return url ;
	System.out.println(url);

	}

}
