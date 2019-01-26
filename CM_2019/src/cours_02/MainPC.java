package cours_02;


public class MainPC {



	public static void main(String[] args) {
		int i;
		Computer tabPC[] =new Computer[3];
		tabPC[0] = new Computer(new Cpu(new Manufacturer("Intel"), "Core I3"),new Manufacturer ("Dell"), 485.23);
		tabPC[1] = new Computer(new Cpu(new Manufacturer("Intel"), "Core I5	"),new Manufacturer ("Microsoft"), 1501.92);
		tabPC[2] = new Computer(new Cpu(new Manufacturer("Intel"), "Celeron N3160"),new Manufacturer ("Medion"), 269.99);
		
		for(i=0;i<3;i++) {
		System.out.println(tabPC[i]);
		}
		
	



	}

}
