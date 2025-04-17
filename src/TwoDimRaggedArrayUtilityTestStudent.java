/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: test TwoDimRaggedArrayUtility
 * Due: 4/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Matthew Chen
*/
import static org.junit.Assert.*;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityTestStudent {

    private double[][] data = {
        {1.0, 2.0, 3.0},
        {4.0, 5.0},
        {6.0, 7.0, 8.0, 9.0}
    };

    @Test
    public void testGetTotal() {
        assertEquals(45.0, TwoDimRaggedArrayUtility.getTotal(data), 0.001);
    }

    @Test
    public void testGetAverage() {
        assertEquals(5.0, TwoDimRaggedArrayUtility.getAverage(data), 0.001);
    }

    @Test
    public void testGetRowTotal() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(data, 1), 0.001);
    }

    @Test
    public void testGetHighestInRow() {
        assertEquals(3.0, TwoDimRaggedArrayUtility.getHighestInRow(data, 0), 0.001);
    }

    @Test
    public void testGetLowestInRow() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(data, 0), 0.001);
    }

    @Test
    public void testGetHighestInColumn() {
        assertEquals(7.0, TwoDimRaggedArrayUtility.getHighestInColumn(data, 1), 0.001);
    }

    @Test
    public void testGetLowestInColumn() {
        assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInColumn(data, 1), 0.001);
    }

    @Test
    public void testGetHighestInArray() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(data), 0.001);
    }

    @Test
    public void testGetLowestInArray() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(data), 0.001);
    }
}

