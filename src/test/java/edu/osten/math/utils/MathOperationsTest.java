package edu.osten.math.utils;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;
import static edu.osten.math.utils.MathOperations.even;
import static edu.osten.math.utils.MathOperations.sum;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.Is.is;

/**
 * Created by osten on 2014-05-22.
 */
public class MathOperationsTest {

    @Test
    public void shouldSumList(){
        assertThat( sum( newArrayList( 1,2,3 ) ), is( 6 ) );
    }

    @Test
    public void shouldConsistOfEvenNumbers(){
        assertThat( even( newArrayList(1, 2, 3) ), contains( 2 ) );
        assertThat( even( newArrayList(1, 2, 3) ), not( contains(1, 3) ) );
    }
}
