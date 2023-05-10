import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Proyecto2Tests {
	private static final Logger logger = LogManager.getLogger(Proyecto2Tests.class);
	@Test
    public void testLogging() {
        // Verificar que los mensajes se han registrado correctamente en los archivos de salida
		logger.debug("This is a debug message");
	    logger.info("This is an info message");
	    logger.error("This is an error message");
		
		assertTrue(new File("logs/error.log").exists());
        assertTrue(new File("logs/debug.log").exists());
        assertTrue(new File("logs/info.log").exists());
	}

}

