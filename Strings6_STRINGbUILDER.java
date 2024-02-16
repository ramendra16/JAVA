public class Strings6_STRINGbUILDER {
    
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Tony");
        //takes less time for addition, multi, etc functions;
        System.out.println(s1);

        //charAt
        System.out.println("Showing char at 0 index :" + s1.charAt(2));

        //set char At index
        s1.setCharAt(0, 'R');
        System.out.println("Changing T with R: "+s1);

        //Insert
        s1.insert(0, "I");
        System.out.println("Inserting I before R: "+ s1);


    }
}
