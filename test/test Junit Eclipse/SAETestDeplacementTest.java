import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SAETestDeplacementTest {

	@Test
	void testDeplacementHaut() {
		char[][] labyrintheTuto = new char[5][41];
		char[][] plateauDeJeuTuto = new char[labyrintheTuto.length][labyrintheTuto[0].length];
		String[] interactions = {"z","s","d","q","o","e"};
		int[] coordPositionJoueur = { 2, 1 };
		int[] coordPositionJoueurAttendu = { 2, 2 }; //x,y
		OperationSurTableaux.initialisationLabyrinthe(0, labyrintheTuto);
		assertArrayEquals(coordPositionJoueurAttendu, SAETestDeplacement.deplacementJoueur(coordPositionJoueur, "z", interactions, plateauDeJeuTuto, labyrintheTuto), "test d�placement vers le haut sans mur en haut");
		int[] coordPositionJoueur2 = { 7, 2 };
		int[] coordPositionJoueurAttendu2 = { 7, 2 }; //x,y
		assertArrayEquals(coordPositionJoueurAttendu2, SAETestDeplacement.deplacementJoueur(coordPositionJoueur2, "z", interactions, plateauDeJeuTuto, labyrintheTuto), "test d�placement vers le haut avec mur en haut");
		
	}
	
	@Test
	void testDeplacementBas() {
		char[][] labyrintheTuto = new char[5][41];
		char[][] plateauDeJeuTuto = new char[labyrintheTuto.length][labyrintheTuto[0].length];
		String[] interactions = {"z","s","d","q","o","e"};
		int[] coordPositionJoueur = { 2, 1 };
		int[] coordPositionJoueurAttendu = { 2, 1 }; //x,y
		OperationSurTableaux.initialisationLabyrinthe(0, labyrintheTuto);
		assertArrayEquals(coordPositionJoueurAttendu, SAETestDeplacement.deplacementJoueur(coordPositionJoueur, "s", interactions, plateauDeJeuTuto, labyrintheTuto),  "test d�placement  vers le bas  avec mur en bas");
		int[] coordPositionJoueur2 = { 20, 2 };
		int[] coordPositionJoueurAttendu2 = { 20, 1 }; //x,y
		OperationSurTableaux.initialisationLabyrinthe(0, labyrintheTuto);
		assertArrayEquals(coordPositionJoueurAttendu2, SAETestDeplacement.deplacementJoueur(coordPositionJoueur2, "s", interactions, plateauDeJeuTuto, labyrintheTuto),  "test d�placement  vers le bas  sans mur en bas");

	}
	
	@Test
	void testDeplacementGauche() {
		char[][] labyrintheTuto = new char[5][41];
		char[][] plateauDeJeuTuto = new char[labyrintheTuto.length][labyrintheTuto[0].length];
		String[] interactions = {"z","s","d","q","o","e"};
		int[] coordPositionJoueur = { 2, 1 };
		int[] coordPositionJoueurAttendu = { 2, 1 }; //x,y
		OperationSurTableaux.initialisationLabyrinthe(0, labyrintheTuto);
		assertArrayEquals(coordPositionJoueurAttendu, SAETestDeplacement.deplacementJoueur(coordPositionJoueur, "q", interactions, plateauDeJeuTuto, labyrintheTuto),  "test d�placement  vers la gauche  avec mur � gauche");
		int[] coordPositionJoueur2 = { 7, 2 };
		int[] coordPositionJoueurAttendu2 = { 5, 2 }; //x,y
		assertArrayEquals(coordPositionJoueurAttendu2, SAETestDeplacement.deplacementJoueur(coordPositionJoueur2, "q", interactions, plateauDeJeuTuto, labyrintheTuto), "test d�placement vers la gauche sans mur � gauche");
		
	}

	@Test
	void testDeplacementDroite() {
		char[][] labyrintheTuto = new char[5][41];
		char[][] plateauDeJeuTuto = new char[labyrintheTuto.length][labyrintheTuto[0].length];
		String[] interactions = {"z","s","d","q","o","e"};
		int[] coordPositionJoueur = { 2, 1 };
		int[] coordPositionJoueurAttendu = { 2, 1 }; //x,y
		OperationSurTableaux.initialisationLabyrinthe(0, labyrintheTuto);
		assertArrayEquals(coordPositionJoueurAttendu, SAETestDeplacement.deplacementJoueur(coordPositionJoueur, "d", interactions, plateauDeJeuTuto, labyrintheTuto),  "test d�placement  vers la droite  avec mur � droite");
		int[] coordPositionJoueur2 = { 7, 2 };
		int[] coordPositionJoueurAttendu2 = { 9, 2 }; //x,y
		assertArrayEquals(coordPositionJoueurAttendu2, SAETestDeplacement.deplacementJoueur(coordPositionJoueur2, "d", interactions, plateauDeJeuTuto, labyrintheTuto), "test d�placement vers la droite sans mur � droite");
	}
	
}
