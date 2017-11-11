//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW28 -- Ye Olde Role Playing Game
//2017-11-08

public class Protagonist extends Character{
	
	
	// attribute initializiation
	
	public String name;
	
	
	/* constructor
	takes String input to name the Protagonist
	initializes all attributes (125, 100, 40, 0.4)	*/
	public Protagonist( String newName ) { 	
		name = newName;		
		life = 125;		
		strength = 100;		
		defense = 40;		
		attackR = 0.4;		
	}
	

	//accessors	

	
	/* getName
	returns value of name attribute */
	public String getName() {		
		return name;		
	}
	
	
	//mutators	
	
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
		defense = 40;		
		attackR = 0.4;		
	}
	

}