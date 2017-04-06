/**
 * 
 */
package com.full.impl;

import com.full.interfaces.ArithmeticOperation;
import com.full.interfaces.Multiplyable;
import com.full.interfaces.Print;

/**
 * @author Johnson Abraham
 * @since 06-Apr-2017, 3:48:56 PM
 * Code
 */
public class Multiplication extends ArithmeticOperation implements Multiplyable {

	private Print print;
	
	/**
	 * 
	 */
	public Multiplication() {
		print = new PrintCommutativeMethod();
	}
	
	/* (non-Javadoc)
	 * @see com.full.interfaces.Multiplyable#multiply(int[])
	 */
	@Override
	public int multiply(int... numbers) {
		
		int product = 1;
		
		for(int number : numbers) {
			product *= number;
		}
		
		return product;
		
	}

	/* (non-Javadoc)
	 * @see com.full.interfaces.Printable#getPrintedMessage(java.lang.String)
	 */
	@Override
	public String[] getPrintedMessage(String operator) {
		return print.printMethod(operator);
	}

}
