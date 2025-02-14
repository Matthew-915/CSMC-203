import java.io.*;
import java.util.*;

public class ESPGame {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("\nWelcome to ESP - extrasensory perception!");
            System.out.println("1. Read and display 16 colors");
            System.out.println("2. Read and display 10 colors");
            System.out.println("3. Read and display 5 colors");
            System.out.println("4. Exit the program");
            System.out.print("Enter your option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (option == 4) {
                break;
            }

            int colorLimit;
            if (option == 1) {
                colorLimit = 16;
            } else if (option == 2) {
                colorLimit = 10;
            } else if (option == 3) {
                colorLimit = 5;
            } else {
                System.out.println("Invalid option. Try again.");
                continue;
            }

            List<String> colors = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("colors.txt"));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null && count < colorLimit) {
                colors.add(line.trim());
                count++;
            }
            br.close();

            int correctGuesses = 0;
            for (int i = 1; i <= 3; i++) {
                System.out.println("\nRound " + i);
                System.out.println("I am thinking of a color. Can you guess it?");

                int randomIndex = random.nextInt(colors.size());
                String selectedColor = colors.get(randomIndex);

                System.out.print("Enter your guess: ");
                String userGuess = scanner.nextLine().trim();

                if (userGuess.equalsIgnoreCase(selectedColor)) {
                    correctGuesses++;
                    System.out.println("I was thinking of " + selectedColor);
                } else {
                    System.out.println("I was thinking of " + selectedColor);
                }
            }

            System.out.println("\nGame Over");
            System.out.println("You guessed " + correctGuesses + " out of 3 correctly.");

            PrintWriter writer = new PrintWriter(new FileWriter("EspGameResults.txt", true));
            writer.println("Game Over");
            writer.println("You guessed " + correctGuesses + " out of 3 correctly.");
            writer.close();
        }

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();
        System.out.print("Date: ");
        String Date = scanner.nextLine();

        System.out.println("\nUsername: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Date: " + Date);

        scanner.close();
    }
}
