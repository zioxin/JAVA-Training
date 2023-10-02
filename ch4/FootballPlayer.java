package ch4;

 
public class FootballPlayer {
	int no;
	String name;
	boolean inPlay;
	int Minutes;
	int numberOfGoals;
	
	void play(int minutesToPlay)
	{
		Minutes=minutesToPlay;
	}
	void score() {
		numberOfGoals++;
	}
}
