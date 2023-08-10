package JavaCodes;

public class Car {
	
	private int modelno;
	private long price;
	private CarSpecs specs;  //has-A
	
	public Car(int modelno, long price, CarSpecs specs) {
		super();
		this.modelno = modelno;
		this.price = price;
		this.specs = specs;
	}

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public CarSpecs getSpecs() {
		return specs;
	}

	public void setSpecs(CarSpecs specs) {
		this.specs = specs;
	}

	@Override
	public String toString() {
		return "Car [modelno=" + modelno + ", price=" + price + ", specs=" + specs + "]";
	}
	
	
	
	
	
}
