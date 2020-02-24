package sample.java.examples.pojo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

//	List<String> collect =
        Stream.of("one","two","three","someName","five").filter(n -> n.length() > 3 )
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).forEach(name -> System.out.println(name));

//	for(String a : collect) {
//		System.out.println(a);
//	}

        // filter: returns a Stream with the elements “B” and “B” because only elements that are equal to “B” will pass the filter operation.
        Stream.of("B", "A", "C" , "B")
                .filter(s -> s.equals("B")).forEach( s -> System.out.println("Filter Criteria:"+s));


        // map: is a Stream with the elements “b”, “a”, “c” and “b” because each element will be mapped (converted) to its lower case representation.
        Stream.of("B", "A", "C" , "B")
                .map(s -> s.toLowerCase()).forEach(n -> System.out.println("Map:"+n));


        // distinct: is a Stream with the elements “B”, “A” and “C” because only unique elements will pass the distinct operation.
        Stream.of("B","A","a","A", "C" , "B").distinct().forEach(n ->System.out.println("Distinct: "+n));

        // sorted: 	returns a Stream with the elements “A”, “B”, “B” and “C” because the sort operation will sort all elements in the stream in natural order.
        Stream.of("B", "A", "C" , "B").sorted().forEach(n -> System.out.println("Sorted: "+n));
        Stream.of("B", "A", "C" , "B").sorted(Comparator.reverseOrder()).forEach(n -> System.out.println("Sorted Reverse Order: "+n));

        // limit: is a Stream with the elements “B” and “A” because after the two first elements the rest of the elements will be discarded.
        Stream.of("B", "A", "C" , "B").limit(2).forEach(n -> System.out.println("Limit: "+n));

        // skip: is a Stream with the elements “A”, “C” and “B” because the first element in the stream will be skipped.
        Stream.of("B", "A", "C" , "B").skip(2).forEach(n -> System.out.println("Skip: "+n));

        // flatMap: returns a Stream with the elements “B”, “A”, “C” and “B” because the two streams (that each contain two elements) are “flattened” to a single Stream with four elements.
        Stream.of(
                Stream.of("B", "A"),
                Stream.of("C", "B")
        ).flatMap(Function.identity()).forEachOrdered(System.out::println);

        Stream<String> flatMap = Stream.of(
                Arrays.asList("B", "A"),
                Arrays.asList("C", "B")
        ).flatMap(l -> l.stream());

        // peek: Is a Stream with the elements “B”, “A”, “C” and “B” but, when consumed in its entirety, will print out the text “BACB” as a side effect. Note that side effect usage in stream are discouraged. Use this operation for debug only.
        Stream.of("A", "D", "B" , "C","E").peek(System.out::print);

        // parallel: is a Stream with the elements “B”, “A”, “C” and “B” but, when consumed, elements in the Stream may be propagated through the pipeline using different Threads. By default, parallel streams are executed on the default ForkJoinPool.
        Stream.of("B", "A", "C" , "B").parallel();
    }

}

