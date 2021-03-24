import java.math.BigInteger;

public class Convert {
	public static String[] convert(String[] input) {
		String[] output = new String[input.length];
		BigInteger big;
		System.out.println("Its gonna run " + input.length + "times so, please wait.");
		for(int i = 0;i < input.length;i++)
		{
			System.out.println("Run #" + i);
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
