import DVDs.DVD;
import Template.Action;
import Template.Movie;
import org.junit.Test;

import static org.junit.Assert.*;

public class templateTest {

    @Test
    public void addMovieTest() {
        DVD dvd = new DVD("Avenger", "yyyyy","xxxxx","2019");

        Action movie = new Action(dvd);
        System.out.println(movie.addMovie());
    }
}