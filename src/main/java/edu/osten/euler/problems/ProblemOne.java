package edu.osten.euler.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by osten on 2014-05-22.
 */
public class ProblemOne {

    public List<Integer> listAllNaturalNumbersBelowTenThatAreMultiplesOfFiveAndthree( int limit ){
        ArrayList<Integer> list = new ArrayList();
        for( int i = 1; i < limit; i++ ){

            if( i % 3 == 0 ) {
                list.add(i);
                continue;
            }

            if( i % 5 == 0) {
                list.add(i);
                continue;
            }
        }
        return list;
    }

    public int sum(Iterable<Integer> toSum){
        int sum = 0;
        for( int i : toSum ){
            sum += i;
        }
        return sum;
    }
}
