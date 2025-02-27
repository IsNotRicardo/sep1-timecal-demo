import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TimeCalTest {
    @Test
    public void testTimeCalculator() {
        double distance1 = 100;
        double distance2 = 200;
        double distance3 = 300;
        double speed1 = 20;
        double speed2 = 50;
        double speed3 = 30;
        assertEquals(5, TimeCal.timeCalculator(distance1, speed1), 0);
        assertEquals(4, TimeCal.timeCalculator(distance2, speed2), 0);
        assertEquals(10, TimeCal.timeCalculator(distance3, speed3), 0);
    }
}
