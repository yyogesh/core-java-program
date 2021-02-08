class AsciiValue {
    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);

        for (int i = 0; i <= 255; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }
        for (int i = 65; i <= 90; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }
    }
}
