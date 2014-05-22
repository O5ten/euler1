package edu.osten.euler.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by osten on 2014-05-22.
 */
public class ProblemTwo {

    public List<Integer> fibonacciSeriesUntil(int limit){
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();

        fibonacci.add( 1 );
        fibonacci.add( 2 );
        int i = 1;
        while ( fibonacci.get( i ) + fibonacci.get( i - 1 ) < limit ){
            fibonacci.add( fibonacci.get( i ) + fibonacci.get( i - 1 ));
            i++;
        }

        return fibonacci;
    }

}
