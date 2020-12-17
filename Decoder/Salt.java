public class Salt {

	public static String salter(String input) {
		int length = input.length()*2 + 1;
		double progress;
		String output = "";
		//
		for(int i = 0;i < input.length();i = i + 10)
		{

			if(i != 0)
			{
				if(i % 1000000 == 0) {
					progress = i / length * 100;
					System.out.println("\tStage 7: Progress = " + i + '/' + length + "\t\t" + progress);
				}
			}
		}

		output = input;
		//
		return "Hello World";//temp
	}

	public static String[] replacer(String[] input) {
		int len;
		String[] output = new String[input.length], In = new String[input.length];
		String hold;
		for(int i = 0;i < input.length;i++) {
			hold = input[i];
			hold = hold.replace('\t', '5');
			len = hold.length();
			//code more here.
			output[i] = hold;
		}

		return output;
	}

	public static String random() {
		
		int min = 32;
		int max = 126;
		int num;
		char random;
		String output = "";

		for(int i = 0;i < 5;i++) {
			num = min +  (int)(Math.random()*(max - min + 1));
			random = (char)num;
			output = output + random;
		}

		return output;
	}
}
