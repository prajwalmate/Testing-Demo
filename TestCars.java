package JavaCodes;

import java.util.List;

public class TestCars {

	public static void main(String[] args) {
		Stockyard stock = new Stockyard();	
		initializeStock(stock);
		
		CarSpecs expcar = new CarSpecs("black", "honda", "city", 2020);
		List<Car> foundcars =stock.search(expcar);
		for(Car car : foundcars)
		{
			System.out.println(car);
		}
		
	}
	
	public static void initializeStock(Stockyard stock)
	{
		
		stock.addCar(3454, 870780, "black", "honda", "city", 2020);
		stock.addCar(6567, 180780, "white", "kia", "seltos", 2022);
		stock.addCar(8987, 989080, "grey", "mahindra", "thar", 2023);
		stock.addCar(1313, 570780, "red", "hyundai", "i20", 2021);
		stock.addCar(5664, 970780, "black", "honda", "city", 2020);
	}

}
