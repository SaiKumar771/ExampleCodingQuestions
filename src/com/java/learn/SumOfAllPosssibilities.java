package com.java.learn;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllPosssibilities {

	public static void main(String[] args) {

		// int[] arr = { -4, 8, 0, -9, -6, -10, 6, 2 };
		// int[] arr = { -8,3,2,-6,2,-8,3,2,-10};
		// int[] arr = { 4,5,8,2,6,1,3,9};
		int[] arr = { 1, 2, 3 };
		List<List<Integer>> result = findAllSubsets(arr);
		int target = 3;
		System.out.println("individual side:" + result.size());
		for (List<Integer> list : result) {
			int sum = 0;
			for (int item : list) {
				sum += item;
			}
			if (sum == target) {
				System.out.println("resultant list" + list);
			}
		}

	}

	public static List<List<Integer>> findAllSubsets(int[] array) {
		List<List<Integer>> subsets = new ArrayList<>();
		subsets.add(new ArrayList<>());
		for (int num : array) {
			int n = subsets.size();
			for (int i = 0; i < n; i++) {
				List<Integer> subset = new ArrayList<>(subsets.get(i));
				subset.add(num);
				subsets.add(subset);
			}
			System.out.println("added subset:" + subsets);
		}
		return subsets;
	}

}
 