
public class AsteriskLogger implements Logger {

	@Override
	public void Log(String logging) {
		System.out.println("***" + logging + "***"  );
		
	}

	@Override
	public void Error(String err) {
		
		System.out.println("*******************\n" + "\n***Error:" + err + "***\n" + "\n*******************" );
		
	}

	
	
}
