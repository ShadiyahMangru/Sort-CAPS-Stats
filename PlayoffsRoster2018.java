import java.util.*;

public class PlayoffsRoster2018{

/**
* The PlayoffsRoster2018 class maintains the team roster for the 2018 playoffs.
*
* @author  Shadiyah Mangru
* @version 1.0
* @since   September 2018
*/	
	
	
	private ArrayList<Player> roster = new ArrayList<Player>();
	
	public PlayoffsRoster2018(){
		setRoster();
	}
	
	public void setRoster(){
		Player kuznetsov = new Player("Evgeny", "Kuznetsov", 12, 89);
		Player ovechkin = new Player("Alex", "Ovechkin", 15, 99);
		Player backstrom = new Player("Nicklas", "Backstrom", 5, 36);
		Player oshie = new Player("T.J.", "Oshie", 8, 55);
		Player carlson = new Player("John", "Carlson", 5, 80);
		Player eller = new Player("Lars", "Eller", 7, 52);
		Player wilson = new Player("Tom", "Wilson", 5, 34);
		Player connolly = new Player("Brett", "Connolly", 6, 32);
		Player niskanen = new Player("Matt", "Niskanen", 1, 32);
		Player smithPelly = new Player("Devante", "Smith-Pelly", 7, 29);
		Player vrana = new Player("Jakub", "Vrana", 3, 39);
		Player orlov = new Player("Dmitry", "Orlov", 2, 48);
		Player beagle = new Player("Jay", "Beagle", 2, 12);
		Player stephenson = new Player("Chandler", "Stephenson", 2, 19);
		Player burakovsky = new Player("Andre", "Burakovsky", 2, 12);
		Player kempny = new Player("Michal", "Kempny", 2, 39);
		Player orpik = new Player("Brooks", "Orpik", 1, 17);
		Player chiasson = new Player("Alex", "Chiasson", 1, 14);
		Player djoos = new Player("Christian", "Djoos", 0, 16);
		Player jerabek = new Player("Jacob", "Jerabek", 0, 3);
		Player walker = new Player("Nathan", "Walker", 0, 1);
		Player gersich = new Player("Shane", "Gersich", 0, 2);
		Player boyd = new Player("Travis", "Boyd", 0, 1);
		
		roster.add(kuznetsov);
		roster.add(ovechkin);
		roster.add(backstrom);
		roster.add(oshie);
		roster.add(carlson);
		roster.add(eller);	
		roster.add(wilson);
		roster.add(connolly);
		roster.add(niskanen);
		roster.add(smithPelly);
		roster.add(vrana);
		roster.add(orlov);
		roster.add(beagle);
		roster.add(stephenson);
		roster.add(burakovsky);
		roster.add(kempny);
		roster.add(orpik);
		roster.add(chiasson);
		roster.add(djoos);
		roster.add(jerabek);
		roster.add(walker);
		roster.add(gersich);
		roster.add(boyd);	
	}
	
	public ArrayList<Player> getRoster(){
		return roster;	
	}
	
	public void printRoster(){
		for(int i=0; i<roster.size(); i++){
			System.out.println(roster.get(i).statsFormat(roster.get(i)));	
		}	
	}
}