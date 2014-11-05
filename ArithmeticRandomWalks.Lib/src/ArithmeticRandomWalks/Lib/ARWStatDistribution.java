package ArithmeticRandomWalks.Lib;

import java.util.ArrayList;
import java.util.Random;

public class ARWStatDistribution implements IDistribution {

	protected Random rnd = new Random();
	ArrayList<Double> data = new ArrayList<Double>(); 
	Double sum = 0D;
	int counter=0;
	protected double startValue;
	
	
	public ARWStatDistribution(double startValue )
	{
		this.startValue = startValue;
	}
	
	
	@Override
	public Double GetNumber() {
		
		 double newValue = startValue +  GetMean() + rnd.nextGaussian() * GetStandardDeviation();
		 counter++;
		 data.add(newValue);
		 return newValue;
	}

	public Double GetMean()
	{
		if( counter == 0)
			return 0D;
		else
			return sum / counter;
	}
	
	public Double GetStandardDeviation()
	{
		if( counter == 0)
			return 0D;
		else 
		{
			Double mean = GetMean();
			Double diffSum= 0D;
			for(Double d:data)
			{
				diffSum += Math.pow( mean - d,2) ;
			}
			return Math.sqrt(diffSum / counter);
		}
	}
}
