/**
 * @author Nathan Henriques
 * @date 06/11/2024
 * a code that reads a txt file and removes all spaces between
 */

package Com.Nathan;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

public class NameEqualizer {
	
	/**
	 * the main method
	 * @param args he command line arguments
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		    // The input stream here is a "FileReader" that reads input.txt
		    // Notice the "throws". We'll talk about this later, but it's needed
		    // for this code to work
		Scanner input = new Scanner(new FileReader("input.txt"));

		    // While the input object has more tokens, do the thing
		while (input.hasNext()) {
			String line = input.nextLine();
		     
			
			// Process line here
			String processedLine = line;
		    String names = line.toLowerCase();
		    String nospace = names.replaceAll(" ", "");
		    
		    System.out.println(nospace);
		    }
		  }
		}


		
