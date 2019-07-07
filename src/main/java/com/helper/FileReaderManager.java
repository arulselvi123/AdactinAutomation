package com.helper;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {
		
	}
	public static FileReaderManager fm=new FileReaderManager();
	
	public static FileReaderManager getInstance() {
		return fm;
	}
	
	public ConfigReader cr;
	
	public ConfigReader getCr() throws IOException {
	if(cr==null) {
		cr=new ConfigReader();
	}
	
	return cr;
	}
}
