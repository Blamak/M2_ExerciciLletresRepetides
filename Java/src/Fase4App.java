import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fase4App {

	public static void main(String[] args) {
		
		List<Character> nom      = new ArrayList<>(Arrays.asList('V', 'I', 'C', 'T', 'O', 'R'));		
		List<Character> cognom   = new ArrayList<>(Arrays.asList('L', 'A', 'S', 'H', 'E', 'R', 'A', 'S'));
		List<Character> fullName = new ArrayList<>();
		
		fullName.addAll(nom);
		fullName.addAll(Arrays.asList(' '));
		fullName.addAll(cognom);
		
		System.out.println("FullName: " + fullName);
	}
}
