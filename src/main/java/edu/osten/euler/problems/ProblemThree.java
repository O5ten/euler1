package edu.osten.euler.problems;

import java.util.ArrayList;
import java.util.List;

import static edu.osten.math.utils.MathOperations.isEven;
import static edu.osten.math.utils.MathOperations.isPrime;
import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

/**
 * Created by osten on 2014-05-24.
 */
public class ProblemThree {

    public List<Double> primeFactorsFrom( double factor ){
        ArrayList<Double> list = new ArrayList<>();
        while ( !isPrime( factor ) )
            for ( double i = 2; i < factor; i++ ){
                if( isPrime( i ) ){
                    double result = ( factor / i);
                    if ( isEven( result ) ){
                        factor = factor / i;
                        list.add( i );
                    }
                }
            }
        list.add( factor );
        return list;
    }
}
