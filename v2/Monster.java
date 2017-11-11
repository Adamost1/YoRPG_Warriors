//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW28 -- Ye Olde Role Playing Game
//2017-11-08

public class Monster extends Character{
	
	// attribute initializiation
	
	public String name;
	
	
	/* constructor
	sets strength to a random number
	initializes all other attributes (foe, 150, 20, 1)	*/
	public Monster(){
		
		name = "foe";
		
		life = 150;
		
		strength = (int)(Math.random() * 45) + 20;
		
		defense = 20;
		
		attackR = 1;
		
	}
	
	
	//accessors

	
	/* getName
	returns value of name attribute */
	public String getName() {
		
		return name;
		
	}
	
	

}