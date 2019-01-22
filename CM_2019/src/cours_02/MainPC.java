package cours_02;

public class MainPC {
	private Computer computer;
	private Cpu cpu;
	private Manufacturer manufacturer;
	
	
	public MainPC() {

	}


	public MainPC(Computer computer, Cpu cpu, Manufacturer manufacturer) {

		this.computer = computer;
		this.cpu = cpu;
		this.manufacturer = manufacturer;
	}


	@Override
	public String toString() {
		return "MainPC [computer=" + computer + ", cpu=" + cpu + ", manufacturer=" + manufacturer + "]";
	}


	public static void main(String[] args) {
		
		
		
		
	}

}
