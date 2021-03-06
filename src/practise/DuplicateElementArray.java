package practise;
//WAP to find duplicate element in an array
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// Compare each element with other(worst approach)
		String names[] = { "Java", "Javascript", "Ruby", "C", "Python", "Java" };
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("duplicate element is " + names[i]);
				}
			}
		}
		// 2. HashSet--It stores unique value
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("duplicate element is " + name);
			}
		}
		// Using HashMap
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);

			} else {
				storeMap.put(name, ++count);
			}
			Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				if (entry.getValue() > 1) {
					System.out.println("duplicate element is " + entry.getKey());
				}
			}
		}
	}
}
