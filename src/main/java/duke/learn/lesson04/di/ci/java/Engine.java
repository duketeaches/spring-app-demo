/**
 * 
 */
package duke.learn.lesson04.di.ci.java;

/**
 * @author Kazi
 *
 */
public class Engine {

    private String cylinders;
    private String allignment;

    public Engine(String cylinder, String allignment) {
	this.cylinders = cylinder;
	this.allignment = allignment;
	System.out.println("Starting Java Engine..");
    }

    public String checkEngine() {
	return "Cylider :" + cylinders + "  Allignment: " + allignment;
    }
}
