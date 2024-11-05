package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	protected int argent;

	public Humain(String nom, String boissonPref, int argent) {
		super();
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		System.out.println("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + boissonPref + ".");

	}

	public void boire() {
		System.out.println("Mmmm, un bon verre de " + boissonPref + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		int nvArgent = argent - prix;
		if (nvArgent <= 0) {
			System.out.println("Je n'ai plus que " + argent + " sous en poche. " + "Je ne peux même pas m'offrir un "
					+ bien + " à " + prix + " sous.");
		} else {
			System.out.println("J'ai " + argent + " sous en poche. " + "Je vais pouvoir m'offrir " + bien + " à " + prix
					+ " sous.");
			perdreArgent(prix);

		}
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		int nvArgent = argent - perte;
		if (nvArgent < 0) {
			argent = 0;
		} else {
			argent = nvArgent;
		}
		;
	}

	protected void parler(String texte) {
		System.out.println("<<" + texte + ">>");
	}

}
