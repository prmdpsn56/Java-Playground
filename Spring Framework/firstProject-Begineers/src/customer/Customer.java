package customer;

public class Customer {
    //state
    private String name;
    private Address workAddress;
    private Address homeAddress;

    //creating
    public Customer(String name, Address workAddress, Address homeAddress) {
        this.name = name;
        this.workAddress = workAddress;
        this.homeAddress = homeAddress;
    }

    //operations

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", workAddress=" + workAddress +
                ", homeAddress=" + homeAddress +
                '}';
    }
}
