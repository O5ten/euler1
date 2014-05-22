package edu.osten.euler.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by osten on 2014-05-22.
 */
public class ProblemOne {

    public List<Integer> listAllNaturalNumbersBelowTenThatAreMultiplesOfFiveAndthree(){
        ArrayList<Integer> list = new ArrayList();
        for( int i = 0; i < 10; i++ ){
            if( i == 0 )
                continue;

            if( i % 3 == 0 )
                list.add( i );

            if( i % 5 == 0)
                list.add( i );

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
