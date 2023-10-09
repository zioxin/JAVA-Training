package ch7;

public class PrimeCalculator {
	public static void main(String[] args) {
		SieveOfEratosthenes PrimeCalc = new SieveOfEratosthenes();
		PrimeCalc.calcPrimeNumbersUp2(500);
		PrimeCalc.filterPrimes(500);
	}

}
