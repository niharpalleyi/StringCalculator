package stringcalculator;
import static org.junit.Assert.assertNotEquals;

import org.junit.*;
public class StringCalculatorTestFinalCases{
	@Test
	public void testforemptystring() throws Exception
	{
		Assert.assertEquals(0,StringCalculatorTestFinal.add(""));
	}
	@Test
	public void testfornumberseparatedbycommahavinglengthlessthan3() throws Exception
	{
		Assert.assertEquals(3,StringCalculatorTestFinal.add("1,2"));
	}
	@Test
	public void testforstringseparatedbycommahavingunknownlength() throws Exception
	{
		Assert.assertEquals(24,StringCalculatorTestFinal.add("1,2,3,4,5,9"));
	}
	@Test
	public void testfornumbersseparatedbycommaandnewline() throws Exception
	{
		Assert.assertEquals(3,StringCalculatorTestFinal.add("1,2"));
	}
	@Test
	public void testforunknowndelimeterspassedatfirstline() throws Exception
	{
		Assert.assertEquals(16,StringCalculatorTestFinal.add("//;\n1,2,4,6,3"));
	}
	@Test
	public void testfornegativenumbers() throws Exception
	{
		Assert.assertEquals(-1,StringCalculatorTestFinal.add("//;\n-1;-2"));
	}
	@Test
	public void testforsumofnumbersgreaterthan1000() throws Exception
	{
		Assert.assertEquals(2,StringCalculatorTestFinal.add("//,\n2,2000"));
	}
	@Test
	public void testforlengthofdelimetermorethan1() throws Exception
	{
		Assert.assertEquals(6,StringCalculatorTestFinal.add("//****\n2****1****3"));
	}
	@Test
	public void testformultipledelimeters() throws Exception
	{
		Assert.assertEquals(6,StringCalculatorTestFinal.add("//[*][%]\n2*1%3"));
	}
	@Test
	public void testformultipledelimeterswithlengthgreaterthan1() throws Exception
	{
		Assert.assertEquals(7,StringCalculatorTestFinal.add("//[**][%]\n2**2%3"));
	}
}
