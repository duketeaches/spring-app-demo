/**
 * 
 */
package duke.learn.lesson07.di.ci.collection.map.xml;

import java.util.Map;

/**
 * @author Kazi
 *
 */
public class Country {

    private Map<String, Long> statePopulation;

    public Country(Map<String, Long> statePopulation) {
	super();
	this.statePopulation = statePopulation;
	System.out.println("Initializing Java state population in Country");
    };

    public Map<String, Long> getStatePopulation() {
	return statePopulation;
    }
}
