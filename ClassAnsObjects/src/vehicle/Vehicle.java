package vehicle;
/**
 * Represents a vehicle with its elements.
 * @author Estevan Tangarife Correa.
 */
public class Vehicle {
	/**
	 * Represents the vehicle color.
	 */
	public String color;
	/**
	 * Represents the vehicle license plate.
	 */
	private int licenseplate;
	/**
	 * Represents the capacity of the vehicle in its inside.
	 */
	private int capacity;
	/**
	 * Represents the vehicle type.
	 */
	protected  String type;
	/**
	 * Represents the vehicle owner.
	 */
	public String owner;
	/**
	 * Represents the year of creation of vehicle.
	 */
	protected int yearofcreation;
	
	/**
	 * Represents the method of starting the vehicle.
	 */
	private void star(){
	
		System.out.println("Staring");
	}
	/**
	 *Represents the method of stopping the vehicle.
	 */
	protected void stop(){
	
		System.out.println("stop");
	}
	/**
	 *Represents the method of knowing if the vehicle is old.
	 */
	protected void knowantiquity(){
	
		
		if(yearofcreation < 2022){
		
			System.out.println("The vehicle is old");
		
		}else{
			
			System.out.println("The vehicle is new");
		
		}
		
	
	}
	/**
	 * Represents the method of knowing your information.
	 */
	private void seeinformation(){
	
		System.out.println("The vehicle color: " + color + "with lincese plate number: " + licenseplate + "has capacity of "+ capacity);
		
		
	}
	/**
	 * Represents the method to get the vehicle owner.
	 * @return Vehicle owner.
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * Represent the method to modify the vehicle owner.
	 * @param owner variable of the class.
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
}
