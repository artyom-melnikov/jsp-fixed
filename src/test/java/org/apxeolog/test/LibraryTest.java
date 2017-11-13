package org.apxeolog.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by APXEOLOG on 31.10.2017.
 */
public class LibraryTest {

    private Library library;

    @Before
    public void setUp() throws Exception {
        library = new Library();
    }

    @Test
    public void sum() throws Exception {
        assertEquals(4, library.sum(2, 2));
        assertEquals(6, library.sum(4, 2));
        assertEquals(0, library.sum(2, -2));
    }

    @Test
    public void mul() throws Exception {
        assertEquals(4, library.mul(2, 2));
        assertEquals(8, library.mul(4, 2));
        assertEquals(-4, library.mul(2, -2));
    }

    @Ignore
    @Test
    public void skipThisTest() {
        assertEquals(4, library.mul(2, 2));
    }

    @Test
    public void failingTest() throws Exception {
        assertEquals(4, library.mul(3, 2));
    }

    @Test
    public void exerciseTest() {
        System.out.println("We are doing nothing here");
    }
}