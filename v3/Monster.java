//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Monster extends Character{
	
	//extends makes Monster a SUBCLASS of Character, which means that it will inherit
	//all the instance variables and methods from class Character

	/* constructor
	sets strength to a random number
	initializes all attributes (instance variables)	*/
	public Monster(){
		
		name = "foe";
		
		life = 150;
		
		strength = (int)(Math.random() * 45) + 20; 
		
		defense = 20;
		
		attackR = 1;
		
	}	

}//end class