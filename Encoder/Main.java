import java.lang.*;
import java.util.Scanner;

class Main {
	public static void main(String[]args) throws InterruptedException {
		
		int EncNum;
		String outputS = "";
		String[] input, hold, Sinput;

		Input acce = new Input();
		Multiply mult = new Multiply();
		Salt salt = new Salt();
		Convert conv = new Convert();
		FileWriters FlwW = new FileWriters();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number to encrypt the string with.");
		EncNum = in.nextInt();

		input = acce.Accept_Input();

		System.out.println("7 stage process starts..........");
		System.out.println("NOW");
		System.out.println("Stage 1 Completed\t\t\t\tInput complete.");


		input = mult.mul(input, EncNum);
		System.out.println("Stage 2 Completed\t\t\t\tMultiply 0 complete.");
		input = mult.mul(input, EncNum);
		System.out.println("Stage 3 Completed\t\t\t\tMultiply 1 complete.");
		input = mult.mul(input, EncNum);
		System.out.println("Stage 4 Completed\t\t\t\tMultiply 2 complete.");

		input = salt.replacer(input);
		System.out.println("Stage 5 Completed\t\t\t\tReplacer complete.");

		input = conv.convert(input);
		System.out.println("Stage 6 Completed\t\t\t\tconvert complete.");


		for(int i = 0;i < input.length;i++) {
			outputS = outputS + input[i].toUpperCase();
			if(i != input.length - 1)
				outputS = outputS + "\\t";
		}

		if(!FlwW.WriteToFile(outputS))
			System.out.println("Stage 8 Completed:\t\t\t\t\tFile Write Complete.");
		else {
			System.out.println("Stage 8 FAILED:\t\t\t\t\tFILE WRITE FAILED");
			System.out.println("Just printing the output.");
			System.out.print("Starting printing in");
			Thread.sleep(1000);
			System.out.print(".....3");
			Thread.sleep(1000);
			System.out.print(".....2");
			Thread.sleep(1000);
			System.out.print(".....1");
			Thread.sleep(1000);
			System.out.println("\n\n\n" + outputS);
			//System.out.println(outputS);
		}
		System.out.println("\n\n\n" + outputS);
	}
}

//started 5:30