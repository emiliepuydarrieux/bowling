package bowling;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancers successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class PartieMonoJoueur {

	/**
	 * Constructeur
	 */
	public PartieMonoJoueur() {
	}

	/**
	 * Cette méthode doit être appelée à chaque lancer de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de ce lancer
	 * @throws IllegalStateException si la partie est terminée
	 * @return vrai si le joueur doit lancer à nouveau pour continuer son tour, faux sinon	
	 */
	public boolean enregistreLancer(int nombreDeQuillesAbattues) {
		int c=1;
		if (nombreDeQuillesAbattues==10||c==2){
			return false;
		}
		{
			c+=1;
			return true;
		}
	}

	/**
	 * Cette méthode donne le score du joueur.
	 * Si la partie n'est pas terminée, on considère que les lancers restants
	 * abattent 0 quille.
	 * @return Le score du joueur
	 */
	public int score(int nombreDeQuillesAbattues) {
		int s=0;
		int tour=10;
		for (int i=1;i<=tour;i++){
			int scoreParTour=0;
			for (int lancer=1;lancer<=2;lancer++){
				s+=nombreDeQuillesAbattues;
				scoreParTour+=nombreDeQuillesAbattues;

				}
				}
					

		return s;

	}

	/**
	 * @return vrai si la partie est terminée pour ce joueur, faux sinon
	 */
	public boolean estTerminee() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}


	/**
	 * @return Le numéro du tour courant [1..10], ou 0 si le jeu est fini
	 */
	public int numeroTourCourant() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * @return Le numéro du prochain lancer pour tour courant [1..3], ou 0 si le jeu
	 *         est fini
	 */
	public int numeroProchainLancer() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

}
