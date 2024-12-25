package com.mst.strings;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class ClosestTime {

    public static void main(String[] args) {
        System.out.println(nextClosestTime("02:33"));
    }

    public static String nextClosestTime(String time) {

        Set<Integer> allowedDigits = new HashSet<>();
        for (char c : time.toCharArray())
            if (c != ':')
                allowedDigits.add(c - '0');

        int minutes = Integer.parseInt(time.substring(0, 2)) * 60 +
                Integer.parseInt(time.substring(3));
        while (true) {
            minutes++;
            if (minutes == 1440)
                minutes = 0;
            int digits[] = new int[]{(minutes / 60) / 10, (minutes / 60) % 10, (minutes % 60) / 10,
                    (minutes % 60) % 10};
            boolean found = true;
            for (int digit : digits) {
                if (!allowedDigits.contains(digit)) {
                    found = false;
                    break;
                }


            }
            if (found)
                return String.format("%02d:%02d", minutes / 60, minutes % 60);


        }
    }
}
