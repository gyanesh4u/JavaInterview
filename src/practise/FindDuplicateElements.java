package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		String infra[] = { "Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "SauceLabs", "Azure", "GCP" };
		// 1. brute force
		// 2. HashSet
		// 3. HashMap<K,V>
		// 4. Streams{

		System.out.println("brute force");
		for (int i = 0; i < infra.length; i++) {
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}
		System.out.println("***************hash set********");
		Set<String> data = new HashSet<String>();
		for (String e : infra) {
			if (data.add(e) == false) {
				System.out.println(e);
			}
		}
		System.out.println("***************hash map********");
		Map<String, Integer> infraMap = new HashMap<String, Integer>();
		for (String e : infra) {
			Integer count = infraMap.get(e);
			if (count == null) {
				infraMap.put(e, 1);
			} else {
				infraMap.put(e, ++count);
			}
		}
		// print all the duplicate elements
		Set<Entry<String, Integer>> entrySet = infraMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
		System.out.println("**************Streams***********");
		Set<String> dataSet = new HashSet<String>();
		Set<String> dupSet = Arrays.asList(infra).stream().filter(e -> !dataSet.add(e)).collect(Collectors.toSet());
		System.out.println(dupSet);
	}
}
