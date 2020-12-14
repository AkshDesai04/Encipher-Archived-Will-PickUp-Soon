import java.util.Scanner;

public class Input {
	public static String[] Accept_Input() {
		int i = 0;
		String[] input = new String[1], flag = new String[500000000];
		String hold = "";
		Scanner in = new Scanner(System.in);

		while(true)
		{
			hold = in.nextLine();
			if(hold.equals("EXIT();"))
				break;
			flag[i] = hold;
			i++;
		}
		
		for(i = flag.length - 1;flag[i] == null;i--){}

		input = new String[i + 1];
		for(;i > -1;i--)
			input[i] = flag[i];
			
		for(i = 0;i < input.length - 1;i++){}
		
		in.close();
		return input;
	}
}
