package pl.dmichalski.lambda.c08_UnaryOperator_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Author: Daniel
 */
public class UnaryOperatorDemo<X> {

    public List<X> applyFunction(UnaryOperator<X> unaryOperator, List<X> list) {
        List<X> returnList = new ArrayList<>();
        list.forEach(x -> returnList.add(unaryOperator.apply(x)));
        return returnList;
    }

    public List<X> applyFunctionAndThen(UnaryOperator<X> unaryOperator1, UnaryOperator<X> unaryOperator2, List<X> list) {
        List<X> returnList = new ArrayList<>();
        list.forEach(x -> returnList.add(unaryOperator1.andThen(unaryOperator2).apply(x)));
        return returnList;
    }

    public List<X> applyFunctionCompose(UnaryOperator<X> unaryOperator1, UnaryOperator<X> unaryOperator2, List<X> list) {
        List<X> returnList = new ArrayList<>();
        list.forEach(x -> returnList.add(unaryOperator1.compose(unaryOperator2).apply(x)));
        return returnList;
    }

}
