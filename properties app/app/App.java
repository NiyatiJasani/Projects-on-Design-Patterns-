package com.write.properties.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		File configFile = new File("resources\\FileProperties.properties");

		try {
			FileReader reader = new FileReader(configFile);
			Properties props = new Properties();
			props.load(reader);
			System.out.println("key    , values ");
			System.out.println("1  " + props.getProperty("1"));
			System.out.println("2 " +props.getProperty("2"));
			System.out.println("3 " +props.getProperty("3"));
			System.out.println("4 " + props.getProperty("4"));
			reader.close();
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {

		}

	}
}
