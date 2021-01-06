class FloatType {
    public static void main(String args[]) {
        float myFloat1, myFloat2, result;
        myFloat1 = 1000.666f;
        myFloat2 = 110.77f;
        result = myFloat1 - myFloat2;
        System.out.println("Number1: " + myFloat1);
        System.out.println("Number2: " + myFloat2);
        System.out.println("Number1-Number2: " + result);
        // 1.40239846 x 10-45 to 3.40282347 x 1038
        // 4.9406564584124654 x 10-324 to 1.7976931348623157 x 10308
    }
}