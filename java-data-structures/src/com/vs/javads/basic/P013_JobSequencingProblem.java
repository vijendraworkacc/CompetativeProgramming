package com.vs.javads.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P013_JobSequencingProblem {
	private static char[] jobId = { 'a', 'b', 'c', 'd', 'e' };
	private static int[] profit = { 100, 19, 27, 25, 15 };
	private static int[] deadline = { 2, 1, 2, 1, 3 };

	private static class Job implements Comparable<Job> {
		private char jobId;
		private int profit;
		private int deadline;

		public Job(char jobId, int profit, int deadline) {
			super();
			this.jobId = jobId;
			this.profit = profit;
			this.deadline = deadline;
		}

		public char getJobId() {
			return jobId;
		}

		public void setJobId(char jobId) {
			this.jobId = jobId;
		}

		public int getProfit() {
			return profit;
		}

		public void setProfit(int profit) {
			this.profit = profit;
		}

		public int getDeadline() {
			return deadline;
		}

		public void setDeadline(int deadline) {
			this.deadline = deadline;
		}

		@Override
		public String toString() {
			return "Job [jobId=" + jobId + ", profit=" + profit + ", deadline=" + deadline + "]";
		}

		@Override
		public int compareTo(Job o) {
			return o.getProfit() - this.getProfit();
		}

	}

	public static List<Job> getProfitableJobs() {
		List<Job> allJobs = new ArrayList<>();
		List<Job> profitableJobs = new ArrayList<>();
		boolean[] slots = new boolean[deadline.length];
		for (int i = 0; i < deadline.length; i++) {
			allJobs.add(new Job(jobId[i], profit[i], deadline[i]));
		}
		System.out.println(allJobs);
		Collections.sort(allJobs);
		System.out.println(allJobs);

		for (int i = 0; i < allJobs.size(); i++) {
			Job job = allJobs.get(i);
			for (int j = job.getDeadline() - 1; j >= 0; j--) {
				if (!slots[j]) {
					slots[j] = true;
					profitableJobs.add(job);
					break;
				}
			}
		}
		return profitableJobs;
	}

	public static void main(String[] args) {
		System.out.println("Job in sequence to be done: " + getProfitableJobs());
	}

}
