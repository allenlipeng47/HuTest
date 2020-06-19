package flux;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.util.concurrent.Executors;

@RequiredArgsConstructor
public class App {

    public static void main(String[] args) {
        monoZipWhen();
    }

    private static String[] strs = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};

    private static int outputThread(int i) {
        System.out.println("fetch data " + Thread.currentThread().getName() + " " + i);
        return i;
    }


    private static Scheduler scheduler = Schedulers.fromExecutor(Executors.newFixedThreadPool(6));

    public static void monoZipWhen() {
        Mono<Integer> f1 = Mono.just(3);
        Mono<Integer> f3 = f1.zipWhen(i -> Mono.just(i + 1), (i1, i2) -> i1 * i2);
        // i -> i + 1, (i + 1) * i
        f3.subscribe(System.out::println);
    }

    public static void zipWith() {
        Flux<Integer> f1 = Flux.just(1, 2, 3);
        Flux<Integer> f2 = Flux.just(4, 5, 6, 7);
        Flux<Integer> f3 = f1.zipWith(f2, (i1, i2) -> i1 * i2);
        f3.subscribe(System.out::println);
    }
    public static void fibonacciGenerator() {
        Flux<Integer> flux = Flux.generate(
                () -> new int[]{0, 1},  // initial state, state can be a string, int, List or anything
                                        // state will be used for the update. Here I used a int[2]
                (state, sink) -> {
                    sink.next(state[0]);    // next(), to emit a value.
                    System.out.println(state[0]);
                    int value = state[0] + state[1];
                    state[0] = state[1];
                    state[1] = value;
                    if (state[1] > 100) {
                        sink.complete();    // complete(), indicate the generator finishes
                    }
                    return state;
                }
        );
        flux.log()
                .subscribe();
    }

    private static String get() {
        return "asdfsa";
    }

    public static void test1() {
        Mono<String> value = Mono.fromCallable(() -> "asdf");
    }

    //    Read 9.8.4 part in https://projectreactor.io/docs/core/release/reference/#context
    public static void context() {
        String key = "message";

        // 1. flatMap, Function<T, Mono<R>>, transform from T to Mono<R>
        Mono.just("hello")
                .flatMap(s -> Mono.just(1))     // Mono in the return
                .subscribe(System.out::println);

        // 2. Transform from ctx to
        Mono.just("hello")
                .subscriberContext()
                .map(ctx -> 1); // Function<Context, Mono<R>> , transform Context to another Mono<R>
                                // Value in the return

        /**
         * Read from context and put it into the value.
         * Sequence can't be reversed. Read first, write second
         */
        Flux<String> flux = Flux.just("a", "b", "c")
                .flatMap(s -> Mono.subscriberContext()          // 1. these two lines are for reading the data in context
                        .map(ctx -> s + " " + ctx.get(key)))
                .subscriberContext(ctx -> ctx.put(key, "world"));  // 2. putting data into context.

        flux.subscribe(System.out::println);

    }

    private static void signal() {
        Flux<String> flux = Flux.just("a", "b", "c");
        flux.doOnEach(p -> {    // p is the signal. 4 types signal: subscribe, next, error, complete
            System.out.println(p + "\tsubscribe: " + p.isOnSubscribe()
                    + "\tnext: " + p.isOnNext()
                    + "\terror: " + p.isOnError()
                    + "\tcomplete: " + p.isOnComplete()
                    + "\ttype: " + p.getType()
                    + "\tvalue: " + p.get());
        }).subscribe();
    }

    private static String getStringFromIndex(int i) {
        System.out.println(Thread.currentThread().getName()+ " found " + i);
        return strs[i];
    }

    public static void staticMapping() {
        Flux f = Flux.range(0, 4)
                .map(App::getStringFromIndex);
        f.subscribe();
    }
}
