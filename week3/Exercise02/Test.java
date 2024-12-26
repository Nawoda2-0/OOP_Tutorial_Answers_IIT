package week3.Exercise02;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("Suneth", 22, "male");
        System.out.println(p1);

        Student s1 = new Student("Kumara", 23, "male", 12345);
        System.out.println(s1);

        Teacher t1 = new Teacher("Hiruni",28, "female", 60000, "Maths");
        System.out.println(t1);
    }
}
