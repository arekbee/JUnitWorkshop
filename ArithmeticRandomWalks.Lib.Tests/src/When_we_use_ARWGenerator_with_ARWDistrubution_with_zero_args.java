import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import static org.mockito.Mockito.*;


import ArithmeticRandomWalks.Lib.ARWDistribution;
import ArithmeticRandomWalks.Lib.ARWGenerator;
import ArithmeticRandomWalks.Lib.IDistribution;
import ArithmeticRandomWalks.Lib.Tests.Helpers.InstanceSpecification;


public class When_we_use_ARWGenerator_with_ARWDistrubution_with_zero_args
		extends InstanceSpecification<ARWGenerator> {

	
	ArrayList<Double> data; 
	IDistribution dis;
	
	@Override
	public void Given() {
		dis = mock(IDistribution.class);
		SubjectUnderTest = new ARWGenerator(dis);
		
	}
	//@Override
	//public void When() {
	//	data = new ArrayList<Double>();
		
	//	when(dis.GetNumber())
	//	for(int i = 0 ; i< 5; i++)
	//		data.add(SubjectUnderTest.next());
		
	//}
	
	@Test
	public void It_should_run_get_number_on_dis()
	{
		verify(dis).GetNumber();
		
	}
	
	@Test
	public void It_should_return_5_elements() {
		int size = data.size();
		assertEquals(5, size);
		
		
	}

}
