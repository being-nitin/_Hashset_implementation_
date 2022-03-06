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
    }
}
