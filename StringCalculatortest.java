package stringcalculator;
import static org.junit.Assert.assertNotEquals;

import org.junit.*;
public class StringCalculatortest {
	@Test
	public void testforemptystring() throws Exception
	{
		Assert.assertEquals(0,StringCalculator2.add(""));
	}
	@Test
	public void testfornumberseparatedbycommahavinglengthlessthan3() throws Exception
	{
		Assert.assertEquals(3,StringCalculator2.add("1,2"));
	}
	@Test
	public void testforstringseparatedbycommahavingunknownlength() throws Exception
	{
		Assert.assertEquals(24,StringCalculator2.add("1,2,3,4,5,9"));
	}
	@Test
	public void testfornumbersseparatedbycommaandnewline() throws Exception
	{
		Assert.assertEquals(3,StringCalculator2.add("1,2"));
	}
	@Test
	public void testforunknowndelimeterspassedatfirstline() throws Exception
	{
		Assert.assertEquals(16,StringCalculator2.add("//;\n1,2,4,6,3"));
	}
	@Test
	public void testfornegativenumbers() throws Exception
	{
		Assert.assertEquals(-1,StringCalculator2.add("//;\n-1;-2"));
	}
	@Test
	public void testforsumofnumbersgreaterthan1000() throws Exception
	{
		Assert.assertEquals(2,StringCalculator2.add("//,\n2,2000"));
	}
	@Test
	public void testforlengthofdelimetermorethan1() throws Exception
	{
		Assert.assertEquals(6,StringCalculator2.add("//****\n2****1****3"));
	}
	@Test
	public void testformultipledelimeters() throws Exception
	{
		Assert.assertEquals(6,StringCalculator2.add("//[*][%]\n2*1%3"));
	}
	@Test
	public void testformultipledelimeterswithlengthgreaterthan1() throws Exception
	{
		Assert.assertEquals(7,StringCalculator2.add("//[**][%]\n2**2%3"));
	}
}
