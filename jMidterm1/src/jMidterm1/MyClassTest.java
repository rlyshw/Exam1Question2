package jMidterm1;

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import MainPackage.MyClass;

public class MyClassTest {
	MyClass c;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReturnTrue() {
		assertTrue("ReturnTrue did not return true",MyClass.ReturnTrue());
	}
	@Test
	public void testAddTwoNumbers(){
		assertEquals("1+1 did not equal 2",MyClass.AddTwoNumbers(1, 1),2);
	}

}
