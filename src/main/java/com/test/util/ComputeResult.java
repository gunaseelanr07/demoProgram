package com.test.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputeResult {
	
	static String computeResult(int[] arrayInput) {
		
		/*
		 * for(int i=0;i<input.getListOfIntArr().size();i++) {
//		Integer[] localArr = input.getListOfIntArr().get(i);
//		Integer maxValue = Arrays.stream(localArr).max().getAsInt();
//		Integer minValue = Arrays.stream(localArr)).min().getAsInt();
//		
//		for (int i = 1; i*(i+1) <= maxValue; i++) {
//
//			if (i * (i+1) <= maxValue && i * (i+1) >= minValue) {
//				count++;
//			}
//			
//
//		}
//		
//		returnCount[i] = count;
//		
//		}
		 */
		
		int count = 0;
		int j = 2;
		
		Integer maxValue = Arrays.stream(arrayInput).max().getAsInt();
		Integer minValue = Arrays.stream(arrayInput).min().getAsInt();
		
		List<Integer> listOfInteger = new ArrayList<>();
		
		for (int i = 1; i < maxValue; i++) {

			if (i * j <= maxValue && i * j >= minValue) {
				count++;
				listOfInteger.add(i*j);
			}
			++j;

		}
		System.out.println(listOfInteger);

		return "Count:" + count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayinput = {23,14,77,56};
		
		
		System.out.println(computeResult(arrayinput));
		
		//System.out.println(Arrays.stream(arrayinput).max().getAsInt());
	

	}

}
