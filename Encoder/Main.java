import java.lang.*;
import java.util.Scanner;

class Main {
	public static void main(String[]args) throws InterruptedException {
		String[] input, hold, Sinput;
		String outputS = "";
		int EncNum;
		Input acce = new Input();
		Multiply mult = new Multiply();
		Salt salt = new Salt();
		Convert conv = new Convert();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number to encrypt the string with.");
		EncNum = in.nextInt();

		input = acce.Accept_Input();

		System.out.println("press Enter To Start Encode.");
		System.out.println("7 stage process starts..........");
		Thread.sleep(1000);
		System.out.println("NOW");
		System.out.println("Stage 1 Complete:     Input complete.");
		Thread.sleep(1000);


		input = mult.mul(input, EncNum);
		System.out.println("Stage 2 Complete:     Multiply 0 complete.");
		Thread.sleep(1000);
		input = mult.mul(input, EncNum);
		System.out.println("Stage 3 Complete:     Multiply 1 complete.");
		Thread.sleep(1000);
		input = mult.mul(input, EncNum);
		System.out.println("Stage 4 Complete:     Multiply 2 complete.");
		Thread.sleep(1000);

		input = salt.replacer(input);
		System.out.println("Stage 5 Complete:     Replacer complete.");
		Thread.sleep(1000);

		input = conv.convert(input);
		System.out.println("Stage 6 Complete:     convert complete.");
		Thread.sleep(1000);


		for(int i = 0;i < input.length;i++) {
			outputS = outputS + input[i].toUpperCase();
			if(i != input.length - 1)
				outputS = outputS + "\\n";
		}

		outputS = salt.salter(outputS);
		System.out.println("Stage 7 Complete:     Salter complete.");
		Thread.sleep(1000);



		System.out.println("\n\n\n\n\n\n\n\n\n\n Output = " + outputS + "Aksh Out.");
	}
}
