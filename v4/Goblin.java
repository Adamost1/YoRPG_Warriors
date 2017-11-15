//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Goblin extends Monster {
	
	
	public Goblin(String newName) {
		
		name = newName;
		life = 150;
		strength = (int)(Math.random() * 100) + 80; 
		defense = 20;
		attackR = 1;
		
	}
    public static String about() {
	return "A low health, high damage Monster focused on killing the Protagonist quickly";
    }
    	
}
