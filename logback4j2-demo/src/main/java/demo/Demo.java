package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	public static void main(String[] args) {
		// This logger lets you use a java.util.Formatter string in the message to format parameters.
		Logger LOG = LogManager.getFormatterLogger();
		LOG.trace("Starting trace...");
		doSomething1(LOG);
		LOG.trace("Stopping trace...");
		System.out.printf("Equal=%s\n",LOG.equals(LogManager.getFormatterLogger()));
		LOG = LogManager.getRootLogger();
		LOG.error("Logging at ROOT level"); // will not run since additivity=false
	}

	private static void doSomething1(final Logger LOG) {
		LOG.info("First log."); // Must configure configuration
		LOG.error("First error log"); // Will show in default configuration
	}
}
