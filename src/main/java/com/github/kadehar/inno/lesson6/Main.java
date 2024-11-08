package com.github.kadehar.inno.lesson6;

import com.github.kadehar.inno.lesson6.timestamp.HumanReadableTimestamp;
import com.github.kadehar.inno.lesson6.timestamp.SocialNetworkPostTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        HumanReadableTimestamp timestamp = new SocialNetworkPostTimestamp();
        // 1. Опубликовано вчера
        LocalDate publishDate = LocalDate.now().minusDays(1);
        LocalTime publishTime = LocalTime.now();
        LocalDateTime eventTimestamp = LocalDateTime.of(publishDate, publishTime);
        System.out.println(timestamp.getTimestamp(eventTimestamp));

        // 2. Опубликовано X минут назад
        publishDate = LocalDate.now();
        publishTime = LocalTime.now().minusMinutes(50);
        eventTimestamp = LocalDateTime.of(publishDate, publishTime);
        System.out.println(timestamp.getTimestamp(eventTimestamp));

        // 3. Опубликовано Х часов назад
        publishTime = LocalTime.now()
                .minusHours(11)
                .minusMinutes(50);
        eventTimestamp = LocalDateTime.of(publishDate, publishTime);
        System.out.println(timestamp.getTimestamp(eventTimestamp));

        // 4. Опубликовано Х дней назад
        publishDate = LocalDate.now().minusDays(101);
        eventTimestamp = LocalDateTime.of(publishDate, publishTime);
        System.out.println(timestamp.getTimestamp(eventTimestamp));
    }
}
