package com.springboot.app.NumberIdentifierApi.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AppConstants {
	
	protected static final String[] NUMBER_RESULTS = {
			"Entered number is a new number!!", //0
			"Entered number already exist!!" //1
	};
	
	public static final List<String> GET_NUMBER_RESULTS = Collections
			.unmodifiableList(Arrays.asList(NUMBER_RESULTS));

}
