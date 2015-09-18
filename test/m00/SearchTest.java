/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m00;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Veronika Pencaka veronika.pencaka@gmail.com Created: 18.09.2015 Last
 * modified: 18.09.2015
 *
 * Describe class
 */
public class SearchTest {

    /**
     * Test of binarySeach method of class Search
     */
    
    
    /**
     * Sorted array, find first element.
     */
    @Test
    public void testSearchCase1() {
        int[] a = {1, 2, 3, 3, 5, 6, 7, 8, 9};
        int x = 1;
        int expected = 0;
        assertEquals(expected, Search.find(x, a));
    }

    /**
     * Sorted array, find last element.
     */
    @Test
    public void testSearchCase2() {
        int[] a = {1, 2, 3, 3, 5, 6, 7, 8, 9};
        int x = 9;
        int expected = 8;
        assertEquals(expected, Search.find(x, a));
    }

    /**
     * Sorted array, find element from middle.
     */
    @Test
    public void testSearchCase3() {
        int[] a = {1, 2, 3, 3, 5, 6, 7, 8, 9};
        int x = 5;
        int expected = 4;
        assertEquals(expected, Search.find(x, a));
    }

    /**
     * Sorted array, if x not found in a.
     */
    @Test
    public void testSearchCase4() {
        int[] a = {1, 2, 3, 3, 5, 6, 7, 8, 9};
        int x = 12;
        int expected = -1;
        assertEquals(expected, Search.find(x, a));
    }

    /**
     * Sorted array, find two equal elements in array and return lower index.
     */
    @Test
    public void testSearchCase5() {
        int[] a = {1, 2, 3, 3, 5, 6, 7, 8, 9};
        int x = 3;
        int expected = 2;
        assertEquals(expected, Search.find(x, a));
    }

    /**
     * Sorted array, find two equal elements in array and return lower index.
     */
    @Test
    public void testSearchCase6() {
        int[] a = {1, 2, 3, 4, 4, 6, 7, 8, 9};
        int x = 4;
        int expected = 3;
        assertEquals(expected, Search.find(x, a));
    }

    /**
     * Unsorted array
     */
    @Test
    public void testSearchCase7() {
        int[] a = {2, 6, 4, 12, 3, 6, 7, 5, 9};
        int x = 4;
        int expected = -1;
        assertEquals(expected, Search.find(x, a));
    }
}
