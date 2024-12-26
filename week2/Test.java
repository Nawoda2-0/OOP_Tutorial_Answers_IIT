package week2;

public class Test {
    public static void main(String[] args) {
        Director director = new Director("james", "Cameron");

        System.out.println("Name of the director : " + director.getName() + " " + director.getSurName());

        Date dob = new Date(34,8,1954);
        director.setDob(dob);
        director.setNumDirectedMovie(23);

        System.out.println(director); // toString()

        Movei movie = new Movei("Avatar", "Fantacy", director);

        System.out.println(movie);

        movie.setNumAward(10);

        System.out.println(movie); // Book's toString()
        System.out.println("title is: " + movie.getTitle());
        System.out.println("category is: " + movie.getCategory ());
        System.out.println("name of director is: " + movie.getDirector().getName());
        System.out.println("surname of director is: " + movie.getDirector().getSurName());
        System.out.println("number of awards is " + movie.getNumAward());
    }
}
