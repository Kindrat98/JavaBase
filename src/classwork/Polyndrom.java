package classwork;

public class Polyndrom {
    public static void main(String[] args) {
        String pol = "oopoo";

        String pol1 = "ooaaoo";

        String s = "Qwerty";

        System.out.println(isPolyndrom(pol));
        System.out.println(isPolyndrom(pol1));
        System.out.println(isPolyndrom(s));
    }

    public static boolean isPolyndrom(String s){
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1)){
            }else {
                return false;
            }
        }
        return true;
    }
}
