class SumOfNumber {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;

        for (int i = 1; i <= 1000; ++i) {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
