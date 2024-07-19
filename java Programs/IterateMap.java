package ttsttsts;
import java.util.HashMap;
import java.util.Map;

public class IterateMap {
    @SuppressWarnings("rawtypes")
	public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Arjun");
        map.put(3, "Mahesh");
        map.put(2, "jack");
        map.put(0, "Brahamha");
        
        System.out.println("Original Map List : "+map);
       
        for (Map.Entry m : map.entrySet()) {
        	System.out.println(m.getKey() + "  " + m.getValue());
		}
        
        map.forEach((k,v)->System.out.println(k +" "+v));
        
        map.entrySet().stream().forEach(m -> System.out.println(m.getKey() +" " +m.getValue()));
        
    }
}
