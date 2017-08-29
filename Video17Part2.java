public class Video17Part2 {
	private String girlName;
	
	public Video17Part2(String name){
		girlName=name;
	}
	public void setName(String name){
		girlName=name;
	}
	public String getName(){
		return girlName;
	}
	public void saying (){
		System.out.printf("Your first gf was %s", getName());
	}
}
