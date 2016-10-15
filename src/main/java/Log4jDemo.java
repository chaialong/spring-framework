import org.apache.log4j.Logger;

public class Log4jDemo {
    static Logger logger = Logger.getLogger(Log4jDemo.class.getName());

    public static void main(String[] args) {
        logger.debug("debug message");
        logger.info("info message");
    }
}
