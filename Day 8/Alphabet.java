class Alphabet {
    public static void main(String[] args) {
        char c = '*';
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");

        // That is, alphabet a is stored as 97 and alphabet z is stored as 122.
        // Similarly,
        // alphabet A is stored as 65 and alphabet Z is stored as 90.
    }
}
