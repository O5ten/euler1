package edu.osten.euler.tests;

import edu.osten.euler.problems.ProblemThree;
import org.junit.Test;

import java.util.List;

import static edu.osten.math.utils.MathOperations.even;
import static edu.osten.math.utils.MathOperations.sum;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.Is.is;

/**
 * Created by osten on 2014-05-24.
 */
public class ProblemThreeTest {

    ProblemThree problem = new ProblemThree();

    @Test
    public void primeFactorOfThirteenThousandOneHundredAndNinetyFiveIsFiveSevenThirteenAndTwentyNine(){

        List<Double> list = problem.primeFactorsFrom( 13195d );
        assertThat( list, contains( 5d, 7d, 13d, 29d ) );
    }

    @Test
    public void answer(){
        List<Double> list = problem.primeFactorsFrom(600851475143d);
        assertThat( list, contains( 71d, 839d, 1471d, 6857d ) );
        System.out.println("Problem 2: =======>" + list.get(list.size()-1) + "<======");
    }
}
