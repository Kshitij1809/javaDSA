package com.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Day2 {

	public static int deleteAnElement(Integer[] arr, int n, int pos) {

		for (int i = pos; i < arr.length ; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n-1] = 0;
		return n - 1;
	}

	public static int[] removeDuplicates(Integer[] nums) {

		LinkedHashSet<Integer> set = new LinkedHashSet<>();
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

		Integer arr[] = {5, 6, 5, 6, 8, 9, 3, 3};
		
		System.out.println(Arrays.toString(arr));
		
		int n = deleteAnElement(arr, arr.length, 5);
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(removeDuplicates(arr)));
		


	}

}
