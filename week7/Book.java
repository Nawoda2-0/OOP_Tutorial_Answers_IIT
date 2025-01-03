package week7;

import java.util.ArrayList;

public class Book implements Comparable<Book>{
    private String title;
    private double price;
    private int year;
    private String author;

    public Book(String title, int year, String author){
        this.title = title;
        this.year = year;
        this.author = author;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book b) {
        return Integer.compare(this.year, b.year);
    }
}
