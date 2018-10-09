import java.util.*;

class PlayoffsRoster implements Comparable<PlayoffsRoster>{
	//fields
	private String lastName;
	private int points;

	//constructor
	PlayoffsRoster(String ln, int p){
		lastName = ln;
		points = p;
	}

	/**
	* a method that defines how to sort Players numerically by points
	* @param PlayoffsRoster the player to which we are comparing
	*/
	@Override
    	public int compareTo(PlayoffsRoster other) {
    		if (this.getPoints() < other.getPoints()) {
    			return -1;
    		}
    		if (this.getPoints() == other.getPoints()) { //how does one sub-sort ties alphabetically???
    			return 0;
    		}
    		return 1;
    	}
	
    	//setters
	public void setLastName(String ln){
		lastName = ln;	
	}
	
	public void setPoints(int p){
		points = p;	
	}
	
	//getters
	public String getLastName(){
		return lastName;	
	}
	
	public int getPoints(){
		return points;	
	}
}

public class SortPoints{
	//fields
	private PlayoffsRoster[] playerPoints;
	private PlayoffsRoster[] sortedPoints;
	private int [] justSortedPoints;
	private String [] playerMapToSortedPoints;
	
	//constructor
	public SortPoints(){
		setPlayerPoints();
		setSortedPoints();
		setJustSortedPoints();
		setPlayerMapToSortedPoints();
	}
	
	//setters
	public void setPlayerPoints(){
		playerPoints = new PlayoffsRoster[23];
		playerPoints[0] = new PlayoffsRoster("Chiasson", 2);
		playerPoints[1] = new PlayoffsRoster("Ovechkin", 27);
		playerPoints[2] = new PlayoffsRoster("Burakovsky", 6);
		playerPoints[3] = new PlayoffsRoster("Connolly", 9);
		playerPoints[4] = new PlayoffsRoster("Orpik", 5);
		playerPoints[5] = new PlayoffsRoster("Stephenson", 7);
		playerPoints[6] = new PlayoffsRoster("Djoos", 1);
		playerPoints[7] = new PlayoffsRoster("Smith-Pelly", 8 );
		playerPoints[8] = new PlayoffsRoster("Orlov", 8);
		playerPoints[9] = new PlayoffsRoster("Kuznetsov", 32);
		playerPoints[10] = new PlayoffsRoster("Jerabek", 1);
		playerPoints[11] = new PlayoffsRoster("Vrana", 8);
		playerPoints[12] = new PlayoffsRoster("Beagle", 8);
		playerPoints[13] = new PlayoffsRoster("Carlson", 20);
		playerPoints[14] = new PlayoffsRoster("Eller", 18);
		playerPoints[15] = new PlayoffsRoster("Niskanen", 9);
		playerPoints[16] = new PlayoffsRoster("Kempny", 5);
		playerPoints[17] = new PlayoffsRoster("Walker", 1);
		playerPoints[18] = new PlayoffsRoster("Backstrom", 23);
		playerPoints[19] = new PlayoffsRoster("Gersich", 0);
		playerPoints[20] = new PlayoffsRoster("Oshie", 21);
		playerPoints[21] = new PlayoffsRoster("Wilson", 15);
		playerPoints[22] = new PlayoffsRoster("Boyd", 0);
	}
	
	public void setSortedPoints(){
		sortedPoints = new PlayoffsRoster[23];
		sortedPoints = getPlayerPoints();
		Arrays.sort(sortedPoints);  //how to prevent both arrays from being sorted???
	}
	
	public void setJustSortedPoints(){
		justSortedPoints = new int[23];
		for(int i = 0; i<sortedPoints.length; i++){
			justSortedPoints[i] = sortedPoints[i].getPoints();	
		}
	}
	
	public void setPlayerMapToSortedPoints(){
		playerMapToSortedPoints = new String[23];
		for(int i=0; i<sortedPoints.length; i++){
			playerMapToSortedPoints[i] = sortedPoints[i].getLastName();	
		}
	}
	
	//getters
	public PlayoffsRoster[] getPlayerPoints(){
		return playerPoints;	
	}
	
	public PlayoffsRoster[] getSortedPoints(){
		return sortedPoints;	
	}
	
	public int[] getJustSortedPoints(){
		return justSortedPoints;	
	}
	
	public String[] getPlayerMapToSortedPoints(){
		return playerMapToSortedPoints;	
	}
	
	
	//prints an array of playerStats
	public void printPlayers(PlayoffsRoster[] roster){
		System.out.println("  POINTS: \tPLAYER: ");
		for(int i=(roster.length - 1); i>=0; i--){
			System.out.println("  " + roster[i].getPoints() + "\t\t" + roster[i].getLastName());	
		}		
	}
	
	//this method selects a random 1-digit or 2-digit integer and sees if at least one member of the 2018 Stanley Cup Playoffs roster earned that number of points
	public void PointsQA(){
		Random r = new Random();
		int randomNum = r.nextInt(33);
		System.out.println("Q.) Did at least one player earn " + randomNum + " points during the 2018 Stanley Cup playoffs?") ;
		if(Arrays.binarySearch(getJustSortedPoints(), randomNum) >= 0){
			System.out.println("A.) Yes, " + getPlayerMapToSortedPoints()[Arrays.binarySearch(getJustSortedPoints(), randomNum)] + " did!");	
		}
		else{
			System.out.println("A.) NO player earned " + randomNum + " points during the 2018 Stanley Cup playoffs");	
		}
		
	}
	
	//main method
	public static void main(String[] args){
	//print 2018 playoffs roster sorted by first name
	//print 2018 playoffs roster sorted by points
	//play points Q&A
		SortPoints sortRoster = new SortPoints();
		//System.out.println("2018 STANLEY CUP PLAYOFFS ROSTER SORTED Z-A BY FIRST NAME");
		//sortRoster.printPlayers(sortRoster.getPlayerPoints());
		//System.out.println();
		System.out.println("2018 STANLEY CUP PLAYOFFS ROSTER SORTED IN DESCENDING ORDER BY POINTS");
		sortRoster.printPlayers(sortRoster.getSortedPoints());
		System.out.println();
		System.out.println("***PLAY 2018 STANLEY CUP PLAYOFFS POINTS Q & A!!!***");
		sortRoster.PointsQA();	
	}
}