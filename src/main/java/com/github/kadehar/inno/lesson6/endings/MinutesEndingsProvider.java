package com.github.kadehar.inno.lesson6.endings;

public class MinutesEndingsProvider extends BaseEndingsProvider {

    @Override
    public String provide(long count) {
        return super.provide(count, "минуту", "минуты", "минут");
    }
}
