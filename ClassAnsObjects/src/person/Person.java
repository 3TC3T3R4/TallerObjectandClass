package person;
/**
 * Represents a person with their characteristics.
 * @author Estevan Tangarife Correa.
 */

/**
 * Represents the package import of the date class.
 */
import java.util.Date;


public class Person {
	
	/**
	 * Represents the person name.
	 */
	public String name;
	/**
	 * Represents the person's first surname.
	 */
	public String lastName1;
	/**
	 * Represents the person's second surname.
	 */
	public String lastName2;
	/**
	 * Represents the person's birthday.
	 */
	public Date dateBirth;
	/**
	 * Represents the person's height.
	 */
	public float height;
	/**
	 * Represent the method to get the person name.
	 * @return Person name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Represent the method to modify the person name.
	 * @param name variable of the class. 
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
