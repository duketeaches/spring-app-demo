/**
 * 
 */
package duke.learn.lesson05.di.ci.collection.xml;

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
	System.out.println("Initializing XMl states in Country");
    };

    public List<String> getStates() {
	return states;
    }
}
