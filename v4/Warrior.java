//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Warrior extends Protagonist{
    
    public Warrior(String newName){
	name = newName;		
	life = 150;		
	strength = 100;		
	defense = 100;		
	attackR = 1.0;	
    }
    public static String about() {
	return "A medium health, medium damage Protagonist with no special points";
    }
    /* specialize
	prepares the Protagonist to perform a special attack
	decreases defense attribute
	increases attack attribute */
	public void specialize() {		
		defense /= 2;		
		attackR *= 2;		
	}
	
	/* normalize
	prepares the Protagonist to perform a normal attack
	resets defense attribute
	resets attack attribute */
	public void normalize() {		
		defense = new Integer(origDefense);		
		attackR = new Double(origAttack);		
	}

}