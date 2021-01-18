class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; ++i) {
            if (i > 4 && i < 9) {
                continue;
            }
            // here it wil come
            System.out.println(i);
        }
    }
}
