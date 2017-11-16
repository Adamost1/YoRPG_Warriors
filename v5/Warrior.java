//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Warrior extends Protagonist{
    
    public Warrior(String newName){
	name = newName;		
	life = 200;		
	strength = 150;		
	defense = 55;		
	attackR = 1.0;
	potionCount = 3;
	    
    }

    double origAttack = 1.0;
    int origDefense = 55;

    
	//about() returns String that tells about the subclass 
    public String about() {
	return "A medium health, medium damage Protagonist with no special points";
    }
    
    /* specialize
	prepares the Protagonist to perform a special attack
	decreases defense attribute
	increases attack attribute */
	public void specialize() {	
		defense = (int) (origDefense * 1.5) ;		
		attackR = 1.5 * origAttack;		
	}
	
	/* normalize
	prepares the Protagonist to perform a normal attack
	resets defense attribute
	resets attack attribute */
	public void normalize() {		
		defense = 100;		
		attackR = 1.0;		
	}


}
