package sample.java.test.examples;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAndParallelStreamExample {

    @Test
    public void simpleStreamExample() {
        List<String> names = Arrays.asList("Sam","Jack","Tom","Jerry","Elvis");
        names.stream().forEach(System.out::println);
    }

    @Test
    public void parellelStreamExample() {
        List<String> names = Arrays.asList("Sam","Jack","Tom","Jerry","Elvis");
        names.parallelStream().forEach(System.out::println); // Use onky if you are working with tons of data. Else using parallelStream does not make sense using it
    }

    @Test
    public void mapStreamAndMethodReferenceExample() {
        List<String> names = Arrays.asList("Sam","Jack","Tom","Jerry","Elvis","James","Bond");
        names.stream().map(String::length).forEach(System.out::println);
        System.out.println("Converting all names to upperCase");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

    }

    @Test
    public void filterSortCollectAndJoinExample() {
        List<String> names = Arrays.asList("Sam","Jack","Tom","Jerry","Elvis","James","Bond");
        String namesJoined = names.stream().filter(name -> name.length() > 3).sorted().collect(Collectors.joining(", "));
        System.out.println("All Names together are: "+namesJoined);
    }

    @Test
    public void InterestingSummaryOfStatistics(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Printing the Statistics Summary:" +intSummaryStatistics.toString());
//        numbers.stream().mapToInt(x -> x).spliterator();
    }

    @Test
    public void groupinpExample() {
        List<String> names = Arrays.asList("Sam","Jack","Tom","Jerry","Elvis","James","Bond","SomeOtherName");
        final Map<Integer, Set<String>> nameCollection = names.stream().collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        final Stream<Map.Entry<Integer, Set<String>>> stream = nameCollection.entrySet().stream();
        stream.forEach(System.out::println);
    }

    @Test
    public void flatMapExample() {
        List<List> listOfLists = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5));
        listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList()).forEach(System.out::println);
//        listOfLists.stream().flatMap(
    }

    @Test
    public void StreamOfStreamFlatMapExample() {
        Stream.of(
                Stream.of("B", "A"),
                Stream.of("C", "B")
        ).flatMap(Function.identity()).forEachOrdered(System.out::println);

        Stream<String> flatMap = Stream.of(
                Arrays.asList("B", "A"),
                Arrays.asList("C", "B")
        ).flatMap(l -> l.stream());
    }

}
