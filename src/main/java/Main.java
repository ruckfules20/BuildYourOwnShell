
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage
        System.out.print("$ ");
        Scanner scannerObj = new Scanner(System.in);
        String input = scannerObj.nextLine();
        System.out.println(input + ": command not found");
    }
}
