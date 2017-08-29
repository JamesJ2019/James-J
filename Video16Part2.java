import java.util.Scanner;

public class Video16Part2{
	public static void main(String[] args){
		    Scanner input = new Scanner(System.in);
		    Video16 hiObject = new Video16();
		    System.out.println("Enter name of first gf here: ");
		    String personal = input.nextLine();
		    hiObject.setName(personal);
		    hiObject.saying();
	}
}