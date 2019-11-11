/**
 * 
 */
package duke.learn.lesson06.di.ci.collection.java;

import java.util.List;

/**
 * @author Kazi
 *
 */
public class Country {

    private List<String> states;

    public Country(List<String> states) {
	super();
	this.states = states;
	System.out.println("Initializing Java states in Country");
    };

    public List<String> getStates() {
	return states;
    }
}
