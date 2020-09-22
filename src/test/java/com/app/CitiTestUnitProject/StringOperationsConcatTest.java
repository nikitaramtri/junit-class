package com.app.CitiTestUnitProject;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringOperationsConcatTest {
	private static  StringOperations strOpr = null;
	
	@BeforeClass
	public static void beforeClass() {
		StringOperationsConcatTest.strOpr = new StringOperations();
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterClass() {
		StringOperationsConcatTest.strOpr = null;
		System.out.println("After Class");
	}
	@Before
	public void before() {
		System.out.println("Before");
	}
	@After
	public void after() {
		System.out.println("After");
	}

	@Parameter(value=0)
	public String s1;
	@Parameter(value=1)
	public String s2;
	@Parameters
	public static Collection<Object []> testData(){
		Object data[][]= {
				{"Nikita ", "Ramtri"},{"Kobe ","Eats"}
		};
		return Arrays.asList(data);
	}
	
	@Test
	public void testconcat() {
		
		assertEquals(s1+s2, strOpr.concat(s1,s2));
	}

	
}
