/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: Order beverage with details
 * Due: 5/6/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Matthew Chen
*/

import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BevShop shop = new BevShop();

        System.out.println("The current order in process can have at most " + BevShop.MAX_ORDER_FOR_ALCOHOL + " alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is " + BevShop.MIN_AGE_FOR_ALCOHOL);

        System.out.println("Start a new order:");

        System.out.print("Would you please enter your name: ");
        String name = input.nextLine();

        System.out.print("Would you please enter your age: ");
        int age = Integer.parseInt(input.nextLine());

        shop.startNewOrder(10, Day.MONDAY, name, age);

        if (age > 20) {
            System.out.println("Your age is above 20 and you are eligible to order alcohol");
        }

        boolean keepOrdering = true;

        while (keepOrdering) {
            System.out.println("\nChoose a beverage to order:");
            System.out.println("1. Alcohol");
            System.out.println("2. Smoothie");
            System.out.println("3. Coffee");
            System.out.println("4. Finish Order");

            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    if (shop.isEligibleForMore()) {
                        if (age >= BevShop.MIN_AGE_FOR_ALCOHOL) {
                            Size aSize = getSizeInput(input);
                            shop.processAlcoholOrder("Alcohol", aSize);
                            System.out.println("The current order of drinks is " + shop.getCurrentOrder().getBeverages().size());
                            System.out.println("The Total Price on the Order: " + shop.getCurrentOrder().calcOrderTotal());
                            if (shop.getCurrentOrder().findNumOfBeveType(Type.ALCOHOL) == BevShop.MAX_ORDER_FOR_ALCOHOL) {
                                System.out.println("You have a maximum alcohol drinks for this order");
                            } else {
                                System.out.println("Your current alcohol drink order is less than 4");
                            }
                        } else {
                            System.out.println("Your Age is not appropriate for alcohol drink!!");
                        }
                    } else {
                        System.out.println("Reached max number of alcohol drinks.");
                    }
                    break;

                case 2:
                    Size sSize = getSizeInput(input);
                    System.out.print("Enter number of fruits: ");
                    int fruits = Integer.parseInt(input.nextLine());
                    System.out.print("Add protein? (true/false): ");
                    boolean protein = Boolean.parseBoolean(input.nextLine());
                    shop.processSmoothieOrder("Smoothie", sSize, fruits, protein);
                    System.out.println("The Total Price on the Order: " + shop.getCurrentOrder().calcOrderTotal());
                    if (fruits > BevShop.MAX_FRUIT) {
                        System.out.println("You reached a Maximum number of fruits");
                    }
                    break;

                case 3:
                    Size cSize = getSizeInput(input);
                    System.out.print("Extra shot? (true/false): ");
                    boolean shot = Boolean.parseBoolean(input.nextLine());
                    System.out.print("Extra syrup? (true/false): ");
                    boolean syrup = Boolean.parseBoolean(input.nextLine());
                    shop.processCoffeeOrder("Coffee", cSize, shot, syrup);
                    System.out.println("The Total Price on the Order: " + shop.getCurrentOrder().calcOrderTotal());
                    break;

                case 4:
                    keepOrdering = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

            System.out.println("Total items on your order is " + shop.getCurrentOrder().getBeverages().size());
        }

        System.out.println("\nFinal Order Summary:");
        System.out.println("Total Price: " + shop.getCurrentOrder().calcOrderTotal());

        input.close();
    }

    private static Size getSizeInput(Scanner input) {
        while (true) {
            System.out.print("Choose a size (Small, Medium, Large): ");
            String sizeStr = input.nextLine().toUpperCase();

            try {
                return Size.valueOf(sizeStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid size. Please enter Small, Medium, or Large.");
            }
        }
    }
}







