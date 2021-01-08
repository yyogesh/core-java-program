class InstanceOfOperator {
    public static void main(String[] args) {
        String str = "test";

        System.out.println(str instanceof String);
        SecondClass obj = new SecondClass();
        System.out.println(obj instanceof SecondClass);

        ThirdClass thirdClassObj = new ThirdClass();
        // System.out.println(thirdClassObj instanceof SecondClass);
    }
}

class SecondClass {
    void getName() {
        System.out.println("SecondClass getName");
    }
}

class ThirdClass {
    void getName() {
        System.out.println("ThirdClass getName");
    }
}