package ch02;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NamingProblems {

	String firstName;
	int power(int base, int exponent) {
		int z=1;
		for(int i=0; i < exponent; i++) {
			z=z*base;
		}
		return z;
	}
	
	
	public static void main (String[] args) {
		NamingProblems namingErrors= new NamingProblems();
		int baseNumber=2;
		int expNumber=4;
		int BaseNumberOfPowerExp=namingErrors.power(baseNumber,expNumber);
		System.out.println(baseNumber + " to the " + expNumber + " is " + BaseNumberOfPowerExp);
		System.out.println(baseNumber+" ^ " + expNumber+ " is " + BaseNumberOfPowerExp);
		
		Hello object = new Hello();
		String answer =object.sayHi("Abraham");
		String answerEmpty =object.sayHi("");
		System.out.println(answer);
		System.out.println(answerEmpty);
		deneme();
		deneme2();
		deneme3();
		
	}
	
	static void deneme() {
		int firstVariable= 5;
			int	SecondVariable= 7;
				System.out.println(firstVariable + " + "+SecondVariable + " = " + (firstVariable+SecondVariable) );
				System.out.println(firstVariable + " - "+SecondVariable + " = " + (firstVariable-SecondVariable) );
				System.out.println(firstVariable + " * "+SecondVariable + " = " + (firstVariable*SecondVariable) );
				System.out.println(firstVariable + " / "+SecondVariable + " = " + (firstVariable/SecondVariable) );
				System.out.println(firstVariable + " ^ "+SecondVariable + " = " + Math.pow(firstVariable, SecondVariable) );
	}
	
	static void deneme2()
	{
		StringBuilder sb =new StringBuilder();
		int[] crossword[]= new int[10][20];
		int sum=0;
		for(int i=0;i<crossword.length;i++)
		{
			for(int j=0;j<crossword.length;j++)
			{
				sum++;
				crossword[i][j]='x';
				System.out.println("kamil " + sum);			
			}
		}
		String[] books= {"smacs","cars","carts"};
		for(String book : books) {
			int index =book.indexOf("c");
			//StringBuilder result =sb.insert(index, book);
			System.out.println(index);
			//System.out.println(result);
			}
		
	}
	
	static void deneme3(){
		String lol ="lol";
		System.out.println(lol.toUpperCase()==lol);
		System.out.println(lol.toUpperCase()==lol.toUpperCase());
		System.out.println(lol.toUpperCase().equals(lol));
		System.out.println(lol.toUpperCase().equals(lol.toUpperCase()));
		System.out.println(lol.toUpperCase().equalsIgnoreCase(lol));
		System.out.println(lol.toUpperCase()
				.equals(lol.toUpperCase()));
		

		List<String> c= new ArrayList<>();
		List<String> e= new ArrayList<String>();

	}
}
