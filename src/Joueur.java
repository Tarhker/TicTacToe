
public class Joueur extends Partie{
	public String nom;
	public int score;
	
	public Joueur(String nom){
		this.nom = nom;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setNom(String nom) {
        this.nom = nom;
    }
}
