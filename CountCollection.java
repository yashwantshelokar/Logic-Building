package Star;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountCollection {
	public static void main(String[] args) {
		String[] ch = { "A", "B", "C", "D", "S", "B", "A", "B", "F", "D", "D" };
		Map<String, Integer> mapDupeCount = new HashMap<String, Integer>();
		for (Integer i = 0; i < ch.length; i++)
		{
			if (mapDupeCount.containsKey(ch[i]))
			{
				Integer count = mapDupeCount.get(ch[i]);
				mapDupeCount.put(ch[i], ++count);
			} else {
				mapDupeCount.put(ch[i], 1);
			}
		}

		System.out.println("result" + mapDupeCount);
	}
}
