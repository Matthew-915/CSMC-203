/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: setting the bonus
 * Due: 4/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Matthew Chen
*/
public class HolidayBonus {

    public static final double HIGH_BONUS = 5000.0;
    public static final double LOW_BONUS = 1000.0;
    public static final double OTHER_BONUS = 2000.0;

    public static double[] calculateHolidayBonus(double[][] data) {
        double[] bonuses = new double[data.length];

        int maxColumns = 0;
        for (double[] row : data) {
            if (row.length > maxColumns) {
                maxColumns = row.length;
            }
        }

        for (int col = 0; col < maxColumns; col++) {
            int highIndex = -1, lowIndex = -1;
            double high = Double.NEGATIVE_INFINITY;
            double low = Double.POSITIVE_INFINITY;

            for (int row = 0; row < data.length; row++) {
                if (col < data[row].length && data[row][col] >= 0) {
                    if (data[row][col] > high) {
                        high = data[row][col];
                        highIndex = row;
                    }
                    if (data[row][col] < low) {
                        low = data[row][col];
                        lowIndex = row;
                    }
                }
            }

            for (int row = 0; row < data.length; row++) {
                if (col < data[row].length && data[row][col] >= 0) {
                    if (highIndex == lowIndex) {
                        bonuses[highIndex] += HIGH_BONUS;
                    } else if (row == highIndex) {
                        bonuses[row] += HIGH_BONUS;
                    } else if (row == lowIndex) {
                        bonuses[row] += LOW_BONUS;
                    } else {
                        bonuses[row] += OTHER_BONUS;
                    }
                }
            }
        }

        return bonuses;
    }


    public static double calculateTotalHolidayBonus(double[][] data) {
        double[] bonuses = calculateHolidayBonus(data);
        double total = 0.0;
        for (double bonus : bonuses) {
            total += bonus;
        }
        return total;
    }
} 