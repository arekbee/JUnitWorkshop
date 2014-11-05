package ArithmeticRandomWalks.Lib.Tests;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import ArithmeticRandomWalks.Lib.ARWDistribution;
import ArithmeticRandomWalks.Lib.ARWGenerator;

public class ARWGeneratorTests {

	
	@Test(expected = UnsupportedOperationException.class)
	@Ignore("because")
	public void It_should_throw_exception()
	{
		ARWGenerator generator = new ARWGenerator(new ARWDistribution(0,0,0));
		generator.remove();
	}
	

}
