package pl.dmichalski.lambda.c05_Mixins;

import pl.dmichalski.lambda.c05_Mixins.model.Person;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        Person person = new Person();
        person.buyShares();
        person.sellShares();
        person.buySomething();
        person.signIn();
        person.signOut();
    }

}
