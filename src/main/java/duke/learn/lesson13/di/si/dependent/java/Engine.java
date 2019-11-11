/**
 * 
 */
package duke.learn.lesson13.di.si.dependent.java;

/**
 * @author Kazi
 *
 */
public class Engine {

    private String cylinders;
    private String allignment;

    public String checkEngine() {
	return "Cylider :" + cylinders + "  Allignment: " + allignment;
    }

    public String getCylinders() {
	return cylinders;
    }

    public void setCylinders(String cylinders) {
	this.cylinders = cylinders;
    }

    public String getAllignment() {
	return allignment;
    }

    public void setAllignment(String allignment) {
	this.allignment = allignment;
    }
}
