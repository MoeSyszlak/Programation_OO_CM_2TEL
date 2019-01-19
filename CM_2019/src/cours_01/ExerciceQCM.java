package cours_01;

import javax.swing.JOptionPane;

public class ExerciceQCM {
	private static int difficultyLvl=0;//Niveau de difficulté compris entre 1 et 5
	private static String exEnonce;//Chaîne de caractères contenant l'énoncé de l'exercice
	private static String[] propTab;//Tableau des propositions
	private static int i=0;
	private static int j=0;


	public void QCM(int difficultyLvl, String exEnonce, String[]propTab, int i) {
		for (j=0; difficultyLvl<1||difficultyLvl>5;j++) {
			difficultyLvl = Integer.parseInt(JOptionPane.showInputDialog("Veuillez choisir votre niveau de difficulte entre 1 et 5. 5 etant le niveau le plus difficile"));
		}
		if(difficultyLvl==1) {
			exEnonce=("Entrez la valeur de la bonne reponse a la question suivante\nQuelle est la capitale de la Belgique?");
		JOptionPane.showMessageDialog(null, exEnonce,"title", 3);
		propTab = new String[3];
		propTab [0] = ("1.Bruxelles");
		propTab [1] = ("2.Liege");
		propTab [2] = ("3.Charleroi");
		
	
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExerciceQCM EQ1 = new ExerciceQCM();
		EQ1.difficultyLvl = 0;
		EQ1.exEnonce = ("test");
		EQ1.i=0;
		EQ1.j=0;
		
		EQ1.QCM(difficultyLvl, exEnonce, propTab, i);
		
		}
	}


