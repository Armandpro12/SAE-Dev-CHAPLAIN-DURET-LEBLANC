
public class TestCombat {
	public static boolean combat(int probaVictoire) {
		int victoire = (int) (1 + Math.random() * 98);
		if (victoire < probaVictoire) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean ratio() {
		double ratioDefaite = 0;
		int nbVictoire = 0;
		int nbDefaite = 0;
		int i = 0;
		while (i < 10000) {
			if (combat(50)) {
				nbVictoire++;
			} else {
				nbDefaite++;
			}
			i++;
		}

		ratioDefaite = nbDefaite + nbVictoire;
		ratioDefaite = nbDefaite / ratioDefaite;
		System.out.println("défaites : " + nbDefaite + "\nvictoires : " + nbVictoire);
		System.out.println(ratioDefaite);
		if (ratioDefaite > 0.49 && ratioDefaite < 0.51) {
			return true;
		} else {
			return false;
		}
	}
}
