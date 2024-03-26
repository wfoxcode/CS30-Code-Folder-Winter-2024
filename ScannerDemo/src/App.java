import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner keys = new Scanner(System.in);

        // System.out.println("Scanner Demo Inputs");

        // // Int input
        // System.out.println("Integars: ");
        // int num = keys.nextInt();
        // System.out.println("The Number Was: " + num);

        // // Double input
        // System.out.println("Double: ");
        // double dblnum = keys.nextDouble();
        // System.out.println("The Number Was: " + dblnum);
        
        // // Nextline input
        // System.out.println("line: ");
        // String word = keys.nextLine();
        // System.out.println("The Word Was: " + word);

        // // Next input
        // System.out.println("word: ");
        // String word2 = keys.next();
        // System.out.println("The Word Was: " + word2);




        Scanner keys = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = keys.nextInt();
        //keys.nextLine();

        System.out.print("Enter a Sentence: ");
        String sentence = keys.nextLine();
        System.out.println(num + " " + sentence);




















    }
}
