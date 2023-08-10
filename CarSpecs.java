package JavaCodes;

import java.util.Objects;

public class CarSpecs {

	private String colour;
	private String make;
	private String model;
	private int man_year;
	
	
	public CarSpecs(String colour, String make, String model, int man_year) {
		super();
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.man_year = man_year;//Change
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMan_year() {
		return man_year;
	}
	public void setMan_year(int man_year) {
		this.man_year = man_year;
	}
	@Override
	public String toString() {
		return "CarSpecs [colour=" + colour + ", make=" + make + ", model=" + model + ", man_year=" + man_year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(colour, make, man_year, model);
	}
	@Override
	public boolean equals(Object obj) {
		CarSpecs other = (CarSpecs) obj;
		if(this.getModel().equals(other.getModel())&& this.getMake().equals(other.getMake())
				&& this.getColour().equals(other.getColour())
				&& this.getMan_year() == other.getMan_year())
				{
					return true;
				}
				else
					return false;	
	}
	
	
	
	
}
