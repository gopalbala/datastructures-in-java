package com.gb.datastructures.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by gbalasubramanian on 13/02/19.
 */
public class ActivitySelection {
    int getMaxActivities(List<Activity> activityList) {
        Collections.sort(activityList, Comparator.comparingInt(o -> o.start));
        int numberOfActivitiesPerformed = 0;
        for (int i = 1; i < activityList.size(); i++) {
            if (activityList.get(i).start >= activityList.get(i-1).start && activityList.get(i).end >= activityList.get(i - 1).end) {
                numberOfActivitiesPerformed++;
            }
        }
        return numberOfActivitiesPerformed;
    }

    static class Activity {
        int start;
        int end;
        public Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(1,2));
        activities.add(new Activity(3,4));
        activities.add(new Activity(2,6));
        activities.add(new Activity(5,7));
        activities.add(new Activity(8,9));
        activities.add(new Activity(5,9));
        ActivitySelection activitySelection = new ActivitySelection();
        int result = activitySelection.getMaxActivities(activities);
        System.out.println(result);
    }
}
