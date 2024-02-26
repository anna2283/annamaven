import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1_000;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected,actual);


    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected,actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1_000;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected,actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected,actual);

    }
}



