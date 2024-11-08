package com.github.kadehar.inno.lesson6.timestamp;

import com.github.kadehar.inno.lesson6.endings.BaseEndingsProvider;
import com.github.kadehar.inno.lesson6.endings.DaysEndingsProvider;
import com.github.kadehar.inno.lesson6.endings.HoursEndingsProvider;
import com.github.kadehar.inno.lesson6.endings.MinutesEndingsProvider;

import java.time.Duration;
import java.time.LocalDateTime;

public class SocialNetworkPostTimestamp implements HumanReadableTimestamp {

    private final BaseEndingsProvider minutesProvider = new MinutesEndingsProvider();
    private final BaseEndingsProvider hoursProvider = new HoursEndingsProvider();
    private final BaseEndingsProvider daysProvider = new DaysEndingsProvider();

    @Override
    public String getTimestamp(LocalDateTime eventTimestamp) {
        Duration duration = Duration.between(eventTimestamp, LocalDateTime.now());
        String eventDurationText;
        if (duration.toHours() < 1) {
            long minutes = duration.toMinutes();
            eventDurationText = String.format("%d %s", minutes, minutesProvider.provide(minutes));
        } else if (duration.toHours() < 24) {
            long hours = duration.toHours();
            eventDurationText = String.format("%d %s", hours, hoursProvider.provide(hours));
        } else if (duration.toHours() == 24) {
            return "Опубликовано вчера";
        } else {
            long days = duration.toDays();
            eventDurationText = String.format("%d %s", days, daysProvider.provide(days));
        }
        return String.format("Опубликовано %s назад", eventDurationText);
    }
}
