import java.util.*;	

public class PlayerStats{

/**
* The PlayerStats class contains a method to numerically sort (the 2018 playoffs) roster by shooting percentage (in double precision).
*
* @author  Shadiyah Mangru
* @version 1.0
* @since   September 2018
*/	
	
    	/**
	* a method that returns the entire roster sorted numerically by shooting percentage
	* @return ArrayList roster numerically sorted by shooting percentage
	*/
	public static ArrayList<Player> sortedShootingPercentage(ArrayList<Player> unsortedArrayList){
		ArrayList<Player> sortPlayers = new ArrayList<Player>();
		for(int i=0; i<unsortedArrayList.size(); i++){
			sortPlayers.add(unsortedArrayList.get(i));	
		}
		Collections.sort(sortPlayers);
		return sortPlayers;
	}	
}