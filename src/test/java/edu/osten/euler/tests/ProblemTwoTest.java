package edu.osten.euler.tests;

import edu.osten.euler.problems.ProblemTwo;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static edu.osten.math.utils.MathOperations.even;
import static edu.osten.math.utils.MathOperations.sum;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by osten on 2014-05-22.
 */
public class ProblemTwoTest {

    ProblemTwo problem = new ProblemTwo();

    @Test
    public void sumOfFiveFibonacciIsNineteen(){
        assertThat( sum( problem.fibonacciSeriesUntil( 5 ) ), is( 6 ) );
    }

    @Test
    public void sumEvenValuesOfFiveFibonacciShouldBe(){
        assertThat( sum( even( problem.fibonacciSeriesUntil( 40 ))), is( 44 ));
    }

    @Test
    public void answer(){
        List<Integer> numbers = problem.fibonacciSeriesUntil( 4_000_000 );
        System.out.println("Problem 2: =======>" + sum( even( numbers ) ) + "<======");
        assertThat( sum( even( numbers ) ), is( 4613732 ) );
    }
}
