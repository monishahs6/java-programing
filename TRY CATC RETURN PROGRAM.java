
public class Main {
    static int test() {
        try {
            System.out.println("Inside try block");
            return 10;
        } catch (Exception e) {
            System.out.println("Exception occurred");
            return 0;
        } finally {
            System.out.println("I am inevitable");
        }
    }

    public static void main(String[] args) {
        System.out.println("Return value: " + test());
    }
}
