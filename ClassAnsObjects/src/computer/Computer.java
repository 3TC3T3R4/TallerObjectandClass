package computer;
/**
 * Represents a computer and its elements.
 * @author Estevan Tangarife Correa.
 */

public class Computer {
	
	/**
	 * Represents the computer brand.
	 */
	public String brand;
	/**
	 * Represents the computer serial number.
	 */
	private int serialnumber;
	/**
	 * Represents the computer processor.
	 */
	protected String processor;
	/**
	 * Represents the computer capacity in the hard disk.
	 */
	public String capacity;
	/**
	 * Represents the computer weight.
	 */
	public float weight;

	/**
	 * Represents the method to print computer programming action.
	 */	
	protected void programming(){
	
		System.out.println("Programming");
	
	}
	
	/**
	 * Represents the method to prints processor quality.
	 */
	private void goodprocessor(){
	
	
		if(processor == "Intel" || processor == "Amd" ){
		
			System.out.println("The processor is awesome");
			
		}else{
		
		
			System.out.println("The processor is regular");
		
		}
		
	
	}
	
	/**
	 * Represents the method to get computer brand.
	 * @return Computer brand.
	 */

	public String getBrand() {
		return brand;
	}
	/**
	 * Represents the method to modify computer brand.
	 * @param brand variable of the class
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * Represents the method to get computer serial number.
	 * @return Computer serial number.
	 */
	public int getSerialnumber() {
		return serialnumber;
	}
	/**
	 * Represents the method for modify computer serial number
	 * @param serialnumber variable of the class
	 */
	public void setSerialnumber(int serialnumber) {
		this.serialnumber = serialnumber;
	}
	/**
	 * Represents the method to get computer processor.
	 * @return Computer processor.
	 */
	public String getProcessor() {
		return processor;
	}
	/**
	 * Represents the method to modify computer processor.
	 * @param processor Variable of the class
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	/**
	 * Represents the method to get computer capacity.
	 * @return Computer capacity.
	 */
	public String getCapacity() {
		return capacity;
	}
	/**
	 * Represents the method to modify the computer capacity.
	 * @param capacity variable of the class.
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	/**
	 * Represents the method to get computer weight.
	 * @return Computer weight.
	 */
	public float getWeight() {
		return weight;
	}
	/**
	 * Represents the method to modify the computer weight.
	 * @param weight 
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}
