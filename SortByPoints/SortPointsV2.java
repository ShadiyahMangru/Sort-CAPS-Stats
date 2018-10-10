import java.util.*;
import java.io.*;

public class SortPointsV2{
	//fields
	private PlayoffsRoster[] sortedPoints;
	private Integer [] justSortedPoints;
	private String [] playerMapToSortedPoints;
	
	//constructor
	public SortPointsV2(){
		setSortedPoints();
		setJustSortedPoints();
		setPlayerMapToSortedPoints();
	}
	
	//setters
	public void setSortedPoints(){
		sortedPoints = new PlayoffsRoster[23];
		sortedPoints[0] = new PlayoffsRoster("Chiasson", 2);
		sortedPoints[1] = new PlayoffsRoster("Ovechkin", 27);
		sortedPoints[2] = new PlayoffsRoster("Burakovsky", 6);
		sortedPoints[3] = new PlayoffsRoster("Connolly", 9);
		sortedPoints[4] = new PlayoffsRoster("Orpik", 5);
		sortedPoints[5] = new PlayoffsRoster("Stephenson", 7);
		sortedPoints[6] = new PlayoffsRoster("Djoos", 1);
		sortedPoints[7] = new PlayoffsRoster("Smith-Pelly", 8 );
		sortedPoints[8] = new PlayoffsRoster("Orlov", 8);
		sortedPoints[9] = new PlayoffsRoster("Kuznetsov", 32);
		sortedPoints[10] = new PlayoffsRoster("Jerabek", 1);
		sortedPoints[11] = new PlayoffsRoster("Vrana", 8);
		sortedPoints[12] = new PlayoffsRoster("Beagle", 8);
		sortedPoints[13] = new PlayoffsRoster("Carlson", 20);
		sortedPoints[14] = new PlayoffsRoster("Eller", 18);
		sortedPoints[15] = new PlayoffsRoster("Niskanen", 9);
		sortedPoints[16] = new PlayoffsRoster("Kempny", 5);
		sortedPoints[17] = new PlayoffsRoster("Walker", 1);
		sortedPoints[18] = new PlayoffsRoster("Backstrom", 23);
		sortedPoints[19] = new PlayoffsRoster("Gersich", 0);
		sortedPoints[20] = new PlayoffsRoster("Oshie", 21);
		sortedPoints[21] = new PlayoffsRoster("Wilson", 15);
		sortedPoints[22] = new PlayoffsRoster("Boyd", 0);
	
		Arrays.sort(sortedPoints); 
	}
	
	public void setJustSortedPoints(){
		justSortedPoints = new Integer[23];
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
	public PlayoffsRoster[] getSortedPoints(){
		return sortedPoints;	
	}
	
	public Integer[] getJustSortedPoints(){
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
	
	//method to play points Q & A
	public void PointsQA(){
		Random r = new Random();
		int randomIndex = r.nextInt(getJustSortedPoints().length);
		int selectedPoints = getJustSortedPoints()[randomIndex];	//selects a random element from the points array
		List pointsList = Arrays.asList(getJustSortedPoints());
		int playerFreq = Collections.frequency(pointsList, selectedPoints);
		
		//ask user how many players ended the 2018 Stanley Cup Playoffs with exactly this number of points, get response, provide feedback
		System.out.println("Q.) How many players ended the 2018 Stanley Cup playoffs with exactly " + selectedPoints + " points?") ;
		
		Integer userPlayersGuess = 0;
		
		try{
			BufferedReader getInput = new BufferedReader(new InputStreamReader(System.in)); 
			System.out.print("\nEnter integer guess: ");
			userPlayersGuess = Integer.parseInt(getInput.readLine());	
		}
		catch(Exception e){
			System.out.println("oh noz, there is an Exception: " + e + "\nTry again!");
		}
		
		if(playerFreq == userPlayersGuess){
			System.out.println("CORRECT!  " + playerFreq + " player(s) earned this exact total number of points.");	
		}
		else{
			System.out.println("Actually, " + playerFreq + " player(s) earned this exact total number of points." );
		}
		
		//create array of user's player inputs
		//for each player with this number of points, ask user to input name of player with this number of points
		String userPlayersLN = "";
		String[] inputPlayers = new String[playerFreq];
		for(int i=0; i<playerFreq; i++){
			try{
				BufferedReader userEntersPlayer = new BufferedReader(new InputStreamReader(System.in)); 
				System.out.print("\nEnter last name of player with " + selectedPoints + " points: ");
				userPlayersLN = userEntersPlayer.readLine().trim();
				inputPlayers[i] = userPlayersLN.toUpperCase();
			}
			catch(Exception e){
				System.out.println("oh noz, there is an Exception: " + e + "\nTry again!");
			}		
		}
		
		//create an answer key array
		int counter = 0;
		String[] answerKey = new String[playerFreq];
		for(int i=0; i<getJustSortedPoints().length; i++){
			if(getJustSortedPoints()[i] == selectedPoints){
				answerKey[counter] = getPlayerMapToSortedPoints()[i].toUpperCase();
				counter++;
			}
			if(counter == playerFreq){
				break;	
			}
		}
		
		//sort arrays, compare contents to determine if user is correct/incorrect
		Arrays.sort(answerKey);
		Arrays.sort(inputPlayers);
		
		if(Arrays.equals(answerKey, inputPlayers) == true){
			System.out.println("\nCONGRATS!  YOU ENTERED THE CORRECT PLAYER(S): " + Arrays.toString(answerKey));	
		}
		else{
			System.out.println("\nThat is not correct.  The players are: " + Arrays.toString(answerKey) + ".  Study these stats then play again!\n\n");	
			System.out.println("2018 STANLEY CUP PLAYOFFS ROSTER SORTED IN DESCENDING ORDER BY POINTS");
			printPlayers(getSortedPoints());
			System.out.println();
		}
		
	}
	
	//main method
	public static void main(String[] args){
		SortPointsV2 sortRoster = new SortPointsV2();
		System.out.println("***PLAY 2018 STANLEY CUP PLAYOFFS POINTS Q & A!!!***");
		sortRoster.PointsQA();	
	}
}

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