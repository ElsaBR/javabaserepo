package wetic.javabase.gui;

// Les Enums

public class ExempleCours {
	public enum Semaine {
		Dimanche,
		Lundi,
		Mardi,
		Mercredi,
		Jeudi,
		Vendredi,
		Samdi,
	}
	
	public class Semaine1 {
		public static final int DIMANCHE = 0;
		public static final int LUNDI = 1;
		public static final int MARDI = 2;
		public static final int MERCREDI = 3;
		public static final int JEUDI = 4;
		public static final int VENDREDI = 5;
		public static final int SAMEDI = 6;		
	}
	
	public static void main(String[] args) {
		Semaine j = Semaine.Lundi;
	}
}
