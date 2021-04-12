package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * How to print duplicate characters from String?
 */
public class DuplicateCharacters {
	public static void main(String[] args) {
		printDuplicateCharacters("Srishti");
		printDuplicateCharacters("A");
		printDuplicateCharacters("");
		printDuplicateCharacters("Java");
	}

	public static void printDuplicateCharacters(String str) {
		if (str == null) {
			System.out.println("NULL String");
			return;
		}
		if (str.isEmpty()) {
			System.out.println("Empty String");
		}
		if (str.length() == 1) {
			System.out.println("Single Char String");
		}
		char words[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : words) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		// print the map
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}

	}
}