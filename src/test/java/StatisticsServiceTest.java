package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMaxWhenAllValuesAreEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 5, 5, 5, 5};
        long expected = 5;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsAtTheEnd() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 2, 3, 4, 9};
        long expected = 9;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsAtTheBeginning() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {9, 2, 3, 4, 1};
        long expected = 9;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-1, -2, -3, -4, -5};
        long expected = -1;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithMixedPositiveAndNegativeValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-1, 5, -3, 10, -4};
        long expected = 10;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }
}