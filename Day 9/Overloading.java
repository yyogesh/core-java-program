class Overloading {
    public static void main(String[] args) {
        System.out.println(add(10, 5));
        System.out.println(add(10, 5, 15));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static int add(int x, int y, int z, int a) {
        return x + y + z + a;
    }

    public static String add(String x, String y) {
        return x + y;
    }
}
