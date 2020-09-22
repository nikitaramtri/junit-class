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
public class StringOperationsCharTest {
	private static  StringOperations strOpr = null;
	
	@BeforeClass
	public static void beforeClass() {
		StringOperationsCharTest.strOpr = new StringOperations();
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterClass() {
		StringOperationsCharTest.strOpr = null;
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
	public String s;
	@Parameter(value=1)
	public int index;
	@Parameters
	public static Collection<Object []> testData(){
		Object data[][]= {
				{"Nikita", 2},{"JUnit Testing",6}
		};
		return Arrays.asList(data);
	}

	@Test
	public void testgetChar() {
		assertEquals(s.charAt(index), strOpr.getChar(s,index));
	}
	
	
	
//	@Test(timeout=1000)
//	public void test() {
//		while(true) {
//			System.out.println("In while");
//		}
//	}
//	
}
