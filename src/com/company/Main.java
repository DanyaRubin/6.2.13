package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        HashSet<Integer> s2 = new HashSet<>();
        s2.add(0);
        s2.add(1);
        s2.add(2);

        Set<Integer> result = symmetricDifference(s1,s2);
        System.out.println(result);
    }

    public static Set symmetricDifference(Set set1, Set set2) {
        HashSet <Set> copySet1 = new HashSet<>(set2);
        HashSet <Set> copySet2 = new HashSet<>(set2);
        copySet1.retainAll(set1);
        copySet2.addAll(set1);
        copySet2.removeAll(copySet1);
        return copySet2;
    }
}
