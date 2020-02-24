package sample.java.test.examples;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FunctionalLazyEvaluationExample {

    @Test
    public void multipleNoSimple() {
        List<Integer> numbers  = Arrays.asList(1,2,3,4,5);
        numbers.stream().map(number -> number * 2).forEach(System.out::println);
    }

    @Test
    public void multiplicationWithExternalNumber() {
        List<Integer> numbers  = Arrays.asList(1,2,3,4,5);
        final Integer multipler = 2;
        numbers.stream().map( number -> number*multipler).forEach(System.out::println);
    }

    @Test
    public void multiplicationWithLazyInitizaliation() {
        List<Integer> numbers  = Arrays.asList(1,2,3,4,5);
        final Integer[] multipler = {2};

        Stream<Integer> integerStream = numbers.stream().map(number -> number * multipler[0]);
         multipler[0] = 3;   // Value updated from 3 to 2. Lazy Evaulation Example {Poor Programming exampe though :)}
        integerStream.forEach(System.out::println); // If you see the Lazy Initilization Kicks in here and the value is updated to 3 and not 2 as defined earlier
    }
}
