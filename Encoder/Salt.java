public class Salt {

	public static String salter(String input) {
		int i;
		System.out.println("Randome String Being Generated.");
		String output = "", random = random(input.length() + 10);
		System.out.println("Randome String Generated.");
		//System.out.println("Randon String = " + random);
		//
		for(i = 0;i < input.length();i = i + 5) {
			try {
				output = output +  random.substring(i, i+5) + input.substring(i, i+5);
			}
			catch(Exception e) {
					try {
					output = output +  random.substring(i, random.length()) + input.substring(i, input.length());
				}
				catch(Exception ex)
				{
					//System.out.println("Eoor Occured as: " + ex);
					output = output + input.substring(i, input.length());
				}
			}

			//System.out.println("output: " + output);

			//if(i%1000 == 0)
				//System.out.println(+ i +  " / " + (input.length()));
		}
		System.out.println(+ --i +  " / " + (input.length()));

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

	public static String random(int x) {
		//Code meeds to be improved here.
		String output = "";
		return output;
	}
}
