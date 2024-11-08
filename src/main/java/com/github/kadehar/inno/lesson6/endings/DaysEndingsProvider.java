package com.github.kadehar.inno.lesson6.endings;

public class DaysEndingsProvider extends BaseEndingsProvider {

    @Override
    public String provide(long count) {
        return super.provide(count, "день", "дня", "дней");
    }
}
