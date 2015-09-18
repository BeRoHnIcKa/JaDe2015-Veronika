/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m00;

/**
 * @author Veronika Pencaka veronika.pencaka@gmail.com Created: 18.09.2015 Last
 * modified: 18.09.2015
 *
 * Describe class
 */
public class Search {

    /**
     * Find the first occurrence of x in sorted array a.
     *
     * @param x value to find
     * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
     * @r
     * eturn lowest i such that a[i]==x, or -1 if x not found in a.
     */
    public static int find(int x, int[] a) {
        return binarySearch(x, a);
    }

    public static int binarySearch(int x, int[] a) {
        if (isSorted(a)) {
            int lower = 0;
            int upper = a.length - 1;
            while (lower <= upper) {
                int mid = lower + (upper - lower) / 2;
                if (x < a[mid]) {
                    upper = mid - 1;
                } else if (x > a[mid]) {
                    lower = mid + 1;
                } else {
                    if (mid != 0 && a[mid] == a[mid - 1]) {
                        upper = mid - 1;
                    } else {
                        return mid; 
                    }
                }
            }
        }
        return -1;
    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        return true;
    }

}
