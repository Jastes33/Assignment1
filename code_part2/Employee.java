public class Employee {

    //Instance Variables

    // Holds the employee's name
    private String name;

    //Holds the hours the employee works
    private int hours;

    //Holds the pay rate per hour of the employee
    private double rate;

    //Holds an array of type Address
    private Address[] address;

    //Constructs an object of type Employee
    public Employee(String name, int hours, double rate, Address[] address){
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        this.address = address;
    }

    //Instance Methods

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public double rate(){
        return rate;
    }

    public Address[] getListOfAddress() {
        return address;
    }

    /**
     * Returns the address at index i if there exists an address at such index/the index is within the bounds
     * of the address array
     * @param i index of requested address
     * @return The address at given point i
     **/

    public Address getAddressAtIndex(int i) {
        if(address.length-1 > i && i>=0) {
            if (address[i] != null) {
                return address[i];
            }
            else{
                throw new NullPointerException("There is no address at index +"+i);
            }
        }
        else{
            throw new IndexOutOfBoundsException("This index is out of bounds!");
            }
    }
}
