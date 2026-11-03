public class Main {

    // Method to add two numbers
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 15;

        // Create an object of Main
        Main obj = new Main();

        // Calling the method
        int result = obj.add(num1, num2);

        System.out.println("Sum is: " + result);
    }
}