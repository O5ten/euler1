package edu.osten.euler.tests;

import edu.osten.euler.problems.ProblemOne;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

/**
 * Created by osten on 2014-05-22.
 */
public class ProblemOneTest {

    ProblemOne problem = new ProblemOne();

    @Test
    public void shouldReturnThreeFiveSixAndNine(){
        List<Integer> numbers = problem.listAllNaturalNumbersBelowTenThatAreMultiplesOfFiveAndthree();
        assertThat( numbers, contains( 3, 5, 6, 9) );
    }

    @Test
    public void shouldSumToTwentyThree(){
        List<Integer> numbers = problem.listAllNaturalNumbersBelowTenThatAreMultiplesOfFiveAndthree();
        assertThat(problem.sum(numbers), is( 23));
    }
}
