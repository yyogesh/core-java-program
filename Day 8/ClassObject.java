public class ClassObject {
    public static void main(String[] args) {
        Person person = new Person();
        person.setPersonName("Ajay");
        System.out.print(person.getPersonName());
    }
}

class Person {
    String name; // Variables

    public String getPersonName() { // Function
        return this.name;
    }

    public void setPersonName(String personName) {// Function
        this.name = personName;
    }
}
