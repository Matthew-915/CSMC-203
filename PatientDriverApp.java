/*
 * Class: CMSC203
 * Instructor: Ashique Tanveer
 * Description: ask user to enter information and print out the result
 * Due: 3/4/2025
 * Platform/compiler: IDEA
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Matthew Chen
*/

import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Patient Information:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("ZIP Code: ");
        String zipCode = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Emergency Contact Name: ");
        String emergencyName = scanner.nextLine();
        System.out.print("Emergency Contact Phone: ");
        String emergencyPhone = scanner.nextLine();

        Patient patient = new Patient(firstName, lastName, address, city, state, zipCode, phoneNumber, emergencyName, emergencyPhone);

        System.out.println("Enter details for Procedure 1:");
        System.out.print("Procedure Name: ");
        String proc1Name = scanner.nextLine();
        System.out.print("Date: ");
        String proc1Date = scanner.nextLine();
        System.out.print("Practitioner Name: ");
        String proc1Practitioner = scanner.nextLine();
        System.out.print("Charges: ");
        double proc1Charges = scanner.nextDouble();
        scanner.nextLine();
        Procedure procedure1 = new Procedure(proc1Name, proc1Date, proc1Practitioner, proc1Charges);

        System.out.println("Enter details for Procedure 2:");
        System.out.print("Procedure Name: ");
        String proc2Name = scanner.nextLine();
        System.out.print("Date: ");
        String proc2Date = scanner.nextLine();
        System.out.print("Practitioner Name: ");
        String proc2Practitioner = scanner.nextLine();
        System.out.print("Charges: ");
        double proc2Charges = scanner.nextDouble();
        scanner.nextLine();
        Procedure procedure2 = new Procedure(proc2Name, proc2Date, proc2Practitioner, proc2Charges);

        System.out.println("Enter details for Procedure 3:");
        System.out.print("Procedure Name: ");
        String proc3Name = scanner.nextLine();
        System.out.print("Date: ");
        String proc3Date = scanner.nextLine();
        System.out.print("Practitioner Name: ");
        String proc3Practitioner = scanner.nextLine();
        System.out.print("Charges: ");
        double proc3Charges = scanner.nextDouble();
        scanner.nextLine();
        Procedure procedure3 = new Procedure(proc3Name, proc3Date, proc3Practitioner, proc3Charges);

        System.out.println("\n" + patient);
        System.out.println(procedure1);
        System.out.println(procedure2);
        System.out.println(procedure3);

        double totalCharges = proc1Charges + proc2Charges + proc3Charges;
        System.out.println("Total Charges: $" + String.format("%.2f", totalCharges));

        // Developer info
        System.out.println("\nThe program was developed by a Student: Matthew Chen \nDue date: 3/4/2025");

        scanner.close();
    }
}
