package ArithmeticRandomWalks.Lib;

import java.util.Random;

public class ARWDistribution  implements IDistribution{

	
	protected double standardDeviation;
	protected Random rnd = new Random();
	protected double mean;
	protected double startValue;
	public int counter=0;
	
	public ARWDistribution(double startValue ,double mean, double standardDeviation)
	{
			this.startValue = startValue;
			this.mean = mean;
			this.standardDeviation = standardDeviation;
	}

	public ARWDistribution(double startValue )
	{
		this(startValue,0,1);
	}
	
	
	public ARWDistribution()
	{
		this(0,0,1);
	}
	
	public Double GetNumber()
	{
		return startValue +  mean + rnd.nextGaussian() * standardDeviation;	
	}
	
	public Double GetNumber(double startValue, double mean,  double standardDeviation)
	{
		counter ++;
		return startValue +  mean + rnd.nextGaussian() * standardDeviation;	
	}
}
