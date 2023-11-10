import java.util.*;

/*  Sorting and Searching using Hashmap 
 *  by Spencer Vedenoff, 11/10/2023
 * 
 * This Java application was coded for my Study.com course CS201 Data Structures & Algorithms
 * 
 * Revise the code to store the pairs of each state and its capital in a Map using the HashMap function.
 * Display the content of the Map, then use the TreeMap class to sort the map while using a binary search tree
 * for storage. Next, the program should prompt the user to enter a state and it should then display the capital
 * for the state.
 */

public class Main {

	public static void main(String[] args) {

		// Hash, sc, tree, and scanline Variables
		HashMap<String,String> hash = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		TreeMap<String,String> tree = new TreeMap<String, String>();
		String scanner;

		String[][] SCAPS = {
			{"Alabama","Montgomery"},
			{"Alaska","Juneau"},
			{"Arizona","Phoenix"},
			{"Arkansas","Little Rock"},
			{"California","Sacramento"},
			{"Colorado","Denver"},
			{"Connecticut","Hartford"},
			{"Delaware","Dover"},
			{"Florida","Tallahassee"},
			{"Georgia","Atlanta"},
			{"Hawaii","Honolulu"},
			{"Idaho","Boise"},
			{"Illinois","Springfield"},
			{"Indiana","Indianapolis"},
			{"Iowa","Des Moines"},
			{"Kansas","Topeka"},
			{"Kentucky","Frankfort"},
			{"Louisiana","Baton Rouge"},
			{"Maine","Augusta"},
			{"Maryland","Annapolis"},
			{"Massachusetts","Boston"},
			{"Michigan","Lansing"},
			{"Minnesota","St. Paul"},
			{"Mississippi","Jackson"},
			{"Missouri","Jefferson City"},
			{"Montana","Helena"},
			{"Nebraska","Lincoln"},
			{"Nevada","Carson City"},
			{"New Hampshire","Concord"},
			{"New Jersey","Trenton"},
			{"New Mexico","Santa Fe"},
			{"New York","Albany"},
			{"North Carolina","Raleigh"},
			{"North Dakota","Bismarck"},
			{"Ohio","Columbus"},
			{"Oklahoma","Oklahoma City"},
			{"Oregon","Salem"},
			{"Pennsylvania","Harrisburg"},
			{"Rhode Island","Providence"},
			{"South Carolina","Columbia"},
			{"South Dakota","Pierre"},
			{"Tennessee","Nashville"},
			{"Texas","Austin"},
			{"Utah","Salt Lake City"},
			{"Vermont","Montpelier"},
			{"Virginia","Richmond"},
			{"Washington","Olympia"},
			{"West Virginia","Charleston"},
			{"Wisconsin","Madison"},
			{"Wyoming","Cheyenne"}
		};
		
		//  For Loop to convert the 2D array into a HashMap
		for (int i = 0; i < 50; i++) {
			hash.put(SCAPS[i][0], SCAPS[i][1]);
		}
		
		// Print statements to interact with end user
		System.out.println("Hello again! I hope you had fun during the previous game.");
		System.out.println("I have stored all the states and capitals in a HashMap. Here they are:");
		System.out.println(hash + "\n");
		System.out.println("You'll notice this list is unsorted and challenging to search! Let's use a TreeMap:");
		// This Copies the HashMap data into a TreeMap structure for searching and sorting
		tree.putAll(hash);		
		System.out.println(tree + "\n");
		System.out.println("There, that's much better. The TreeMap automatically sorted by natural order (alphabetic).");
		System.out.println("Now, if you type the name of any state I will tell you its capital city.\n");
		// Do loop will allow the user to keep using program for as long as they'd like
		do {
			System.out.println("Enter state name (Note: case sensitive) or type \"exit\" to quit:  ");
			scanner = scan.nextLine();
			if (tree.containsKey(scanner)) {
				System.out.println("The capital of " + scanner + " is: " + tree.get(scanner));
			} else {
				// This is the exit condition for if the user wants to quit
				if (scanner.equals("exit")) {
					System.out.println("Ok. Thanks for playing!");	
				} else {
					// This handles an unknown input from the end user
					System.out.println("Sorry, I don't know a state named \"" + scanner + "\"");
				}
			}
		} while (! scanner.equals("exit"));		

		scan.close();
		
	}
}