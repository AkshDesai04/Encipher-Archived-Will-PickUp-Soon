import java.math.BigInteger;

public class Convert {
	public static String[] convert(String[] input) {
		String[] output = new String[input.length];
		BigInteger big;
		for(int i = 0;i < input.length;i++)
		{
			if(input[i].length() == 0) {
				output[i] = "";
				continue;
			}
			big = new BigInteger(input[i]);
			output[i] = big.toString(36);
		}
		return output;
	}
}
