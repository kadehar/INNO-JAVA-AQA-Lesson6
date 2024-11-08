package com.github.kadehar.inno.lesson6.endings;

public class HoursEndingsProvider extends BaseEndingsProvider {

    @Override
    public String provide(long count) {
        return super.provide(count, "час", "часа", "часов");
    }
}
