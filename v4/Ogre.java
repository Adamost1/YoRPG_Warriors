//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Ogre extends Monster {
	
	
	public Ogre(String newName) {
		
		name = newName;
		life = 200;
		strength = (int)(Math.random() * 80) + 65; 
		defense = 50;
		attackR = 1;
			
	}
    public String about() {
	return "A medium health, medium damage Monster with nothing special";
    }
    
}
