import java.util.Scanner;

public class Video15 {
	public static void main(String args[]) {
		
		    Scanner input = new Scanner (System.in);
		    Video15Part2 thinkingObject = new Video15Part2 ();
		    
		    System.out.println("Enter your name here: ");
		    String name = input.nextLine();
		    
		    thinkingObject.simpleMessage(name);
		
	}
}
