package pl.dmichalski.lambda.c05_Mixins.model.interfaces;

/**
 * Author: Daniel
 */
public interface InvestorIF {

    default void buyShares() {
        System.out.println("Investor bought shares...");
    }

    default void sellShares() {
        System.out.println("Investor sold shares...");
    }

}
