package Logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LogInfo {


	   // object of Logger class
	   private static Logger logger = LogManager.getLogger(LogInfo.class);

	   public  static void main(String args[]){

	      System.out.println("Execution started: ");

	      // logging messages
	      logger.info("This is for information");
	      logger.error("This is for error information");
	      logger.warn("This is for warning information");
	      logger.fatal("This is for fatal information");

	      System.out.println("Execution done: ");
	   }
	}


