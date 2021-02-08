class CallByValue {
    public static void main(String[] args) {
        int i = 11;
        getCallByValue(i);
        System.out.println("I value calling modified : " + i);
    }

    public static void getCallByValue(int i) {
        if (i > 10) {
            i = 50;
        }
        System.out.println("IN a function : " + i);
    }
}
