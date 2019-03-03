/*
 * Assignment Unit 2- IO With txt files
 * Soyeon Jang
 * Ms Cooper
 * ICS4UI
 * Description: Reads in from a txt file (a set of years) and adds 1 until each digit in each number is distinct
 * then it is output to a txt file
 * If the digits of the year is already distinct, it adds one.
 * 2 March 2019
 */

import java.io.*; //imports input-output package

//creates main class named IOAssignment
public class IOAssignment {
	
	//necessary to have "throws IOException" for the use of buffered reader in the main method
	public static void main(String[] args) throws IOException { 

		FileReader myReader = new FileReader("yearinput.txt"); //creates a file reader for txt file named "yearinput.txt"
		BufferedReader myInput = new BufferedReader(myReader); //creates buffered reader to read txt file 

		FileWriter myWriter = new FileWriter("yearoutput.txt"); //creates a text file named "yearout.txt" for the output
		PrintWriter myOutput = new PrintWriter(myWriter); //creates print writer for the output

		int numLine = Integer.parseInt(myInput.readLine()); //reads the first line in the file and set it to numLine to indicate how many more lines we are expecting
		System.out.println(numLine); //prints out the number of line in the console
		myOutput.println(numLine); //outputs the numLine read from the input file

		//for each year following numLine
		for (int i = 0; i < numLine; i++) {

			String yearInput = myInput.readLine();// gets the year input
			int yearInteger = Integer.parseInt(yearInput) + 1;// parses to an integer to add 1
			String year = Integer.toString(yearInteger);// converts back to string

			//while loop: there is a duplicate, add 1 to make digits distinct from one another
			while (checkDuplicate(year)) {
				
				yearInteger++;//adds 1 to the year until the digits of the year is distinct
				year = Integer.toString(yearInteger);// converts back to string
				
			}//closes while loop that calls the function method checkDuplicate to see if the digits are distinct
			
			System.out.println(year); //prints out the added year in the console
			myOutput.println(year); //outputs the added year in the output text file
			
		} //closes for loop 
		
		//closes file variables
		myReader.close();
		myInput.close();
		myOutput.close();
		myWriter.close();
	}//closes main method

	/*
	 * function method checkDuplicate
	 * String year is the line (year) read from the input txt file 
	 * Compares each digit to another digit in the year using charAt and boolean to see if there's same digit
	 * Return: boolean duplicate 
	 * Boolean true if duplicate exist
	 * Boolean false if the digits are distinct
	 */
	public static boolean checkDuplicate(String year) {
		boolean duplicate = false;// set duplicate equal to false by default
		
		// for each element in the character array at index i
		for (int i = 0; i < year.length(); i++) {
			
			// compare with another element in the array at index j
			for (int j = 0; j < year.length(); j++) {
				
				//if the elements are not the same
				//duplicate is not false
				//the character elements of the string year at the index i and j are equal
				if (i != j && duplicate == false && year.charAt(i) == year.charAt(j)) {
					
					duplicate = true; // set duplicate to true
			
				} //closes if statement to set the boolean true == duplicate exist
			} //closes for-loop (compare each with another digit) 
		} //closes for-loop (each element in the char Array- using i)
		return duplicate;// return duplicate
	}//closes function method checkDuplicate
}// closes class IOAssignment
