package duke.learn.lesson20.jdbc;

public class Employee {

    private int id;

    private String firstName;

    private String lastName;

    private String address;

    /**
     * 
     */
    public Employee() {
	super();
    }

    /**
     * @param id
     * @param firstName
     * @param lastName
     * @param address
     */
    public Employee(int id, String firstName, String lastName, String address) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
    }

    public int getId() {
	return id;
    }

    public void setId(final int id) {
	this.id = id;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(final String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(final String lastName) {
	this.lastName = lastName;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(final String address) {
	this.address = address;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
		+ "]";
    }
}
