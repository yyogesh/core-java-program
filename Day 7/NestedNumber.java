class NestedNumber {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; ++i) { // 1 // 2 // 3
            for (int j = 1; j <= i; ++j) { // 1 // 1, 2 // 1, 2, 3
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("***********************");
        for (int i = 1; i <= rows; ++i) { // 1 // 2 // 3
            for (int j = 1; j <= i; ++j) { // 1 // 1, 2 // 1, 2, 3
                System.out.println("");
            }
            System.out.print(i + " ");
        }
    }
}

// 1
// 1 2
// 1 2 3
