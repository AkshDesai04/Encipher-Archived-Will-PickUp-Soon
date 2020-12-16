public class Salt {

	public static String salter(String input) {
		String output = "";
		//
		for(int i = 0;i < input.length();i = i + 10)
		{
			input = input.substring(0, i) + random() + input.substring(i);
			if(i % 1000 == 0)
				System.out.println( + i + " / " + (input.length() * 2));
		}

		output = input;
		//
		return output;//temp
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
