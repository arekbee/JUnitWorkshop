package ArithmeticRandomWalks.Lib.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ArithmeticRandomWalks.Lib.ARWDistribution;

public class ARWDistributionTest {

	
	ARWDistribution dis;
	
	@org.junit.Before 
	public void Before()
	{
		dis= new ARWDistribution();
		System.out.println("Before");
	}
	
	public void PrinntMethodName()
	{
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName().replace('_', ' ');
		System.out.println(methodName);
	}
	
	
	@Test(timeout= 1000)
	public void It_should_return_1_bacause_mean_is_one_and_startValue_is_zero() {
		PrinntMethodName();
		
		Double value = dis.GetNumber(0,1,0);
		assertEquals(1, value.doubleValue(), 0.001D);
		System.out.println("Counter:"+ dis.counter);
	}

	@Test
	public void It_should_return_0_bacause_mean_is_zero_and_startValue_is_zero() {
		PrinntMethodName();
		Double value = dis.GetNumber(0,0,0);
		assertEquals(0, value.doubleValue(), 0.001D);
		System.out.println("Counter:"+ dis.counter);
	}
	
	@org.junit.After
	public void After()
	{
		System.out.println("After");
		
	}
	
}
