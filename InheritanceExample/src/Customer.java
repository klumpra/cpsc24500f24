public class Customer extends Person {
    // specific things that I want to store about Customer
    private String shippingAddress;
    private String phoneNumber;
    public String getShippingAddress() {
        return shippingAddress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setShippingAddress(String addr) {
        shippingAddress = addr;
    }
    public void setPhoneNumber(String phone) {
        // could do stuff to validate the phone number
        phoneNumber = phone;
    }
    public Customer() {
        this("Firstname","Lastname","","");
    }
    public Customer(String firstName, String lastName, String shippingAddress, String phoneNumber) {
        super(firstName,lastName);
        setShippingAddress(shippingAddress);
        setPhoneNumber(phoneNumber);
    }
    @Override
    public String getType() {
        return "Customer";
    }
    @Override
    public String toString() {
        return String.format("%s\t%s\t%s",super.toString(),shippingAddress,phoneNumber);
    }
}
