package com.app.CitiTestUnitProject;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.TestCase;
//import org.junit.Test;

@RunWith(Parameterized.class)
public class ArithmeticOperationsTest extends TestCase {
	private static ArithmeticOperation arithObj = null;
	
	@BeforeClass
	public static void beforeClass() {
		ArithmeticOperationsTest.arithObj = new ArithmeticOperation();
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterClass() {
		ArithmeticOperationsTest.arithObj = null;
		System.out.println("After Class");
	}
	
	@Parameter(value=0)
	public int x;
	@Parameter(value=1)
	public int y;
	
	@Parameters
	public static Collection<Object []> testData(){
		Object data[][]= {
				{50,10},{45,9},{35,5},{150,3},{66,3},{51,17}
		};
		return Arrays.asList(data);
	}

	
	@Test
	public void testDivide() {
		
		assertEquals((x/y),arithObj.divide(x, y), 1.0);
	}
	
	
	
}
