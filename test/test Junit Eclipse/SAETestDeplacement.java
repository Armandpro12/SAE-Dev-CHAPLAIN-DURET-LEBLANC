
public class SAETestDeplacement {
	
	  static char[] listeObstacle = { '\u250C', '\u2518', '\u2514', '\u2510', '\u2503', '\u2500', '\u2502' };
	  
	  public static void execute() {
		  
	  }
	  public static int[] deplacementJoueur(int[] coordPositionJoueur, String action,
		      String[] interactions, char[][] plateauDeJeu, char[][] labyrinthe) { // vueJoueur(plateauDeJeu,
		    // coordPositionJoueur);
		    if (action.equalsIgnoreCase(interactions[0]) && coordPositionJoueur[1] + 1 < labyrinthe.length
		        && verifObstacle(labyrinthe[coordPositionJoueur[1] + 1][coordPositionJoueur[0]])) { // avancer
		      plateauDeJeu[coordPositionJoueur[1]][coordPositionJoueur[0]] = ' ';
		      coordPositionJoueur[1] += 1;
		    }

		    if (action.equalsIgnoreCase(interactions[1]) && coordPositionJoueur[1] - 1 > 0
		        && verifObstacle(labyrinthe[coordPositionJoueur[1] - 1][coordPositionJoueur[0]])) { // reculer
		      plateauDeJeu[coordPositionJoueur[1]][coordPositionJoueur[0]] = ' ';
		      coordPositionJoueur[1] -= 1;

		    }

		    else if (action.equalsIgnoreCase(interactions[2]) && coordPositionJoueur[0] + 2 < labyrinthe[0].length - 1
		        && verifObstacle(labyrinthe[coordPositionJoueur[1]][coordPositionJoueur[0] + 2])) { // droite
		      plateauDeJeu[coordPositionJoueur[1]][coordPositionJoueur[0]] = ' ';
		      coordPositionJoueur[0] += 2;

		    }

		    else if (action.equalsIgnoreCase(interactions[3]) && coordPositionJoueur[0] - 2 > 0
		        && verifObstacle(labyrinthe[coordPositionJoueur[1]][coordPositionJoueur[0] - 2])) { // gauche
		      plateauDeJeu[coordPositionJoueur[1]][coordPositionJoueur[0]] = ' ';
		      coordPositionJoueur[0] -= 2;
		    }
		    return coordPositionJoueur;
		  }
	  
	  public static boolean verifObstacle(char emplacement) {
		    for (int obstacle = 0; obstacle < listeObstacle.length; obstacle++) {
		      if (emplacement == listeObstacle[obstacle]) {
		        return false;
		      }
		    }
		    return true;
		  }
}
