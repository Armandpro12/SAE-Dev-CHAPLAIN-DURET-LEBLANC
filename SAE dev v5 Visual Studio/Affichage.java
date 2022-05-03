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
    System.out.println("\tChoisissez la difficulté \n");
    System.out.println("1. Tuto \n2. FACILE \n3. INTERMEDIAIRE \n4. DIFFICILE \n5. RETOUR");
  }

  public static void afficherMenuTouches() { // Ethan
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("1. z : AVANCER \n2. s : RECULER \n3. q : ALLER À DROITE \n4. d:ALLER À GAUCHE \n5. RETOUR");
  }

  public static void afficherOptionsEnJeu() { // Ethan
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "1. REPRENDRE \n2. TOUCHES \n3. AIDE \n4. DIFFICULTE \n5. REDÉMARRER ET REVENIR AU MENU PRINCIPAL");
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
        "Il y a six interactions possibles : avancer, aller à droite, aller à gauche, reculer, afficher le menu des options et interagir. \n\n1. RETOUR");
  }

  public static void afficherInfosTouches() {
    GestionChoixUtilisateur.affectationInteractions(Main.interactions);
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Chaque touche est associée à une interaction : \nAvancer : " + Main.interactions[0]
            + " \nAller à droite : " + Main.interactions[2] + " \nAller à gauche : " + Main.interactions[3]
            + " \nReculer : " + Main.interactions[1]
            + "\nIl est possible de les modifier en vous rendant dans les OPTIONS puis TOUCHES. \n\n1. RETOUR");
  }

  public static void afficherInfosPieces() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Des pièces peuvent être obtenues dans certaines situations : en cas de victoire ou de victoire sur un monstre. Pour en savoir plus sur les victoires, veuillez vous renseigner sur les victoires. Un ennemi vous donnera 3 pièces.  \n1. RETOUR");
  }

  public static void afficherInfosLabyrinthes() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Il y a trois labyrinthes selon trois niveaux differents : \nFacile \nIntermédiaire \nDifficile. \nDans chaque labyrinthe, il y a un certains nombre de murs, d'items et d'ennemis \n1. RETOUR");
  }

  public static void afficherInfosDifficultes() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "La difficulté se fera ressentir par le joueur en fonction de la taille du labyrinthe et de sa complexité. \nPar exemple, un labyrinthe d'une grande taille sera plus difficile \n1. RETOUR");
  }

  public static void afficherInfosVictoire() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Selon les victoires, un système de gain de pièces :\n  \n TUTO : 10 pièces \n FACILE : 20 pièces \n INTERMEDIAIRE : 30 pièces \n DIFFICILE : 50 pièces \n\n1. RETOUR");
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

    tableau[coordPositionJoueur[1]][coordPositionJoueur[0]] = '\u00D7'; // y x

  }

  public static void afficherMarche() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out
        .println("Bienvenue au marché ! \n\n1. Acheter un item \n2. Jouer au jeu du hasard \n3. Sortir du marché");
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
        + "\n4. Retourner au marché");
  }

  public static void afficherChoixItems(String itemAlea1, String itemAlea2, String itemAlea3) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Bienvenue au magasin ! \n\n1. Acheter " + itemAlea1 + " (quantité restante : "
        + Main.quantiteItemsDispo[OperationSurTableaux.trouverElement(Main.itemsAchetables, itemAlea1)]
        + ") \n2. Acheter " + itemAlea2 + " (quantité restante : "
        + Main.quantiteItemsDispo[OperationSurTableaux.trouverElement(Main.itemsAchetables, itemAlea2)] +
        ") \n3. Acheter " + itemAlea3 + " (quantité restante : "
        + Main.quantiteItemsDispo[OperationSurTableaux.trouverElement(Main.itemsAchetables, itemAlea3)]
        + ") \n4. Retourner au marché");
  }

  public static void afficherJeuDuHasard() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Bienvenue au stand de jeu ! \n\n1. Jouer au jeu du hasard (prix : 5 pièces) \n2. Retourner au marché");
  }

  public static void afficherAchatItems(String descriptionItem, int prixItem, String itemAlea) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out
        .println("Nombre de pièces possédées : " + Main.nbPièces + "\n\nDescription de l'item : \n" + descriptionItem
            + "\n\nÊtes-vous sûr de vouloir acheter " + itemAlea + " pour le prix de " + prixItem
            + " pièces ? \n1. Oui je suis sûr \n2. Revenir au choix des items");
  }

  public static void afficherManqueArgent(int prixItem) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Il vous manque " + (prixItem - Main.nbPièces) + " pièce(s) \n\n1. Revenir au marché");
  }

  public static void afficherItemPlusEnStock() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Cet item n'est plus disponible à l'achat \n\n1. Revenir au marché");
  }

  public static void afficherManqueItem() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Vous n'avez pas les items requis pour pouvoir continuer ! \nRetournez au marché (la case M dans le labyrinthe) et achetez tous les items disponibles \n\n1. Reprendre le jeu");
  }

  public static void afficherFinLabyrintheTuto() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Tu as fini le tuto et tu as normalement les bases du jeu. \nPour en savoir +, tu peux entrer \"o\" en jeu et accéder à l'aide dans les options \nLe défi va se corser dans le labyrinthe suivant. \nMais ça je pense que tu le sais... \nTu sais ce qu'il te reste à faire \nBonne chance... \n\n1. Continuer le jeu");
  }

  public static void afficherFinLabyrintheFacile() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Bravo tu as fini le labyrinthe le plus facile. \nMaintenant le défi va être plus corsé... \nBonne chance... \n\n*Vous avez gagné 20 pièces*\n\n1. Continuer le jeu");
  }

  public static void afficherFinLabyrintheMoyen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Bravo tu as fini le labyrinthe moyen. \nJ'ai sous-estimé ta puissance \nMaintenant le défi va être ENCORE plus corsé... \nBonne chance... \n\n*Vous avez gagné 30 pièces*\n\n1. Continuer le jeu");
  }

  public static void afficherFinLabyrintheDifficile() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Bravo tu as fini le labyrinthe difficile. \nAAAAARGH tu as réussi !!! \nComment est-ce possible ?! \nBonne chance... \n\n*Vous avez gagné 50 pièces* \n\n1. Finir le jeu \n2. Recommencer le jeu avec les items gagnés");
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
        "Malheureusement, vous avez perdu le combat, vous retournerez donc au début du labyrinthe ! \n\n1. Continuer");
  }

  public static void afficherVictoire() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Vous avez gagné le combat face à un ennemi !\nBravo à vous ! \n\n1. Continuer");
  }

  public static void afficherPlusDeVie() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
        "Vous avez perdu car vous n'avez plus de vie. \n\n1. Recommencer");
  }
}