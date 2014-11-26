package pl.dmichalki.c01;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author: Daniel
 */
public class SecondExample {

    public boolean idTodayAfterTommorrow() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        return tomorrow.isAfter(today);
    }

    public DayOfWeek getLastDayOfMonth() {
        TemporalAdjuster adjuster = TemporalAdjusters.lastDayOfMonth();
        return LocalDate.now().with(adjuster).getDayOfWeek();
    }

    public int howManyDaysUntilLongestDayOfTheYear() {
        LocalDate today = LocalDate.now();
        LocalDate longestDay = today.with(Month.JUNE).withDayOfMonth(21);
        return Period.between(today, longestDay).getDays();
    }

    public Duration howLongUntilNewYear() {
        ZonedDateTime here = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime getNewYear = ZonedDateTime.of(2014, 12, 31, 23, 59, 59, 0, ZoneId.of("Europe/London"));
        return Duration.between(here, getNewYear);
    }

    public List<DayOfWeek> lastDaysOfMonthsInYear(final int year) {
        List<DayOfWeek> dayOfWeeks = new ArrayList<DayOfWeek>();
        /*
          for (Month month : Month.values()) {
            DayOfWeek day = LocalDate.now()
                    .withYear(year)
                    .with(month)
                    .with(TemporalAdjusters.lastDayOfMonth())
                    .getDayOfWeek();
            dayOfWeeks.add(day);
          }
        */
        // or
        return Stream.of(Month.values()).map(month -> LocalDate.now()
                .withYear(year)
                .with(month)
                .with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek()).collect(Collectors.toList());
    }
}
