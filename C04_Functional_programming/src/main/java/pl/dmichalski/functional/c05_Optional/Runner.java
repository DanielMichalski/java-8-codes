package pl.dmichalski.functional.c05_Optional;

import java.util.Optional;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        Optional<String> optionalName = Optional.of("Lorem Ipsum");

        assert optionalName.isPresent();
        assert optionalName.get().equals("Lorem ipsum");

        Optional<String> noName = Optional.of(null);
        assert optionalName.orElse("qweasdzxc").equals("qweasdzxc");

    }

}
