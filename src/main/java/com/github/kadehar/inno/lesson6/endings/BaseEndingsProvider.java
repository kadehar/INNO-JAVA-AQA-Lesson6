package com.github.kadehar.inno.lesson6.endings;

/**
 * Класс, предоставляющий пользователю слова с верным окончанием.
 */
abstract public class BaseEndingsProvider {

    /**
     * Предоставляет пользователю слово с верным окончанием.
     *
     * @param number Число по которому будут определяться окончания.
     * @param words  Массив слов, который используется для окончаний.
     * @return Слово с верным окончанием.
     */
    protected String provide(long number, String... words) {
        long remainder = number % 10;
        if (remainder == 1 && number != 11) {
            return words[0];
        } else if (remainder >= 2 && remainder <= 4 && !(number >= 12 && number <= 14)) {
            return words[1];
        } else {
            return words[2];
        }
    }

    abstract public String provide(long count);
}
