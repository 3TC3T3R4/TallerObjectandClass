package fruit;
/**
 *Represents a fruit with its characteristics.
 * @author Estevan Tangarife Correa.
 */

/**
 * Represents the arraylist class imported in this class.
 */
import java.util.ArrayList;


public class Fruit {
	
	/**
	 * Represents the fruit name.
	 */
	public String name;
	/**
	 * Represent the fruit average weight.
	 */
	private float averageWeight;
	/**
	 * Represents a list of colors.
	 */
	public ArrayList<String> colors;
	/**
	 * Represents the method to get the colors of a list.
	 * @return colors list. 
	 */
	public ArrayList<String> getColors() {
		return colors;
	}
	/**
	 * Represents the method to modify the color list.
	 * @param colors variable of the class.
	 */
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
}
