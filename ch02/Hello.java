package ch02;

public class Hello {
	String world ="Everyone";
		public String sayHi(String who) {
			String sentance;
			if(who!="")
				sentance="Hi "+ who +" :)";
			else
				sentance="Hi " + world + " :)";
				
			return sentance;
		}
}
