import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
}

public class TopMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2023),
            new Movie("Movie B", 9.1, 2024),
            new Movie("Movie C", 7.9, 2022),
            new Movie("Movie D", 8.9, 2024),
            new Movie("Movie E", 9.3, 2023),
            new Movie("Movie F", 8.7, 2024)
        );

        movies.stream()
              .filter(m -> m.releaseYear >= 2023)        // filter recent movies
              .sorted((m1, m2) -> Double.compare(m2.rating, m1.rating)) // sort by rating desc
              .limit(5)                                  // top 5
              .forEach(m -> System.out.println(m.name + " - " + m.rating));
    }
}
