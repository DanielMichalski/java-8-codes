package pl.dmichalski.lambda.c07_Supplier_functional_interface.factory;

import java.util.function.Supplier;

/**
 * Author: Daniel
 */
public class Factory<X> {

    public X getX(Supplier<? extends X> supplier) {
        return supplier.get();
    }

}
