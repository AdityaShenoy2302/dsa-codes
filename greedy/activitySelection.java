// You are given n activities with their start and end times. Select the max number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. Activities are sorted according to end time.

import java.util.*;

public class activitySelection {
    public static void main(String args[]) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int maxAct = 0;
        ArrayList<Integer> res = new ArrayList<>();

        maxAct = 1;
        res.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                res.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max activities = " + maxAct);
        for (int i = 0; i < res.size(); i++) {
            System.out.print("A" + res.get(i) + " ");
        }
    }
}