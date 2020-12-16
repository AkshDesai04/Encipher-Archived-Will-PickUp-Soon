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
		FileWriters FlwW = new FileWriters();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number to encrypt the string with.");
		EncNum = in.nextInt();

		input = acce.Accept_Input();

		System.out.println("press Enter To Start Encode.");
		System.out.println("7 stage process starts..........");
		Thread.sleep(1000);
		System.out.println("NOW");
		System.out.println("Stage 1 Completen\t\t\t\tInput complete.");
		Thread.sleep(1000);


		input = mult.mul(input, EncNum);
		System.out.println("Stage 2 Completen\t\t\t\tMultiply 0 complete.");
		Thread.sleep(1000);
		input = mult.mul(input, EncNum);
		System.out.println("Stage 3 Completen\t\t\t\tMultiply 1 complete.");
		Thread.sleep(1000);
		input = mult.mul(input, EncNum);
		System.out.println("Stage 4 Completen\t\t\t\tMultiply 2 complete.");
		Thread.sleep(1000);

		input = salt.replacer(input);
		System.out.println("Stage 5 Completen\t\t\t\tReplacer complete.");
		Thread.sleep(1000);

		input = conv.convert(input);
		System.out.println("Stage 6 Completen\t\t\t\tconvert complete.");
		Thread.sleep(1000);


		for(int i = 0;i < input.length;i++) {
			outputS = outputS + input[i].toUpperCase();
			if(i != input.length - 1)
				outputS = outputS + "\\t";
		}

		outputS = salt.salter(outputS);
		System.out.println("Stage 7 Completen\t\t\t\tSalter complete.");
		Thread.sleep(1000);

		if(FlwW.WriteToFile(outputS))
			System.out.println("Stage 8 Complete:\t\t\t\t\tFile Write Complete.");
		else {
			System.out.println("Stage 8 FAILED:\t\t\t\t\tFILE WRITE FAILED");
			System.out.println("Just printing the output.");
			System.out.print("Starting printing in.....");
			Thread.sleep(1000);
			System.out.print(".....3");
			Thread.sleep(1000);
			System.out.print(".....2");
			Thread.sleep(1000);
			System.out.print(".....1");
			Thread.sleep(1000);
			System.out.println("Starting Print");
			System.out.println(outputS);
		}
	}
}
