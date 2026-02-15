package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> set = new TreeSet<>();

        for (int b : bulbs) {
            if (!set.add(b))
                set.remove(b);
        }

        return new ArrayList<>(set);
    }
}