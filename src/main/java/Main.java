
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage
        
        


        boolean x=false;
        while(!x){
             
        System.out.print("$ ");
        Scanner scannerObj = new Scanner(System.in);
        String input = scannerObj.nextLine();
        input =input.strip();
        if(input.startsWith("echo")){
            // System.out.println(input);
            input =input.replace("echo","");
            input=input.strip();
            System.out.println(input);
        }
        // TODO: make this a regex later
        else if(input.equalsIgnoreCase("exit 0")){
            x=true;
            break;
        }
        else{System.out.println(input + ": command not found");  } 
        }
  
        
        
    }
}
