package com.juyoung.book.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class BooksTest {
    @Test
    public void getBookInfo_ReturnBookData() throws Exception {
        Books book = Books.builder()
                .title("Smart Phonics")
                .level(1)
                .summary("smart phonics has fun!")
                .author("e-future")
                .isopen(false).build();

//        assertThat(book.getId(), is(1));
        assertThat(book.getAuthor(), is("e-future"));
    }
}