package cours_01;

import javax.swing.JOptionPane;

public class StudentCalcul {
	private String lastName;
	private static String firstName;
	private static int a = 0;
	private static int b = 0;
	private static int answer = 0;
	private static int i;
	private static int goodAnswerNbr;
	
	
public void calcul(int a, int b, int i, int answer) {
	for(i=0; i<10; i++) {
		a = (int)(Math.random() *100);
		b =(int)(Math.random() *100);
		 answer = Integer.parseInt(JOptionPane.showInputDialog("Quelle est la valeur de" + " " + a + "+" + b + "?"));
		if (answer == a + b) {
			goodAnswerNbr ++;
		}
	}
	JOptionPane.showMessageDialog(null, "M." + " "+ lastName + " " + firstName + " " +  "vous avez obtenu"+ " " + goodAnswerNbr + "/" + i ,"title", 1);

	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		StudentCalcul SC1 = new StudentCalcul();
		SC1.lastName = "Einstein";
		SC1.firstName = "Albert";
		SC1.a = 0;
		SC1.b = 0;
		SC1.i=0;
		SC1.goodAnswerNbr=0;
		
		SC1.calcul(a, b, i, answer);
		
		StudentCalcul SC2 = new StudentCalcul();
		SC2.lastName = "Syszlak";
		SC2.firstName = "Moe";
		SC2.a = 0;
		SC2.b = 0;
		SC2.i= 0;
		SC2.goodAnswerNbr = 0;
		
		
		
		SC2.calcul(a, b, i, answer);
		
		

		
		



	}

}
