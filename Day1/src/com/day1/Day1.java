package com.day1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Day1 {

	public static int removeDuplicates(int[] nums) {
		
		List<int[]> list = Arrays.asList(nums);
		
		Set<int[]> set = new LinkedHashSet<>();
		set.add(list.get(0));
		set.add(list.get(1));
		set.add(list.get(2));
		
		int[] arr = new int[set.size()];
		
		int j = 0;
		for(int i : set) {
			arr[j] = i;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
  		
		return set.size();
		
	}
	public static void main(String[] args) {
		

		int[] nums = {1,1,2};
		int n = removeDuplicates(nums);
		
		System.out.println(n);

	}

}
