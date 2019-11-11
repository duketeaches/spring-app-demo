/**
 * 
 */
package duke.learn.lesson17.di.si.collection.map.java;

import java.util.Map;

/**
 * @author Kazi
 *
 */
public class Country {

    private Map<String, Long> statePopulation;

    public Country() {
	System.out.println("Initializing Java state population in Country using SI");
    }

    public Map<String, Long> getStatePopulation() {
	return statePopulation;
    }

    public void setStatePopulation(Map<String, Long> statePopulation) {
	this.statePopulation = statePopulation;
    }
}
