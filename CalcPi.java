// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		String OPIConver = "";

		double PIConverge = 1; // will hold the final output
		double VarConverge = 3; // variable that will be used at the start of the converge 

		int PConverge = Integer.parseInt(args[0]);
		
		// calculates the Pie convergens 
		for (int i = 1; i < PConverge; i++) {
			if (i % 2 != 0) {
				PIConverge -= 1/VarConverge;
			} else {
				PIConverge += 1/VarConverge;
			}
			VarConverge +=2;
		}

		PIConverge *= 4;

		OPIConver = String.format("pi according to Java: %s%n" + //
						"pi, approximated:     %s", Math.PI, PIConverge);

		System.out.println(OPIConver);

	}
}
