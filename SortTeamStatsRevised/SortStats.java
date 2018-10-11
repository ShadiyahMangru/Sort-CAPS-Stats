import java.util.*;
import java.io.*;

class Player implements Comparable<Player>{
	//fields
	private String lastName;
	private int stat;
	
	//constructor
	Player(String ln, int s){
		lastName = ln;
		stat = s;
	}
	
	/**
	* a method that defines how to sort Players numerically by a stat
	* @param Player the player to which we are comparing
	*/
	@Override
    	public int compareTo(Player other) {
    		if (this.getStat() < other.getStat()) {
    			return -1;
    		}
    		if (this.getStat() == other.getStat()) { 
    			return 0;
    		}
    		return 1;
    	}
	
	//setters
	public void setLastName(String ln){
		lastName = ln;
	}
	
	public void setStat(int s){
		stat = s;	
	}
	
	//getters
	public String getLastName(){
		return lastName;	
	}
	
	public int getStat(){
		return stat;	
	}
}


class PlayoffsPoints{
	//fields
	private ArrayList<Player> rosterPoints;
	
	//constructor
	PlayoffsPoints(){
		setRosterPoints();
	}
	
	//setters
	public void setRosterPoints(){
		rosterPoints = new ArrayList<Player>();
		rosterPoints.add( new Player("Chiasson", 2) );
		rosterPoints.add( new Player("Ovechkin", 27) );
		rosterPoints.add( new Player("Burakovsky", 6) );
		rosterPoints.add( new Player("Connolly", 9) );
		rosterPoints.add( new Player("Orpik", 5) );
		rosterPoints.add( new Player("Stephenson", 7) );
		rosterPoints.add( new Player("Djoos", 1) );
		rosterPoints.add( new Player("Smith-Pelly", 8 ) );
		rosterPoints.add( new Player("Orlov", 8) );
		rosterPoints.add( new Player("Kuznetsov", 32) );
		rosterPoints.add( new Player("Jerabek", 1) );
		rosterPoints.add( new Player("Vrana", 8) );
		rosterPoints.add( new Player("Beagle", 8) );
		rosterPoints.add( new Player("Carlson", 20) );
		rosterPoints.add( new Player("Eller", 18) );
		rosterPoints.add( new Player("Niskanen", 9) );
		rosterPoints.add( new Player("Kempny", 5) );
		rosterPoints.add( new Player("Walker", 1) );
		rosterPoints.add( new Player("Backstrom", 23) );
		rosterPoints.add( new Player("Gersich", 0) );
		rosterPoints.add( new Player("Oshie", 21) );
		rosterPoints.add( new Player("Wilson", 15) );
		rosterPoints.add( new Player("Boyd", 0) );	
		Collections.sort(rosterPoints);
	}
	
	//getters
	public ArrayList<Player> getRosterPoints(){
		return rosterPoints;	
	}
}


class PlayoffsGoals{
	//fields
	private ArrayList<Player> rosterGoals;
	
	//constructor
	PlayoffsGoals(){
		setRosterGoals();
	}
	
	//setters
	public void setRosterGoals(){
		rosterGoals = new ArrayList<Player>();
		rosterGoals.add( new Player("Chiasson", 1) );
		rosterGoals.add( new Player("Ovechkin", 15) );
		rosterGoals.add( new Player("Burakovsky", 2) );
		rosterGoals.add( new Player("Connolly", 6) );
		rosterGoals.add( new Player("Orpik", 1) );
		rosterGoals.add( new Player("Stephenson", 2) );
		rosterGoals.add( new Player("Djoos", 0) );
		rosterGoals.add( new Player("Smith-Pelly", 7 ) );
		rosterGoals.add( new Player("Orlov", 2) );
		rosterGoals.add( new Player("Kuznetsov", 12) );
		rosterGoals.add( new Player("Jerabek", 0) );
		rosterGoals.add( new Player("Vrana", 3) );
		rosterGoals.add( new Player("Beagle", 2) );
		rosterGoals.add( new Player("Carlson", 5) );
		rosterGoals.add( new Player("Eller", 7) );
		rosterGoals.add( new Player("Niskanen", 1) );
		rosterGoals.add( new Player("Kempny", 2) );
		rosterGoals.add( new Player("Walker", 0) );
		rosterGoals.add( new Player("Backstrom", 5) );
		rosterGoals.add( new Player("Gersich", 0) );
		rosterGoals.add( new Player("Oshie", 8) );
		rosterGoals.add( new Player("Wilson", 5) );
		rosterGoals.add( new Player("Boyd", 0) );	
		Collections.sort(rosterGoals);
	}
	
	//getters
	public ArrayList<Player> getRosterGoals(){
		return rosterGoals;	
	}
}


class PlayoffsAssists{
	//fields
	private ArrayList<Player> rosterAssists;
	
	//constructor
	PlayoffsAssists(){
		setRosterAssists();
	}
	
	//setters
	public void setRosterAssists(){
		rosterAssists = new ArrayList<Player>();
		rosterAssists.add( new Player("Chiasson", 1) );
		rosterAssists.add( new Player("Ovechkin", 12) );
		rosterAssists.add( new Player("Burakovsky", 4) );
		rosterAssists.add( new Player("Connolly", 3) );
		rosterAssists.add( new Player("Orpik", 4) );
		rosterAssists.add( new Player("Stephenson", 5) );
		rosterAssists.add( new Player("Djoos", 1) );
		rosterAssists.add( new Player("Smith-Pelly", 1 ) );
		rosterAssists.add( new Player("Orlov", 6) );
		rosterAssists.add( new Player("Kuznetsov", 20) );
		rosterAssists.add( new Player("Jerabek", 1) );
		rosterAssists.add( new Player("Vrana", 5) );
		rosterAssists.add( new Player("Beagle", 6) );
		rosterAssists.add( new Player("Carlson", 15) );
		rosterAssists.add( new Player("Eller", 11) );
		rosterAssists.add( new Player("Niskanen", 8) );
		rosterAssists.add( new Player("Kempny", 3) );
		rosterAssists.add( new Player("Walker", 1) );
		rosterAssists.add( new Player("Backstrom", 18) );
		rosterAssists.add( new Player("Gersich", 0) );
		rosterAssists.add( new Player("Oshie", 13) );
		rosterAssists.add( new Player("Wilson", 10) );
		rosterAssists.add( new Player("Boyd", 0) );	
		Collections.sort(rosterAssists);
	}
	
	//getters
	public ArrayList<Player> getRosterAssists(){
		return rosterAssists;	
	}
}


public class SortStats{
	//constructor
	SortStats(){
	}
	
	//prints an arrayList of playerStats
	public static void printPlayers(ArrayList<Player> roster, String statType){
		System.out.println("  " + statType.toUpperCase() + ":\tPLAYERS:  ");
		for(int i=(roster.size() - 1); i>=0; i--){
			System.out.println("  " + roster.get(i).getStat() + "\t\t" + roster.get(i).getLastName());	
		}		
	}
	
	/**
	* a method that outputs a menu to select type of sorted stats to display on screen
	*/
	public static void userOptions(){
		PlayoffsPoints p = new PlayoffsPoints();
		PlayoffsGoals g = new PlayoffsGoals();
		PlayoffsAssists a = new PlayoffsAssists();
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
						SortStats.printPlayers(p.getRosterPoints(), "points");
						userOptions();
						break;
					case 2: System.out.println("  You selected: Sort Washington Capitals' Stats by GOALS");
						SortStats.printPlayers(g.getRosterGoals(), "goals");
						userOptions();
						break;
					case 3: System.out.println("  You selected: Sort Washington Capitals' Stats by ASSISTS");
						SortStats.printPlayers(a.getRosterAssists(), "assists");
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