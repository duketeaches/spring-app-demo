/**
 * 
 */
package duke.learn.lesson09.di.ci.inheritance.xml;

/**
 * @author Kazi
 *
 */
public class Employee {

    private int id;
    private String name;
    private Address address;

    /**
     * @param id
     * @param name
     */
    public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
    }

    /**
     * @param id
     * @param name
     * @param address
     */
    public Employee(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
    }

    public void print() {
	System.out.println(id + " " + name);
	System.out.println(address);
    }

}
