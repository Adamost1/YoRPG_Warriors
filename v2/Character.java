//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW28 -- Ye Olde Role Playing Game
//2017-11-08

public class Character {
	
	
	// attribute initializiation
	
	public int life, strength, defense;
	
	public double attackR;	
	
	
	public boolean isAlive(){
		return life > 0;
	}

	public int getDefense(){
		return defense;
	}

	public void lowerHP(int damage){
		life -= damage;
	} 

	public int attack(Character enemy){	
		int dmg = (int) (strength * attackR) - enemy.getDefense();		
		if(dmg < 0) {
			dmg = 0;
		}		
		enemy.lowerHP( dmg );		
		return dmg;		
	}

}