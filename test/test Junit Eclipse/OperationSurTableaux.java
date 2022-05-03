
public class OperationSurTableaux {

  // Ethan a fait le marché, les placements murs,

  static char[] listeObstacle = { '\u250C', '\u2518', '\u2514', '\u2510', '\u2503', '\u2500', '\u2502' };

  static char[][] barInfoBas = Main.barInfoBas;
  static String[] texteBarInfo = new String[Main.barInfoBas.length - 2];

  public static void initialisationLabyrinthe(int difficulte, char[][] labyrinthe) { // Armand

    for (int ligne = 0; ligne < labyrinthe.length; ligne++) {
      for (int colonne = 0; colonne < labyrinthe[ligne].length; colonne++) {
        labyrinthe[ligne][colonne] = ' ';
      }
    }
    if (difficulte == 0) {
      placementMurTuto(labyrinthe);
    }

    else if (difficulte == 1) {
      placementMurEasy(labyrinthe);
    }

    else if (difficulte == 2) {
      placementMurMedium(labyrinthe);
    }

    else {
      placementMurHard(labyrinthe);
    }

    delimitation(labyrinthe);
  }

  public static void placementMurHard(char[][] labyrinthe) { // Ethan
    int[] positionMur = new int[2];
    positionMur[0] = 4; // positionMur[0] = x (position mur x pair pour le perso)
    positionMur[1] = 4;// positionMur[1] = y

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';
    for (int ligne = 5; ligne < 7; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    for (int ligne = 9; ligne < 11; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }
    positionMur[1] = 11;
    for (int colonne = 4; colonne < 9; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 9;
    positionMur[1] = 11;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 4;
    positionMur[1] = 11;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 4;
    positionMur[1] = 7;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[1] = 4;
    positionMur[0] = 8;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 7;

    for (int colonne = 5; colonne < 8; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 8;
    for (int ligne = 7; ligne < 10; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[0] = 8;
    for (int ligne = 5; ligne < 7; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[1] = 8;
    positionMur[0] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 7;
    positionMur[0] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[1] = 11;
    positionMur[0] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[1] = 10;
    positionMur[0] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 9;
    positionMur[0] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 11;
    positionMur[0] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    for (int colonne = 13; colonne < 19; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[1] = 11;
    positionMur[0] = 19;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    for (int ligne = 6; ligne < 14; ligne++) {
      labyrinthe[ligne][positionMur[0] + 3] = '\u2502';
    }

    positionMur[0] = 21;
    positionMur[1] = 11;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 11;
    positionMur[0] = 20;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 7;
    for (int colonne = 13; colonne < 19; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[1] = 7;
    positionMur[0] = 18;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 8;
    positionMur[0] = 18;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 9;
    positionMur[0] = 18;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 9;
    positionMur[0] = 17;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 9;
    positionMur[0] = 16;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 9;
    positionMur[0] = 15;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 13;

    for (int colonne = 0; colonne < 17; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[1] = 15;
    positionMur[0] = 5;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 15;
    positionMur[0] = 6;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    for (int colonne = 10; colonne < 17; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 16;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 13;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 14;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 15;
    positionMur[0] = 4;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[1] = 16;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 17;
    positionMur[0] = 4;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    for (int colonne = 5; colonne < 10; colonne++) {

      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[1] = 17;
    positionMur[0] = 10;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 17;
    positionMur[0] = 12;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 17;
    positionMur[0] = 11;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 8;

    for (int ligne = 18; ligne < 25; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[0] = 7;

    for (int ligne = 19; ligne < 25; ligne += 2) {
      labyrinthe[ligne][positionMur[0]] = '\u2500';
    }

    positionMur[0] = 6;

    for (int ligne = 19; ligne < 25; ligne += 2) {
      labyrinthe[ligne][positionMur[0]] = '\u2500';
    }

    positionMur[0] = 5;

    for (int ligne = 19; ligne < 25; ligne += 2) {
      labyrinthe[ligne][positionMur[0]] = '\u2500';
    }

    positionMur[0] = 4;

    for (int ligne = 19; ligne < 25; ligne += 2) {
      labyrinthe[ligne][positionMur[0]] = '\u2500';
    }

    positionMur[0] = 28;
    positionMur[1] = 26;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 26;

    for (int colonne = 9; colonne < 28; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 28;

    for (int ligne = 25; ligne > 17; ligne--) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[1] = 18;
    positionMur[0] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 19;
    positionMur[0] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[1] = 19;
    positionMur[0] = 13;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 19;
    positionMur[0] = 14;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 19;
    positionMur[0] = 16;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 19;
    positionMur[0] = 15;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 20;
    positionMur[0] = 17;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[1] = 19;
    positionMur[0] = 17;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 20;
    positionMur[0] = 18;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 20;
    positionMur[0] = 19;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 20;
    positionMur[0] = 20;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 24;

    for (int ligne = 18; ligne < 23; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[0] = 24;
    positionMur[1] = 17;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[0] = 28;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 27;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 26;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 25;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 22;
    positionMur[0] = 24;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    for (int colonne = 23; colonne > 12; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 12;

    for (int ligne = 23; ligne < 24; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[1] = 22;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[1] = 4;
    positionMur[0] = 13;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    for (int colonne = 14; colonne < 18; colonne++) {

      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[1] = 27;
    positionMur[0] = 8;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 26;
    positionMur[0] = 8;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    for (int ligne = 29; ligne < 32; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[1] = 14;
    positionMur[0] = 22;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[1] = 14;
    positionMur[0] = 23;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 24;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 2;

    for (int colonne = 18; colonne < 37; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[1] = 6;
    positionMur[0] = 26;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 7;
    positionMur[0] = 27;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 7;
    positionMur[0] = 26;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 28;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 29;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 30;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 8;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 9;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[0] = 29;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 28;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 26;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[1] = 10;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 11;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 28;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 28;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    for (int ligne = 12; ligne < 16; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[0] = 36;

    for (int ligne = 3; ligne < 7; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[1] = 7;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    for (int colonne = 35; colonne > 27; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[1] = 4;
    for (int colonne = 27; colonne < 36; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[1] = 5;
    positionMur[0] = 30;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 34;

    for (int ligne = 8; ligne < 15; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[1] = 5;
    positionMur[0] = 9;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 10;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 42;

    for (int ligne = 1; ligne < 15; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[1] = 15;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    for (int colonne = 41; colonne > 37; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[1] = 25;
    positionMur[0] = 14;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 24;
    positionMur[0] = 18;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 2;
    positionMur[0] = 36;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 10;
    positionMur[0] = 33;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 30;
    positionMur[0] = 8;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[1] = 30;
    positionMur[0] = 9;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    for (int colonne = 10; colonne < 25; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[1] = 29;
    positionMur[0] = 20;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 28;
    positionMur[0] = 20;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[1] = 30;
    positionMur[0] = 24;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 28;

    for (int colonne = 21; colonne < 28; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[1] = 30;
    positionMur[0] = 28;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    for (int colonne = 29; colonne < 37; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 32;

    for (int ligne = 29; ligne > 23; ligne--) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[0] = 8;
    positionMur[1] = 32;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 31;
    positionMur[0] = 24;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 28;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 23;
    positionMur[0] = 32;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[0] = 33;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 31;
    positionMur[0] = 24;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 31;
    positionMur[0] = 24;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 23;

    for (int colonne = 34; colonne < 43; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 42;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    for (int ligne = 24; ligne < 31; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[1] = 31;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 43;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 44;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 44;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 32;
    positionMur[0] = 44;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 20;

    for (int colonne = 29; colonne < 36; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[1] = 28;
    for (int colonne = 49; colonne < 81; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 48;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    for (int ligne = 27; ligne > 18; ligne--) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[1] = 16;
    positionMur[0] = 38;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 15;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[1] = 17;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 32;
    positionMur[0] = 92;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 4;
    positionMur[0] = 44;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 45;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 43;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 46;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 46;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 3;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 2;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[0] = 48;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 49;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 50;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 50;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 3;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 6;
    positionMur[0] = 46;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 8;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 9;

    positionMur[1] = 10;

    positionMur[1] = 12;

    positionMur[1] = 9;
    positionMur[0] = 27;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 11;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 31;

    for (int colonne = 87; colonne < 96; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 86;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[1] = 30;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 29;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 28;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    for (int colonne = 85; colonne > 80; colonne--) {

      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 78;
    positionMur[1] = 27;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 78;
    positionMur[1] = 26;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 77;
    positionMur[1] = 26;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 76;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 77;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 75;
    positionMur[1] = 26;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 74;
    positionMur[1] = 26;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 74;
    positionMur[1] = 25;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 74;
    positionMur[1] = 24;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 70;
    positionMur[1] = 23;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';
    positionMur[0] = 70;
    positionMur[1] = 22;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 69;
    positionMur[1] = 22;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 68;
    positionMur[1] = 22;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 67;
    positionMur[1] = 22;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 66;
    positionMur[1] = 22;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 65;
    positionMur[1] = 22;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 64;
    positionMur[1] = 22;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 63;
    positionMur[1] = 22;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 66;
    positionMur[1] = 21;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 66;
    positionMur[1] = 20;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 65;
    positionMur[1] = 20;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 64;
    positionMur[1] = 20;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 63;
    positionMur[1] = 20;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 62;
    positionMur[1] = 20;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 61;
    positionMur[1] = 20;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 60;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 59;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 58;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 59;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 58;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    for (int ligne = 21; ligne < 25; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[0] = 54;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 53;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 62;
    positionMur[1] = 19;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 62;
    positionMur[1] = 18;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 62;
    positionMur[1] = 17;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 62;
    positionMur[1] = 16;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 31;
    positionMur[0] = 96;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 30;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 28;

    for (int colonne = 99; colonne > 92; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[0] = 92;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[1] = 27;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 26;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 91;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 90;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 89;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 88;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 86;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[1] = 25;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 24;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 86;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 88;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 22;

    for (int colonne = 99; colonne > 78; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[1] = 20;

    for (int colonne = 99; colonne > 85; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    for (int colonne = 80; colonne > 70; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[1] = 18;

    for (int colonne = 90; colonne > 80; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    for (int colonne = 73; colonne > 65; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[1] = 16;

    for (int colonne = 81; colonne > 66; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    for (int colonne = 95; colonne > 89; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[0] = 82;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 15;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 14;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 13;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[1] = 16;
    positionMur[0] = 96;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 17;
    positionMur[0] = 96;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 18;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 11;
    positionMur[0] = 45;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 46;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 47;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 51;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 52;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 53;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 56;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 57;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 58;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 62;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 63;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 64;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 68;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 69;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 70;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 71;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 72;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 73;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 77;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 78;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 79;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 83;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 84;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 85;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 89;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 90;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 91;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 14;

    for (int colonne = 87; colonne < 96; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[0] = 96;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 13;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 17;

    for (int colonne = 57; colonne > 47; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[1] = 2;

    for (int colonne = 55; colonne < 62; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[0] = 62;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    for (int ligne = 3; ligne < 7; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[1] = 4;

    for (int colonne = 61; colonne > 54; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }
    positionMur[1] = 9;
    positionMur[0] = 56;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[0] = 54;
    positionMur[1] = 5;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 54;
    positionMur[1] = 4;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[1] = 8;
    positionMur[0] = 53;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[0] = 52;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[0] = 68;

    for (int ligne = 0; ligne < 4; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[1] = 13;
    positionMur[0] = 52;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 14;
    positionMur[0] = 52;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 13;
    positionMur[0] = 72;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 14;
    positionMur[0] = 72;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 59;
    positionMur[1] = 8;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[0] = 76;

    for (int ligne = 5; ligne < 8; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[0] = 84;

    for (int ligne = 8; ligne < 10; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[0] = 76;

    for (int ligne = 1; ligne < 3; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[0] = 84;

    for (int ligne = 2; ligne < 6; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[0] = 94;

    for (int ligne = 7; ligne < 9; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[1] = 4;

    for (int colonne = 90; colonne < 97; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }
    positionMur[1] = 9;
    positionMur[0] = 70;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 71;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 72;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 8;
    positionMur[0] = 70;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 69;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 68;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 47;
    positionMur[1] = 2;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 87;
    positionMur[1] = 26;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 24;
    positionMur[0] = 86;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[1] = 24;
    positionMur[0] = 87;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 40;
    positionMur[1] = 24;

    labyrinthe[positionMur[1]][positionMur[0]] = 'M';

    positionMur[0] = 6;
    positionMur[1] = 8;

    labyrinthe[positionMur[1]][positionMur[0]] = 'E';

    positionMur[0] = 40;
    positionMur[1] = 1;

    labyrinthe[positionMur[1]][positionMur[0]] = 'E';

    positionMur[0] = 80;
    positionMur[1] = 25;

    labyrinthe[positionMur[1]][positionMur[0]] = 'E';

    positionMur[0] = 52;
    positionMur[1] = 3;

    labyrinthe[positionMur[1]][positionMur[0]] = 'E';

    positionMur[0] = 46;
    positionMur[1] = 14;

    labyrinthe[positionMur[1]][positionMur[0]] = 'E';

    positionMur[0] = 44;
    positionMur[1] = 1;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u25A0';
    positionMur[0] = 46;
    positionMur[1] = 1;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u25A0';

  }

  public static void placementMurMedium(char[][] labyrinthe) { // Ethan
    int[] positionMur = new int[2];
    positionMur[0] = 5; // positionMur[0] = x (position mur x pair pour le perso)
    positionMur[1] = 4;// positionMur[1] = y

    positionMur[1] = 2;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 6;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    for (int ligne = 5; ligne < 13; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[1] = 15;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 5;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 4;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 7;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[0] = 12;

    for (int ligne = 16; ligne > 14; ligne--) {
      labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    }

    positionMur[1] = 14;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[0] = 13;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 14;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 15;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 16;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 13;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 11;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 15;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 14;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 13;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 14;

    positionMur[1] = 9;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 13;

    positionMur[1] = 7;

    for (int colonne = 7; colonne < 17; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 12;

    for (int ligne = 5; ligne > 2; ligne--) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[1] = 2;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    for (int colonne = 13; colonne < 20; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[1] = 5;
    positionMur[0] = 18;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 4;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    for (int colonne = 19; colonne < 26; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[0] = 26;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 3;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 6;

    for (int colonne = 24; colonne < 32; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[0] = 32;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    for (int ligne = 7; ligne < 12; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';
    }

    positionMur[1] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 33;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 34;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 16;
    positionMur[0] = 18;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 15;
    positionMur[0] = 23;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 24;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 25;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 26;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 27;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 10;

    positionMur[0] = 41;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    for (int colonne = 37; colonne < 41; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';
    }

    positionMur[0] = 42;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    for (int ligne = 16; ligne > 12; ligne--) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[1] = 12;
    positionMur[0] = 22;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 11;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 10;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[0] = 23;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 24;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 25;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 26;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 9;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 8;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 4;
    positionMur[0] = 32;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 33;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 34;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 35;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 36;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 5;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 2;
    positionMur[0] = 40;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 41;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 42;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 43;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 44;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[1] = 3;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 8;
    positionMur[0] = 37;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 38;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 39;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 40;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 7;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 6;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[0] = 41;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 42;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 43;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 34;

    for (int ligne = 1; ligne < 4; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[1] = 15;

    for (int colonne = 43; colonne < 47; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[0] = 32;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 15;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 16;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 14;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[0] = 33;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 34;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 35;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 16;
    positionMur[0] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 2;
    positionMur[0] = 20;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 1;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 4;

    for (int colonne = 50; colonne > 44; colonne--) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[0] = 44;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 46;
    positionMur[1] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[1] = 11;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 10;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 9;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 45;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 16;
    positionMur[0] = 14;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u25A0';

    positionMur[0] = 16;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u25A0';

    positionMur[1] = 15;
    positionMur[0] = 18;

    labyrinthe[positionMur[1]][positionMur[0]] = 'E';

    positionMur[1] = 8;

    labyrinthe[positionMur[1]][positionMur[0]] = 'E';

    positionMur[1] = 16;
    positionMur[0] = 44;

    labyrinthe[positionMur[1]][positionMur[0]] = 'M';

    positionMur[1] = 13;
    positionMur[0] = 26;

    labyrinthe[positionMur[1]][positionMur[0]] = 'E';

  }

  public static void placementMurEasy(char[][] labyrinthe) { // Ethan

    int[] positionMur = new int[2];
    positionMur[0] = 5; // positionMur[0] = x (position mur x pair pour le perso)
    positionMur[1] = 4;// positionMur[1] = y

    positionMur[0] = 1;
    positionMur[1] = 5;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 2;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 4;
    positionMur[1] = 2;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 3;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 5;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 6;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 10;
    positionMur[1] = 1;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 2;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u250C';

    positionMur[0] = 11;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 12;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 4;

    for (int ligne = 6; ligne < 7; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[1] = 5;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 3;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 10;

    for (int ligne = 7; ligne > 5; ligne--) {
      labyrinthe[ligne][positionMur[0]] = '\u2502';

    }

    positionMur[1] = 6;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 9;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[1] = 4;

    for (int colonne = 10; colonne < 14; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[0] = 14;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    for (int colonne = 19; colonne < 25; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[1] = 7;
    positionMur[0] = 22;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 18;
    positionMur[1] = 6;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 7;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 14;
    positionMur[1] = 5;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 16;
    positionMur[1] = 2;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 17;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 18;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 19;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2518';

    positionMur[0] = 2;
    positionMur[1] = 6;

    labyrinthe[positionMur[1]][positionMur[0]] = 'M';

    positionMur[0] = 22;
    positionMur[1] = 7;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u25A0';

    positionMur[0] = 20;
    positionMur[1] = 7;
    labyrinthe[positionMur[1]][positionMur[0]] = '\u25A0';

    positionMur[1] = 5;
    positionMur[0] = 18;

    labyrinthe[positionMur[1]][positionMur[0]] = 'E';

    positionMur[1] = 4;
    positionMur[0] = 8;

    labyrinthe[positionMur[1]][positionMur[0]] = 'E';

  }

  public static void placementMurTuto(char[][] labyrinthe) { // Ethan
    int[] positionMur = new int[2];
    positionMur[0] = 5; // positionMur[0] = x (position mur x pair pour le perso)
    positionMur[1] = 4;// positionMur[1] = y

    positionMur[1] = 3;

    for (int colonne = 4; colonne < 15; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[1] = 1;

    for (int colonne = 4; colonne < 15; colonne++) {
      labyrinthe[positionMur[1]][colonne] = '\u2500';

    }

    positionMur[0] = 22;
    positionMur[1] = 3;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 1;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[0] = 28;
    positionMur[1] = 3;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 29;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2500';

    positionMur[0] = 30;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2510';

    positionMur[1] = 2;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2502';

    positionMur[1] = 2;
    positionMur[0] = 16;

    labyrinthe[positionMur[1]][positionMur[0]] = 'M';

    positionMur[1] = 1;

    labyrinthe[positionMur[1]][positionMur[0]] = '\u2514';

    positionMur[0] = 38;
    for (int ligne = 0; ligne < labyrinthe.length; ligne++) {
      labyrinthe[ligne][positionMur[0]] = '\u25A0';
    }

    positionMur[1] = 2;
    positionMur[0] = 22;

    labyrinthe[positionMur[1]][positionMur[0]] = 'E';

  }

  public static void initialisationBrouillard(char[][] brouillard) { // Armand

    for (int ligne = 0; ligne < brouillard.length; ligne++) {
      for (int colonne = 0; colonne < brouillard[ligne].length; colonne++) {
        brouillard[ligne][colonne] = '\u2592'; // remplis la surface du brouillard
      }
    }
  }

  public static void initialisationBarInfoBas() { // Armand
    for (int ligne = 0; ligne < barInfoBas.length; ligne++) {
      for (int colonne = 0; colonne < barInfoBas[ligne].length; colonne++) {
        barInfoBas[ligne][colonne] = ' ';
      }
    }
    delimitation(barInfoBas);
  }

  public static void actualiserPlateauDeJeu(char[][] brouillard, char[][] plateauDeJeu, char[][] labyrinthe) { // Armand
    for (int ligne = 1; ligne < labyrinthe.length - 1; ligne++) {
      for (int colonne = 1; colonne < labyrinthe[ligne].length - 1; colonne++) {
        plateauDeJeu[ligne][colonne] = brouillard[ligne - 1][colonne - 1]; // remplis le plateau de jeu de brouillard
      }
    }
    delimitation(plateauDeJeu);

  }

  public static void delimitation(char[][] tableau) { // Armand
    for (int ligne = 0; ligne < tableau.length; ligne++) {
      for (int colonne = 0; colonne < tableau[ligne].length; colonne++) {
        tableau[0][colonne] = '\u2500'; // limite bas
        tableau[tableau.length - 1][colonne] = '\u2500'; // limite haut
        tableau[ligne][tableau[ligne].length - 1] = '\u2502'; // limite droit
        tableau[ligne][0] = '\u2502'; // limite gauche
      }
    }

    tableau[0][0] = '\u2514'; // angle bas gauche
    tableau[0][tableau[0].length - 1] = '\u2518'; // angle bas droit
    tableau[tableau.length - 1][tableau[0].length - 1] = '\u2510'; // angle haut droit
    tableau[tableau.length - 1][0] = '\u250C'; // angle haut gauche
  }

  public static void deplacementJoueur(int[] coordPositionJoueur, String action,
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
  }

  final static void vueJoueur(int[] coordPositionJoueur, char[][] plateauDeJeu, char[][] labyrinthe) { // Armand

    boolean obstacleHaut = false;
    boolean obstacleBas = false;
    int tailleLimiteVue = Main.tailleLimiteVue;

    for (int limiteVueY = 1; limiteVueY < tailleLimiteVue + 1; limiteVueY++) { // pour
      // la
      // vue
      // en
      // ordonnée
      if (coordPositionJoueur[1] + limiteVueY < labyrinthe.length - 1
          && verifObstacle(labyrinthe[coordPositionJoueur[1] + limiteVueY][coordPositionJoueur[0]])
          && !obstacleHaut) { // pour la vue
        // de haut
        plateauDeJeu[coordPositionJoueur[1] + limiteVueY][coordPositionJoueur[0]] = labyrinthe[coordPositionJoueur[1]
            + limiteVueY][coordPositionJoueur[0]];
      }

      else if (coordPositionJoueur[1] + limiteVueY < labyrinthe.length - 1
          && !verifObstacle(labyrinthe[coordPositionJoueur[1] + limiteVueY][coordPositionJoueur[0]])
          && !obstacleHaut) { // pour la vue
        // de haut
        plateauDeJeu[coordPositionJoueur[1] + limiteVueY][coordPositionJoueur[0]] = labyrinthe[coordPositionJoueur[1]
            + limiteVueY][coordPositionJoueur[0]];
        obstacleHaut = true;
      }

      if (coordPositionJoueur[1] - limiteVueY > 0
          && verifObstacle(labyrinthe[coordPositionJoueur[1] - limiteVueY][coordPositionJoueur[0]])
          && !obstacleBas) { // pour la vue en
        // bas
        plateauDeJeu[coordPositionJoueur[1] - limiteVueY][coordPositionJoueur[0]] = labyrinthe[coordPositionJoueur[1]
            - limiteVueY][coordPositionJoueur[0]];
      }

      else if (coordPositionJoueur[1] - limiteVueY > 0 && !obstacleBas) { // pour la vue
        // en
        // bas
        plateauDeJeu[coordPositionJoueur[1] - limiteVueY][coordPositionJoueur[0]] = labyrinthe[coordPositionJoueur[1]
            - limiteVueY][coordPositionJoueur[0]];
        obstacleBas = true;
      }
    }
    boolean obstacleGauche = false;
    boolean obstacleDroite = false;
    for (int limiteVueX = 1; limiteVueX < tailleLimiteVue * 3 + 1; limiteVueX++) { // pour la vue en abscisse un * 3 car
                                                                                   // 1 y = 3x en terme de taille
      if (coordPositionJoueur[0] + limiteVueX < labyrinthe[0].length - 1
          && verifObstacle(labyrinthe[coordPositionJoueur[1]][coordPositionJoueur[0] + limiteVueX])
          && !obstacleDroite) { // pour la vue de
        // droite
        plateauDeJeu[coordPositionJoueur[1]][coordPositionJoueur[0]
            + limiteVueX] = labyrinthe[coordPositionJoueur[1]][coordPositionJoueur[0] + limiteVueX];
      }

      else if (coordPositionJoueur[0] + limiteVueX < labyrinthe[0].length - 1 && !obstacleDroite) { // pour la vue
        // de
        // droite
        plateauDeJeu[coordPositionJoueur[1]][coordPositionJoueur[0]
            + limiteVueX] = labyrinthe[coordPositionJoueur[1]][coordPositionJoueur[0] + limiteVueX];
        obstacleDroite = true;
      }

      if (coordPositionJoueur[0] - limiteVueX > 0
          && verifObstacle(labyrinthe[coordPositionJoueur[1]][coordPositionJoueur[0] - limiteVueX])
          && !obstacleGauche) { // pour la vue de
        // gauche
        plateauDeJeu[coordPositionJoueur[1]][coordPositionJoueur[0]
            - limiteVueX] = labyrinthe[coordPositionJoueur[1]][coordPositionJoueur[0] - limiteVueX];
      }

      else if (coordPositionJoueur[0] - limiteVueX > 0 && !obstacleGauche) { // pour la vue
        // de
        // gauche
        plateauDeJeu[coordPositionJoueur[1]][coordPositionJoueur[0]
            - limiteVueX] = labyrinthe[coordPositionJoueur[1]][coordPositionJoueur[0] - limiteVueX];
        obstacleGauche = true; // cas sortie de if
      }
    }
    boolean obstacleHautDroite = false;
    boolean obstacleHautGauche = false;
    boolean obstacleBasDroite = false;
    boolean obstacleBasGauche = false;

    for (int limiteVueDiagonaleY = 1; limiteVueDiagonaleY < tailleLimiteVue + 1; limiteVueDiagonaleY++) { // pour la vue
                                                                                                          // en
                                                                                                          // diagonale
      for (int limiteVueDiagonaleX = 1; limiteVueDiagonaleX < tailleLimiteVue * 3 + 1; limiteVueDiagonaleX++) { // 1 y =
                                                                                                                // 3x en
                                                                                                                // terme
                                                                                                                // de
                                                                                                                // taille
        if (coordPositionJoueur[0] + limiteVueDiagonaleX < labyrinthe[0].length - 1
            && coordPositionJoueur[1] + limiteVueDiagonaleY < labyrinthe.length - 1
            && verifObstacle(labyrinthe[coordPositionJoueur[1] + limiteVueDiagonaleY][coordPositionJoueur[0]
                + limiteVueDiagonaleX])
            && !obstacleHautDroite) { // pour la vue en haut à droite

          plateauDeJeu[coordPositionJoueur[1] + limiteVueDiagonaleY][coordPositionJoueur[0]
              + limiteVueDiagonaleX] = labyrinthe[coordPositionJoueur[1] + limiteVueDiagonaleY][coordPositionJoueur[0]
                  + limiteVueDiagonaleX];
        }

        else if (coordPositionJoueur[0] + limiteVueDiagonaleX < labyrinthe[0].length - 1
            && coordPositionJoueur[1] + limiteVueDiagonaleY < labyrinthe.length - 1 && !obstacleHautDroite) { // pour la
                                                                                                              // vue en
                                                                                                              // haut à
                                                                                                              // droite

          plateauDeJeu[coordPositionJoueur[1] + limiteVueDiagonaleY][coordPositionJoueur[0]
              + limiteVueDiagonaleX] = labyrinthe[coordPositionJoueur[1] + limiteVueDiagonaleY][coordPositionJoueur[0]
                  + limiteVueDiagonaleX];

          obstacleHautDroite = true;

        }

        if (coordPositionJoueur[0] - limiteVueDiagonaleX > 0
            && coordPositionJoueur[1] - limiteVueDiagonaleY > 0 && verifObstacle(
                labyrinthe[coordPositionJoueur[1] - limiteVueDiagonaleY][coordPositionJoueur[0]
                    - limiteVueDiagonaleX])
            && !obstacleBasGauche) { // pour
          // la
          // vue
          // en
          // bas
          // à
          // gauche

          plateauDeJeu[coordPositionJoueur[1] - limiteVueDiagonaleY][coordPositionJoueur[0]
              - limiteVueDiagonaleX] = labyrinthe[coordPositionJoueur[1] - limiteVueDiagonaleY][coordPositionJoueur[0]
                  - limiteVueDiagonaleX];
        }

        else if (coordPositionJoueur[0] - limiteVueDiagonaleX > 0
            && coordPositionJoueur[1] - limiteVueDiagonaleY > 0 && !obstacleBasGauche) { // pour
          // la
          // vue
          // en
          // bas
          // à
          // gauche

          plateauDeJeu[coordPositionJoueur[1] - limiteVueDiagonaleY][coordPositionJoueur[0]
              - limiteVueDiagonaleX] = labyrinthe[coordPositionJoueur[1] - limiteVueDiagonaleY][coordPositionJoueur[0]
                  - limiteVueDiagonaleX];

          obstacleBasGauche = true;
        }

        if (coordPositionJoueur[0] - limiteVueDiagonaleX > 0
            && coordPositionJoueur[1] + limiteVueDiagonaleY < labyrinthe.length - 1 && verifObstacle(
                labyrinthe[coordPositionJoueur[1] + limiteVueDiagonaleY][coordPositionJoueur[0]
                    - limiteVueDiagonaleX])
            && !obstacleHautGauche) { // pour
          // la
          // vue
          // en
          // haut
          // à
          // gauche

          plateauDeJeu[coordPositionJoueur[1] + limiteVueDiagonaleY][coordPositionJoueur[0]
              - limiteVueDiagonaleX] = labyrinthe[coordPositionJoueur[1] + limiteVueDiagonaleY][coordPositionJoueur[0]
                  - limiteVueDiagonaleX];
        } else if (coordPositionJoueur[0] - limiteVueDiagonaleX > 0
            && coordPositionJoueur[1] + limiteVueDiagonaleY < labyrinthe.length - 1 && !obstacleHautGauche) { // pour
          // la
          // vue
          // en
          // haut
          // à
          // gauche

          plateauDeJeu[coordPositionJoueur[1] + limiteVueDiagonaleY][coordPositionJoueur[0]
              - limiteVueDiagonaleX] = labyrinthe[coordPositionJoueur[1] + limiteVueDiagonaleY][coordPositionJoueur[0]
                  - limiteVueDiagonaleX];
          obstacleHautGauche = true;
        }

        if (coordPositionJoueur[0] + limiteVueDiagonaleX < labyrinthe[0].length - 1
            && coordPositionJoueur[1] - limiteVueDiagonaleY > 0 && verifObstacle(
                labyrinthe[coordPositionJoueur[1] - limiteVueDiagonaleY][coordPositionJoueur[0]
                    + limiteVueDiagonaleX])
            && !obstacleBasDroite) { // pour
          // la
          // vue
          // en
          // bas
          // à
          // droite

          plateauDeJeu[coordPositionJoueur[1] - limiteVueDiagonaleY][coordPositionJoueur[0]
              + limiteVueDiagonaleX] = labyrinthe[coordPositionJoueur[1] - limiteVueDiagonaleY][coordPositionJoueur[0]
                  + limiteVueDiagonaleX];
        }

        else if (coordPositionJoueur[0] + limiteVueDiagonaleX < labyrinthe[0].length - 1
            && coordPositionJoueur[1] - limiteVueDiagonaleY > 0 && !obstacleBasDroite) { // pour
          // la
          // vue
          // en
          // bas
          // à
          // droite

          plateauDeJeu[coordPositionJoueur[1] - limiteVueDiagonaleY][coordPositionJoueur[0]
              + limiteVueDiagonaleX] = labyrinthe[coordPositionJoueur[1] - limiteVueDiagonaleY][coordPositionJoueur[0]
                  + limiteVueDiagonaleX];
          obstacleBasDroite = true;
        }
      }

    }
    // Affichage.afficherPositionJoueur(coordPositionJoueur, plateauDeJeu);
  }

  public static boolean verifObstacle(char emplacement) { // Armand
    for (int obstacle = 0; obstacle < listeObstacle.length; obstacle++) {
      if (emplacement == listeObstacle[obstacle]) {
        return false;
      }
    }
    return true;
  }

  public static void informationsBarInfoBas(int numDialogue, int numPage) { // Armand
    if (numDialogue == 0) { // numDialogue == 0 est pour tous les dialogues en jeu les numDialogue supérieur
                            // sont pour les dialogues en tuto
      if (numPage == 0) {
        texteBarInfo[0] = "interaction possible : aucune";
        texteBarInfo[2] = "nombre de coeurs : " + Main.nbVie;
        texteBarInfo[3] = "probabilité de victoire : " + Main.probaVictoire + "%";
        texteBarInfo[4] = "nombre de pièces : " + Main.nbPièces;
        texteBarInfo[5] = "items possédés : ";
        int compteur = 0;
        boolean slotVide = false;
        while (compteur < Main.itemsPossédés.length && !slotVide) {
          if (Main.itemsPossédés[compteur] == null) {
            slotVide = true;
          } else {
            texteBarInfo[5] += Main.itemsPossédés[compteur] + " | ";
            compteur++;
          }
        }
        if (compteur == 0) {
          texteBarInfo[5] += "aucun";
        }

      } else if (numPage == 1) {
        texteBarInfo[0] = "Entrez : \"E\" pour interagir";
        texteBarInfo[2] = "Interaction possible : entrer dans le marché";
      } else if (numPage == 2) {
        texteBarInfo[0] = "Entrez : \"E\" pour interagir";
        texteBarInfo[2] = "Interaction possible : finir le labyrinthe";
      } else if (numPage == 3) {
        texteBarInfo[0] = "Entrez n'importe quelle lettre pour combattre";
        texteBarInfo[2] = "Interaction obligatoire : combattre";
      }
    }
    if (numDialogue == 1) {
      if (numPage == 1) {
        texteBarInfo[0] = "Entrez \"suivant\" pour continuer ou \"passer\" pour passer le tuto";
        texteBarInfo[2] = "Bonjour ! ";
      } else if (numPage == 2) {
        texteBarInfo[0] = "Entrez \"suivant\" pour continuer";
        texteBarInfo[2] = "Bienvenue pour une nouvelle aventure ! ";
      } else if (numPage == 3) {
        texteBarInfo[0] = "Entrez \"suivant\" pour continuer";
        texteBarInfo[2] = "elle sera donc présente pour t'aider tout au long du jeu !";
        texteBarInfo[3] = "Cette boite est ici pour afficher des informations utiles en cours de jeu,";
      } else if (numPage == 5) {
        texteBarInfo[0] = "Entrez \"suivant\" pour continuer";
        texteBarInfo[2] = "En entrant \"" + Main.interactions[4] + "\" après le tuto";
        texteBarInfo[3] = "N'oublie pas que ton nom est modifiable en cours de jeu !";
        texteBarInfo[4] = "Bonjour " + Main.pseudo + " ! ";
      } else {
        texteBarInfo[0] = "Entrez \"suivant\" pour continuer";
        texteBarInfo[2] = "D'abord laisse moi te présenter ton premier labyrinthe !";
      }

    } else if (numDialogue == 2) {
      if (numPage == 1) {
        texteBarInfo[0] = "Entrez \"suivant\" pour continuer";
        texteBarInfo[2] = "C'est parce que tu n'es pas encore présent dans le labyrinthe...";
        texteBarInfo[3] = "Pour l'instant, tu ne vois rien ; c'est normal...";
      } else if (numPage == 2) {
        texteBarInfo[0] = "Entrez \"suivant\" pour continuer";
        texteBarInfo[2] = "Bon, laisse-moi chercher la commande...";
      } else if (numPage == 3) {
        texteBarInfo[0] = "Entrez \"suivant\" pour continuer";
        texteBarInfo[2] = "...";
        texteBarInfo[3] = "hum...";
      } else if (numPage == 4) {
        texteBarInfo[0] = "Entrez \"suivant\" pour continuer";
        texteBarInfo[2] = "Trouvée !!!";
      }

    } else if (numDialogue == 3) {
      texteBarInfo[0] = "Entrez \"suivant\" pour continuer";
      texteBarInfo[2] = "car je n'ai pas encore implémenté la vue...";
      texteBarInfo[3] = "Bon... pour l'instant tu vois rien";
      texteBarInfo[4] = "La croix, c'est toi !";
    }

    else if (numDialogue == 4) {
      if (numPage == 1) {
        texteBarInfo[0] = "Entrez \"suivant\" pour continuer";
        texteBarInfo[2] = "Tu n'as plus qu'à l'explorer !!!";
        texteBarInfo[3] = "Voilà le jeu est complet !";
        texteBarInfo[4] = "TADAAAAM !!!";
      } else if (numPage == 2) {
        texteBarInfo[0] = "Entrez \"suivant\" pour jouer";
        texteBarInfo[2] = "se déplacer à droite : " + Main.interactions[2] + "  |  " + "se déplacer à gauche : "
            + Main.interactions[3];
        texteBarInfo[3] = "avancer : " + Main.interactions[0] + "  |  " + " reculer : " + Main.interactions[1];
        texteBarInfo[5] = "voici la liste des touches pour se déplacer : ";
        texteBarInfo[6] = "Ah oui j'oubliais !!!";
      }

    }

  }

  public static void remplirInformationsBarInfoBas(int numDialogue, int numPage) { // Armand
    for (int ligne = 0; ligne < texteBarInfo.length; ligne++) {
      texteBarInfo[ligne] = " ";
    }
    for (int ligne = 1; ligne < Main.barInfoBas.length - 1; ligne++) {
      for (int emplacementLettre = 1; emplacementLettre < Main.barInfoBas[ligne].length - 1; emplacementLettre++) {
        Main.barInfoBas[ligne][emplacementLettre] = ' ';
      }

    }
    OperationSurTableaux.informationsBarInfoBas(numDialogue, numPage);
    for (int ligne = 0; ligne < texteBarInfo.length; ligne++) {
      for (int emplacementLettre = 0; emplacementLettre < texteBarInfo[ligne]
          .length() && emplacementLettre < Main.barInfoBas[0].length - 1; emplacementLettre++) {

        Main.barInfoBas[1 + ligne][1 + emplacementLettre] = texteBarInfo[ligne]
            .charAt(emplacementLettre);
      }

    }
  }

  public static void itemAlea(String[] listeObjets, int[] listePrixObjets) { // Ethan
    int item1;
    int item2;
    int item3;

    if (Main.difficulte == 0) {
      listeObjets[0] = Main.itemsAchetablesTuto[0];
      listeObjets[1] = Main.itemsAchetablesTuto[1];
      listeObjets[2] = Main.itemsAchetablesTuto[2];

      listeObjets[3] = Main.descriptionItemsAchetablesTuto[0];
      listeObjets[4] = Main.descriptionItemsAchetablesTuto[1];
      listeObjets[5] = Main.descriptionItemsAchetablesTuto[2];

      listePrixObjets[0] = Main.prixItemsAchetablesTuto[0];
      listePrixObjets[1] = Main.prixItemsAchetablesTuto[1];
      listePrixObjets[2] = Main.prixItemsAchetablesTuto[2];
    } else {
      item1 = (int) (0 + Math.random() * (Main.itemsAchetables.length - 1));

      do {
        item2 = (int) (0 + Math.random() * (Main.itemsAchetables.length - 1));
      } while (item2 == item1);
      do {
        item3 = (int) (0 + Math.random() * (Main.itemsAchetables.length - 1));
      } while (item3 == item2 || item3 == item1);

      listeObjets[0] = Main.itemsAchetables[item1];
      listeObjets[1] = Main.itemsAchetables[item2];
      listeObjets[2] = Main.itemsAchetables[item3];

      listeObjets[3] = Main.descriptionItemsAchetables[item1];
      listeObjets[4] = Main.descriptionItemsAchetables[item2];
      listeObjets[5] = Main.descriptionItemsAchetables[item3];

      listePrixObjets[0] = Main.prixItemsAchetables[item1];
      listePrixObjets[1] = Main.prixItemsAchetables[item2];
      listePrixObjets[2] = Main.prixItemsAchetables[item3];

    }
  }

  public static int trouverElement(String[] tableau, String element) {
    String elem;
    for (int i = 0; i < tableau.length; i++) {
      if (tableau[i] == null) {
        elem = null;
      } else if (tableau[i].equalsIgnoreCase(element)) {
        return i;
      }
    }
    return -1;
  }

  public static boolean combat(int probaVictoire) { // Ethan
    int victoire = (int) (1 + Math.random() * 98);
    if (victoire < probaVictoire) {
      return true;
    } else {
      return false;
    }
  }

}