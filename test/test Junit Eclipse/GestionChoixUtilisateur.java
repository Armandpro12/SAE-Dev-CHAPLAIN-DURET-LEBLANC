import java.util.Scanner;

public class GestionChoixUtilisateur {

  final static Scanner sc = new Scanner(System.in);

  static boolean enJeu;

  public static void choixMenuPrincipal() {

    int choix;

    do {
      Affichage.afficherMenuPrincipal();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix < 1 || choix > 4);
    switch (choix) {
      case 1:
        Main.tutoFait = false;
        Main.difficulte = 0;
        Main.resistance = 1;
        Main.initialisation();
        break;
      case 2:
        choixMenuOptions();
        break;
      case 3:
        choixMenuDiffficulte();
        enJeu = false;
      default:
        System.exit(0);
        break;
    }

  }

  public static void choixMenuOptions() {

    int choix;
    do {
      Affichage.afficherMenuOptions();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix < 1 || choix > 5);
    switch (choix) {
      case 1:
        enJeu = false;
        choixMenuTouches(Main.interactions);
        break;
      case 2:
        enJeu = false;
        choixMenuAide();
      case 3:
        GestionChoixUtilisateur.menuChangementPseudo();
        break;
      case 4:
        Main.main(null);
        break;
      default:
        choixMenuPrincipal();
        enJeu = false;
        break;
    }
  }

  public static void choixMenuDiffficulte() {
    int choix;
    do {
      Affichage.afficherMenuDifficulte();
      choix = Integer.parseInt(sc.nextLine());

    } while (choix < 1 || choix > 6);

    switch (choix) {
      case 1:
        Main.difficulte = 0;
        Main.coordPositionJoueur[0] = 2;
        Main.coordPositionJoueur[1] = 1;
        Main.verifDifficulte();
        OperationSurTableaux.initialisationLabyrinthe(Main.difficulte, Main.labyrinthe);
        OperationSurTableaux.initialisationBrouillard(Main.brouillard);
        break;
      case 2:
        Main.difficulte = 1;
        Main.coordPositionJoueur[0] = 2;
        Main.coordPositionJoueur[1] = 1;
        Main.verifDifficulte();
        OperationSurTableaux.initialisationLabyrinthe(Main.difficulte, Main.labyrinthe);
        OperationSurTableaux.initialisationBrouillard(Main.brouillard);
        break;
      case 3:
        Main.difficulte = 2;
        Main.coordPositionJoueur[0] = 2;
        Main.coordPositionJoueur[1] = 1;
        Main.verifDifficulte();
        OperationSurTableaux.initialisationLabyrinthe(Main.difficulte, Main.labyrinthe);
        OperationSurTableaux.initialisationBrouillard(Main.brouillard);
        break;
      case 4:
        Main.difficulte = 3;
        Main.coordPositionJoueur[0] = 2;
        Main.coordPositionJoueur[1] = 1;
        Main.verifDifficulte();
        OperationSurTableaux.initialisationLabyrinthe(Main.difficulte, Main.labyrinthe);
        OperationSurTableaux.initialisationBrouillard(Main.brouillard);
        break;
      default:
        if (enJeu) {
          menuOptionsEnJeu();
        } else {
          choixMenuPrincipal();
        }

    }
    if (enJeu) {
      menuOptionsEnJeu();
    } else {
      choixMenuPrincipal();
    }

  }

  public static void choixMenuTouches(String[] interactions) {
    int choix;
    do {
      Affichage.afficherMenuTouches();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix < 1 || choix > 5);
    while (choix < 5) {
      switch (choix) {
        case 1:
          interactions[0] = Affichage.demanderActionJoueur();
          break;
        case 2:
          interactions[1] = Affichage.demanderActionJoueur();
          break;
        case 3:
          interactions[2] = Affichage.demanderActionJoueur();
          break;
        default:
          interactions[3] = Affichage.demanderActionJoueur();
      }

      Affichage.afficherMenuTouches();
      choix = Integer.parseInt(sc.nextLine());
    }

    if (enJeu) {
      menuOptionsEnJeu();
    } else {
      choixMenuOptions();
    }
  }

  public static void choixMenuAide() {
    int choix;
    do {
      Affichage.afficherMenuAide();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix < 1 || choix > 8);
    switch (choix) {
      case 1:
        Affichage.afficherInfosInteractions();
        break;
      case 2:
        Affichage.afficherInfosTouches();
        break;
      case 3:
        Affichage.afficherInfosPieces();
        break;
      case 4:
        Affichage.afficherInfosLabyrinthes();
        break;
      case 5:
        Affichage.afficherInfosDifficultes();
        break;
      case 6:
        Affichage.afficherInfosVictoire();
        break;
      case 7:
        Affichage.afficherInfosPseudo();
        break;
      default:
        if (enJeu) {
          menuOptionsEnJeu();
        } else {
          choixMenuOptions();
        }
    }

    choix = Integer.parseInt(sc.nextLine());
    retourChoix1(choix);
  }

  public static String[] affectationInteractions(String[] interactions) {
    if (interactions[0] == null) {
      interactions[0] = "z";
    }
    if (interactions[1] == null) {
      interactions[1] = "s";
    }
    if (interactions[2] == null) {
      interactions[2] = "d";
    }
    if (interactions[3] == null) {
      interactions[3] = "q";
    }
    if (interactions[4] == null) {
      interactions[4] = "o";
    }
    if (interactions[5] == null) {
      interactions[5] = "e";
    }
    return interactions;
  }

  public static void menuOptionsEnJeu() {
    int choix;
    do {
      Affichage.afficherOptionsEnJeu();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix < 1 || choix > 6);
    switch (choix) {
      case 1:
        Main.reprendre();
        break;
      case 2:
        enJeu = true;
        choixMenuTouches(Main.interactions);
        break;
      case 3:
        enJeu = true;
        choixMenuAide();
      case 4:
        enJeu = true;
        choixMenuDiffficulte();
      default:
        choixMenuPrincipal();
        break;
    }

  }

  public static void menuChangementPseudo() {
    int choix;
    do {
      Affichage.afficherMenuChangementPseudo();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix != 1 && choix != 2);

    if (choix == 1) {
      Affichage.demanderChangementPseudo();
      Main.pseudo = sc.nextLine();
      menuChangementPseudo();
    }

    choixMenuOptions();

  }

  public static void retourChoix1(int choix) {

    if (choix == 1) {
      GestionChoixUtilisateur.choixMenuAide();
      enJeu = false;
    }
  }

  public static void marche() {
    int choix;
    String[] objetsAlea = new String[6];
    int[] prixObjetsAlea = new int[3];

    OperationSurTableaux.itemAlea(objetsAlea, prixObjetsAlea);

    do {
      Affichage.afficherMarche();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix < 1 || choix > 3);
    switch (choix) {
      case 1:
        acheterItems(objetsAlea, prixObjetsAlea);
        break;
      case 2:
        jeuDuHasard();
        break;
      default:
        Main.reprendre();
        break;
    }

  }

  static int numEmplacementItem = 0;

  public static void acheterItems(String[] objetsAlea, int[] prixObjetsAlea) {
    int choix;
    String itemAlea1 = objetsAlea[0];
    String itemAlea2 = objetsAlea[1];
    String itemAlea3 = objetsAlea[2];
    String descriptionItemAlea1 = objetsAlea[3];
    String descriptionItemAlea2 = objetsAlea[4];
    String descriptionItemAlea3 = objetsAlea[5];
    int prixItem1 = prixObjetsAlea[0];
    int prixItem2 = prixObjetsAlea[1];
    int prixItem3 = prixObjetsAlea[2];
    do {
      if (Main.difficulte == 0) {
        Affichage.afficherChoixItemsTuto(itemAlea1, itemAlea2, itemAlea3);
        choix = Integer.parseInt(sc.nextLine());
      } else {
        Affichage.afficherChoixItems(itemAlea1, itemAlea2, itemAlea3);
        choix = Integer.parseInt(sc.nextLine());
      }

    } while (choix < 1 || choix > 4);
    switch (choix) {
      case 1:
        menuItemAlea(descriptionItemAlea1, prixItem1, itemAlea1, objetsAlea, prixObjetsAlea);
        break;
      case 2:
        menuItemAlea(descriptionItemAlea2, prixItem2, itemAlea2, objetsAlea, prixObjetsAlea);
        break;
      case 3:
        menuItemAlea(descriptionItemAlea3, prixItem3, itemAlea3, objetsAlea, prixObjetsAlea);
        break;
      default:
        marche();
        break;
    }
  }

  public static void menuItemAlea(String descriptionItem, int prixItem, String itemAlea, String[] objetsAlea,
      int[] prixObjetsAlea) {
    int choix;
    do {
      Affichage.afficherAchatItems(descriptionItem, prixItem, itemAlea);
      choix = Integer.parseInt(sc.nextLine());
    } while (choix < 1 || choix > 2);
    switch (choix) {
      case 1:
        if (Main.nbPièces < prixItem) {
          menuManqueArgent(prixItem);
          acheterItems(objetsAlea, prixObjetsAlea);
        } else if (Main.difficulte == 0 && Main.quantiteItemsDispoTuto[OperationSurTableaux
            .trouverElement(Main.itemsAchetablesTuto, itemAlea)] == 0) {
          menuManqueItem();
        } else if (Main.difficulte > 0
            && Main.quantiteItemsDispo[OperationSurTableaux.trouverElement(Main.itemsAchetables, itemAlea)] == 0) {
          menuManqueItem();
        } else {
          if (!itemAlea.equals("3 coeurs")) {
            Main.itemsPossédés[numEmplacementItem] = itemAlea;
            numEmplacementItem += 1;
          }
          if (Main.difficulte == 0) {
            Main.quantiteItemsDispoTuto[OperationSurTableaux.trouverElement(Main.itemsAchetablesTuto, itemAlea)] -= 1;
          } else {
            Main.quantiteItemsDispo[OperationSurTableaux.trouverElement(Main.itemsAchetables, itemAlea)] -= 1;
          }
          Main.nbPièces -= prixItem;
          Main.actionItem(itemAlea);
          acheterItems(objetsAlea, prixObjetsAlea);
        }
        break;
      default:
        acheterItems(objetsAlea, prixObjetsAlea);
        break;
    }
  }

  public static void jeuDuHasard() {
    int choix;
    do {
      Affichage.afficherJeuDuHasard();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix < 1 || choix > 2);
    switch (choix) {
      case 1:
        if (Main.nbPièces < 5) {
          menuManqueArgent(5);
        } else {
          Main.nbPièces -= 5;
        }
        break;
      default:
        marche();
        break;
    }

  }

  public static void menuManqueArgent(int prixItem) {
    int choix;
    do {
      Affichage.afficherManqueArgent(prixItem);
      choix = Integer.parseInt(sc.nextLine());
    } while (choix != 1);
    if (choix == 1) {
      marche();
    }
  }

  public static void menuManqueItem() {
    int choix;
    do {
      Affichage.afficherItemPlusEnStock();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix != 1);
    if (choix == 1) {
      marche();
    }
  }

  public static void finLabyrinthe() {

    int choix;
    if (Main.difficulte == 0) {
      int NbItemMinimum = 2;
      for (int i = 0; i < Main.itemsAchetablesTuto.length; i++) {
        if (Main.itemsAchetablesTuto[i].equals("3 coeurs")) {
          NbItemMinimum -= 0;
        } else if (OperationSurTableaux.trouverElement(Main.itemsPossédés, Main.itemsAchetablesTuto[i]) != -1) {
          NbItemMinimum -= 1;
        }
      }
      if (NbItemMinimum > 0 || Main.nbVie < 1) {
        do {
          Affichage.afficherManqueItem();
          choix = Integer.parseInt(sc.nextLine());
        } while (choix != 1);
        if (choix == 1) {
          Main.reprendre();
        }
      } else {
        do {
          Affichage.afficherFinLabyrintheTuto();
          choix = Integer.parseInt(sc.nextLine());
        } while (choix != 1);
        if (choix == 1) {
          Main.difficulte = 1;
          Main.initialisation();
        }
      }
    } else if (Main.difficulte == 1) {
      do {
        Affichage.afficherFinLabyrintheFacile();
        choix = Integer.parseInt(sc.nextLine());
      } while (choix != 1);
      if (choix == 1) {
        Main.nbPièces += 20;
        Main.difficulte = 2;
        Main.initialisation();
      }
    } else if (Main.difficulte == 2) {
      do {
        Affichage.afficherFinLabyrintheMoyen();
        choix = Integer.parseInt(sc.nextLine());
      } while (choix != 1);
      if (choix == 1) {
        Main.nbPièces += 30;
        Main.difficulte = 3;
        Main.initialisation();
      }
    } else if (Main.difficulte == 3) {
      do {
        Affichage.afficherFinLabyrintheDifficile();
        choix = Integer.parseInt(sc.nextLine());
      } while (choix < 1 || choix > 2);
      if (choix == 1) {
        System.exit(0);
      } else if (choix == 2) {
        Main.nbPièces += 50;
        Main.difficulte = 1;
        Main.initialisation();
      }
    }
  }

  public static void menuEnnemi(int numTour) {
    int choix;

    boolean victoire;
    do {
      Affichage.afficherEnnemi();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix != 1);
    if (Main.difficulte == 0) {
      if (choix == 1) {
        while (numTour < 3) {
          victoire = true;
          numTour += 1;
          menuVictoire(numTour);
          Affichage.afficherEnnemi();
        }
      }
    }

    else {
      if (choix == 1) {
        while (numTour < 3) {
          victoire = OperationSurTableaux.combat(Main.probaVictoire);
          if (!victoire) {
            menuDefaite();
          } else {
            numTour += 1;
            menuVictoire(numTour);
            Affichage.afficherEnnemi();
          }
        }
      }
    }
  }

  public static void menuDefaite() {
    int choix;
    do {
      Affichage.afficherDefaite();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix != 1);
    if (choix == 1) {
      Main.nbVie -= (1 / Main.resistance);
      Main.coordPositionJoueur[0] = 2;
      Main.coordPositionJoueur[1] = 1;
      Main.reprendre();
    }
  }

  public static void menuVictoire(int numTour) {
    int choix;
    do {
      Affichage.afficherVictoire();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix != 1);
    if (choix == 1) {
      if (numTour < 3) {
        menuEnnemi(2);
      } else {
        Main.labyrinthe[Main.coordPositionJoueur[1]][Main.coordPositionJoueur[0]] = ' ';
        Main.nbPièces += 10;
        Main.reprendre();
      }

    }
  }

  public static void plusDeVie() {
    int choix;
    do {
      Affichage.afficherPlusDeVie();
      choix = Integer.parseInt(sc.nextLine());
    } while (choix != 1);
    if (choix == 1) {
      choixMenuPrincipal();
    }
  }
}
