import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ProjectReactor {

    public static void main(String[] args) {
        Flux.just("a", "b", "c")
                .map(s -> s.concat(" letter"))
                .subscribe(p -> {
                    System.out.println("peng-li");
                    System.out.println(p);
                },
                        e -> {
                            System.out.println(e);
                        });

//        Mono.just("String")
//                .map(s -> s.concat(" abc"))
//                .subscribe(System.out::println);
    }
}
