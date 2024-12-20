package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public int getReputation() {
		return reputation;
	}

	public Yakuza(String nom, String boissonPref, int argent, String clan) {
		super(nom, boissonPref, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ...");
		parler(victime.getNom() + " si tu tiens à la vie, donne moi ta bourse !");
		int perte = victime.getArgent();
		gagnerArgent(victime.getArgent());
		reputation++;
		victime.seFaireExtorquer();
		parler("J'ai piqué les " + perte + " sous de " + victime.getNom() + " ,ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi Hi !");

	}

	public int perdre() {
		int argentPerdu = getArgent();
		perdreArgent(getArgent());
		reputation--;
		parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan);
		return argentPerdu;

	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan" + clan + " ?");
		parler("Je l'ai dépouillé de ses " + gain + " sous");

	}

	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		super.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}

}
