package pl.dmichalki.c01;

import java.time.*;

/**
 * Author: Daniel
 */
public class Example1 {

    public LocalDate getHenryBirthday() {
        return LocalDate.of(1491, Month.JUNE, 28);
    }

    public LocalTime getSampleLocalTime() {
        return LocalTime.of(13, 51);
    }

    public LocalDateTime getSampleLocalDateTime() {
        return LocalDateTime.of(1941, Month.JUNE, 28, 13, 51);
    }

    public LocalDateTime getComponentDateTime() {
        return LocalDateTime.of(getHenryBirthday(), getSampleLocalTime());
    }

    public LocalDate getTodayFromLocalDateTime() {
        return LocalDateTime.now().toLocalDate();
    }

    public int getDifferenceBetweenParisAndLondon() {
        ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
        return paris.getHour() - london.getHour();
    }

}
