package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//Log levels : T-trace, D-debug, I-Info, W-warn, E-error, F-fatal
public class LoggingDemo {
	private static Logger logger = LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
//		System.out.println(); never use sysout in real project use logger.
		logger.trace("this is logger trace");
		logger.debug("this is logger debug");
		logger.info("this is logger info");
		logger.warn("this is logger warn");
		logger.error("this is logger error");
		logger.fatal("this is logger fatal");
		
	}
}
