//•COMPARING STRINGS:

/* 
#Syntax--  
if(name1.compareto(name2));
it will return 3 values: 
1. s1 > s2: Positive value
2. s1 ==s2: 0
3. s1 > s3: Negative Value
*/

public class Strings5_compareTo{
	public static void main(String args[]){
	String name1 = "Tony";
	String name2 = "Stark";

	if(name1.compareTo(name2)==0)
	{
		System.out.println("Strings are equal"); 
	}

	else	
	{
	 	System.out.println("Strings are not equal");
	}
}
}