//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public abstract class Protagonist extends Character{

	//extends makes Protagonist a SUBCLASS of Character, which means that it will inherit
	//all the instance variables and methods from class Character

  
	/* specialize
	prepares the Protagonist to perform a special attack
	decreases defense attribute
	increases attack attribute */
	public abstract void specialize();		
	
	/* normalize
	prepares the Protagonist to perform a normal attack
	resets defense attribute
	resets attack attribute */
	public abstract void normalize();


	public abstract String about();
	

}//end class