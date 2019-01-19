package cours_01;

public class Livre {
	private String author;
	private String title;
	private int pagesNumber;
	
	

	public Livre(String author, String title, int pagesNumber) {
		this.author = author;
		this.title = title;
		this.pagesNumber = pagesNumber;
	}

	


	public Livre() {
		
		// TODO Auto-generated constructor stub
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre livre1 = new Livre();
		livre1.author = "Proust";
		livre1.title = "A la recherche du temps perdu";
		livre1.pagesNumber = 1800;
		
		Livre livre2 = new Livre();
		livre2.author = "George R.R. Martin";
		livre2.title = "Le trone de fer";
		livre2.pagesNumber = 1900;
	}

}
