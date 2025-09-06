package log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class Loger {
    public static final Logger logger = LogManager.getLogger();

    final static File logFile;

    static {
        logFile = new File( "logs.log" );
        if ( !logFile.exists() ) {
            try {
                logFile.createNewFile();
            }
            catch (final IOException e) {
                e.printStackTrace();
            }
        }
    }
}
