package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Hashset Implementation.

        HashSet <Integer> set = new HashSet<>();
        set.add(89);
        set.add(90);
        set.add(91);
        set.add(92);
        set.remove(91);
        System.out.println(set);
    }
}
