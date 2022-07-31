
public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.Log("Hello");
		logger.Error("TEST");
		
		Logger logging = new SpacedLogger();
		
		logging.Log("Trial Test");
		logging.Error("Supercalifragilisticexpealidocious");

	}

}