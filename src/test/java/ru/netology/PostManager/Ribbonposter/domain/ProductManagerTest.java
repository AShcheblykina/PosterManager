package ru.netology.PostManager.Ribbonposter.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PostManager.Ribbonposter.domain.ProductManager;


public class ProductManagerTest {
    Ribbonposter AllMovieTitle1 = new Ribbonposter("bloodshot");
    Ribbonposter AllMovieTitle2 = new Ribbonposter("gentlemen");
    Ribbonposter AllMovieTitle3 = new Ribbonposter("invisibleMan");

    @Test
    public void test() {
        ProductManager repo = new ProductManager();
        repo.added(AllMovieTitle1);
        repo.added(AllMovieTitle2);
        repo.added(AllMovieTitle3);

        Ribbonposter[] expected = {AllMovieTitle1, AllMovieTitle2, AllMovieTitle3};
        Ribbonposter[] actual = repo.getAllMovieTitle();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test() {
        ProductManager repo = new ProductManager();
        repo.added(AllMovieTitle1);

        Ribbonposter[] expected = {AllMovieTitle1};
        Ribbonposter[] actual = repo.getAllMovieTitle();

        Assertions.assertArrayEquals(expected,actual);

    }
}
