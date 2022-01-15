
// Question 3b: new class SpacedLogger
public class SpacedLogger implements Logger {
//Question 6: new method takes a sting, converts to char array, iterates through array to create new string with spaces	
	public void log(String log) {
		
		char[] word = log.toCharArray();
		StringBuilder spaceWord = new StringBuilder("");
		
		for(int i = 0; i < log.length(); i++) {
		
		String letter = Character.toString(word[i]);
		spaceWord.append(" " + letter);
		}
		
		System.out.println(spaceWord);
	}
//Question 8: includes "Error:" in stringbuilder
	public void error(String error) {
		
		char[] word = error.toCharArray();
		StringBuilder errorWord = new StringBuilder("ERROR:");
		
		for(int i = 0; i < error.length(); i++) {
		
		String letter = Character.toString(word[i]);
		errorWord.append(" " + letter);
		
		}
		
		System.out.println(errorWord);
		
		
	}

}
