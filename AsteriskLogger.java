//Question 3a: new class AsteriskLogger
public class AsteriskLogger implements Logger{
//Question 4: method takes a string and prints with * before and after
	public void log(String log) {
		System.out.println("***"+log+"***");
		
	}
//Question 5: Method print iterates through length of string and prints line of *, string is printed between * lines
	public void error(String error) {
		
for(int i = 0; i < error.length()+ 13; i++) {
			
			System.out.print("*");	
			}
		System.out.println("");
		System.out.println("");
		
		System.out.println("***"+ "Error: " + error+ "***");
		System.out.println("");
		
		for (int i=0; i< error.length()+ 13; i++) {
			
			System.out.print("*");
		}
		System.out.println("");
		
	}
	

}
