package ch7;

import java.util.Arrays;

public class HomeWorksCh7 {
	public static void main(String[] args) {
		
		String[] myStrArr= new String[50];
		String[] myStrArr2= new String[50];
		myStrArr[0]="zafer";
		myStrArr[1]="Muammer";
		myStrArr[2]="Melek";
		myStrArr[3]="Nil";
		myStrArr[5]="Nebiye";
		myStrArr[6]="Musaffet";
		Arrays.copyOf(myStrArr,myStrArr2.length);
		
	}

}
