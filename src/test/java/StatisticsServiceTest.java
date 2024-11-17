import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.statistic.StatisticsService;

public class StatisticsServiceTest {

    @Test
    void shouldReturnMaxFromPositiveNumbers() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {3, 5, 10, 7}; // Нормальный случай, где есть разные положительные числа
        long expected = 10; // Максимальное значение
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxWhenAllNumbersAreEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 5, 5, 5}; // Все числа одинаковы
        long expected = 5; // Любое число можно считать максимальным
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxFromNegativeNumbers() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-3, -5, -10, -7}; // Все числа отрицательные
        long expected = -3; // Наименьшее отрицательное число (ближе к 0) является максимальным
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxFromSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {42}; // Только один элемент в массиве
        long expected = 42; // Этот элемент и есть максимальный
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxFromDuplicateMaxValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {6, 8, 8, 3, 5}; // Несколько одинаковых максимальных значений
        long expected = 8; // Максимальное значение, которое встречается несколько раз
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxFromDescendingOrder() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {10, 5, 3, 1}; // Числа в порядке убывания
        long expected = 10; // Первое число — максимальное
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxFromMixedPositiveAndNegativeNumbers() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-3, 5, -10, 7}; // Смешанные положительные и отрицательные числа
        long expected = 7; // Максимальное положительное число
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}