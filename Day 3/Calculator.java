import java.util.Scanner;

class Calculator {
    public static void main(String arg[]) {
        Scanner yx = new Scanner(System.in);
        int result = 0;
        System.out.println("Please enter operation : ");
        String operation = yx.next();

        System.out.println("Please enter first number for addition : ");
        int firstNumber = yx.nextInt();

        System.out.println("Please enter second number for addition : ");
        int secondNumber = yx.nextInt();

        if (operation.equals("Add")) {
            result = firstNumber + secondNumber;
        }
        if (operation.equals("Sub")) {
            result = firstNumber - secondNumber;
        }
        if (operation.equals("Mul")) {
            result = firstNumber * secondNumber;
        }
        if (operation.equals("Div")) {
            result = firstNumber / secondNumber;
        }
        System.out.println("Sum of two number is : " + result);
    }
}

// You need to ask to user three input
// 1. operator ===> add , sub, mul, div
// String operator = xscan.nextString();
// 2. first number ==> 50
// 3. second number ===> 100
// 4. show result 50 + 100 ==> 150
// 100 - 50 ==> 50
// 50 * 100 ==> 5000

// if(operator == 'Add') {

// }

// if(operator == 'Sub') {

// }

// if(operator == 'mul') {

// }
