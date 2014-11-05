package ArithmeticRandomWalks.Lib.Tests.Helpers;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public abstract class InstanceSpecification<T> {

	public T SubjectUnderTest;
	
	@Before
	public void Before()
	{
		Given();
		When();
		
	}
	public void Given(){};
	public void When(){};
	
}
