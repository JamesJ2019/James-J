import java.util.Random;

public class Video26 {
	public static void main(String[] args){
		Random people = new Random();
		int number;
		
		for(int counter=1; counter<=10;counter++){
			number = 1+people.nextInt(6);
			System.out.println(number + " ");
		}
	}
}
