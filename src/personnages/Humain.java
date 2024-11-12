package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int argent;
	protected int nbConnaissance;
	protected int nbMaxC = 30;
	protected Humain[] memoire = new Humain[nbMaxC];

	public Humain(String nom, String boissonPref, int argent) {
		super();
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
		this.nbConnaissance = 0;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println(texte);
	}

	public void direBonjour() {
		System.out.println("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + boissonPref + ".");

	}

	public void boire() {
		System.out.println("Mmmm, un bon verre de " + boissonPref + " ! GLOUPS !");
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

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this); // repondre à moi meme
		memoriser(autreHumain);
	}

	private void memoriser(Humain humain) {
		if (nbConnaissance < nbMaxC) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		} else {
			for (int i = 0; i < nbMaxC - 1; i++) {
				memoire[i] = memoire[i + 1];
			}
			memoire[nbMaxC - 1] = humain;
		}
	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);

	}

	public void listerConnaissance() {
		System.out.print("Je connais beaucoup de monde dont : " + memoire[0].getNom());
		for (int i = 1; i < nbConnaissance; i++) {
			System.out.print(", " + memoire[i].getNom());
		}
		System.out.println();
	}

}
