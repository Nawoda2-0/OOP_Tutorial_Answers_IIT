package week2.task01;

public class Date {
    private int day;
    private int month;
    private int year;

    //Constructor
    public Date(int day, int month, int year){
        if (day==0){
            System.out.println("Day can not be zero");
        } else if (day>31) {
            System.out.println("Day should be in range of 1-31");
        }else {
            this.day = day;
        }

        if (month==0){
            System.out.println("Month can not be zero");
        } else if (day>12) {
            System.out.println("Month should be in range of 1-12");
        }else {
            this.month = month;
        }

        if (year==0){
            System.out.println("Year can not be zero");
        } else if (year>2079) {
            System.out.println("Year should be in range of 1980-2079");
        }else {
            this.year = year;
        }
    }

    //public getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDate(){
        return day + " : " + month + " : " + year;
    }


    //public setters
    public void setDay(int day) {
        if (day==0){
            System.out.println("Day can not be zero");
        } else if (day>31) {
            System.out.println("Day should be in range of 1-31");
        }else {
            this.day = day;
        }

    }

    public void setMonth(int month) {
        if (month==0){
            System.out.println("Month can not be zero");
        } else if (day>12) {
            System.out.println("Month should be in range of 1-12");
        }else {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year==0){
            System.out.println("Year can not be zero");
        } else if (year>2079) {
            System.out.println("Year should be in range of 1980-2079");
        }else {
            this.year = year;
        }
    }

    public void setDate(int day, int month, int year){
        this.day  =day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
