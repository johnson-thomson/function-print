/**
 * 
 */
package com.full.impl;

import com.full.interfaces.Print;
import com.full.service.InvalidOperatorException;
import com.full.service.MethodCreationService;

/**
 * @author Johnson Abraham
 * @since 06-Apr-2017, 4:23:59 PM
 * Code
 */
public class PrintCommutativeMethod implements Print {

	/* (non-Javadoc)
	 * @see com.full.interfaces.Print#printMethod(java.lang.String)
	 */
	@Override
	public String[] printMethod(String operator) {
		
		String[] method = new String[10];
		
		try {
			
			String methodName = MethodCreationService.identifyMethodName(operator);
			String resultVariable = MethodCreationService.identifyResultVariableName(operator);
			String variableInitialValue = MethodCreationService.identifyResultVariableInitialValue(operator);
			
			method[0] = "public int "+ methodName +"(int... numbers) {";
			method[1] = "	int "+ resultVariable +" = "+ variableInitialValue;
			method[2] = "	for(int number : numbers) {";
			method[3] = "		"+ resultVariable + operator +"= number";
			method[4] = "	}";
			method[5] = "	return "+ resultVariable;
			method[6] = "}";
			
		} catch (InvalidOperatorException e) {
			method[0] = "There seems to be a problem.. Please try again...";
		}
		
		return method;
	}

}
