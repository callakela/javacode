import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharsInString {
	
	public List<Entry<Character,Integer>> getDublicateChar(String aStr){
		
		Map<Character,Integer> map= new HashMap<>();
		
		char[] array=null;
		
		if(aStr!=null) {
			
			array=aStr.toCharArray();
			
		for (int i = 0; i < array.length; i++) {
			
			if(map.containsKey(array[i])) {
				
				map.put(array[i], map.get(array[i])+1);
				
			}else {
				
				map.put(array[i], 1);
			}
		  }
		}
		
		List<Entry<Character,Integer>> list= new ArrayList<Entry<Character,Integer>>();
		
		Set<Entry<Character,Integer>> set=map.entrySet();
		
		for (Entry<Character,Integer> object : set) {
			
			if(object.getValue()>1) {
				
				list.add(object);
			}
		}
		
		return list;
	}
	
	
	
	
	public static void main(String[] args)
	{
		List<Entry<Character,Integer>>  element=new DuplicateCharsInString().getDublicateChar("amitakelal");
		
		for (Entry<Character, Integer> entry : element) {
			
			System.out.println("key ="+entry.getKey()+" values="+entry.getValue());
		}
	}


}
