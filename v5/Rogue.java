//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Rogue extends Protagonist{
    
    public Rogue(String newName){

	name = newName;		
	life = 170;		
	strength = 200;		
	defense = 50;		
	attackR = 1.0;
	potionCount = 5;
    }

    double origAttack = 1.0;
    int origDefense = 50;

	
	//about() returns String that tells about the subclass 

    public String about() {
	return "A low health, high damage Protagonist focused on killing monsters quickly";
    }

    /* specialize
	prepares the Protagonist to perform a special attack
	decreases defense attribute
	increases attack attribute */
	public void specialize() {		
		defense = origDefense / 2 ;		
		attackR = origAttack * 2;		
	}
	
	/* normalize
	prepares the Protagonist to perform a normal attack
	resets defense attribute
	resets attack attribute */
	public void normalize() {		
		defense = 50;		
		attackR = 1.0;		
	}
}
