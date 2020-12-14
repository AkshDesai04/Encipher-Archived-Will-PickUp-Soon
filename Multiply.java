public class Multiply {
	public static String[] mul(String[] input, int EncNum) {
		String[] output = new String[input.length];

		for(int i = 0;i < input.length;i++) {
			output[i] = "";
			for(int j = 0;j < input[i].length();j++)
				output[i] = output[i] + (((int)(input[i].charAt(j))) * EncNum) + "\t";
		}
		return output;
	}
}
