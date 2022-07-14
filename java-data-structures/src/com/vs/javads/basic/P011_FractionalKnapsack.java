package com.vs.javads.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P011_FractionalKnapsack {
	private static int[] value = { 60, 40, 100, 120 };
	private static int[] weight = { 10, 40, 20, 30 };
	private static int capacity = 50;
	private static double maxValue = 0D;

	static class ValueWeightRatio {
		private int value;
		private int weight;
		private int ratio;

		public ValueWeightRatio(int value, int weight) {
			super();
			this.value = value;
			this.weight = weight;
			this.ratio = value / weight;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public int getRatio() {
			return ratio;
		}

		public void setRatio(int ratio) {
			this.ratio = ratio;
		}

		@Override
		public String toString() {
			return "ValueWeightRatio [value=" + value + ", weight=" + weight + ", ratio=" + ratio + "]";
		}

	}

	public static double getMaxValue() {
		Comparator<ValueWeightRatio> comparator = (o1, o2) -> {
			return o2.getRatio() - o1.getRatio();
		};
		List<ValueWeightRatio> valueWeightRatios = new ArrayList<>();
		for (int i = 0; i < weight.length; i++) {
			valueWeightRatios.add(new ValueWeightRatio(value[i], weight[i]));
		}
		Collections.sort(valueWeightRatios, comparator);
		for (ValueWeightRatio o : valueWeightRatios) {
			if (capacity - o.getWeight() >= 0) {
				capacity = capacity - o.getWeight();
				maxValue += o.getValue();
			} else {
				double fraction = (double) capacity / (double) o.getWeight();
				maxValue += o.getValue() * fraction;
				capacity -= o.getWeight() * fraction;
				break;
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		System.out.println("Max value is " + getMaxValue());
	}
}
