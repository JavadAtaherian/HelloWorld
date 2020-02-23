//import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int thenumber = scanner.nextInt();

        if (thenumber>= -128 && thenumber<=127) {
            System.out.println("byte");
            
        }
        
        if (thenumber>= -32768 && thenumber<=32768) {
            System.out.println("short");
        }

        if (thenumber>= -2147483648 && thenumber<= 2147483647) {

            System.out.println("int");
        }

        
            System.out.println("long");
        


        
            
        
		
        
        
    }


    





}
