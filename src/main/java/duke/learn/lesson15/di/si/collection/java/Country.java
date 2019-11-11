/**
 * 
 */
package duke.learn.lesson15.di.si.collection.java;

import java.util.List;

/**
 * @author Kazi
 *
 */
public class Country {

    private List<String> states;

    public Country() {
	System.out.println("Initializing Java states in Country using SI");
    };

    public List<String> getStates() {
	return states;
    }

    public void setStates(List<String> states) {
	this.states = states;
    }
}
