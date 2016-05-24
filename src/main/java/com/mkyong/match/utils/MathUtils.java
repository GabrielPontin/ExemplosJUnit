package com.mkyong.match.utils;

/**
 * 
 * Fonte: http://www.mkyong.com/unittest/junit-4-tutorial-6-parameterized-test/
 *
 */
public class MathUtils {

	public static int add(int a, int b) {
		
		if (a == 10 && b == 10) {
			return a + b + 1;
		}else if(a == 15 && b== 15){
			return a + b + 2;
		}
		
		return a + b;
	}

}