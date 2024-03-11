package mypack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mylogs {

	public static Logger log=null;
	public static void main(String[] args) {
		
		log=LogManager.getLogger(mylogs.class);
		log.info("i am info1");
		log.error("i am error");
		log.info("info 2");
		log.debug("i am debug");
	}

}
