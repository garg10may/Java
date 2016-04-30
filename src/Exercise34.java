/*
Write a procedure char_freq_table() that, when run in a terminal, accepts a file name from the user,
builds a frequency listing of the characters contained in the file,
and prints a sorted and nicely formatted character frequency table to the screen.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise34 {
	
	public static boolean ASC = true;
    public static boolean DESC = false;

	   private static Map<Character, Integer> sortByComparator(Map<Character, Integer> unsortMap, final boolean order)
	    {

	        List<Entry<Character, Integer>> list = new LinkedList<Entry<Character, Integer>>(unsortMap.entrySet());
	        
	        System.out.println(list);

	        // Sorting the list based on values, can also be done based on keys but in that case using TreeMap would also work
	        Collections.sort(list, new Comparator<Entry<Character, Integer>>()
	        {
	            public int compare(Entry<Character, Integer> o1,
	                    Entry<Character, Integer> o2)
	            {
	                if (order)
	                {
	                    return o1.getValue().compareTo(o2.getValue());
	                }
	                else
	                {
	                    return o2.getValue().compareTo(o1.getValue());

	                }
	            }
	        });

	        // Maintaining insertion order with the help of LinkedList
	        Map<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
	        for (Entry<Character, Integer> entry : list)
	        {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	        return sortedMap;
	    }

	public static Map<Character, Integer> char_freq_table(String x) throws IOException {

		String line;

		Map<Character, Integer> m = new HashMap<Character, Integer>();

		BufferedReader br = new BufferedReader(new FileReader(x));

		while ((line = br.readLine()) != null) {

			//Exercise21.initialize_map(line, m);

			for (Character c : line.toCharArray()) {

				if (m.get(c) != null) {
					
					m.put(c, m.get(c) + 1);
					
				} else {
					
					m.put(c, 1);
				}
			}
		}

		br.close();

		Map<Character, Integer> sortedMapASC = sortByComparator(m,DESC);
		
		return sortedMapASC;
		
		
	};

	public static void main(String[] args) throws IOException {

		Map<Character, Integer> map = char_freq_table("C:\\unixdict.txt");
		
		for ( Entry<Character, Integer> entry: map.entrySet()) {
			
			
			System.out.println(entry.getValue() + " : " + entry.getKey());
		}
		
		

	}
}