import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {


    @Test
    public void shouldAddNewMovie() {
        FilmManager movies = new FilmManager();

        movies.addNewMovie("Новый фильм");

        String[] expected = {"Новый фильм"};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNewMovies() {
        FilmManager movies = new FilmManager();

        movies.addNewMovie("Новый фильм");
        movies.addNewMovie("Новый фильм 1");
        movies.addNewMovie("Новый фильм 2");
        movies.addNewMovie("Новый фильм 3");

        String[] expected = {"Новый фильм", "Новый фильм 1", "Новый фильм 2", "Новый фильм 3"};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturn5LastMovies() {
        FilmManager movies = new FilmManager();

        movies.addNewMovie("Новый фильм");
        movies.addNewMovie("Новый фильм 1");
        movies.addNewMovie("Новый фильм 2");
        movies.addNewMovie("Новый фильм 3");
        movies.addNewMovie("Новый фильм 4");
        movies.addNewMovie("Новый фильм 5");

        String[] expected = {"Новый фильм 5", "Новый фильм 4", "Новый фильм 3", "Новый фильм 2", "Новый фильм 1"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturn5LastMoviesFromShortList() {
        FilmManager movies = new FilmManager();

        movies.addNewMovie("Новый фильм");
        movies.addNewMovie("Новый фильм 1");
        movies.addNewMovie("Новый фильм 2");
        movies.addNewMovie("Новый фильм 3");


        String[] expected = {"Новый фильм 3", "Новый фильм 2", "Новый фильм 1", "Новый фильм"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturn4LastMovies() {
        FilmManager movies = new FilmManager(4);

        movies.addNewMovie("Новый фильм");
        movies.addNewMovie("Новый фильм 1");
        movies.addNewMovie("Новый фильм 2");
        movies.addNewMovie("Новый фильм 3");
        movies.addNewMovie("Новый фильм 4");
        movies.addNewMovie("Новый фильм 5");

        String[] expected = {"Новый фильм 5", "Новый фильм 4", "Новый фильм 3", "Новый фильм 2"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturn7LastMoviesFromShortlist() {
        FilmManager movies = new FilmManager(7);

        movies.addNewMovie("Новый фильм");
        movies.addNewMovie("Новый фильм 1");
        movies.addNewMovie("Новый фильм 2");
        movies.addNewMovie("Новый фильм 3");
        movies.addNewMovie("Новый фильм 4");
        movies.addNewMovie("Новый фильм 5");

        String[] expected = {"Новый фильм 5", "Новый фильм 4", "Новый фильм 3", "Новый фильм 2", "Новый фильм 1", "Новый фильм"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastMoviesFromEmptylist() {
        FilmManager movies = new FilmManager();

        String[] expected = {};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
