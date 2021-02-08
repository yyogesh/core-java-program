class Funciton {
    public static void main(String[] args) {
        add();
        add();
        add();
        addition(10, 20);
        addition(20, 20);
        addition(30, 20);
        int sum = additionReturn(40, 60); // function calling
        System.out.println("SUm is " + sum);
    }

    public static void add() { // function definition
        System.out.println(5 + 5);
    }

    public static void addition(int x, int y) {
        System.out.println(x + y);
    }

    public static int additionReturn(int x, int y) {
        int result = x + y;
        return result; // return statement
    }
}
