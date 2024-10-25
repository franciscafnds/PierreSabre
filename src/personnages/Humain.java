package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int argent;
	
	public Humain(String nom, String boissonPref, int argent) {
		super();
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
	}
	
	
	private String getNom() {
		return nom;
	}

	private int getArgent() {
		return argent;
	}


	public void direBonjour() {
		System.out.println("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + boissonPref);
		
	}
	
	private void boire() {
		System.out.println("Mmmm, un bon verre de " + boissonPref + " ! GLOUPS !");
	}
	
//	private void acheter(String bien, int prix) {
//		
//	}
//	
//	private void gagnerArgent(int gain) {
//		
//	}
//	
//	private void perdreArgent(int perte) {
//		
//	}
//	
//	private void parler(String texte) {
//		
//	}
//	
	
	
}
