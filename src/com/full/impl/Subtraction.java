/**
 * 
 */
package com.full.impl;

import com.full.interfaces.ArithmeticOperation;
import com.full.interfaces.Print;
import com.full.interfaces.Subtractable;

/**
 * @author Johnson Abraham
 * @since 06-Apr-2017, 9:56:48 AM
 * Code
 */
public class Subtraction extends ArithmeticOperation implements Subtractable {

	private Print print;
	
	/* (non-Javadoc)
	 * @see com.full.interfaces.Subtractable#subtract(int[])
	 */
	@Override
	public int subtract(int... numbers) {

		int difference = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			difference = difference - numbers[i];
		}
		
		return difference;
	}

	/* (non-Javadoc)
	 * @see com.full.interfaces.Printable#getPrintedMessage(java.lang.String)
	 */
	@Override
	public String[] getPrintedMessage(String operator) {
		return print.printMethod(operator);
	}

}
