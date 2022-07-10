import com.fibonnacisequence.FibonacciCalculator;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciApplication {

    public static void main(String[] args) {

        boolean willRunAgain = true;

        //The application runs until the user does not select y.
        do {

            int fibonacciTermNumber;

            // These lines run until the user enters an integer in the range of 0-200.
            do {

                fibonacciTermNumber = promptForInt("Enter the term number of the fibonacci sequence " +
                        "(any integer 0 - 200): ");

            } while ( fibonacciTermNumber > 200 || fibonacciTermNumber < 0 );

            printFibonacciSequence(fibonacciTermNumber);
            willRunAgain = promptForContinue();

        } while (willRunAgain == true);

    }



    static int promptForInt(String output){
        Scanner scanner = new Scanner(System.in);
        System.out.println(output);
        return scanner.nextInt();
    }

    //This method declares a FibonacciCalculator object and calls its calculateTerm() function, then prints the terms
    static void printFibonacciSequence(int fibonacciTermNumber){
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator(fibonacciTermNumber);
        ArrayList<BigInteger> returnList = fibonacciCalculator.calculateTerm();

        for(int i = 0 ; i < returnList.size() ; i++){

            System.out.print(" [" + returnList.get(i) + "] " );

            if( ( i % 5 == 0 ) && ( i != 0 ) ){
                System.out.printf("%n");
            }

        }

    }

    //This method determines whether the application will run again.
    static boolean promptForContinue(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf(" %n Would you like to enter another number? (Y or N) ");
        String yesOrNo = scanner.next();

        return yesOrNo.equalsIgnoreCase("y");
    }
}
