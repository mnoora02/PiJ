package Day_18.Day_19;

public class Apple {
	private Integer weight; 
	private String colour; 

	public Integer getWeight(){
		return this.weight;
	}

	public String getColour(){
		return this.colour;
	}

	public void setWeight(Integer w) {
		this.weight = w;
	}
	
	public void setColour(String c) {
		this.colour = c;
	}

	public Apple(Integer weight, String colour) {
		this.weight = weight;
		this.colour = colour;
	}

	@Override
	public String toString(){
		return "Colour: " + getColour() + "weight: " + getWeight();
	}

}