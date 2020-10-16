import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Fase2App {
	
	public static void main(String[] args) {

		List<Character> nom = new ArrayList<>();
		nom.addAll(Arrays.asList('V','i', 'c', 't', 'o', 'r', '1'));
		
		for(char lletra : nom) {	
			lletra = Character.toLowerCase(lletra);
			if (lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' | lletra == 'u') {
				System.out.println("VOCAL");
			} else if (!Character.isDigit(lletra)) {
				System.out.println("CONSONANT");
			}
			
			if (Character.isDigit(lletra)) {
				JOptionPane.showMessageDialog(null, "Els noms de persones no contenen números");
			}
			
		}
	}
}
