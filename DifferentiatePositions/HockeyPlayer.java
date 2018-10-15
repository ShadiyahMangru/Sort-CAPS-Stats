public class HockeyPlayer{
	//fields
	private String lastName;
	private String position;
	
	//constructors
	public HockeyPlayer(){
	}
	
	public HockeyPlayer(String lastName, String position){
		this.lastName = lastName;
		this.position = position;
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
	public void printPositionDetails(HockeyPlayer hp){
		System.out.println("Name: " + hp.lastName + "\tPosition: " + hp.position);	
	}
	
	//main method
	public static void main(String... args){
		HockeyPlayer ov = new HockeyPlayer("Ovechkin", "Forward");
		ov.printPositionDetails(ov);
		Forward ovechkin = new Forward("Ovechkin", "Forward", true, false, false);
		ovechkin.printPositionDetails(ovechkin);
		
		HockeyPlayer b = new HockeyPlayer("Backstrom", "Forward");
		b.printPositionDetails(b);
		Forward backstrom = new Forward("Backstrom", "Forward", false, false, true);
		backstrom.printPositionDetails(backstrom);
		
		HockeyPlayer o = new HockeyPlayer("Oshie", "Forward");
		o.printPositionDetails(o);
		Forward oshie = new Forward("Oshie", "Forward", false, true, false);
		oshie.printPositionDetails(oshie);
		
		HockeyPlayer h = new HockeyPlayer ("Holtby", "Goalie");
		h.printPositionDetails(h);
		
		HockeyPlayer c = new HockeyPlayer("Carlson", "Defense");
		c.printPositionDetails(c);
	}
}

class Forward extends HockeyPlayer{
	//fields
	private boolean leftWing;
	private boolean rightWing;
	private boolean center;
	
	//constructor
	public Forward(String lastName, String position, boolean leftWing, boolean rightWing, boolean center){
		super(lastName, position);
		this.leftWing = leftWing;
		this.rightWing = rightWing;
		this.center = center;
	}
	
	//print (overload)
	public void printPositionDetails(Forward pl){
		String pos = "";
		if(pl.leftWing == true){
			pos = "Left Wing";	
		}
		else if(pl.rightWing == true){
			pos = "Right Wing";	
		}
		else{
			pos = "Center";	
		}
		System.out.println("Name: " + pl.getLastName() + "\tPosition: " + pl.getPosition() + ", " + pos);
	}
	
}



class Goalie extends HockeyPlayer{

	


}



class Defense extends HockeyPlayer{




}