package week1.task01;

public class Person {
    private String name;
    private String surname;
    private int age;

    //Constructors
    public Person(String name){
        this.name = name;
    }
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //Method to display name.
    public void displayName(){
        System.out.println(name);
    }

    //setters
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setAge(int age){
        this.age = age;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }

}
