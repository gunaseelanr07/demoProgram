package com.test.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InputArray {
	
//	int [] inputArray;
//	
//	public int[] getInputArray() {
//		return inputArray;
//	}
//
//	public void setInputArray(int[] inputArray) {
//		this.inputArray = inputArray;
//	}
//
//	public InputArray(@JsonProperty("inputArray") int[] input) {
//		this.inputArray=input;
//	}
	
	List<Integer[]> listOfIntArr;
	
	public InputArray(@JsonProperty("range1") Integer[] input1,@JsonProperty("range2") Integer[] input2,@JsonProperty("range3") Integer[] input3) {
		List<Integer[]> list = new ArrayList<>();
		list.add(input1);
		list.add(input2);
		list.add(input3);
		this.listOfIntArr = list;
		
	}

	public List<Integer[]> getListOfIntArr() {
		return listOfIntArr;
	}

	public void setListOfIntArr(List<Integer[]> listOfIntArr) {
		this.listOfIntArr = listOfIntArr;
	}
	

}
