import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fase4App {

	public static void main(String[] args) {
		
		List<Character> name = new ArrayList<>(Arrays.asList('V', 'I', 'C', 'T', 'O', 'R'));		
		List<Character> surname  = new ArrayList<>(Arrays.asList('L', 'A', 'S', 'H', 'E', 'R', 'A', 'S'));
		List<Character> fullName = new ArrayList<>();
		
		fullName.addAll(name);
		fullName.add(' ');
		fullName.addAll(surname);
		
		System.out.println("Full name: " + fullName);
	}
}
