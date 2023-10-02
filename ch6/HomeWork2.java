package ch6;



public class HomeWork2 {
	static double[] roots(int a,int b,int c) {
		double[] rootsEq= new double[2];
		double delta;
		delta=Math.pow(b, 2)-4*a*c;
		rootsEq[0]=(-b+Math.sqrt(delta))/(2*a);
		rootsEq[1]=(-b-Math.sqrt(delta))/(2*a);
		
		return  rootsEq;
	}

	public static void main(String[] args) {
		double[] result=new double[2];
		int a=2;
		int b=7;
		int c=3;
		result=roots(a,b,c);
		System.out.println("roots of "+a+"x^2+"+b+"x+"+c+"=0 \n X1="+result[0]+"\n X2=" + result[1] );
		FizzBuzz(24);
		long x=1234567897;
		long result2 =convertNumber(x);
		System.out.println("Inverse of "+x+" equals: "+ result2); 
		String MakeItShiny="IBTECH";
		System.out.println( "The word of "+ MakeItShiny+ " become "+StarBetweenLetters(MakeItShiny)+ " after convertion.");
		calcPrimeNumbersUp2(25);
		double pi=calcPiMonteCarlo(100000);
        System.out.println("Pi: " + pi);
        System.out.println("Real Pi: " + Math.PI);
        System.out.println("Real Pi ratio: " + pi/Math.PI);    
		double toplamfiyat;
		toplamfiyat=fiyatHesapla(574);
		
		System.out.println(toplamfiyat);
	} 
	
	static void FizzBuzz(int startFrom) {
		for(int x=startFrom;x<100;x++) {
			if(x % 3==0) System.out.println("Fizz");
			else if (x % 5==0) System.out.println("Buzz");
			else System.out.println(x);
		}
	}
	
	static long convertNumber(long number2Convert)
	{
		int[] numbers= new int[10];
		
	
		long temp=number2Convert;
		long result=0L;
		for(int i=0;i<10;i++) 
		{
			numbers[i]=0;
			if(temp>=10)
			{
				numbers[i]=(int)temp % 10;
			}
			else
			{
				result+=temp%10;
				break;
			}
			temp=(temp-numbers[i])/10;
			result=(result+numbers[i])*10;
		}
			return result;
	}
	
	static String StarBetweenLetters(String word) {
		int charCount=word.length();
		String result="";
		for(int i=0;i<charCount;i++) {
			if(i!=(charCount-1))
				result=result+word.charAt(i)+"*";
			else
				result=result+word.charAt(i);
		}
		return result;
	}
	
	static void calcPrimeNumbersUp2(int maxValeu) {
		
	int countPrime=0;
	System.out.println("Prime numbers up to " + maxValeu +" are as fallows.");
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
	
	static double calcPiMonteCarlo(int totalPoints)
	{	
        int pointsInsideCircle = 0;
        for (int i = 0; i < totalPoints; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) {
                pointsInsideCircle++;
            }
        }
        double pi = 4.0 * pointsInsideCircle / totalPoints;    
        return pi;        
	}
	
	static double fiyatHesapla(int sayfaAdedi)
	{
		double[] results=new double[120];
		double result=0;
		int resultCount=0;
		int kalanSayfa=0;
		int[] iCount=new int[120];
		int[] i12Count=new int[120];
		int[] i25Count=new int[120];
		for(int i25=0;i25 < (sayfaAdedi/25); i25++)
		{
			for(int i12=0;i12< (sayfaAdedi/12); i12++)
			{
				for(int i=0;i<12;i++)
				{
					kalanSayfa=((sayfaAdedi-i)-i12*12)-i25*25;
					//System.out.println(kalanSayfa);
					if(kalanSayfa==0)
					{
						results[resultCount]=i*5+i12*50+i25*100;
						iCount[resultCount]=i;
						i12Count[resultCount]=i12;
						i25Count[resultCount]=i25;
						//System.out.println(i+ " adet tek sayfa, "+i12+" adet 12 sayfa, "+i25+ "adet 25 sayfa şeklinde pay edilirse\n"+"toplam fotokopi bedeli " + results[resultCount]+" kr olarak hesaplanmıştır.");
						resultCount++;
					}					
						
				}				
			}	
		}
		result=results[0];
		int minValPlace=0;
		for (int i = 1; i < results.length; i++) {
            if (results[i] < result && results[i]!=0 ) {
            	result = results[i];
            	minValPlace=i;
            }
        }
		System.out.println(iCount[minValPlace]+ " adet tek sayfa, "+i12Count[minValPlace]+" adet 12 sayfa, "+i25Count[minValPlace]+ 
				" adet 25 sayfa şeklinde pay edilirse\n"+"toplam fotokopi bedeli " + result+" kr olarak hesaplanmıştır.");
		return result;
	}
}
