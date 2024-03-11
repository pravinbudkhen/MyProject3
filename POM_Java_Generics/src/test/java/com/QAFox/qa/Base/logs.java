package com.QAFox.qa.Base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class logs {
	private static Logger logs=LogManager.getLogger(logs.class);
	public static void main(String[] args) {
		 	
		 
		 logs.info("log1");
		 logs.error("Error1");
		 logs.error("error2");
		 logs.info("log3");
		 logs.fatal("fatal");
		 
		 logs.info("logX");
		 logs.error("ErrorX");
		 logs.error("ErrorXX");
		 logs.info("logXXX");
		 logs.fatal("fatalX");
		
	}

}
