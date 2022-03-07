package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Hashset Implementation.
    // in this duplicate elements are not allowed

        HashSet <Integer> set = new HashSet<>();
        set.add(89);
        set.add(90);
        set.add(91);
        set.add(92);
        set.remove(91);
        System.out.println(set);
        set.add(89);
        set.add(90);
        /* in this 89,90 will not be considered because set will terminate the
           duplicate element.
         */
        System.out.println(set);
        // and this elements will get print in sorted order.

        // to check that any particular element is present or not.
        System.out.println(set.contains(89));

        // to check that the set is empty or not.
        System.out.println(set.isEmpty());

        // to check the size of set
        System.out.println(set.size());

        // clear method added
        set.clear();
        System.out.println(set);
    }
}
