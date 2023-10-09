package ch7;
import java.util.Arrays;

public class SieveOfEratosthenes {
	
	
	void filterPrimes(int maxNumber) {
		
		System.out.println("Prime numbers up to " + maxNumber +" are with Sieve Of Eratosthenes technique as follows.");
		boolean[] primeNumbers = new boolean[maxNumber];
		Arrays.fill(primeNumbers, true);
		for(int i=2;i<maxNumber;i++)
		{
			if(primeNumbers[i])
			for(int j=2;j*i<maxNumber;j++) {
				int notPrime=j*i; 
				primeNumbers[notPrime]=false;
			}
		}
		int index=0;
		int countPrimes=0;
				
		for(boolean e:primeNumbers) {
			
			if(e && index>=2) {
				countPrimes++;
				System.out.print(index+" ");
				if(countPrimes%20==0)System.out.print("\n");
			}
			
			index++;	
		}
		System.out.println("\n"+countPrimes);
		System.out.print("Prime Count is "+countPrimes+ "\n");
		
	}
	
	void calcPrimeNumbersUp2(int maxValeu) {
		
		int countPrime=0;
		System.out.println("Prime numbers up to " + maxValeu +" are divition way as fallows.");
			for(int number=2; number < maxValeu;number++) 
			{
				boolean isPrime = true;
				for (int i = 2; i <= Math.sqrt(number); ++i) 
				{
		            if (number % i == 0) {
		                isPrime = false;
		                break;
		            }
		        }
				if(isPrime)
				{
					countPrime++;
					if(countPrime % 20 == 0)
						System.out.println(number + " ");
					else
						System.out.print(number + " ");
				}
			}		
			System.out.print("\n");
			System.out.print("Prime Count is "+countPrime+ "\n");
		}

}
