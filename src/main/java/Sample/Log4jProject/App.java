package Sample.Log4jProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.test.lomborktest.LomborkTest;

public class App {
	
	private static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		LomborkTest l1 = new LomborkTest();
		logger.info("Setting var of LomborgTest from Log4jProject");
//		l1.setProp1("Prop1");
//		l1.setProp2("Prop2");
		logger.info("Calling test() of LomborgTest from Log4jProject");
//		l1.test(logger);
		logger.debug("Printing l1 from main " + l1);
		logger.info("Ending Log4jProject");
	}

}
