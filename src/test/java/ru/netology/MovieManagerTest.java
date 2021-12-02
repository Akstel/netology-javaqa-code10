package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    private MovieManager manager = new MovieManager(8);

    @Test
    public void shouldAddMovie() {
        Movie first = new Movie(1,"Avatar", "fantasy", "Url1");
        Movie second = new Movie(2,"It", "horror", "Url2");
        Movie third = new Movie(3,"land", "fantastic", "Url3");
        Movie fourth = new Movie(4,"Great", "drama", "Url4");

        manager.addMovie(second);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{second};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetLatestMovies() {


        Movie first = new Movie(1,"Avatar", "fantasy", "Url1");
        Movie second = new Movie(2,"It", "horror", "Url2");
        Movie third = new Movie(3,"land", "fantastic", "Url3");
        Movie fourth = new Movie(4,"Great", "drama", "Url4");
        Movie fifth = new Movie(5,"Lord of the Rings", "fantasy", "Url5");
        Movie sixth = new Movie(6,"Sleepy Hollow", "horror", "Url6");
        Movie seventh = new Movie(7,"Interstellar", "fantastic", "Url7");
        Movie eight = new Movie(8,"Rain man", "drama", "Url8");
        Movie ninth = new Movie(9,"Titanic", "drama", "Url9");


        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eight);
        manager.addMovie(ninth);


        Movie[] actual = manager.getLatestMovies();
        Movie[] expected = new Movie[]{ninth, eight, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldGetLatestMoviesMin() {


        Movie first = new Movie(1,"Avatar", "fantasy", "Url1");
        Movie second = new Movie(2,"It", "horror", "Url2");
        Movie third = new Movie(3,"land", "fantastic", "Url3");
        Movie fourth = new Movie(4,"Great", "drama", "Url4");
        Movie fifth = new Movie(5,"Lord of the Rings", "fantasy", "Url5");


        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);


        Movie[] actual = manager.getLatestMovies();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);


    }

}