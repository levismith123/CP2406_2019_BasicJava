package week8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void FictionTest(){
        Book.Fiction book = new Book.Fiction("HitchHikers guide to the galaxy");
        assertEquals("HitchHikers guide to the galaxy", book.getTitle());
        assertEquals(24.99, book.getPrice());
    }

    @Test
    public void NonFictionTest(){
        Book.NonFiction book = new Book.NonFiction("Dictionary");
        assertEquals("Dictionary", book.getTitle());
        assertEquals(37.99, book.getPrice());
    }
}