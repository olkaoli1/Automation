package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxWithNegativeValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-3, -8, -12, -1, -5};
        long expected = -1;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxWithSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {42};
        long expected = 42;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxWithDuplicateMaxValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {6, 8, 8, 3, 5};
        long expected = 8;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxWhenSortedDescending() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {10, 5, 3, 1};
        long expected = 10;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxWithAllEqualValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7, 7, 7, 7};
        long expected = 7;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxWithMixedPositiveAndNegativeValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-10, -20, 15, -5, 0};
        long expected = 15;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxWithLargeArray() {
        StatisticsService service = new StatisticsService();
        long[] incomes = new long[1000];
        for (int i = 0; i < incomes.length; i++) {
            incomes[i] = i;
        }
        long expected = 999;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}