import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LongestSubstr {

	public String getLongestSubStr(String str) {

		String[] strArray = str.split("");

		String wordMaxLeg = "";

		Map<String, Integer> wordMap = new LinkedHashMap<>();

		System.out.println("--strArray---" + strArray);
		String strWord = "";
		for (int i = 0; i < strArray.length; i++) {

			if (strArray[i].equalsIgnoreCase(" ")) {
				wordMap.put(strWord, strWord.trim().length());
				strWord = "";
			}
			strWord += strArray[i];

			System.out.println("--strWord---" + strWord);

		}

		List<Entry<String, Integer>> resultMap = sortMap(wordMap);

		System.out.println("--wordMap---" + wordMap);
		Entry<String, Integer> set = resultMap.get(0);
		wordMaxLeg = set.getKey().toString();
		System.out.println("--wordMaxLeg---" + wordMaxLeg);
		return wordMaxLeg;
	}

	public List sortMap(Map<String, Integer> map) {

		Map<String, Integer> sortedMap = new HashMap<>();

		Set<Entry<String, Integer>> set = map.entrySet();

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

		return list;
	}

	public static void main(String... ars) {

		String word = new LongestSubstr().getLongestSubStr("Hi I am Amit Akela ");
		System.out.println("--word---" + word);
	}

}
