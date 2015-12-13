import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

/*
A certain childrens game involves starting with a word in a particular category. Each participant in
turn says a word, but that word must begin with the final letter of the previous word. 
Once a word has been given, it cannot be repeated. If an opponent cannot give a word in the category, 
they fall out of the game. For example, with "animals" as the category,
Child 1: dog 
Child 2: goldfish
Child 1: hippopotamus
Child 2: snake
Your task in this exercise is as follows: Take the following selection of 70 English Pokemon names 
(extracted from Wikipedia's list of Pokemon) and generate the/a sequence with the highest possible
number of Pokemon names where the subsequent name starts with the final letter of the preceding name.
No Pokemon name is to be repeated.
audino bagon baltoy banette bidoof braviary bronzor carracosta charmeleon
cresselia croagunk darmanitan deino emboar emolga exeggcute gabite
girafarig gulpin haxorus heatmor heatran ivysaur jellicent jumpluff kangaskhan
kricketune landorus ledyba loudred lumineon lunatone machamp magnezone mamoswine
nosepass petilil pidgeotto pikachu pinsir poliwrath poochyena porygon2
porygonz registeel relicanth remoraid rufflet sableye scolipede scrafty seaking
sealeo silcoon simisear snivy snorlax spoink starly tirtouga trapinch treecko
tyrogue vigoroth vulpix wailord wartortle whismur wingull yamask
*/

public class Exercise45 {

	private static String pokemon = "audino bagon baltoy banette bidoof braviary bronzor carracosta charmeleon"
			+ " cresselia croagunk darmanitan deino emboar emolga exeggcute gabite girafarig gulpin haxorus"
			+ " heatmor heatran ivysaur jellicent jumpluff kangaskhan kricketune landorus ledyba loudred"
			+ " lumineon lunatone machamp magnezone mamoswine nosepass petilil pidgeotto pikachu pinsir"
			+ " poliwrath poochyena porygon2 porygonz registeel relicanth remoraid rufflet sableye"
			+ " scolipede scrafty seaking sealeo silcoon simisear snivy snorlax spoink starly tirtouga"
			+ " trapinch treecko tyrogue vigoroth vulpix wailord wartortle whismur wingull yamask";

	private static String[] pokemonArray = pokemon.split(" ");

	private static HashMap<Character, HashSet<String>> map = new HashMap<Character, HashSet<String>>();

	public static void initializeHashMap() {

		for (String i : pokemonArray) {

			char first_character = i.charAt(0);

			map.put(first_character, new HashSet<String>());

		}
	}

	public static void makeHashMap() {

		for (String i : pokemonArray) {

			char first_character = i.charAt(0);

			map.get(first_character).add(i);
		}

	}

	public static ArrayList<String> find(ArrayList<String> chain) {

		ArrayList<ArrayList<String>> allChains = new ArrayList<ArrayList<String>>();

		String word = chain.get(chain.size() - 1);

		Character last_character = word.charAt(word.length() - 1);

		HashSet<String> options = map.get(last_character);

		try {

			options.removeAll(chain);
			
			System.out.println(options);
			
			System.out.println(chain);
			
			System.out.println(allChains);
			
			System.out.println();

			for (String i : options) {

				ArrayList<String> growingChain = new ArrayList<String>();

				growingChain.addAll(chain);

				growingChain.add(i);

				allChains.add(find(growingChain));

			}

			return allChains.stream().max(Comparator.comparingInt(ArrayList::size)).get();

		} catch (NullPointerException e) {

			return chain;
		}

	}

	public static void main(String[] args) {

		initializeHashMap();
		makeHashMap();

		ArrayList<String> a = new ArrayList<String>();
		a.add("bagon");

		System.out.println(find(a));

	}
}