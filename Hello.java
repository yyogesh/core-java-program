public class Hello {
    // access modifier
    char firstLetter = 'A';

    public static void main(String[] main) {
        System.out.println("Hello, World! 2");

        Student s1 = new Student();
        s1.addStudent(1, "Ravi");
        s1.displayInformation();

        Student s2 = new Student();
        s2.addStudent(2, "Karan");
        s2.displayInformation();
    }
}

class Student {
    int rollNumber;
    String name;

    void addStudent(int r, String n) {
        this.rollNumber = r;
        this.name = n;
    }

    void displayInformation() {
        System.out.println(this.rollNumber + " " + this.name);
    }
}