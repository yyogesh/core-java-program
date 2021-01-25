import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        // int num = 1234;
        // num / 10 ===> 123
        // num % 10 ===> 4

        // 123 / 10 ===> 12
        // num % 10 ===> 3

        // 12 / 10 ===> 1
        // num % 10 ===> 2
        int num = 0;
        int reversenum = 0;
        System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);
        // Captured input would be stored in number num
        num = in.nextInt();

        // if(2000 % 4 == 0)
        // 1234
        while (num != 0) {
            reversenum = reversenum * 10; // 4 ==> 40
            // 0
            reversenum = reversenum + num % 10; // 43
            num = num / 10; // 123 // 12
            System.out.println("num : " + num);
            System.out.println("reversenum : " + reversenum);
        }

        // while(num != 0) {
        // int digit = num % 10;
        // reversed = reversed * 10 + digit;
        // num /= 10;
        // }
        System.out.println("Reverse of input number is: " + reversenum);
    }
}
