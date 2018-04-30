package com.howtoprogram.junit5.singletontest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {


    @Test
    @DisplayName("should validate singleton")
    void singletonTest()
    {
        Book book = Book.getInstance();
        book.setName("Gatitos");
        assertEquals("Gatitos", book.getName());

        Book bookUno = Book.getInstance();
        bookUno.setName("Perritos");
        assertEquals("Perritos", bookUno.getName());

        Book bookDos = Book.getInstance();
        bookDos.setName("Cocodrilos");
        assertEquals("Cocodrilos", bookDos.getName());
    }
}