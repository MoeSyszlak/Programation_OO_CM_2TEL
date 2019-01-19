package cours_01;

public class EssentialOil {
	private String name; 
	private double capacity; //in ml
	private double price; //in €




	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getCapacity() {
		return capacity;
	}



	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public EssentialOil(String name, double capacity, double price) {
		this.name = name;
		this.capacity = capacity;
		this.price = price;
	}



	public EssentialOil() {

		// TODO Auto-generated constructor stub
	}


	public String toString() {
		return "EssentialOil [name=" + name + ", capacity=" + capacity + "ml, price=" + price + "Euro]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EssentialOil essentialOil1 = new EssentialOil();
		essentialOil1.name = "Orange Sanguine";
		essentialOil1.capacity = 10;
		essentialOil1.price = 2.20;

		EssentialOil essentialOil2 = new EssentialOil();
		essentialOil2.name = "Eucalyptus radie";
		essentialOil2.capacity = 30;
		essentialOil2.price = 5.90;


	}

}
