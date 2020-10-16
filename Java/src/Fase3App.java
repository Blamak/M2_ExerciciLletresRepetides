import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Fase3App {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> lletres = new HashMap<Character, Integer>();
		
		List<Character> nom = new ArrayList<>();
		nom.addAll(Arrays.asList('v','i', 'c', 't', 'o', 'r', 'l', 'a', 's', 'h', 'e', 'r', 'a', 's'));
		
		for(char lletra: nom) {
			int vegades;
			if (lletres.get(lletra) == null) {
				vegades = 0;
			} else {
				vegades = lletres.get(lletra);
			}
			lletres.put(lletra, vegades+1);
		}
		
		System.out.println(lletres);

	}

}