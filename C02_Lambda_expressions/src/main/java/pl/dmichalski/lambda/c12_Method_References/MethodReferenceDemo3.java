package pl.dmichalski.lambda.c12_Method_References;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Reference to an instance method of an arbitrary object
 * of  a particular type ==> ContainingType::methodName
 * Author: Daniel
 */
public class MethodReferenceDemo3 {

    public static void main(String[] args) {
        List<Color> colorList = Arrays.asList(
                new Color("Red"), new Color("Yellow"),
                new Color("Blue"), new Color("White"));

//        List<String> colorNameList = applyFunction(colorList, x -> x.getName());
        List<String> colorNameList = applyFunction(colorList, Color::getName);
        System.out.println(colorNameList);
    }

    public static List<String> applyFunction(List<Color> list, Function<Color, String> function) {
        List<String> returnList = new ArrayList<>();
        list.forEach(x -> returnList.add(function.apply(x)));
        return returnList;
    }

}

class Color {

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
