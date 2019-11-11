/**
 * 
 */
package duke.learn.lesson03.di.ci.xml;

/**
 * @author Kazi
 *
 */
public class Transmission {

    private String type;

    public Transmission(String type) {
	this.type = type;
	System.out.println("Starting transmission");
    }

    public String checkTranmission() {
	return type;
    }

}
