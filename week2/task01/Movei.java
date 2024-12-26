package week2.task01;

public class Movei {
    private String title;
    private String category;
    private Director director;
    private int numAward;

    Actor listActors[] = new Actor[10];

    public Movei(String title, String category, Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Director getDirector() {
        return director;
    }

    public int getNumAward() {
        return numAward;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setNumAward(int numAward) {
        this.numAward = numAward;
    }

    @Override
    public String toString() {
        return "Movei{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director=" + director +
                ", numAward=" + numAward +
                '}';
    }
}
