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
 * 	  
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

	public static int damage() {
		Scanner userInput = new Scanner (System.in);
		System.out.println("What are your " + pokemon + "'s stats?");
		
		
	}
	public static void main(String[] args) {
		battlestart();
	}
}
