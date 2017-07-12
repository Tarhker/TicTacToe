import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends Partie{
	public Case[][] grille;
	JFrame fen = new JFrame();
	JPanel pan = new JPanel();
	public Joueur joueur1;
	public Joueur joueur2;
	
	private static int TAILLE_CASE = 150;
	
	public Fenetre(){
		grille = new Case[3][3];
		
		fen.setTitle("Morpion");
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setVisible(true);
		fen.setLocationRelativeTo(null);
		fen.setFocusable(true);
		fen.setResizable(false);
		
		pan.setLayout(new GridLayout(3,3,10,10));
		
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				pan.add(pan, new Case(TAILLE_CASE, TAILLE_CASE));
				
			}
		}
		
		fen.setSize(TAILLE_CASE * 3, TAILLE_CASE * 3); 
	}
	
	public void lancerPartie(){
		
	}
	
	public void creerJoueur(){
		Joueur joueur1 = new Joueur("toto");
		Joueur joueur2 = new Joueur("tata");
	}
	
	public void rejouerPartie(){
		
	}
}
