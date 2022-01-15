//Question 9: Class with main method
public class App {

	public static void main(String[] args) {
//Question 10:		
		Logger word1 = new AsteriskLogger();
		
		word1.log("hello");
		
        Logger errorWord1 = new AsteriskLogger();
        
        errorWord1.error("hello");
		
        Logger word2 = new SpacedLogger();
        
        word2.log("sam");
        
        Logger errorWord2 = new SpacedLogger();
        
        errorWord2.error("Sam");
	}

}
