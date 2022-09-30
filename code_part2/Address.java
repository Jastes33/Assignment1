public class Address {

    //Instance Variables

    //Holds the address name
    private String street;

    //Holds the address number
    private int number;

    //Holds the postal code of the address
    private String postal;

    public Address(String street, int number, String postal){
        this.street = street;
        this.number = number;
        this.postal = postal;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getPostal(){
        return postal;
    }
}
