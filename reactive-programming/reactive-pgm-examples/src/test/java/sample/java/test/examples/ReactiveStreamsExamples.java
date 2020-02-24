package sample.java.test.examples;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;

public class ReactiveStreamsExamples {

  @Test
  public void simpleStreamExample() {
      Flux<String> nameFlux = Flux.just("Sam","Jack","Tom","Jerry","Elvis","James","Bond","SomeOtherName");
      nameFlux.toStream().forEach(System.out::println);
    }

    @Test
    public void simpleStreamExampleWithSubscribe() {
      // This method behaves the same way as simpleStreamExample but with an subscriber as Flux and Mono both implement CorePublisher
        Flux<String> nameFlux = Flux.just("Sam","Jack","Tom","Jerry","Elvis","James","Bond","SomeOtherName");
        nameFlux.subscribe(System.out::println);
        nameFlux.subscribe( name -> System.out.println(name.toUpperCase()));
    }

    @Test
    public void triggerSubscributionOnaFluxObject() {
        Flux<String> nameFlux = Flux.just("Sam","Jack","Tom","Jerry","Elvis");
        nameFlux.doOnEach(name-> System.out.println(name.get())).subscribe();
        // This method creates an additional null object which is null
    }

    @Test
    public void streamExampleWithSubscriberAndConsumer() {
        Flux<String> nameFlux = Flux.just("Sam","Jack","Tom","Jerry","Elvis");

        // Subscriber lambda
        Consumer<String> println = System.out::println;
        // Error Handler
        Consumer<Throwable> errorHandler = e-> System.out.println("Some Error Occured");
        // Runnable Upon Complete
        Runnable allDone = () -> System.out.println("Its Done");
        // Triggering Subscription
        nameFlux.subscribe(println, null, allDone);

    }

}
