import java.util.Scanner;

public class Affichage {

  final static Scanner sc = new Scanner(System.in);

  public static void afficherMenuPrincipal() { // Ethan
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("1. JOUER \n2. OPTIONS \n3. DIFFICULTE \n4. QUITTER");

  }

  public static void afficherMenuOptions() { // Ethan
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("1. TOUCHES \n2. AIDE \n3. PSEUDO \n4. REDEMARRER LE JEU \n5. RETOUR");

  }

  public static void afficherMenuDifficulte() { // Ethan
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("\tChoisissez la difficult� \n");
    System.out.println("1. Tuto \n2. FACILE \n3. INTERMEDIAIRE \n4. DIFFICILE \n5. RETOUR");
  }

  public static void afficherMenuTouches() { // Ethan
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("1. z : AVANCER \n2. s : RECULER \n3. q : ALLER � DROITE \n4. d:ALLER � GAUCHE \n5. RETOUR");
  }

  public static void afficherOptionsEnJeu() { // Ethan
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "1. REPRENDRE \n2. TOUCHES \n3. AIDE \n4. DIFFICULTE \n5. RED�MARRER ET REVENIR AU MENU PRINCIPAL");
  }

  public static void afficherMenuAide() { // Ethan
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "1. INTERACTIONS \n2. TOUCHES \n3. PIECES \n4. LABYRINTHES \n5. DIFFICULTES \n6. VICTOIRE \n7. PSEUDO \n8. RETOUR");
  }

  public static void afficherInfosInteractions() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Il y a six interactions possibles : avancer, aller � droite, aller � gauche, reculer, afficher le menu des options et interagir. \n\n1. RETOUR");
  }

  public static void afficherInfosTouches() {
    GestionChoixUtilisateur.affectationInteractions(Main.interactions);
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Chaque touche est associ�e � une interaction : \nAvancer : " + Main.interactions[0]
            + " \nAller � droite : " + Main.interactions[2] + " \nAller � gauche : " + Main.interactions[3]
            + " \nReculer : " + Main.interactions[1]
            + "\nIl est possible de les modifier en vous rendant dans les OPTIONS puis TOUCHES. \n\n1. RETOUR");
  }

  public static void afficherInfosPieces() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Des pi�ces peuvent �tre obtenues dans certaines situations : en cas de victoire ou de victoire sur un monstre. Pour en savoir plus sur les victoires, veuillez vous renseigner sur les victoires. Un ennemi vous donnera 3 pi�ces.  \n1. RETOUR");
  }

  public static void afficherInfosLabyrinthes() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Il y a trois labyrinthes selon trois niveaux differents : \nFacile \nInterm�diaire \nDifficile. \nDans chaque labyrinthe, il y a un certains nombre de murs, d'items et d'ennemis \n1. RETOUR");
  }

  public static void afficherInfosDifficultes() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "La difficult� se fera ressentir par le joueur en fonction de la taille du labyrinthe et de sa complexit�. \nPar exemple, un labyrinthe d'une grande taille sera plus difficile \n1. RETOUR");
  }

  public static void afficherInfosVictoire() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Selon les victoires, un syst�me de gain de pi�ces :\n  \n TUTO : 10 pi�ces \n FACILE : 20 pi�ces \n INTERMEDIAIRE : 30 pi�ces \n DIFFICILE : 50 pi�ces \n\n1. RETOUR");
  }

  public static void afficherInfosPseudo() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Il vous est possible de changer de pseudo. \nPour cela, vous devez vous rendre dans OPTIONS puis PSEUDO. \n1.RETOUR");
  }

  public static void afficherMenuChangementPseudo() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("1. CHANGER DE PSEUDO \n2. RETOUR");
  }

  public static void demanderChangementPseudo() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.print("Votre nouveau pseudo : ");
  }

  public static void demanderPseudo() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.print("Tout d'abord, donne moi ton nom : ");
    Main.pseudo = sc.nextLine();
  }

  public static void afficherTableau(char[][] tableau) { // Armand
    for (int ligne = tableau.length - 1; ligne > -1; ligne--) {
      for (int colonne = 0; colonne < tableau[ligne].length; colonne++) {
        System.out.print(tableau[ligne][colonne]);
      }
      System.out.println();
    }

  }

  public static String demanderActionJoueur() { // Armand
    String action;

    System.out.print("Action : ");
    action = sc.nextLine();

    return action;

  }

  public static void afficherPositionJoueur(int[] coordPositionJoueur, char[][] tableau) { // Armand

    tableau[coordPositionJoueur[1]][coordPositionJoueur[0]] = '\u00D7';

  }

  public static void afficherMarche() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out
        .println("Bienvenue au march� ! \n\n1. Acheter un item \n2. Jouer au jeu du hasard \n3. Sortir du march�");
  }

  public static void afficherChoixItemsTuto(String itemAlea1, String itemAlea2, String itemAlea3) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Bienvenue au magasin ! \n\n1. Acheter " + itemAlea1 + "\t il en reste "
        + Main.quantiteItemsDispoTuto[OperationSurTableaux.trouverElement(Main.itemsAchetablesTuto, itemAlea1)]
        + "\n2. Acheter " + itemAlea2 + "\t il en reste "
        + Main.quantiteItemsDispoTuto[OperationSurTableaux.trouverElement(Main.itemsAchetablesTuto, itemAlea2)] +
        "\n3. Acheter " + itemAlea3 + "\t il en reste "
        + Main.quantiteItemsDispoTuto[OperationSurTableaux.trouverElement(Main.itemsAchetablesTuto, itemAlea3)]
        + "\n4. Retourner au march�");
  }

  public static void afficherChoixItems(String itemAlea1, String itemAlea2, String itemAlea3) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Bienvenue au magasin ! \n\n1. Acheter " + itemAlea1 + " (quantit� restante : "
        + Main.quantiteItemsDispo[OperationSurTableaux.trouverElement(Main.itemsAchetables, itemAlea1)]
        + ") \n2. Acheter " + itemAlea2 + " (quantit� restante : "
        + Main.quantiteItemsDispo[OperationSurTableaux.trouverElement(Main.itemsAchetables, itemAlea2)] +
        ") \n3. Acheter " + itemAlea3 + " (quantit� restante : "
        + Main.quantiteItemsDispo[OperationSurTableaux.trouverElement(Main.itemsAchetables, itemAlea3)]
        + ") \n4. Retourner au march�");
  }

  public static void afficherJeuDuHasard() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Bienvenue au stand de jeu ! \n\n1. Jouer au jeu du hasard (prix : 5 pi�ces) \n2. Retourner au march�");
  }

  public static void afficherAchatItems(String descriptionItem, int prixItem, String itemAlea) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out
        .println("Nombre de pi�ces poss�d�es : " + Main.nbPi�ces + "\n\nDescription de l'item : \n" + descriptionItem
            + "\n\n�tes-vous s�r de vouloir acheter " + itemAlea + " pour le prix de " + prixItem
            + " pi�ces ? \n1. Oui je suis s�r \n2. Revenir au choix des items");
  }

  public static void afficherManqueArgent(int prixItem) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Il vous manque " + (prixItem - Main.nbPi�ces) + " pi�ce(s) \n\n1. Revenir au march�");
  }

  public static void afficherItemPlusEnStock() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Cet item n'est plus disponible � l'achat \n\n1. Revenir au march�");
  }

  public static void afficherManqueItem() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Vous n'avez pas les items requis pour pouvoir continuer ! \nRetournez au march� (la case M dans le labyrinthe) et achetez tous les items disponibles \n\n1. Reprendre le jeu");
  }

  public static void afficherFinLabyrintheTuto() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Tu as fini le tuto et tu as normalement les bases du jeu. \nPour en savoir +, tu peux entrer \"o\" en jeu et acc�der � l'aide dans les options \nLe d�fi va se corser dans le labyrinthe suivant. \nMais �a je pense que tu le sais... \nTu sais ce qu'il te reste � faire \nBonne chance... \n\n1. Continuer le jeu");
  }

  public static void afficherFinLabyrintheFacile() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Bravo tu as fini le labyrinthe le plus facile. \nMaintenant le d�fi va �tre plus cors�... \nBonne chance... \n\n*Vous avez gagn� 20 pi�ces*\n\n1. Continuer le jeu");
  }

  public static void afficherFinLabyrintheMoyen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Bravo tu as fini le labyrinthe moyen. \nJ'ai sous-estim� ta puissance \nMaintenant le d�fi va �tre ENCORE plus cors�... \nBonne chance... \n\n*Vous avez gagn� 30 pi�ces*\n\n1. Continuer le jeu");
  }

  public static void afficherFinLabyrintheDifficile() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Bravo tu as fini le labyrinthe difficile. \nAAAAARGH tu as r�ussi !!! \nComment est-ce possible ?! \nBonne chance... \n\n*Vous avez gagn� 50 pi�ces* \n\n1. Finir le jeu \n2. Recommencer le jeu avec les items gagn�s");
  }

  public static void afficherEnnemi() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Il y a un ennemi !! Combattez-le !! \n\n1. Combattre");
  }

  public static void afficherDefaite() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Malheureusement, vous avez perdu le combat, vous retournerez donc au d�but du labyrinthe ! \n\n1. Continuer");
  }

  public static void afficherVictoire() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Vous avez gagn� le combat face � un ennemi !\nBravo � vous ! \n\n1. Continuer");
  }

  public static void afficherPlusDeVie() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Vous avez perdu car vous n'avez plus de vie. \n\n1. Recommencer");
  }
}