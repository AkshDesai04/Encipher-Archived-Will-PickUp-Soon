import java.util.Scanner;

// Java program generate a random AlphaNumeric String 
// using Math.random() method 

public class RandomString { 

	// function to generate a random string of length n 
	static String getAlphaNumericString(int n) 
	{ 

		// chose a Character random from this String 
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
									+ "0123456789"
									+ "abcdefghijklmnopqrstuvxyz"
									+ "`~!@#$%^&*()_+-={}[]\\|\'\";:/?.>,< "; 

		// create StringBuffer size of AlphaNumericString 
		StringBuilder sb = new StringBuilder(n); 

		for (int i = 0; i < n; i++) { 

			// generate a random number between 
			// 0 to AlphaNumericString variable length 
			int index 
				= (int)(AlphaNumericString.length() 
						* Math.random()); 

			// add Character one by one in end of sb 
			sb.append(AlphaNumericString 
						.charAt(index)); 
		} 

		return sb.toString(); 
	} 

	public static void main(String[] args) 
	{ 

		// Get the size n 
		System.out.println("Enter the length of the String to be made.");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 

		// Get and display the alphanumeric string 
		System.out.println(RandomString 
							.getAlphaNumericString(n)); 
	} 
} 
