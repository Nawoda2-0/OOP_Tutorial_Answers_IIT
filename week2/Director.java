package week2;

public class Director {
    private String name;
    private String surName;
    private int numDirectedMovie;
    private Date Dob;

    public Director(String name, String surName){
        this.name = name;
        this.surName = surName;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getNumDirectedMovie() {
        return numDirectedMovie;
    }

    public Date getDob() {
        return Dob;
    }

    //setters

    public void setDob(Date dob) {
        Dob = dob;
    }

    public void setNumDirectedMovie(int numDirectedMovie) {
        this.numDirectedMovie = numDirectedMovie;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", numDirectedMovie=" + numDirectedMovie +
                ", Dob=" + Dob +
                '}';
    }
}
