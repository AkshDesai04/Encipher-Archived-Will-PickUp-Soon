import java.util.Scanner;

class Main {
	public static void main(String[]args) {
		String[] input, hold, Sinput;
		String outputS = "";
		int EncNum;
		Input acce = new Input();
		Multiply mult = new Multiply();
		Salt salt = new Salt();
		Convert conv = new Convert();
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter the String to be encrypted.");
		input = acce.Accept_Input();
		
		System.out.println("Enter the number to encrypt the string with.");

		input = mult.mul(input);
		input = mult.mul(input);
		input = mult.mul(input);

		input = salt.replacer(input);

		input = conv.convert(input);

		input = salt.salter(input);



		for(int i = 0;i < input.length;i++) {
			outputS = outputS + input[i].toUpperCase();
			if(i != input.length - 1)
				outputS = outputS + "\\n";
		}

		System.out.println(outputS + "\n The String has been encoded using 404 only and not the provided number.");
	}
}
