package likeLionTestQ._1223_Q4.movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable<Movie>{
    private String title;
    private int date;
    private double rating;

    public Movie(String title, int date, double rating) {
        this.title = title;
        this.date = date;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.title.compareTo(o.title);
    }
}

class RatingComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o1.getRating(),o2.getRating());
    }
}

class yearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return Integer.compare(o1.getDate(),o2.getDate());
    }
}

public class MovieManager {
    public static void main(String[] args) {

    }
}
