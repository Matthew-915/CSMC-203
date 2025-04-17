/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: test HolidayBonus
 * Due: 4/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Matthew Chen
*/
import static org.junit.Assert.*;
import org.junit.Test;

public class HolidayBonusTestStudent {

    @Test
    public void testCalculateHolidayBonus() {
        double[][] data = {
            {1000, 2000},
            {3000},
            {4000, 5000}
        };
        double[] bonuses = HolidayBonus.calculateHolidayBonus(data);
        assertEquals(2000.0, bonuses[0], 0.01);
        assertEquals(2000.0, bonuses[1], 0.01);
        assertEquals(10000.0, bonuses[2], 0.01);
    }

    @Test
    public void testCalculateTotalHolidayBonus() {
        double[][] data = {
            {1500, 1500},
            {2500},
            {1000, 1000}
        };
        double[] bonuses = HolidayBonus.calculateHolidayBonus(data);
        double total = HolidayBonus.calculateTotalHolidayBonus(data);
        double sum = 0;
        for (double b : bonuses) sum += b;
        assertEquals(sum, total, 0.01);
    }

    @Test
    public void testNegativeValuesExcluded() {
        double[][] data = {
            {-1000, 2000},
            {3000},
            {4000, -500}
        };
        double[] bonuses = HolidayBonus.calculateHolidayBonus(data);
        assertEquals(5000.0, bonuses[0], 0.01);
        assertEquals(1000.0, bonuses[1], 0.01);
        assertEquals(5000.0, bonuses[2], 0.01);
    }
}

