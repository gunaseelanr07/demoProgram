package com.test.controller;

import java.util.Arrays;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.InputArray;

@RestController
@Controller
@RequestMapping("/")
public class PostController {
	


	/*
	 * 1*2 = 2 2*3 = 6 3*4 = 12 4*5 = 20 5*6 = 30 6*7 = 42 7*8 = 54 8*9 = 72 9*10
	 * =90 Finding number of occurrence of the
	 */

	@PostMapping(value = "/arrayResult", consumes = "application/json")
	public String returnResult(@RequestBody InputArray input) {

		int[] returnCount = new int[input.getListOfIntArr().size()];
		
		/*
		 * Find highest & lowest from array 3 3 0 8132780896
		 */
		

		System.out.println("intput:" + input.getListOfIntArr().size());

		for (int i = 0; i < input.getListOfIntArr().size(); i++) {

			System.out.println("value of i :" + i);

			Integer[] localArr = input.getListOfIntArr().get(i);

			System.out.println("value of localArr:" + Arrays.toString(localArr));

			int maxValue = Arrays.stream(localArr).max(Comparator.naturalOrder()).get();
			int minValue = Arrays.stream(localArr).min(Comparator.naturalOrder()).get();

			System.out.println("value of min & max:" + minValue + " " + maxValue);
			
			int count = 0;
			for (int j = 1; j * (j + 1) <= maxValue; j++) {

				if (j * (j + 1) <= maxValue && j * (j + 1) >= minValue) {
					count++;
				}

			}

			System.out.println("Count:" + count);
			returnCount[i] = count;

		}

		return "Count:" + Arrays.toString(returnCount);
	}

}
