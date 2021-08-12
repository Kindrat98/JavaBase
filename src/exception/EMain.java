package exception;

public class EMain {
    public static void main(String[] args) {

        try {
            int a = 5;
            String s = null;
            s.length();
        }catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally2");
        }

    }

    public static void sleep () throws InterruptedException {
        Thread.sleep(1000);
    }
}
