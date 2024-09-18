// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
        // TODO: Implement the recursive function to reverse the string
        if (s == null || s.length() <= 1) {
            return s;
        }
        System.out.println("Reversing: " + s);
        return reverse(s.substring(1)) + s.charAt(0);
    }
     public static void main(String[] args) {
        String input = "test string";
        String reversed = reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
