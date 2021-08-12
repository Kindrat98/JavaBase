package classwork;

public class Reverse {
    public static void main(String[] args) {
        String s = "1234567";

        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        System.out.println(result);
    }
}
