import java.util.*;

/**
 * 
 */

/**
 * @author tlss
 *
 */
public class Sieve {

	private long range;
	private ArrayList<Long> set1 = new ArrayList<Long>();
	
	public void getRange(long range)
	{
		this.range = range;
		primeGenerator();
	}
	
	public void primeGenerator()
	{
		long i,j;
		long k;
		for(i=0;i<=this.range;i++)
		{
			this.set1.add((int)i,i);
		}
		
		
		k= (long)Math.sqrt((double)this.range);
	
		
			for(i=2;i<=k;i++)
			{
				for(j=i+1;j<=this.range;j++)
					if(set1.get((int)j)%i == 0 )
						set1.set((int)j, 0L);
			
			}
			
		for(i=2;i<=this.range;i++)
		{
			if(set1.get((int)i) != 0)
			System.out.println(set1.get((int)i));
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long range_input;
		System.out.println("Enter the range ");
		Scanner stdin = new Scanner(System.in);
		range_input = stdin.nextLong();
		Sieve s1 = new Sieve();
		s1.getRange(range_input);
		stdin.close();

	}

}
