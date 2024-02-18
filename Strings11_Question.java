import java.util.Scanner;
public class Strings11_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s1 = sc.next();
        String result="";

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == 'e'){
                
                result = s1.replace('e', 'i');
                
            }
            else{
                System.out.println(s1);
            }
            
        }
        
            System.out.println(result);
        
    }
    
}
