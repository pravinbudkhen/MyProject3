package mypack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mylog1 {


	public static Logger log=null;
	public static void main(String[] args) {
		
		log=LogManager.getLogger(mylogs.class);
		log.info("i am info");
		log.error("i am error");
		log.info("info");
	
}
}
