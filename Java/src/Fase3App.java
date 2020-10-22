import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Fase3App {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> lletresMap = new HashMap<>();
		
		List<Character> nom = new ArrayList<>();
		nom.addAll(Arrays.asList(
				'v','i', 'c', 't', 'o', 'r',
				'l', 'a', 's', 'h', 'e', 'r', 'a', 's',
				's', 'a', 'n', 'c', 'h', 'e', 'z'
				));
		
		for(char lletra: nom) {
			
			int vegades;
			if (lletresMap.get(lletra) == null) {
				vegades = 0;
			} else {
				vegades = lletresMap.get(lletra);
			}
			
			lletresMap.put(lletra, vegades+1);
		}
		
		System.out.println(lletresMap);

	}

}
