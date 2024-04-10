package log4j2;
import org.apache.log4j.Logger;

public class log4j2 {

    private static final Logger logger = Logger.getLogger(log4j2.class);

    public static void main(String[] args) {
        if(args.length != 2) {
            logger.error("起動引数の数が異常: " + args.length);
        }
    }
}
