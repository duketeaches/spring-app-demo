/**
 * 
 */
package duke.learn.lesson04.di.ci.java;

/**
 * @author Kazi
 *
 */
public class Car {

    private Engine engine;
    private Transmission transmission;

    /**
     * @param engine
     * @param transmission
     */
    public Car(Engine engine, Transmission transmission) {
	super();
	this.engine = engine;
	this.transmission = transmission;
	System.out.println("Initializing Java Car");
    }

    public String getCarDetails() {
	return engine.checkEngine() + " with " + transmission.checkTranmission();
    }
}
