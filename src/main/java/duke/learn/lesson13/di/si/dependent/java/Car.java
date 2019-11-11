/**
 * 
 */
package duke.learn.lesson13.di.si.dependent.java;

/**
 * @author Kazi
 *
 */
public class Car {

    private Engine engine;
    private Transmission transmission;

    public String getCarDetails() {
	return engine.checkEngine() + " with " + transmission.checkTranmission();
    }

    public Engine getEngine() {
	return engine;
    }

    public void setEngine(Engine engine) {
	this.engine = engine;
    }

    public Transmission getTransmission() {
	return transmission;
    }

    public void setTransmission(Transmission transmission) {
	this.transmission = transmission;
    }
}
