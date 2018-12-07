package animal;

public class Whale extends Animal{
	
//	The properties of the whale
	public String mainOcean;
	public Integer weight;
	public Integer maxSpeed;
	public Integer length;
	
//	The contructor for the whale as well as the name property from the animal
	public Whale(String name, String mainOcean, Integer weight, Integer maxSpeed, Integer length) {
		super(name);
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.length = length;
	}

//	The getters and setters
	public String getMainOcean() {
		return mainOcean;
	}

	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}
	
	
	public static String whatAmI() {return "This is a whale";}
	

}
