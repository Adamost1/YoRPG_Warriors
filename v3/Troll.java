//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Troll extends Monster {
	
	
	public Troll(String newName) {
		
		name = newName;
		life = 300;
		strength = (int)(Math.random() * 65) + 40; 
		defense = 100;
		attackR = 1;
		
	}
    public static String about() {
	return "A high health, low damage Monster focused on surviving against the Protagonist";
    }
    
}
