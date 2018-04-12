import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemovDuplicate {
	
	public static void main(String... ars) {
		
		Stream<Hosting> stream= (Arrays.asList(new Hosting(1,"abc",10000),new Hosting(2,"xyz",10000),new Hosting(3,"efg",15000),new Hosting(4,"ijk",20000))).stream();
		
		Map<Integer,String> result2=stream.collect(Collectors.toMap(Hosting::getId,Hosting::getName));
		
		result2.forEach((k,v)->{System.out.println(k+"  Hi " +v);});
		Stream<Hosting> stream2= (Arrays.asList(new Hosting(1,"abc",10000),new Hosting(2,"xyz",10000),new Hosting(3,"efg",15000),new Hosting(4,"ijk",20000))).stream();
		Map<String,Long> result3=stream2.sorted(Comparator.comparing(Hosting::getName).reversed()).collect(Collectors.toMap(Hosting::getName,Hosting::getWebsites));
		result3.forEach((k,v)->System.out.println(k+" "+v));
		
	}

}
