package com.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Day1 {

	public static int[] removeDuplicates(int[] nums) {

		HashSet<Integer> set = new HashSet<>();
		//System.out.println(set); // this gives --> []

		for(int num : nums) {
			if (!set.contains(num)) 
				set.add(num);
		}

		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.addAll(set);
		int[] arr = new int[arrList.size()];

		for(int i = 0; i < arrList.size(); i++) {
			arr[i] = arrList.get(i);
		}

		return arr;

	}

	public static void main(String[] args) {

		int[] nums = {1,1,2};
		nums = removeDuplicates(nums);

		System.out.println(Arrays.toString(nums));

	}

}
