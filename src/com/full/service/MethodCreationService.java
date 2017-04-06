/**
 * 
 */
package com.full.service;

/**
 * @author Johnson Abraham
 * @since 06-Apr-2017, 4:28:25 PM
 * Code
 */
public class MethodCreationService {

	public static final String ADDITION = "+";
	public static final String SUBTRACTION = "-";
	public static final String MULTIPLICATION = "*";
	
	public static String identifyMethodName(String operator) throws InvalidOperatorException {
		
		String name;
		
		if(operator.equals(ADDITION)) {
			name = "add";
		} else if(operator.equals(SUBTRACTION)) {
			name = "subtract";
		} else if(operator.equals(MULTIPLICATION)) {
			name = "multiply";
		} else {
			throw new InvalidOperatorException("Invalid operator "+ operator);
		}
		
		return name;
	}
	
	public static String identifyResultVariableName(String operator) {
		
		String variableName = new String();
		
		if(operator.equals(ADDITION)) {
			variableName = "sum";
		} else if(operator.equals(SUBTRACTION)) {
			variableName = "difference";
		} else if(operator.equals(MULTIPLICATION)) {
			variableName = "product";
		}
		
		return variableName;
		
	}
	
	public static String identifyResultVariableInitialValue(String operator) {
		
		String initialValue = new String();
		
		if(operator.equals(ADDITION)) {
			initialValue = "0";
		} else if(operator.equals(SUBTRACTION)) {
			initialValue = "numbers[0]";
		} else if(operator.equals(MULTIPLICATION)) {
			initialValue = "1";
		}
		
		return initialValue;
	}
}
