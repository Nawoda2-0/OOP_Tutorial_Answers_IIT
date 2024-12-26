package week1.task01;

public class Main {
    public static void main(String[] args) {
        Person ben = new Person("Ben");
        Person tom = new Person("Tom");
        Person john = new Person("John");
        Person suneth = new Person("Suneth");

        ben.setSurname("Stock");
        ben.setAge(42);

        tom.setSurname("Lassy");
        tom.setAge(32);

        john.setSurname("Peter");
        john.setAge(27);

        suneth.setSurname("Nawoda");
        suneth.setAge(22);

        System.out.println(ben.getName()  + " " + ben.getSurname() + " is " + ben.getAge() + " years old!");
        System.out.println(tom.getName()  + " " + tom.getSurname() + " is " + tom.getAge() + " years old!");
        System.out.println(john.getName()  + " " + john.getSurname() + " is " + john.getAge() + " years old!");
        System.out.println(suneth.getName()  + " " + suneth.getSurname() + " is " + suneth.getAge() + " years old!");
    }

}
