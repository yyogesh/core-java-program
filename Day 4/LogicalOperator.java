class LogicalOperator {
    public static void main(String ar[]) {
        boolean check = (5 > 3) && (8 > 5);
        boolean check1 = (5 > 3) && (8 < 5);
        System.out.println(check);

        // && operator
        System.out.println((5 > 3) && (8 > 5)); // true
        System.out.println((5 > 3) && (8 < 5)); // false

        // || operator
        System.out.println((5 < 3) || (8 > 5)); // true
        System.out.println((5 > 3) || (8 < 5)); // true
        System.out.println((5 < 3) || (8 < 5)); // false

        // // ! operator
        System.out.println(!(5 == 3)); // true
        System.out.println(!(5 > 3)); // false
    }
}

// && logical and operator both statement should true
// || either or statement should true
// // ! not operator reverser ===> true ===> false
