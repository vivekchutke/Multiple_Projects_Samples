package sample.java.test.examples;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FunctionalPgmExamples {
    /*
    4 properties of an Functional Programming
    1. Name
    2. Return Type
    3. Parameter List
    4. Body
    */

    @Test
    public void functionWith4ThingsLegacyWay() throws Exception {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am thread one");
            }
        });
        t1.start();
        System.out.println("In Main test for demonstrating the legacy way of writing a function");
    }

    @Test
    public void functionalProgrammingWithLamdaExpression() {

        Thread t1 = new Thread(() -> System.out.println("I am the thread from Lamdas"));
        t1.start();
        System.out.println("In Main thread for demonstarting the working of Lamdas");
    }

    @Test
    public void demoOfListIterationWithVariousWays() {
        // Creating a list of States
        List<String> usStates = Arrays.asList("California","New York","Texas","Ohio","Washington DC");

        // Legacy Way of printing the various States
        System.out.println("Legacy Way of printing US States:");
        for(int i=0 ; i< usStates.size() ; i++) {
            System.out.println(usStates.get(i));
        }

        // Using a consumer to Print US States
        System.out.println("Using a consumer to print US states");
        usStates.forEach(new Consumer<String>() {
            @Override
            public void accept(String state) {
                System.out.println(state);
            }
        });

        // Using the Lamda way
        System.out.println("Using the Lamda way of iterating through the collection");
        // Way 1
        usStates.stream().forEach( (String state) -> System.out.println(state));

        System.out.println("Using the Lamda without type declaration");
        // Way 2
        usStates.stream().forEach( (state) -> System.out.println(state));

        System.out.println("Using the Lamda without type function defination when we have only one variable in the function");
        // Way 3
        usStates.stream().forEach( state -> System.out.println(state));

        System.out.println("Using the Lamda with method references");
        // Way 4
        usStates.stream().forEach( System.out::println);
    }

    @Test
    public void stateCountWithSizCharacters() {
        // Creating a list of States
        List<String> usStates = Arrays.asList("California","New York","Texas","Ohio","Washington DC");

        System.out.println(//"Count of states with 5 characters long: "+
                usStates.stream().filter(state -> state.length() >= 5).collect(Collectors.toList()).size());

        //Filtering and printing the states
        usStates.stream().filter(state -> state.length() >= 5).collect(Collectors.toList()).forEach(System.out::println);
    }

}
