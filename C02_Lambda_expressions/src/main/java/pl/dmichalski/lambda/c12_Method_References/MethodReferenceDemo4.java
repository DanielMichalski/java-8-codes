package pl.dmichalski.lambda.c12_Method_References;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Reference to an instance method of a particular object ==>
 * <pre>ContainingObject::instanceMethodName</pre>
 * Author: Daniel
 */
public class MethodReferenceDemo4 {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        MethodReferenceDemo4.acceptConsumer(numberList, System.out::println);
    }

    public static void acceptConsumer(List<Integer> list, Consumer<Integer> consumer) {
//        list.forEach(x -> consumer.accept(x));
        list.forEach(consumer::accept);
    }

}
