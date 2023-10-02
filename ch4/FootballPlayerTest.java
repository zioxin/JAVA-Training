package ch4;

public class FootballPlayerTest {

	
	public static void main(String[] args) {
		FootballPlayer alex= new FootballPlayer();
		alex.no=10;
		alex.name="Alex de Souza";
		alex.Minutes=0;
		alex.inPlay=true;
		alex.numberOfGoals=0;
		
		alex.play(90);
		alex.score();
		alex.score();
		System.out.println("Number of Goals Alex scored: "+alex.numberOfGoals);// number of goals 2
		System.out.println("Alex played totally "+ alex.Minutes + " minutes so far.");// Minutes is 90
		
		
	}
}
