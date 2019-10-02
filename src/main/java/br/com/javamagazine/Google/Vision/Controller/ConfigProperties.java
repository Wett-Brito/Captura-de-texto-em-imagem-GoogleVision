package br.com.javamagazine.Google.Vision.Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	
	public static Properties getConfig() throws IOException {
		Properties config = new Properties();
		FileInputStream file = new FileInputStream("./properties/Config.properties");
		config.load(file);
		return config;

	}

}
