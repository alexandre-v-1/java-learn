package test;

import equals.Movie;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovieTest {
    @Test
    public void TestEquals() {
        Movie endgamePart1 = new Movie("End game part 1", new Date(1555884000), 4);
        Movie endgamePart1Copy = new Movie("End game part 1", new Date(1555884000), 4);
        Movie endgamePart2 = new Movie("End game part 2", new Date(1591740000), 3);

        // test reference
        assertNotSame(endgamePart1, endgamePart1Copy);
        // test not same
        assertNotSame(endgamePart1, endgamePart2);
        // test equal methode
        assertEquals(endgamePart1, endgamePart1Copy);
        // test transitivity
        assertEquals(endgamePart1Copy, endgamePart1);

        // update value & test equals return false
        endgamePart1Copy.setRanking(2);
        assertNotEquals(endgamePart1, endgamePart1Copy);

    }

    @Test
    public void TestHashCode() {
        Movie endgamePart1 = new Movie("End game part 1", new Date(1555884000), 4);
        Movie endgamePart1Copy = new Movie("End game part 1", new Date(1555884000), 4);
        Movie endgamePart2 = new Movie("End game part 2", new Date(1591740000), 3);

        assertEquals(endgamePart1.hashCode(), endgamePart1.hashCode());
        assertEquals(endgamePart1.hashCode(), endgamePart1Copy.hashCode());
        assertNotSame(endgamePart2.hashCode(), endgamePart1Copy.hashCode());

        endgamePart1Copy.setReleaseDate(new Date(159174002));
        assertNotSame(endgamePart1.hashCode(), endgamePart1Copy.hashCode());
    }

    @Test
    public void TestSort() {
        Movie endgamePart1 = new Movie("End game part 1", new Date(1555884000), 4);
        Movie endgamePart2 = new Movie("End game part 2", new Date(1591740000), 3);
        Movie endgamePart1Copy = new Movie("End game part 1", new Date(1555884000), 4);

        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(endgamePart1);
        movieList.add(endgamePart1Copy);
        movieList.add(endgamePart2);

        movieList.sort(Collections.reverseOrder());

        StringBuilder movieListString = new StringBuilder();
        for (Movie s : movieList) {
            movieListString.append(s.toString()).append("\n");
        }
        System.out.print(movieListString);

        assertTrue(true);
    }
}
