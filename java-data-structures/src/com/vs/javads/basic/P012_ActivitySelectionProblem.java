package com.vs.javads.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * https://www.youtube.com/watch?v=AsbDqOauGZE
*/
public class P012_ActivitySelectionProblem {
	private static int[] start = { 1, 3, 0, 5, 8, 5 };
	private static int[] end = { 2, 4, 6, 7, 9, 9 };

	private static class ActivityTiming implements Comparable<ActivityTiming> {
		private int start;
		private int end;

		public ActivityTiming(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		public int getStart() {
			return start;
		}

		public void setStart(int start) {
			this.start = start;
		}

		public int getEnd() {
			return end;
		}

		public void setEnd(int end) {
			this.end = end;
		}

		@Override
		public String toString() {
			return "(" + start + ", " + end + ")";
		}

		@Override
		public int compareTo(ActivityTiming o) {
			return this.getEnd() - o.getEnd();
		}

	}

	/*
	 * 1. Create two array list, one for creating a list of start and end time pair
	 * and another for storing the selected activities.
	 * 
	 * 2. Sort the allActivities list with the help of end time.
	 * 
	 * 3. Loop through allActivities, if the end time of the activity is less than
	 * the start time of the next activity, then add the activity in
	 * selectedActivities list. And do the save for n - 1 activities.
	 * 
	 * 4. Add the last valid activity to the selectedActivities list.
	 */
	public static List<ActivityTiming> getActivitySequence() {
		List<ActivityTiming> allActivities = new ArrayList<>();
		List<ActivityTiming> selectedActivities = new ArrayList<>();
		for (int i = 0; i < end.length; i++) {
			allActivities.add(new ActivityTiming(start[i], end[i]));
		}
		Collections.sort(allActivities);
		int i = 0, j = 1, size = allActivities.size(), lastSelectedActivity = -1;
		while (j < size) {
			if (allActivities.get(i).getEnd() < allActivities.get(j).getStart()) {
				selectedActivities.add(allActivities.get(i));
				i = j;
				lastSelectedActivity = j;
				j++;
			} else {
				j++;
			}
		}
		if (!(lastSelectedActivity < 0))
			selectedActivities.add(allActivities.get(lastSelectedActivity));
		return selectedActivities;
	}

	public static void main(String[] args) {
		System.out.println("Selected activity sequence: " + getActivitySequence());
	}
}
