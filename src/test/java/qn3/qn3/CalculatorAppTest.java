package qn3.qn3;

import org.testng.annotations.*;

import junit.framework.Assert;

public class CalculatorAppTest {
	@Test
//	@Parameters({"a","b"})
	public void testAdd() {
		CalculatorApp app = new CalculatorApp();
//		int a = Integer.parseInt(sa);
//		int b = Integer.parseInt(sb);
		int a=10;
		int b=5;
		int actual=app.addMethod(a, b);
		int expected=a+b;
		Assert.assertEquals(actual, expected);
	}
	@Test
//	@Parameters({"a","b"})
	public void testSub() {
		CalculatorApp app = new CalculatorApp();
//		int a = Integer.parseInt(sa);
//		int b = Integer.parseInt(sb);
		int a=10;
		int b=5;
		int actual=app.subMethod(a,b);
		int expected=a-b;
		Assert.assertEquals(actual, expected);
	}
	@Test
//	@Parameters({"a","b"})
	public void testMul() {
		CalculatorApp app = new CalculatorApp();
//		int a = Integer.parseInt(sa);
		int a=10;
		int b=5;
//		int b = Integer.parseInt(sb);
		int actual=app.mulMethod(a, b);
		int expected=a*b;
		Assert.assertEquals(actual, expected);
	}
}
