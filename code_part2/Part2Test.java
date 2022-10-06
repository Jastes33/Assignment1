import java.util.Scanner;

public class Part2Test {
    /**
     * This file will be used to test Part 2 of Assignment 1
     * No exception handling is in place. Exception handling might be introduced at a later date
     */
    public static void main(String args[]){
        System.out.println("Welcome to the Part 2 test program!");
        Scanner employeeScanner = new Scanner(System.in);
        System.out.println("Please enter the name of the employee you would like to upload: ");
        String employeeName = employeeScanner.nextLine();
        System.out.println("Please enter the employee's hours worked per week: ");
        int employeeHours = employeeScanner.nextInt();
        System.out.println("Please enter the employee's hourly pay: ");
        Double employeePayPerHour = employeeScanner.nextDouble();
        System.out.println("How many addresses is this employee associated with? ");
        int employeeAddressNum = employeeScanner.nextInt();
        employeeScanner.nextLine();

        Address[] addresses = new Address[employeeAddressNum];
        String employeeAddressName;
        int employeeStreetNum;
        String employeeZipCode;

        for(int i = 0; i < employeeAddressNum; i++){
            System.out.println("Please enter the street name for address number "+(i+1)+": ");
            employeeAddressName = employeeScanner.nextLine();
            System.out.println("Please enter the street number for address number "+(i+1)+": ");
            employeeStreetNum = employeeScanner.nextInt();
            employeeScanner.nextLine();
            System.out.println("Please enter the postal code for address number "+(i+1)+": ");
            employeeZipCode = employeeScanner.nextLine();
            addresses[i] = new Address(employeeAddressName,employeeStreetNum,employeeZipCode);
            System.out.println();
        }

        Employee newEmployee = new Employee(employeeName,employeeHours,employeePayPerHour,addresses);

        System.out.println("Here is the employee's file you have just created:");
        System.out.println("The name of the employee is "+newEmployee.getName());
        System.out.println("The amount of hours this employee works in a week is "+newEmployee.getHours());
        System.out.println("The amount of money this employee gets paid per hour is: "+newEmployee.getRate());
        System.out.println("Here are the list of addressed currently associated with this employee: ");
        for(int j = 0; j < employeeAddressNum; j++){
            Address addressAt = newEmployee.getAddressAtIndex(j);
            System.out.println("The street name of address number "+(j+1)+" is: "+addressAt.getStreet());
            System.out.println("The street number of address number "+(j+1)+" is: "+addressAt.getNumber());
            System.out.println("The postal code for address number "+(j+1)+" is: "+addressAt.getPostal());
            System.out.println();
        }
        System.out.println("This is the end of the program. Have a nice day!");
    }
}
