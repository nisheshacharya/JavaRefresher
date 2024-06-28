package string;

public class StringBuilderPractice {
    public static void main(String[] args) {
        String word = "Apple is good.";
        String section = "is";
        System.out.println(removeStringSection(word, section));

    }
    public static String removeStringSection(String word, String section) {

        StringBuilder sb = new StringBuilder(word);

        int startIndex = sb.indexOf(section);
        sb.delete(startIndex, startIndex+ section.length());
        return sb.toString();
    }
}

