
/*dictionnaire unicode : 
\u00B7 : · (les pas du joueurs)
\u00D7 : × (le joueur)
\u250C : ┌ (mur haut gauche)
\u2518 : ┘ (mur bas droit)
\u2514 : └ (mur bas gauche)
\u2510 : ┐ (mur haut droit)
\u2502 : │ (mur vertical)
\u2500 : ─ (mur horizontal)
\u2592 : ▒ (cases encore non explorées)
\u25A0 : ■ (case d'arrivée)
*/

class Main {

  // ensemble des interactions possibles pour le joueur : [0] touche pour avancer,
  // [1] touche pour reculer, [2] touche pour aller à droite, [3] touche pour
  // aller à gauche, [4] touche option en jeu, [5] touche interagir
  static String[] interactions = new String[6];

  // relatif aux labyrinthes
  static char[][] labyrinthe; // labyrinthe[y][x]+ x impair pour le perso qui se déplace de 2x pour 1y. C'est
                              // le schéma du jeu qui est ensuite mis dans le plateau de jeu.
  static char[][] labyrintheTuto = new char[5][41];
  static char[][] labyrintheEasy = new char[9][25];
  static char[][] labyrintheMedium = new char[18][51];
  static char[][] labyrintheHard = new char[34][101];
  static char[][] barInfoBas = new char[10][101];

  // relatif aux plateau de jeux
  static char[][] plateauDeJeu; // plateauDeJeu[y][x] ce qui accueil le brouillard et le labyrinthe quand
                                // visible par le joueur.
  static char[][] plateauDeJeuTuto = new char[labyrintheTuto.length][labyrintheTuto[0].length];
  static char[][] plateauDeJeuEasy = new char[labyrintheEasy.length][labyrintheEasy[0].length];
  static char[][] plateauDeJeuMedium = new char[labyrintheMedium.length][labyrintheMedium[0].length];
  static char[][] plateauDeJeuHard = new char[labyrintheHard.length][labyrintheHard[0].length];

  // relatif au brouillard
  static char[][] brouillard; // brouillard[y][x] s'affiche dans la zone jouable donc de 1 à longueur-1 car en
                              // length et en 0 c'est les bordures
  static char[][] brouillardTuto = new char[labyrintheTuto.length - 2][labyrintheTuto[0].length - 2];
  static char[][] brouillardEasy = new char[labyrintheEasy.length - 2][labyrintheEasy[0].length - 2];
  static char[][] brouillardMedium = new char[labyrintheMedium.length - 2][labyrintheMedium[0].length - 2];
  static char[][] brouillardHard = new char[labyrintheHard.length - 2][labyrintheHard[0].length - 2];

  // coordonnées du joueur
  static int[] coordPositionJoueur = new int[2]; // coordPositionJoueur[x][y]

  // difficulté : 0 pour tuto, 1 pour facile, 2 pour moyen et 3 pour difficile
  static int difficulte;

  // pseudo que le joueur entre dans le tuto et peut le modifier dans les options
  static String pseudo;

  // relatif au marché
  static String[] itemsAchetablesTuto = { "lampe", "3 coeurs", "bâton" }; // Ethan
  static int[] quantiteItemsDispoTuto = { 1, 1, 1 }; // Ethan
  static int[] prixItemsAchetablesTuto = { 10, 15, 5 }; // Ethan
  static String[] descriptionItemsAchetablesTuto = { "Permet de doubler la visibilité",
      "vous ajoute 3 coeurs, sinon... Pas de jeu",
      "Rudimentaire mais essentiel pour le combat. \n50% de chance de tuer un ennemi" };
  static String[] itemsAchetables = { "épée", "plastron", "casque", "paire de gants", "bottes", " " }; // Ethan
  static int[] quantiteItemsDispo = { 1, 1, 1, 1, 1 }; // Ethan
  static int[] prixItemsAchetables = { 25, 60, 25, 5, 10, 15 }; // Ethan

  // Ethan
  static String[] descriptionItemsAchetables = { "Coupante et maniable. \najoute 15% de chance de tuer un ennemi",
      "Solide et tient chaud. \nréduit de 0,6 coeur la quantité de coeurs perdus lors d'une défaite",
      "Protège des projectiles. \nréduit de 0,5 coeur la quantité de coeurs perdus lors d'une défaite",
      "Chaude, protège les mains et maniement plus agile des armes.\najoute 1% de chance de tuer un ennemi et réduit de 0,2 coeur la quantité de coeurs perdus lors d'une défaite",
      "Elles tiennent chaud et protègent les pieds. \n" }; // Ethan

  // relatif au joueur
  static String[] itemsPossédés = new String[itemsAchetables.length + itemsAchetablesTuto.length]; // Ethan
  static double nbVie = 0; // Ethan
  static int probaVictoire = 0; // Ethan
  static int nbPièces = 30; // Ethan

  // vérifie si le tuto est fait ou non
  static boolean tutoFait = false;

  // définie la taille de visibilité du joueur
  static int tailleLimiteVue = 1;

  static double resistance; // Ethan

  public static void main(String[] args) {
    difficulte = 0;
    GestionChoixUtilisateur.choixMenuPrincipal();
  }

  public static void initialisation() {
    coordPositionJoueur[0] = 2;
    coordPositionJoueur[1] = 1;
    GestionChoixUtilisateur.affectationInteractions(interactions);
    verifDifficulte();
    OperationSurTableaux.initialisationLabyrinthe(difficulte, labyrinthe);
    OperationSurTableaux.initialisationBrouillard(brouillard);
    OperationSurTableaux.initialisationBarInfoBas();
    OperationSurTableaux.actualiserPlateauDeJeu(brouillard, plateauDeJeu, labyrinthe);
    verifInteract(labyrinthe);
    Affichage.afficherTableau(barInfoBas);
    Affichage.afficherPositionJoueur(coordPositionJoueur, plateauDeJeu);
    OperationSurTableaux.vueJoueur(coordPositionJoueur, plateauDeJeu, labyrinthe);
    lancementJeu(true);
  }

  public static void reprendre() {
    verifDifficulte();
    OperationSurTableaux.actualiserPlateauDeJeu(brouillard, plateauDeJeu, labyrinthe);
    Affichage.afficherTableau(barInfoBas);
    Affichage.afficherPositionJoueur(coordPositionJoueur, plateauDeJeu);
    OperationSurTableaux.vueJoueur(coordPositionJoueur, plateauDeJeu, labyrinthe);
    lancementJeu(true);
  }

  public static void lancementTuto() {
    int numDialogue = 1;
    int numPage = 1;
    if (!tutoFait) {
      if (numDialogue == 1) {
        System.out.print("\033[H\033[2J");  // \033[H met le curseur au début de la ligne suivante \033[2J supprimer toute la console
        System.out.flush();
        while (numPage < 7) {
          System.out.print("\033[H\033[2J");
          System.out.flush();
          if (numPage == 4) {
            Affichage.demanderPseudo();
            numPage += 1;
          } else {
            OperationSurTableaux.remplirInformationsBarInfoBas(numDialogue, numPage);
            Affichage.afficherTableau(barInfoBas);
            verifActionIntro(numDialogue, numPage, Affichage.demanderActionJoueur());
            numPage += 1;
          }

        }

        numDialogue += 1;
        numPage = 1;
      }

      if (numDialogue == 2) {
        while (numPage < 5) {
          System.out.print("\033[H\033[2J");
          System.out.flush();
          OperationSurTableaux.actualiserPlateauDeJeu(brouillard, plateauDeJeu, labyrinthe);
          Affichage.afficherTableau(plateauDeJeu);
          OperationSurTableaux.remplirInformationsBarInfoBas(numDialogue, numPage);
          Affichage.afficherTableau(barInfoBas);
          verifActionIntro(numDialogue, numPage, Affichage.demanderActionJoueur());
          numPage += 1;
        }
        numDialogue += 1;
        numPage = 1;

      }

      if (numDialogue == 3) {
        coordPositionJoueur[0] = 2;
        coordPositionJoueur[1] = 1;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        OperationSurTableaux.actualiserPlateauDeJeu(brouillard, plateauDeJeu, labyrinthe);
        Affichage.afficherPositionJoueur(coordPositionJoueur, plateauDeJeu);
        Affichage.afficherTableau(plateauDeJeu);
        OperationSurTableaux.remplirInformationsBarInfoBas(numDialogue, numPage);
        Affichage.afficherTableau(barInfoBas);

        verifActionIntro(numDialogue, numPage, Affichage.demanderActionJoueur());
        numDialogue += 1;
        numPage = 1;

      }

      if (numDialogue == 4) {
        while (numPage < 3) {
          System.out.print("\033[H\033[2J");
          System.out.flush();
          OperationSurTableaux.actualiserPlateauDeJeu(brouillard, plateauDeJeu, labyrinthe);
          Affichage.afficherPositionJoueur(coordPositionJoueur, plateauDeJeu);
          OperationSurTableaux.vueJoueur(coordPositionJoueur, plateauDeJeu, labyrinthe);
          Affichage.afficherTableau(plateauDeJeu);
          OperationSurTableaux.remplirInformationsBarInfoBas(numDialogue, numPage);
          Affichage.afficherTableau(barInfoBas);
          verifActionIntro(numDialogue, numPage, Affichage.demanderActionJoueur());
          numPage += 1;
        }

        numDialogue += 1;
        tutoFait = true;

      }
    } else {
      tutoFait = true;
    }

  }

  public static void lancementJeu(boolean lancerLeJeu) {
    if (difficulte == 0) {
      lancementTuto();
      while (difficulte == 0) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        verifDifficulte();
        OperationSurTableaux.actualiserPlateauDeJeu(brouillard, plateauDeJeu, labyrinthe);
        Affichage.afficherPositionJoueur(coordPositionJoueur, plateauDeJeu);
        OperationSurTableaux.vueJoueur(coordPositionJoueur, plateauDeJeu, labyrinthe);
        Affichage.afficherTableau(plateauDeJeu);
        verifInteract(labyrinthe);
        Affichage.afficherTableau(barInfoBas);
        String action = Affichage.demanderActionJoueur();
        verifActionEnJeu(action);

      }

    } else {
      while (lancerLeJeu && nbVie > 0) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        verifDifficulte();
        OperationSurTableaux.actualiserPlateauDeJeu(brouillard, plateauDeJeu, labyrinthe);
        Affichage.afficherPositionJoueur(coordPositionJoueur, plateauDeJeu);
        OperationSurTableaux.vueJoueur(coordPositionJoueur, plateauDeJeu, labyrinthe);
        Affichage.afficherTableau(plateauDeJeu);
        verifInteract(labyrinthe);
        Affichage.afficherTableau(barInfoBas);
        String action = Affichage.demanderActionJoueur();
        verifActionEnJeu(action);
      }
      GestionChoixUtilisateur.plusDeVie();

    }

  }

  public static void verifDifficulte() {

    if (difficulte == 0) {
      labyrinthe = labyrintheTuto;
      brouillard = brouillardTuto;
      plateauDeJeu = plateauDeJeuTuto;
    }

    else if (difficulte == 1) {
      labyrinthe = labyrintheEasy;
      brouillard = brouillardEasy;
      plateauDeJeu = plateauDeJeuEasy;
    }

    else if (difficulte == 2) {
      labyrinthe = labyrintheMedium;
      brouillard = brouillardMedium;
      plateauDeJeu = plateauDeJeuMedium;
    }

    else if (difficulte == 3) {
      labyrinthe = labyrintheHard;
      brouillard = brouillardHard;
      plateauDeJeu = plateauDeJeuHard;
    } else {
      System.out.println("Erreur ! Difficultée inexistante");
    }

  }

  public static void verifActionEnJeu(String action) {
    if (action.equalsIgnoreCase(interactions[4])) {
      GestionChoixUtilisateur.menuOptionsEnJeu();
    } else if (verifInteract(labyrinthe) == "marche" && action.equalsIgnoreCase(interactions[5])) {
      GestionChoixUtilisateur.marche();
    } else if (verifInteract(labyrinthe) == "ennemi") {
      GestionChoixUtilisateur.menuEnnemi(1);
    }

    else if (verifInteract(labyrinthe) == "fin" && action.equalsIgnoreCase(interactions[5])) {
      GestionChoixUtilisateur.finLabyrinthe();
    } else {
      OperationSurTableaux.deplacementJoueur(coordPositionJoueur, action,
          interactions, plateauDeJeu, labyrinthe);
    }
  }

  public static void verifActionIntro(int numDialogue, int numPage, String action) {
    boolean bonTexte = false;

    while (!bonTexte) {
      if (action.equalsIgnoreCase("suivant")) {
        bonTexte = true;

      } else if (action.equalsIgnoreCase("passer")) {
        bonTexte = true;
        nbVie = 2;
        probaVictoire = 50;
        nbPièces = 10;
        tailleLimiteVue = 2;
        difficulte = 1;
        itemsPossédés[0] = "lampe";
        itemsPossédés[1] = "bâton";
        initialisation();
      } else {
        action = Affichage.demanderActionJoueur();
      }
    }
  }

  public static String verifInteract(char[][] labyrinthe) {
    if (labyrinthe[coordPositionJoueur[1]][coordPositionJoueur[0]] == 'M') {
      OperationSurTableaux.remplirInformationsBarInfoBas(0, 1);
      return "marche";
    } else if (labyrinthe[coordPositionJoueur[1]][coordPositionJoueur[0]] == 'E') {
      OperationSurTableaux.remplirInformationsBarInfoBas(0, 3);
      return "ennemi";
    } else if (labyrinthe[coordPositionJoueur[1]][coordPositionJoueur[0]] == '\u25A0') {
      OperationSurTableaux.remplirInformationsBarInfoBas(0, 2);
      return "fin";
    } else {
      OperationSurTableaux.remplirInformationsBarInfoBas(0, 0);
      return "";
    }
  }

  public static void actionItem(String item) {
    if (item.equals("lampe")) {
      tailleLimiteVue *= 2;
    } else if (item.equals("3 coeurs")) {
      nbVie += 3;
    } else if (item.equals("bâton")) {
      probaVictoire += 50;
    } else if (item.equals("épée")) {
      probaVictoire += 15;
    } else if (item.equals("paire de gants")) {
      probaVictoire += 1;
      resistance += 0.5;
    } else if (item.equals("plastron")) {
      resistance += 4;
    } else if (item.equals("bottes")) {
      resistance += 0.8;
    } else if (item.equals("casque")) {
      resistance += 1;
    }
  }
}