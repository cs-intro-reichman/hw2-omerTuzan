// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		String Overbose = "";

		int Sverbose = 0; // will hold the current number, when verbose is true
		int Vcount = 1; // Counts the amount of variables in 1 line

		String VorC = args[1]; 
		int ACollatz = Integer.parseInt(args[0]);

		// will only check for verbose if the second argument is "v" because we dont need special output in "c" :)
		if (VorC.compareTo("v") == 0) {
			// runs the collatz equation, for 1 to ACollatz
			for (int i = 1; i <= ACollatz; i++) {
				Sverbose = i;
				// while loop will run until the last variable in the line is 1
				do {
				  Vcount++;
				  Overbose += Sverbose + " ";
				  if (Sverbose % 2 == 0) {
					Sverbose /= 2;
				  } else {
					Sverbose = Sverbose * 3 + 1;
				  }
				}
				while (Sverbose != 1);
				Overbose += Sverbose + String.format(" (%s)%n", Vcount);
				Vcount = 1; // resets the var count for every line
			}
		}

		Overbose += String.format("Every one of the first %s hailstone sequences reached 1.", ACollatz);

		System.out.println(Overbose);
	}
}
