class SumOfFourDigits {
    public static void main(String[] args) {

        int n = 1234;

        int d1 = n / 1000;
        int d2 = (n / 100) % 10;
        int d3 = (n / 10) % 10;
        int d4 = n % 10;

        int sum = d1 + d2 + d3 + d4;

        System.out.println("Sum of four digits = " + sum);
    }
}