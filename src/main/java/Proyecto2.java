//import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.junit.jupiter.api.Test;

public class Proyecto2 {
	private static final Logger logger = LogManager.getLogger(Proyecto2.class);
	
	public static void main(String[] args) {
		    logger.debug("This is a debug message");
		    logger.info("This is an info message");
		    logger.error("This is an error message");
		  }	
}
