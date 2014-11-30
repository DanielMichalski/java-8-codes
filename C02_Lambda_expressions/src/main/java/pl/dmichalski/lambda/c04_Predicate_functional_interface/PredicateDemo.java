package pl.dmichalski.lambda.c04_Predicate_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Author: Daniel
 */
public class PredicateDemo<T> {

    public List<T> testPredicate(Predicate<T> p, List<T> list) {
        List<T> returnList = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public List<T> testPredicateNEGATE(Predicate<T> p, List<T> list) {
        return list.stream().filter(t -> p.negate().test(t)).collect(Collectors.toList());
    }

    public List<T> testPredicateOR(Predicate<T> p1, Predicate<T> p2, List<T> list) {
        return list.stream().filter(t -> p1.or(p2).test(t)).collect(Collectors.toList());
    }

    public List<T> testPredicateAND(Predicate<T> p1, Predicate<T> p2, List<T> list) {
        return list.stream().filter(t -> p1.and(p2).test(t)).collect(Collectors.toList());
    }

}
