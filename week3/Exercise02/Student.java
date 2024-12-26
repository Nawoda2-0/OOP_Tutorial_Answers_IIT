package week3.Exercise02;

public class Student extends Person {
    private int idNo;
    private double fee;
    private int grade;

    public Student(String name, int age, String gender, int idNo) {
        super(name, age, gender);
        this.idNo = idNo;
    }

    //getters
    public int getGrade() {
        return grade;
    }

    public double getFee() {
        return fee;
    }

    public int getIdNo() {
        return idNo;
    }

    //setters
    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNo=" + idNo +
                ", fee=" + fee +
                ", grade=" + grade +
                ", name='" + super.name + '\'' +
                ", age=" + super.age +
                ", gender='" + super.gender + '\'' +
                '}';
    }
}
