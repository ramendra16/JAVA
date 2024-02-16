public class StringS7_REVERSE {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Tony");
        System.out.println("Before Reversing the String: "+s1);
        for (int i =0; i< s1.length()/2; i++)
        {
            int front=i;
            int end= s1.length() -1 -i;

            char frontChar =  s1.charAt(front);
            char endChar = s1.charAt(end);


            s1.setCharAt(front , endChar);
            s1.setCharAt(end, frontChar);

        }

        System.out.println("After Reversing the String: "+s1);

    }
    
}
