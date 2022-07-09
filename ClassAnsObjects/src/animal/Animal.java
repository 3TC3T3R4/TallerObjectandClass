package animal;
/**
 * Represents a animal with its elements.
 * @author Estevan Tangarife Correa.
 */

public class Animal {
	/**
	 * Represents the name for the animal.
	 */
	public String name;
	/**
	 * Represents the type of animal.
	 */
	public String type;
	/**
	 *Represents the owner of animal.
	 */
	protected String owner;
	/**
	 *Represents the age of animal.
	 */
	public int age;
	/**
	 * Represents the status for the animal.
	 */
	private boolean extinct;
	/**
	 *Print the animal eating action. 
	 */
	protected void eat(){
		System.out.println("Im eating");
	}
	/**
	 * Print the animal sleeping action.
	 */
	protected void sleeping(){
	
		System.out.println("Im sleeping");
	
	}
	/**
	 * Print the information of the animal.
	 */
	private void animalinformation(){
	System.out.println(name + " is a " + type + " currently his owner is "+ owner);
	
	
	}
	
	/**
	 * Print animal status.
	 */
	protected void isextinct(){

		if(extinct){
		
			System.out.println("the animal is extinct");
		
		}else{
			System.out.println("the animal is not extinct");
			
		}
		

	}
	/**
	 * Represents method to get animal name.
	 * @return Animal name.
	 */
	public String getName() {
		return name;
	}
	/**
	* Represents method to modify animal name.
	* @param name variable of the class
	*/
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Represents the method to get animal type.
	 * @return  Animal type.
	 */
	public String getType() {
		return type;
	}
	/**
	 * Represents method to modify animal type.
	 * @param type variable of the class.
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * Represents the method to get animal owner.
	 * @return Animal owner.
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * Represents method to modify animal owner.
	 * @param owner variable of the class.
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * Represents the method to get animal age.
	 * @return Animal age.
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Represents method to modify animal age.
	 * @param age variable of the class.
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Represents the method to get animal extinct.
	 * @return Animal extinct.
	 */
	public boolean isExtinct() {
		return extinct;
	}
	/**
	 * Represents method to modify animal extinct.
	 * @param extinct variable of the class
	 */
	public void setExtinct(boolean extinct) {
		this.extinct = extinct;
	}
	
	
	
}
