public class Strings4{
	public static void main(String args[]){
	String name1 = "Tony";
	String name2 = "Stark";
	String fullName = name1 + " " +name2;
	System.out.println(fullName.length()); 
	for(int i =0; i<fullName.length(); i++)
	{
	System.out.println(fullName.charAt(i));
	}
}
}