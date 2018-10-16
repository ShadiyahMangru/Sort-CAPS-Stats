public class HockeyPlayerV2{
	//fields
	private String lastName;
	private String position;
	
	//constructors
	public HockeyPlayerV2(){
	}
	
	public HockeyPlayerV2(String lastName, String position){
		this.lastName = lastName;
		this.position = position;
	}
	
	public HockeyPlayerV2(HockeyPlayerV2 hp){
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
		
		HockeyPlayerV2 ov = new HockeyPlayerV2("Ovechkin", "Forward");
		Skaters ovechkin = new Skaters(ov, 49, 38, 87, 3);
		Forward ovechkinA = new Forward(ovechkin, true, false, false);
		System.out.println(ovechkinA.printPositionDetails());
		
		HockeyPlayerV2 b = new HockeyPlayerV2("Backstrom", "Forward");
		Skaters backstrom = new Skaters(b, 21, 50, 71, 5);
		Forward backstromN = new Forward(backstrom, false, false, true);
		System.out.println(backstromN.printPositionDetails());
		
		HockeyPlayerV2 o = new HockeyPlayerV2("Oshie", "Forward");
		Skaters oshie = new Skaters(o, 18, 29, 47, 2);
		Forward oshieTJ = new Forward(oshie, false, true, false);
		System.out.println(oshieTJ.printPositionDetails());
		
		HockeyPlayerV2 h = new HockeyPlayerV2("Holtby", "Goalie");
		System.out.println(h.printPositionDetails());
		
		HockeyPlayerV2 c = new HockeyPlayerV2("Carlson", "Defense");
		Skaters carlson = new Skaters(c, 15, 53, 68, 0);
		System.out.println(carlson.printPositionDetails());
	}
}

class Goalie extends HockeyPlayerV2{
	//constructor
	public Goalie(){	
	}
}

class Skaters extends HockeyPlayerV2{
	//fields
	private int goals;
	private int assists;
	private int points;
	private int plusMinus;
	
	//constructors
	public Skaters(){
	}
	
	public Skaters(String lastName, String position, int goals, int assists, int points, int plusMinus){
		super(lastName, position);
		this.goals = goals;
		this.assists = assists;
		this.points = points;
		this.plusMinus = plusMinus;
	}
	
	public Skaters(HockeyPlayerV2 hp, int goals, int assists, int points, int plusMinus){
		super(hp);
		this.goals = goals;
		this.assists = assists;
		this.points = points;
		this.plusMinus = plusMinus;
	}
	
	public Skaters(Skaters s){
		this(s.getLastName(), s.getPosition(), s.goals, s.assists, s.points, s.plusMinus);	
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

class Forward extends Skaters{
	//fields
	private boolean leftWing;
	private boolean rightWing;
	private boolean center;
	
	//constructors
	public Forward(){
	}
	
	public Forward(String lastName, String position, int goals, int assists, int points, int plusMinus, boolean leftWing, boolean rightWing, boolean center){
		super(lastName, position, goals, assists, points, plusMinus);
		this.leftWing = leftWing;
		this.rightWing = rightWing;
		this.center = center;
	}
	
	public Forward(Skaters s, boolean leftWing, boolean rightWing, boolean center){
		super(s);
		this.leftWing = leftWing;
		this.rightWing = rightWing;
		this.center = center;
	}
	
	//print
	@Override
	public String printPositionDetails(){
		String pos = "";
		if(leftWing == true){
			pos = "Left Wing";	
		}
		else if(rightWing == true){
			pos = "Right Wing";	
		}
		else{
			pos = "Center";	
		}
		
		return "Name: " + super.getLastName() + "\tPosition: " + super.getPosition() + ", " + pos + "\tGoals: " + super.getGoals() + "\tAssists: " + super.getAssists() + "\tPoints: " + super.getPoints() + "\t+/-: " + super.getPlusMinus();
	}
	
}

class Defense extends Skaters{
	//constructor
	public Defense(){	
	}
}