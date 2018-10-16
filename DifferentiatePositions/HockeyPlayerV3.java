public class HockeyPlayerV3{
	//fields
	private String lastName;
	private String position;
	
	//constructors
	public HockeyPlayerV3(String lastName, String position){
		this.lastName = lastName;
		this.position = position;
	}
	
	public HockeyPlayerV3(HockeyPlayerV3 hp){
		this(hp.lastName, hp.position);
	}
	
	//setters
	public void setLastName(String lastName){
		this.lastName = lastName;	
	}
	
	public void setPosition(String position){
		this.position = position;	
	}
	
	//getters
	public String getLastName(){
		return lastName;	
	}
	
	public String getPosition(){
		return position;	
	}
	
	//print
	public String printPositionDetails(){
		return "\nName: " + lastName + "\tPosition: " + position;
	}
	
	//main method
	public static void main(String... args){
		System.out.println("************************************************");
		System.out.println("SOME 2017-2018 REGULAR SEASON STATS:\n");
		
		HockeyPlayerV3 ov = new HockeyPlayerV3("Ovechkin", "Forward, LW");
		Skaters ovechkin = new Skaters(ov, 49, 38, 87, 3);
		System.out.println(ovechkin.printPositionDetails());
		
		HockeyPlayerV3 b = new HockeyPlayerV3("Backstrom", "Forward, C");
		Skaters backstrom = new Skaters(b, 21, 50, 71, 5);
		System.out.println(backstrom.printPositionDetails());
		
		HockeyPlayerV3 o = new HockeyPlayerV3("Oshie", "Forward, RW");
		Skaters oshie = new Skaters(o, 18, 29, 47, 2);
		System.out.println(oshie.printPositionDetails());
		
		HockeyPlayerV3 c = new HockeyPlayerV3("Carlson", "Defense");
		Skaters carlson = new Skaters(c, 15, 53, 68, 0);
		System.out.println(carlson.printPositionDetails());
		
		HockeyPlayerV3 h = new HockeyPlayerV3("Holtby", "Goalie");
		Goalies holtby = new Goalies(h, 1648, 153, 1495);
		System.out.println(holtby.printPositionDetails());
	}
}

class Goalies extends HockeyPlayerV3{
	//fields
	private int shotsAgainst;
	private int goalsAgainst;
	private int saves;
	
	//constructors
	public Goalies(String lastName, String position, int shotsAgainst, int goalsAgainst, int saves){
		super(lastName, position);
		this.shotsAgainst = shotsAgainst;
		this.goalsAgainst = goalsAgainst;
		this.saves = saves;
	}
	
	public Goalies(HockeyPlayerV3 hp, int shotsAgainst, int goalsAgainst, int saves){
		super(hp);
		this.shotsAgainst = shotsAgainst;
		this.goalsAgainst = goalsAgainst;
		this.saves = saves;
	}
	
	//setters
	public void setShotsAgainst(int shotsAgainst){
		this.shotsAgainst = shotsAgainst;	
	}
	
	public void setGoalsAgainst(int goalsAgainst){
		this.goalsAgainst = goalsAgainst;	
	}
	
	public void setSaves(int saves){
		this.saves = saves;	
	}
	
	//getters
	public int getShotsAgainst(){
		return shotsAgainst;	
	}
	
	public int getGoalsAgainst(){
		return goalsAgainst;	
	}
	
	public int getSaves(){
		return saves;	
	}
	
	//print
	@Override
	public String printPositionDetails(){
		return super.printPositionDetails() + "\tShots Against: " + shotsAgainst + "\tGoals Against: " + goalsAgainst + "\tSaves: " + saves;
	}
}

class Skaters extends HockeyPlayerV3{
	//fields
	private int goals;
	private int assists;
	private int points;
	private int plusMinus;
	
	//constructors
	public Skaters(String lastName, String position, int goals, int assists, int points, int plusMinus){
		super(lastName, position);
		this.goals = goals;
		this.assists = assists;
		this.points = points;
		this.plusMinus = plusMinus;
	}
	
	public Skaters(HockeyPlayerV3 hp, int goals, int assists, int points, int plusMinus){
		super(hp);
		this.goals = goals;
		this.assists = assists;
		this.points = points;
		this.plusMinus = plusMinus;
	}
	
	//setters
	public void setGoals(int goals){
		this.goals = goals;
	}
	
	public void setAssists(int assists){
		this.assists = assists;	
	}
	
	public void setPoints(int points){
		this.points = points;	
	}
	
	public void setPoints(int goals, int assists){
		points = goals + assists;	
	}
	
	public void setPoints(){
		points = goals + assists;	
	}
	
	public void setPlusMinus(int plusMinus){
		this.plusMinus = plusMinus;	
	}
	
	//getters
	public int getGoals(){
		return goals;	
	}
	
	public int getAssists(){
		return assists;
	}	
	
	public int getPoints(){
		return points;	
	}
	
	public int getPlusMinus(){
		return plusMinus;	
	}
	
	//print
	@Override
	public String printPositionDetails(){
		return super.printPositionDetails() + "\tGoals: " + goals + "\tAssists: " + assists + "\tPoints: " + points + "\t+/-: " + plusMinus;
	}
}