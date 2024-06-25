package string;

public class Demo1 {


    public static void main(String[] args) {
        String s1 = "Welcome";   // String literal
        String s2 = new String("America");

        System.out.println("Length of string " +s1 +" is: " + s1.length());
        System.out.println("Length of string" +s2 +" is: " + s2.length());

    }
}

class Demo2 {
    public static void main(String[] args) {

        String s3 = "Language";
        System.out.println("Character at index 2 in Language: "+s3.charAt(2));
        System.out.println("Character at index 4 in Language: "+ s3.charAt(4));
        System.out.println("Character at index 0 in Language: "+ s3.charAt(0));
        System.out.println("Substring at (1,3) in Language: " + s3.substring(1,3));

    }
}


class Demo3 {
    public static void main(String[] args) {
        String s4 = "Java";
        String s5 = "Language";

        String s6 = s4.concat(s5);
        System.out.println("Concatenated string: "+ s6);
    }
}
