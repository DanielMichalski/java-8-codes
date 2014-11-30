package pl.dmichalski.lambda.c06_Function_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Author: Daniel
 */
public class FunctionDemo<X, Y> {

    public List<Y> applyFunction(Function<X, Y> function, List<X> list) {
        List<Y> returnList = new ArrayList<>();
        list.forEach(x -> returnList.add(function.apply(x)));
        return returnList;
    }

    public List<Y> applyFunctionAndThen(Function<X, Y> function1, Function<Y, Y> function2, List<X> list) {
        List<Y> returnList = new ArrayList<>();
        list.forEach(x -> returnList.add(function1.andThen(function2).apply(x)));
        return returnList;
    }

    public List<Y> applyFunctionCompose(Function<Y, Y> function1, Function<X, Y> function2, List<X> list) {
        List<Y> returnList = new ArrayList<>();
        list.forEach(x -> returnList.add(function1.compose(function2).apply(x)));
        return returnList;
    }

}
