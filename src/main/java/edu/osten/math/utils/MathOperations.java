package edu.osten.math.utils;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.util.List;

import static com.google.common.collect.Iterables.filter;
import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

/**
 * Created by osten on 2014-05-22.
 */
public class MathOperations {

    public static int sum( Iterable<Integer> numbers ){
        Integer s = 0;
        for( Integer n : numbers ){
            s+=n;
        }
        return s;
    }

    public static <T extends Number> Iterable<T> even( Iterable<T> iterable ){
        return filter(iterable, new Predicate<T>() {
            @Override
            public boolean apply(T value) {
                return Math.floor(value.doubleValue()/2) - value.doubleValue()/2 == 0;
            }
        });
    }

    public static boolean isPrime( double number ){
        double divisor = 2;

        if( number < divisor){
           return false;
        }

        while ( divisor <= sqrt( number ) ){
            if ( isEven( number / divisor )){
                return false;
            }
            divisor++;
        }
        return true;
    }

    public static boolean isEven( double candidate ){
        double a = candidate;
        double b = floor( candidate );

        if ( a == b ){
            return true;
        }
        return false;
    }
}
