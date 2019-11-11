/**
 * 
 */
package duke.learn.lesson04.di.ci.java;

/**
 * @author Kazi
 *
 */
public class Transmission {

    private String type;

    public Transmission(String type) {
	this.type = type;
	System.out.println("Starting  Java transmission");
    }

    public String checkTranmission() {
	return type;
    }

}
