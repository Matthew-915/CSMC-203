/*
 * Class: CMSC203
 * Instructor: Ashique Tanveer
 * Description: To enter patient's information
 * Due: 3/4/2025
 * Platform/compiler: IDEA
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Matthew Chen
*/

public class Patient {
    private String firstName, lastName;
    private String address, city, state, zipCode;
    private String phoneNumber;
    private String emergencyContactName, emergencyContactPhone;

    public Patient() {}

    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Patient(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this(firstName, lastName);
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String buildFullName() {
        return firstName + " " + lastName;
    }

    public String buildAddress() {
        return address + ", " + city + ", " + state + " " + zipCode;
    }

    public String buildEmergencyContact() {
        return emergencyContactName + "   " + emergencyContactPhone;
    }

    @Override
    public String toString() {
        return "Patient Information:\n" + buildFullName() + "\n" + buildAddress() + "\nPhone: " + phoneNumber + "\nEmergency Contact: " + buildEmergencyContact();
    }
}

