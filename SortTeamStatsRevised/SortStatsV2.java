import java.util.*;
import java.io.*;

class Player implements Comparable<Player>{
	//fields
	private String lastName;
	private int points;
	private int goals;
	private int assists;
	private ArrayList<Player> roster;
	private static int sortBy;
	
	//constructors
	Player(){	
		setRoster();
	}
	
	Player(int sb){
		sortBy = sb;
		setRoster();
	}
	
	Player(String ln, int p, int g, int a){
		lastName = ln;
		points = p;
		goals = g;
		assists = a;
	}
	
	/**
	* a method that defines how to sort Players numerically by a stat
	* @param Player the player to which we are comparing
	*/
	@Override
    	public int compareTo(Player other) {
    	switch(sortBy){
    	case 1:
    		if (this.getPoints() < other.getPoints()) {
    			return -1;
    		}
    		if (this.getPoints() == other.getPoints()) { 
    			return 0;
    		}
    		break;
   	case 2:
    		if (this.getGoals() < other.getGoals()) {
    			return -1;
    		}
    		if (this.getGoals() == other.getGoals()) { 
    			return 0;
    		}
    		break;
    	case 3:
    		if (this.getAssists() < other.getAssists()) {
    			return -1;
    		}
    		if (this.getAssists() == other.getAssists()) { 
    			return 0;
    		}
    		break;
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
	
	public void setGoals(int g){
		goals = g;	
	}
	
	public void setAssists(int a){
		assists = a;	
	}
	
	public void setRoster(){
		roster = new ArrayList<Player>();
		roster.add( new Player("Chiasson", 2, 1, 1) );
		roster.add( new Player("Ovechkin", 27, 15, 12) );
		roster.add( new Player("Burakovsky", 6, 2, 4) );
		roster.add( new Player("Connolly", 9, 6, 3) );
		roster.add( new Player("Orpik", 5, 1, 4) );
		roster.add( new Player("Stephenson", 7, 2, 5) );
		roster.add( new Player("Djoos", 1, 0, 1) );
		roster.add( new Player("Smith-Pelly", 8, 7, 1) );
		roster.add( new Player("Orlov", 8, 2, 6) );
		roster.add( new Player("Kuznetsov", 32, 12, 20) );
		roster.add( new Player("Jerabek", 1, 0, 1) );
		roster.add( new Player("Vrana", 8, 3, 5) );
		roster.add( new Player("Beagle", 8, 2, 6) );
		roster.add( new Player("Carlson", 20, 5, 15) );
		roster.add( new Player("Eller", 18, 7, 11) );
		roster.add( new Player("Niskanen", 9, 1, 8) );
		roster.add( new Player("Kempny", 5, 2, 3) );
		roster.add( new Player("Walker", 1, 0, 1) );
		roster.add( new Player("Backstrom", 23, 5, 18) );
		roster.add( new Player("Gersich", 0, 0, 0) );
		roster.add( new Player("Oshie", 21, 8, 13) );
		roster.add( new Player("Wilson", 15, 5, 10) );
		roster.add( new Player("Boyd", 0, 0, 0) );			
	}
	
	//getters
	public String getLastName(){
		return lastName;	
	}
	
	public int getPoints(){
		return points;	
	}
	
	public int getGoals(){
		return goals;	
	}
	
	public int getAssists(){
		return assists;	
	}
	
	public ArrayList<Player> getRoster(){
		return roster;	
	}
}


class PlayoffsPoints extends Player{
	//fields
	private ArrayList<Player> rosterPoints;
	
	//constructor
	PlayoffsPoints(){
		Player p = new Player(1);
		setRosterPoints();
	}
	
	//setters
	public void setRosterPoints(){
		rosterPoints = new ArrayList<Player>(getRoster());
		Collections.sort(rosterPoints);
	}
	
	//getters
	public ArrayList<Player> getRosterPoints(){
		return rosterPoints;	
	}
}


class PlayoffsGoals extends Player{
	//fields
	private ArrayList<Player> rosterGoals;
	
	//constructor
	PlayoffsGoals(){
		Player p = new Player(2);
		setRosterGoals();
	}
	
	//setters
	public void setRosterGoals(){
		rosterGoals = new ArrayList<Player>(getRoster());
		Collections.sort(rosterGoals);
	}
	
	//getters
	public ArrayList<Player> getRosterGoals(){
		return rosterGoals;	
	}
}


class PlayoffsAssists extends Player{
	//fields
	private ArrayList<Player> rosterAssists;
	
	//constructor
	PlayoffsAssists(){
		Player p = new Player(3);
		setRosterAssists();
	}
	
	//setters
	public void setRosterAssists(){
		rosterAssists = new ArrayList<Player>(getRoster());
		Collections.sort(rosterAssists);
	}
	
	//getters
	public ArrayList<Player> getRosterAssists(){
		return rosterAssists;	
	}
}


public class SortStatsV2{
	//constructor
	SortStatsV2(){
	}
	
	//prints an arrayList of playerStats
	public static void printPlayers(ArrayList<Player> roster){
		System.out.println("  POINTS:\tGOALS:\t\tASSISTS\t\tPLAYERS:  ");
		for(int i=(roster.size() - 1); i>=0; i--){
			System.out.println("  " + roster.get(i).getPoints() + "\t\t" + roster.get(i).getGoals() + "\t\t" + roster.get(i).getAssists() + "\t\t" + roster.get(i).getLastName());	
		}		
	}
	
	/**
	* a method that outputs a menu to select type of sorted stats to display on screen
	*/
	public static void userOptions(){
		System.out.println();
		System.out.println("*********************************************************");
		System.out.println("WELCOME TO 2018 STANLEY CUP PLAYOFFS STATS SORTER!");
		System.out.println("\nSelect a sort by option:\n1.) Points \n2.) Goals\n3.) Assists \n\n4.) Exit");
		System.out.println("\n*********************************************");
		
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter selection: ");
			int userChoice = Integer.parseInt(reader.readLine());	
			System.out.println();
				switch(userChoice){
					case 1: System.out.println("  You selected: Sort Washington Capitals' Stats by POINTS");
						PlayoffsPoints p = new PlayoffsPoints();
						SortStatsV2.printPlayers(p.getRosterPoints() );
						userOptions();
						break;
					case 2: System.out.println("  You selected: Sort Washington Capitals' Stats by GOALS");
						PlayoffsGoals g = new PlayoffsGoals();
						SortStatsV2.printPlayers(g.getRosterGoals() );
						userOptions();
						break;
					case 3: System.out.println("  You selected: Sort Washington Capitals' Stats by ASSISTS");
						PlayoffsAssists a = new PlayoffsAssists();
						SortStatsV2.printPlayers(a.getRosterAssists() );
						userOptions();
						break;
					case 4: System.out.print("  You selected: EXIT");
						System.exit(0);
						break;
					default: userOptions(); //reload menu bc invalid selection
						break;	
				}
		}
		catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e + "\nTry again!");
		userOptions();
		}
	}
	
	
	//main method
	public static void main(String[] args){
		userOptions();
	}
}