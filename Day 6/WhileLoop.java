import java.util.Scanner;

class WhileLoop {
    public static void main(String[] args) {
        int sum = 0;
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        while (number >= 0) {
            sum += number;
            System.out.println("Enter a number");
            number = input.nextInt();
        }

        System.out.println("Sum = " + sum);
        input.close();

        // while(true) {

        // }
    }
}
