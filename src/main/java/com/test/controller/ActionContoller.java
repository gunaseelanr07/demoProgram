package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/")
public class ActionContoller {

	/*
	 * 1*2 = 2 2*3 = 6 3*4 = 12 4*5 = 20 5*6 = 30 6*7 = 42 7*8 = 54 8*9 = 72 9*10 =90
	 * Finding number of occurrence of the 
	 */
	
	//http://localhost:8080/result?start=5&end=7

	@GetMapping("/result")
	public String returnResult(@RequestParam(value = "start") Integer start, @RequestParam(value = "end") Integer end) {

		int count = 0;
		
	
		for (int i = 1; i*(i+1) < end; i++) {

			//1*2 2*3
			
			if (i * (i+1) <= end && i * (i+1) >= start) {
				count++;
			}
			
//			if(i*(i+1)>end)
//				break;
		

		}
		
		return "Count:" + count;
	}

}
