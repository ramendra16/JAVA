import java.util.Scanner;
public class Strings10_QUESTION{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st String: ");
        String s1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();

        String full = s1 + s2;
        System.out.println(full.length());


    }
}