/**
 * 
 */
package duke.learn.lesson16.di.si.collection.map.xml;

import java.util.Map;

/**
 * @author Kazi
 *
 */
public class Country {

    private Map<String, Long> statePopulation;

    public Country() {
	System.out.println("Initializing XML state population in Country");
    };

    public Map<String, Long> getStatePopulation() {
	return statePopulation;
    }

    public void setStatePopulation(Map<String, Long> statePopulation) {
	this.statePopulation = statePopulation;
    }
}
