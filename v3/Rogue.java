//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Rogue extends Protagonist{
    
    public Rogue(String newName){

	name = newName;		
	life = 50;		
	strength = 150;		
	defense = 75;		
	attackR = 1.0;	
    }
    public static String about() {
	return "A low health, high damage Protagonist focused on killing monsters quickly";
    }
    
}
