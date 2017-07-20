package codinginterview;

import java.util.HashMap;

public class WordCount {
	private HashMap<String, Integer> map;

	public WordCount(){
		map = new HashMap<String, Integer>();
	}

	public  void read(String[] doc){
		for(String word: doc){
			if(!map.containsKey(word)){
				map.put(word,0);
			}
			map.put(word, map.get(word)+1);
		}
	}

	public int getCount(String word){
		if(map.get(word)==null)
			return 0;
		else
			return map.get(word);
	}
}
