import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class App {

    @Rule
    public static TemporaryFolder tmpFolder = new TemporaryFolder();

    public static void main(String[] args) throws IOException {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(1);
        System.out.println(linkedHashSet);
    }
}
