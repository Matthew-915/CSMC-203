/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: enter the data
 * Due: 4/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Matthew Chen
*/
import java.io.*;
import java.util.*;

public class TwoDimRaggedArrayUtility {

    public static double[][] readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<double[]> rows = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                String[] values = line.split(" ");
                double[] row = new double[values.length];
                for (int i = 0; i < values.length; i++) {
                    row[i] = Double.parseDouble(values[i]);
                }
                rows.add(row);
            }
        }
        scanner.close();
        return rows.toArray(new double[rows.size()][]);
    }

    public static void writeToFile(double[][] data, File file) throws IOException {
        PrintWriter writer = new PrintWriter(file);
        for (double[] row : data) {
            for (int i = 0; i < row.length; i++) {
                writer.print(row[i]);
                if (i < row.length - 1) writer.print(" ");
            }
            writer.println();
        }
        writer.close();
    }

    public static double getTotal(double[][] data) {
        double total = 0;
        for (double[] row : data) {
            for (double val : row) {
                total += val;
            }
        }
        return total;
    }

    public static double getAverage(double[][] data) {
        double total = 0;
        int count = 0;
        for (double[] row : data) {
            for (double val : row) {
                total += val;
                count++;
            }
        }
        return total / count;
    }

    public static double getRowTotal(double[][] data, int row) {
        double total = 0;
        for (double val : data[row]) {
            total += val;
        }
        return total;
    }

    public static double getColumnTotal(double[][] data, int col) {
        double total = 0;
        for (double[] row : data) {
            if (col < row.length) {
                total += row[col];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] data, int row) {
        double max = Double.NEGATIVE_INFINITY;
        for (double val : data[row]) {
            if (val > max) max = val;
        }
        return max;
    }

    public static int getHighestInRowIndex(double[][] data, int row) {
        double max = Double.NEGATIVE_INFINITY;
        int index = -1;
        for (int i = 0; i < data[row].length; i++) {
            if (data[row][i] > max) {
                max = data[row][i];
                index = i;
            }
        }
        return index;
    }

    public static double getLowestInRow(double[][] data, int row) {
        double min = Double.POSITIVE_INFINITY;
        for (double val : data[row]) {
            if (val < min) min = val;
        }
        return min;
    }

    public static int getLowestInRowIndex(double[][] data, int row) {
        double min = Double.POSITIVE_INFINITY;
        int index = -1;
        for (int i = 0; i < data[row].length; i++) {
            if (data[row][i] < min) {
                min = data[row][i];
                index = i;
            }
        }
        return index;
    }

    public static double getHighestInColumn(double[][] data, int col) {
        double max = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length && row[col] > max) {
                max = row[col];
            }
        }
        return max;
    }

    public static int getHighestInColumnIndex(double[][] data, int col) {
        double max = Double.NEGATIVE_INFINITY;
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] > max) {
                max = data[i][col];
                index = i;
            }
        }
        return index;
    }

    public static double getLowestInColumn(double[][] data, int col) {
        double min = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length && row[col] < min) {
                min = row[col];
            }
        }
        return min;
    }

    public static int getLowestInColumnIndex(double[][] data, int col) {
        double min = Double.POSITIVE_INFINITY;
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] < min) {
                min = data[i][col];
                index = i;
            }
        }
        return index;
    }

    public static double getHighestInArray(double[][] data) {
        double max = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            for (double val : row) {
                if (val > max) max = val;
            }
        }
        return max;
    }

    public static double getLowestInArray(double[][] data) {
        double min = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            for (double val : row) {
                if (val < min) min = val;
            }
        }
        return min;
    }
}

