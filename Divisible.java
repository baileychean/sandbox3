//Bailey Chean
import java.util.Scanner;

class Divisible {
    public static void main(String[] args)
    {

        int a; //declare variables
        int b;

        Scanner kb = new Scanner(System.in); //calling scanner class
        System.out.println("Please enter the first integer.");
        a = kb.nextInt(); // asking for user inputs
        System.out.println("Please enter the second  integer.");
        b = kb.nextInt();

        int remainder = a % b; // determines remainder of mod

        if(a%b==0){ //setting up if remainder == 0
            System.out.println("The first integer is evenly divided by the second integer.");
        }else{
            System.out.println("The first integer is not evenly divided. The remainder is: " + remainder); // if remainder isn't 0, then display remainder 
        }
    }
}