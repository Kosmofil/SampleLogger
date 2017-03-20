import com.kosmos.TestInfoLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    //initialization of logger
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        testErrorLog();

        Thread thread = new TestInfoLog();
        thread.start();
        Thread second = new TestInfoLog();
        second.start();
    }

    public static void testErrorLog() {
        System.out.print("abra-kadabra");//какаято логика
        logger.error("error message is correct");
    }
}
