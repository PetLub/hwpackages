import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.hwpackage.VacationService;

public class VacationServiceTest {
    @ParameterizedTest
    // @CsvSource({
    //        "3, 10000, 3000, 20000",
    //        "2, 100000, 60000, 150000"
    // })
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void testEconomicalVacation(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        // int expected = 3;
        // int income = 10_000; // доход за месяц работы
        // int expenses = 3_000; // ежемесячный расход
        // int threshold = 20_000; // минимальная сумма на счету для отдыха

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    // @Test
    // public void testRichVacation() {
    // VacationService service = new VacationService();
    // int expected = 2;
    // int income = 100_000; // доход за месяц работы
    // int expenses = 60_000; // ежемесячный расход
    // int threshold = 150_000; // минимальная сумма на счету для отдыха;

    // int actual = service.calculate(income, expenses, threshold);

    // Assertions.assertEquals(expected, actual);

}

