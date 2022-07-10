package com.fibonnacisequence;


import java.math.BigInteger;
import java.util.ArrayList;


public class FibonacciCalculator {

    int fibonacciTermNumber;

    public FibonacciCalculator(int fibonacciTermNumber){
        this.fibonacciTermNumber = fibonacciTermNumber;
    }

    /* This method can be called by other classes. It adds up to the 1st term of the sequence to the list
    *  and then calls the private overloaded method. */
    public ArrayList<BigInteger> calculateTerm() {

        ArrayList<BigInteger> returnList = new ArrayList<>();

        if ( fibonacciTermNumber == 0 ){
            returnList.add(BigInteger.valueOf(0));
            return returnList;
        } else if (fibonacciTermNumber == 1){
            returnList.add(BigInteger.valueOf(0));
            returnList.add(BigInteger.valueOf(1));
            return returnList;
        } else {
            returnList.add(BigInteger.valueOf(0));
            returnList.add(BigInteger.valueOf(1));
            return calculateTerm( 2 , returnList);
        }
    }


    /* This recursive function is called by the public overloaded function of the same name. It adds the sum of the two
    * previous terms together to the list and calls itself until the current term number is equal to the fibonacci term
    * number specified by the class */
    private ArrayList<BigInteger> calculateTerm(int currentTermNumber  , ArrayList<BigInteger> returnList){

        if(currentTermNumber == fibonacciTermNumber){
            returnList.add(  returnList.get( currentTermNumber - 1 ).add( returnList.get( currentTermNumber - 2 ) )  );
            return returnList;
        } else {
            returnList.add( returnList.get( currentTermNumber - 1 ).add( returnList.get( currentTermNumber - 2 ) )  );
            return calculateTerm( ++currentTermNumber , returnList);
        }

    }


}
