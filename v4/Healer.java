//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13


public class Healer extends Protagonist{
    
    
    public Healer(String newName){

	name = newName;		
	life = 300;		
	strength = 110;		
	defense = 60;		
	attackR = 1.0;
    }

    double origAttack = 1.0;
    int origDefense = 60;

	

	//about() returns String that tells about the subclass 
    public String about() {
	return "A high health, low damage Protagonist focused on surviving longer";
    }
    
	/* specialize
	prepares the Protagonist to perform a special attack
	decreases defense attribute
	increases attack attribute */
	public void specialize() {		
		defense = 2 * origDefense;		
		attackR = origAttack / 2;		
	}
	
	/* normalize
	prepares the Protagonist to perform a normal attack
	resets defense attribute
	resets attack attribute */
	public void normalize() {		
		defense = 200;		
		attackR = 1.0;		
	}
	
}
