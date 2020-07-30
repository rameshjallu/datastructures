package chapter1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Delete1 {

	static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			if (in.hasNextInt()) {
				int k = in.nextInt();

				if (map.containsKey(k)) {

					int v = map.get(k);
					map.put(k, ++v);

				} else {
					map.put(k, 1);
				}
			}

			else {
				

				Set<Map.Entry<Integer, Integer>> set = map.entrySet();

				for (Entry<Integer, Integer> entry : set) {
					if (entry.getValue() > 1) {
						System.out.println(entry.getKey());
					}
				}
				
				in.next();

			}

		}

	}
}
