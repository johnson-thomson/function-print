/**
 * 
 */
package com.full.impl;

import com.full.interfaces.Addable;
import com.full.interfaces.ArithmeticOperation;
import com.full.interfaces.Print;

/**
 * @author Johnson Abraham
 * @since 06-Apr-2017, 9:53:12 AM
 * Code
 */
public class Addition extends ArithmeticOperation implements Addable {

	private Print print;
	
	/**
	 * 
	 */
	public Addition() {
		print = new PrintCommutativeMethod();
	}
	
	@Override
	public int add(int... numbers) {
		
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
	}

	/* (non-Javadoc)
	 * @see com.full.interfaces.Printable#getPrintedMessage(java.lang.String)
	 */
	@Override
	public String[] getPrintedMessage(String operator) {
		return print.printMethod(operator);
	}
	
	
}
