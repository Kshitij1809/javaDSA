package com.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Day2 {
	
	public static int deleteAnElement(int[] arr, int n, int pos) {
		
		for (int i = pos; i < arr.length ; i++) {
			arr[i - 1] = arr[i];
		}
		
		arr[n-1] = 0;
		
		
		return n - 1;
	}
	
    public int removeDuplicates(int[] nums) {

        List<int[]> list = Arrays.asList(nums);
		
		Set<int[]> set = new LinkedHashSet<>();
		
		set.addAll(list);

        int n = set.size();
        return n;
        
    }

	public static void main(String[] args) {
		
		Integer arr[] = {5, 6, 5, 6, 8, 9, 3, 3};
//		int n = deleteAnElement(arr, 5, 3);
//		
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		List<Integer> list = Arrays.asList(arr);
		
		Set<Integer> set = new LinkedHashSet<>();
		
		set.addAll(list);
		
		set.forEach(System.out::print);
		System.out.println("\n"+set.size());
		Integer[] newArr = null;
		if(set instanceof Object) {
		newArr = (Integer[]) set.toArray();
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		
//		Integer newArr[] = new Integer[arr.length];
//		
//		System.out.println("\n"+set.size());
//
//		int i = 0;
//		for(Integer s : set) {
//			newArr[i] = s;
//			i++;
//		}
//		
//		System.out.println(" ");
//		for (int j = 0; j < set.size(); j++) {
//			
//			System.out.print(newArr[j] + " ");
//		}
		
		
		
		
		
		

	}

}
