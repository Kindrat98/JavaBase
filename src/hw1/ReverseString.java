package hw1;

public class ReverseString {
    public static void main(String[] args) {
        String s = "1234567";

        System.out.println(reverse(s));
    }

    public static String reverse(String s){
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        return result;
    }
}
