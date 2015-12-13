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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

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

			if (options.isEmpty()) {

				return chain;

			} else {

				HashSet<String> clone = (HashSet<String>) options.clone();

				for (String i : clone) { // sometimes I don't know why my code
											// works or not works

					ArrayList<String> growingChain = new ArrayList<String>();

					growingChain.addAll(chain);

					growingChain.add(i);

					allChains.add(find(growingChain));

				}

				ArrayList<String> maxList = Collections.max(allChains, new Comparator<ArrayList<String>>() {
					public int compare(ArrayList<String> list1, ArrayList<String> list2) {						
						return Integer.compare(list1.size(), list2.size());
					}					
				});

				return maxList;

			}

		} catch (NullPointerException e) {

			return chain;
		}

	}

	public static void main(String[] args) {

		initializeHashMap();
		
		makeHashMap();

		ArrayList<ArrayList<String>> allWordsMaxes = new ArrayList<ArrayList<String>>();

		for (String i : pokemonArray) {

			ArrayList<String> word = new ArrayList<String>();

			word.add(i);

			allWordsMaxes.add(find(word));

			
		}
		
		System.out.println(allWordsMaxes);

		ArrayList<String> longest = allWordsMaxes.stream().max(Comparator.comparingInt(ArrayList::size)).get();

		System.out.println(longest);
		
		System.out.println(longest.size());

	}
}