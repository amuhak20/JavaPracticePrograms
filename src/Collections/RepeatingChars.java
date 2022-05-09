package Collections;

import java.util.HashMap;
import java.util.Map;

public class RepeatingChars {
public static void main(String[] args) {

Map<Character, Integer> map = new HashMap<Character, Integer>();

String name = "GooOgle";
char[] ch = name.toCharArray();
for(char c: ch)
{
	
if(map.containsKey(c))
{
map.put(c, map.get(c)+1);
}
else 
{
map.put(c, 1);
}
}
System.out.println(map);
}
}
