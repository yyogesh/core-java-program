public class Loop {
    public static void main(String arg[]) {
        // Statement 1 is executed (one time) before the execution of the code block.
        // Statement 2 defines the condition for executing the code block.
        // Statement 3 is executed (every time) after the code block has been executed.
        int n = 5;
        for (int i = 1; i <= n; ++i) {
            System.out.println("Value of is " + i);
        }

        for (int j = 1; j <= 5; j++) {
            System.out.println("Square of " + j + " is " + (j * j));
        }

        System.out.println("************** While loop **************");

        int x = 1;

        while (x <= 5) {
            System.out.println("Value of is " + x);
            x++;
        }

        System.out.println("************** do While loop **************");
        int y = 6;

        do {
            System.out.println("Value of is " + y);
            y++;
        } while (y <= 5);
    }
}
