public class Salt {

	public static String[] salter(String[] input) {
		String[] output = new String[input.length];
		//
		for(int i = 0;i < input.length;i++) {
			for(int j = input[i].length();j >= 0;j--) {
			}
		}
		//
		return input;//temp
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

	public static char random() {
		
		int min = 32;
		int max = 126;
		int num = min +  (int)(Math.random()*(max - min + 1));
		char random = (char)num;

		return random;
	}
}
