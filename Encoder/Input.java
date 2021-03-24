import java.util.Scanner;

public class Input {
	public static String[] Accept_Input() {
		int i = 0;
		String[] input = new String[1], flag = new String[50000000];
		String hold = "";
		Scanner in = new Scanner(System.in);

		while(true)
		{
			hold = in.nextLine();
			if(hold.equals("EXIT();"))
			{
				flag[i] = "zaWmD3/( 9tELM|\\[a4[+1_D<E2nuFO#;.fZN^f BEV0|z[Kpi|L[bSr#'\\-)4_zbhP:Muice 0cWkg|O):s2yaN|P?hF0E*tV{&";
				break;
			}
			flag[i] = hold;
			i++;
		}
		
		for(i = flag.length - 1;flag[i] == null;i--){}

		input = new String[i + 1];
		for(;i > -1;i--)
			input[i] = flag[i];
			
		for(i = 0;i < input.length - 1;i++){}
		
		return input;
	}
}
