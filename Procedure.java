/*
 * Class: CMSC203
 * Instructor: Ashique Tanveer
 * Description: To enter practitioner's information
 * Due: 3/4/2025
 * Platform/compiler: IDEA
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Matthew Chen
*/

public class Procedure {
    private String procedureName, procedureDate, practitionerName;
    private double procedureCharges;

    public Procedure() {}

    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
        this(procedureName, procedureDate);
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }

    @Override
    public String toString() {
        return "\nprocedureName: " + procedureName + "\nprocedureDate: " + procedureDate + "\npractitionerName: " + practitionerName + "\ncharge:$" + String.format("%.2f", procedureCharges);
    }
}
