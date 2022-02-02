//Bailey Chean
//Since technically each switch case works without looping, would points be deducted from each individual category, or just from the looping section?
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Sales {
    public static void main(String[] args) throws IOException {
        double saleAdd; // declare new variable to reference file
        Scanner keyboard = new Scanner(System.in); // calling scanner class

        FileWriter fwriter = new FileWriter("sales.txt", true); // allows reading from the sales.txt, true = appends to rewrite/add
        PrintWriter outputFile = new PrintWriter(fwriter); // actually adding the stuff

        int user;

        System.out.println("Please choose one of the following options. \n1. Add a sale to the file." + // displays available available things to do within the program
                "\n2. Print out all of the sales in the file. \n3. Print the total of all the sales." +
                "\n4. Quit the program.");

        user = keyboard.nextInt(); //asking user input for their choice
        while (user !=4){
            switch (user) { //switch to do different things depending on user input

                case 1:
                    System.out.println("Please enter the cost of the item.");
                    saleAdd = keyboard.nextDouble(); // user input of cost
                    outputFile.println(saleAdd); // appends stuff to the sales.txt

                    System.out.println("Please choose one of the following options. \n1. Add a sale to the file." + // displays available available things to do within the program
                        "\n2. Print out all of the sales in the file. \n3. Print the total of all the sales." +
                        "\n4. Quit the program.");
                    keyboard.nextLine();
                    user = keyboard.nextInt(); //asking user input for their choice again
                    outputFile.close(); // close program to save

                    continue;

                case 2:
                    File myFile = new File("sales.txt"); //creates a new file that can access sales.txt
                    Scanner inputFile = new Scanner(myFile);
                    String readLine; // declaring new string
                    while (inputFile.hasNext()){ // has.Next will keep running while there's more data in the file, loops until it returns false
                        readLine = inputFile.nextLine(); // reads each individual line
                        System.out.println(readLine); // prints out each line as it shows in sales.txt
                    }
                    inputFile.close(); // close file
                    System.out.println("\nPlease choose one of the following options. \n1. Add a sale to the file." + // displays available available things to do within the program
                        "\n2. Print out all of the sales in the file. \n3. Print the total of all the sales." +
                        "\n4. Quit the program.\n");
                    keyboard.nextLine();
                    continue;

                case 3:
                    double sum = 0; //set sum = 0
                    File newFile = new File("sales.txt"); //creates a new file that can access sales.txt
                    Scanner adding = new Scanner(newFile);
                    while (adding.hasNext()){
                        sum += adding.nextDouble(); //adds all the numbers from file to sum
                    }
                    System.out.println("The total sum of your cart is: " + sum);
                    System.out.println("\nPlease choose one of the following options. \n1. Add a sale to the file." + // displays available available things to do within the program
                            "\n2. Print out all of the sales in the file. \n3. Print the total of all the sales." +
                            "\n4. Quit the program.\n");
                    keyboard.nextLine();
                    continue;
            }
        }
    }
}

