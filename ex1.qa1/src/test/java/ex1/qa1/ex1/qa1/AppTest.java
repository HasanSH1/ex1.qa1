package ex1.qa1.ex1.qa1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
	//hasan sharkawe(212148670)-hamza marei(211841291)
/**
 * Unit test for simple App.
 */
public class AppTest {

	q1 TST=  new q1();
	@Test
	public void Test_1() {
	String expr1 = "A";
	int a= 24 , b = 14;
	String mod = "regular";
	String actual_result = TST.Comapre(a, b, mod);
	assertEquals(expr1,actual_result);
	}
	
	
	@Test
	public void Test_2() {
	String expr1 = "A";
	int a= 27 , b = -14;
	String mod = "regular";
	String actual_result = TST.Comapre(a, b, mod);
	assertEquals(expr1,actual_result);
	}
	@Test
	public void Test_4() {
	String expr1 = "B";
	int a= 18 , b = 10;
	String mod = "negatives";
	String actual_result = TST.Comapre(a, b, mod);
	assertEquals(expr1,actual_result);
	}
	
	@Test
	public void Test_5() {
	String expr1 = "B";
	int a= 30 , b = -25;
	String mod = "negatives";
	String actual_result = TST.Comapre(a, b, mod);
	assertEquals(expr1,actual_result);
	}
	
	
	/*@Test
	public void Test_6() {
	String expr1 = "B";
	int a= 21 , b =#;
	String mod = "negatives";
	String actual_result = TST.Comapre(a, b, mod);
	assertEquals(expr1,actual_result);
	}*/
	
	@Test
	public void Test_7() {
	String expr1 = "B";
	int a= 9 , b = 12;
	String mod = "regular";
	String actual_result = TST.Comapre(a, b, mod);
	assertEquals(expr1,actual_result);
	}
	
	@Test
	public void Test_8() {
	String expr1 = "B";
	int a= 7 , b = -10;
	String mod = "reciprocals";
	String actual_result = TST.Comapre(a, b, mod);
	assertEquals(expr1,actual_result);
	}
	
	/*@Test
	public void Test_9() {
	String expr1 = "B";
	int a= 49 , b = !;
	String mod = "reciprocals";
	String actual_result = TST.Comapre(a, b, mod);
	assertEquals(expr1,actual_result);
	}*/
}

