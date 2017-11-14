//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Protagonist extends Character{

	//extends makes Protagonist a SUBCLASS of Character, which means that it will inherit
	//all the instance variables and methods from class Character
	
//instance variables

		protected double origAttack = attackR;
		protected int origDefense = defense;
	
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
		defense = new Integer(origDefense);		
		attackR = new Double(origAttack);		
	}
	

}//end class