/****
 * Grading Comments:   11/25
 *  Obviously, you didn't finish by Friday evening's deadline.  I'll look again and regrade Monday 
 *  evening after 7pm.  But for now, I'll have to grade it as-is.
 *  RUBRIC Unit 3 = 25 pts
 * 10 pts - Correct Output (must compile and run)   5/10
 * 5 pts - Proper Use of Scanner, and decent User Interface  3/5
 * 3 pts - Proper Use of Return       0/2
 * 3 pts - Proper User of Parameter   0/2
 * 2 pts - Pseudocode and comments    1/2   Good with what you finished.
 * 2 pts - Consistent Layout and Style following Style Guidelines  2/2
 */

/*		Pseudo-code:
 * ----------------------------------
 * method battlestart():
 * 	  Announce the battle starting
 * 	  Ask for Pokemon name from user
 * ----------------------------------
 * method damage()
 * 	  damage = ((2 * lvl + 10) / 250 + (atk / def) * (base + 2)) * modifier
 * 	  modifier = STAB * rng (0.85, 1.0)
 * 	  Ask for user input in stats:
 * 		Level:
 *		Attack:
 *		Defense:
 *		Base:
 * 		STAB:
 *		HP:
 * 	  return HP
 * ----------------------------------
 * method statsTable()
 * 	  print name
 *    print hp
 */


import java.util.*;

public class PokemonBattle {

	public static String battlestart() {
		Scanner userInput = new Scanner (System.in);
		System.out.println("A wild Zebstrika appeared!");
		System.out.println();
		
		System.out.print("Which Pokemon do you choose?  ");
		String pokemon = userInput.nextLine();
		
		System.out.println("You chose " + pokemon + "!");
		System.out.println();
		
		System.out.println("It's a battle between " + pokemon + " and Zebstrika");
		return pokemon;
	}

	public static double damage() {
		Scanner userInput = new Scanner (System.in);
		System.out.println("What are your pokeomon's stats?");
		System.out.print("Level:  ");
		int lvl = userInput.nextInt();
		
		System.out.print("Attack:  ");
		int atk = userInput.nextInt();
		
		System.out.print("Defense:  ");
		int def = userInput.nextInt();
		
		System.out.print("Base:  ");
		int base = userInput.nextInt();
		
		System.out.print("STAB:  ");
		int stab = userInput.nextInt();
		
		System.out.print("HP:  ");
		int hp = userInput.nextInt();
		
		System.out.println();
		
		double dam = ((2 * lvl + 10) / (250) + (atk/def) * base + 2) * (0.85 + Math.random() * (0.15) * stab);
		hp = hp - (int)dam;
		System.out.println("Your pokeomn took " + (int)dam + " points of damage.");
		System.out.println("Your HP is now " + hp + ".");
		return hp;
	}
	
	public static void statsTable(String pokemon, double hp) {
		System.out.println("Name:   " + pokemon);
		System.out.println("HP:     " + hp);
	}
	public static void main(String[] args) {
		statsTable(battlestart(), damage());
	}
}
