//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String OCheers = "";

            boolean isEExist = false; // will be used to check wether the exceptional chars exist in the string

            String Cheer =  args[0].toUpperCase(); // will uppercase so every output will be valid, since we dont cheer in lower case :))))))))))))
            int Amount = Integer.parseInt(args[1]);
            
            String ELetters = "AEFHILMNORSX"; // string that holds all the exceptional chars, will be used to check for them in the main string
            
            
            // iterate on the cheer char
            for (int i = 0; i < Cheer.length(); i++) {
                // used to check for the exceptional chars
                for (int j = 0; j < ELetters.length(); j++){
                   int EIndex = Cheer.indexOf(ELetters.charAt(j));
                   while (EIndex != -1) {
                        if (i == EIndex) break;
                        EIndex = Cheer.indexOf(ELetters.charAt(j), EIndex + 1);
                   }
                   if (i == EIndex) {isEExist = true; break;}
                   EIndex = -1;
                }

                // will add an or a if an execptional char was found to the last output
                if (isEExist) {
                        OCheers += String.format("Give me %2$s %1$s: %1$s!%n", Cheer.charAt(i), "an");
                } else {
                        OCheers += String.format("Give me %2$s %1$s: %1$s!%n", Cheer.charAt(i), "a ");
                } 
                isEExist = false;               
            }

            OCheers += "What does that spell?\n"; // random line before the cheer :((((((((( 

            // chhheeeeerrrsss!!!!!!!!!!!!
            for (int i = 1; i <= Amount; i++) {
                if (i == Amount) {
                        OCheers += Cheer + "!!!";
                } else {
                        OCheers += Cheer + "!!!\n";
                }
                
            }

            System.out.println(OCheers);
        }
}
