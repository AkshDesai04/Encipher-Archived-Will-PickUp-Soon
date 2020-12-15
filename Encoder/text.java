import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = in.nextLine();
        for(int i = 0;i < str.length();i = i + 10)
        {
            str = str.substring(0, i) + random() + str.substring(i);
            System.out.println("str = " + str);
        }
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