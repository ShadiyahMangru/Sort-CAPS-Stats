import java.util.*;

public class Driver{
	
/**
* The Driver class contains the main method.  From this class, the user may run the program and output
* (i) the 2018 playoffs roster (current default sorting is by points), and 
* (ii) a roster numerically sorted by shooting percentage (in double precision).
*
* @author  Shadiyah Mangru
* @version 1.0
* @since   September 2018
*/	
		public static void main(String[] args){
			PlayoffsRoster2018 newInst = new PlayoffsRoster2018();
			PlayerStats shootingPercent = new PlayerStats();
			
			newInst.printRoster();
			
			ArrayList<Player> teamStats = newInst.getRoster();
			
			System.out.println("\nPLAYERS' SHOOTING PERCENTAGE SORTED NUMERICALLY: ");
			ArrayList<Player> sortedTeamStats = shootingPercent.sortedShootingPercentage(teamStats);
			for(int i=0; i<sortedTeamStats.size(); i++){
				System.out.println(sortedTeamStats.get(i).getLastName() + "'s shooting percentage: " + sortedTeamStats.get(i).getShootingPercentageDouble());
			}	
	}
}