package com.springboot.app.NumberIdentifierApi.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.springboot.app.NumberIdentifierApi.util.AppConstants;

@Service
public class IdentifierService {
	ArrayList<Integer> arr1=new ArrayList<>();
		
	public String checkNumber(int number) {
		if(arr1.size()==0) {
			System.out.println("*******List is empty*******");
			arr1.add(number);
			return AppConstants.GET_NUMBER_RESULTS.get(0);
		} 
		else {
			for(Integer i : arr1)
			{
				if(i==number) {
					System.out.println("*******Value is present in the list*******");	
					return AppConstants.GET_NUMBER_RESULTS.get(1);
				}
			}
			arr1.add(number);
		
			}
			
			System.out.println("*******List is not empty & does not hold entered value*******");
			return AppConstants.GET_NUMBER_RESULTS.get(0);
					
		}
	}
