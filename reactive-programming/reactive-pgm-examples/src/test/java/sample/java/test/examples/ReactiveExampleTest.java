package sample.java.test.examples;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.client.ExpectedCount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sample.java.examples.pojo.Person;
import sample.java.examples.pojo.PersonCommand;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;

@Slf4j
public class ReactiveExampleTest {
    Person viveka = new Person("Vivek","Chutke");
    Person tom = new Person("Tom", "Cruise");
    Person james = new Person("James", "Bond");
    Person jennifer = new Person("Jennifer", "Lopaz");
    Person jason = new Person("Jason","Roy");

    @Test
    public void monoTest()  {
        // Creating a Mono Object
        Mono<Person> monoPerson = Mono.just(viveka);
        // Getting a Person object from mono publisher
        Person person = monoPerson.block();
        log.info(person.sayMyName());
    }

    @Test
    public void monoTransform() {
        Mono<Person> personMono = Mono.just(tom);
        PersonCommand command = personMono.map( person -> new PersonCommand(person)).block();
        log.info(command.sayMyName());
    }

    @Test()
    public void monoFilter() {
        Mono<Person> personMono = Mono.just(jennifer);
        Person person1 = personMono.filter(person -> person.getFirstName().
                equalsIgnoreCase("Jennifer Lopaz")).block();
        Assertions.assertThrows(NullPointerException.class,() -> log.info(person1.sayMyName()));
    }

    @Test
    public void fluxTest() {
        Flux<Person> personFlux = Flux.just(viveka,jennifer);
        personFlux.subscribe(person -> log.info(person.sayMyName()));
    }

    @Test
    public void fluxTestFilter() {
        Flux<Person> personFlux = Flux.just(viveka,james,tom);
        personFlux.filter(person -> person.sayMyName()
                .equalsIgnoreCase(viveka.sayMyName()))
                .subscribe(person -> log.info(person.sayMyName()));
    }

    @Test
    public void fluxTestDelayNoOutput() {
        Flux<Person> people = Flux.just(james,jennifer,viveka,jason);
        people.delayElements(Duration.ofSeconds(1))
                .subscribe(person -> log.info(person.sayMyName()));
    }

    @Test
    public void fluxTestDelay() throws InterruptedException {
        CountDownLatch  countDownLatch = new CountDownLatch(1);
        Flux<Person> people = Flux.just(james,jennifer,viveka,jason);
        people.delayElements(Duration.ofSeconds(1)).doOnComplete(countDownLatch::countDown).subscribe(person -> log.info(person.sayMyName()));
        countDownLatch.await();
    }
}
