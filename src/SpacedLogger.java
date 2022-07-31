
public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		StringBuilder word = new StringBuilder();
		for(int i = 0; i < log.length(); i++) {
			char letter = log.charAt(i);
			word.append(letter + " ");
		}
		
		System.out.println(word);
	}

	@Override
	public void Error(String err) {
		StringBuilder word = new StringBuilder();
		for(int i = 0; i < err.length(); i++) {
			char letter = err.charAt(i);
			word.append(letter + " ");
		}
		System.out.println("ERROR: " + word);
		
	}

}
