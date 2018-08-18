package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Additivity
 * @author root
 *
 */
public class LogToFile {

	public static void main(String[] args) {
		final Logger LOG = LoggerFactory.getLogger(LogToFile.class);
		LOG.trace("Starting trace...");
		doSomething1(LOG);
		LOG.trace("Stopping trace...");
	}
	
	private static void doSomething1(final Logger LOG) {
		LOG.info("First log."); // Must configure configuration
		LOG.error("First error log"); // Will show in default configuration
	}
}
