
import ArithmeticRandomWalks.Lib.*;

public class Runner {

	public static void main(String[] args) throws Exception {

		//IDistribution distribution = new ARWDistribution(10,10,1);
		IDistribution distribution = new  ARWStatDistribution(10);
		ARWGenerator gen = new ARWGenerator(distribution);
		int counter = 0 ;
		for(Double d: gen)
		{
			System.in.read();
			System.out.println(counter+ ": " +d);
			counter++;
		}
			
	}

}
