package superextends;

import java.util.ArrayList;
import java.util.List;

/**
 *     A1
 *    /  \
 *   A2  A3
 *      /  \
 *    A4   A5
 */
public class App {

    public static void main(String[] args) {
        List<? extends A3> list1 = new ArrayList<A4>();
//        List<? extends A3> list2 = new ArrayList<A1>(); // compile error
        List<? super A3> list3 = new ArrayList<A1>();
//        List<? super A3> list4 = new ArrayList<A4>(); // compile error
    }
}
