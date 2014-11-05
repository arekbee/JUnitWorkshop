
package ArithmeticRandomWalks.Lib;

import java.util.Iterator;



public class ARWGenerator implements Iterable<Double>, Iterator<Double>{

	
	private IDistribution distribution;

	
	public ARWGenerator(IDistribution distribution)
	{
		this.distribution = distribution;
	}
	
	
	@Override
	public Iterator<Double> iterator()
	{
		return this;
	}


	@Override
	public boolean hasNext() {
		return true;
	}

 
	
	@Override
	public Double next() {
		return distribution.GetNumber();
	}


	@Override
	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	
	
}
