package by.epam.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.epam.logic.Utils;

public class App {
    private static final Logger LOG = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		LOG.info("Application started");
		System.out.println(Utils.isAllPositiveNumbers("12", "79"));
		LOG.info("Application finished");
	}
}
