package week3.Exercise02;

public class Teacher extends Person{
    private double salary;
    private String subject;

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    //getters
    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    //setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                ", name='" + super.name + '\'' +
                ", age=" + super.age +
                ", gender='" + super.gender + '\'' +
                '}';
    }
}
