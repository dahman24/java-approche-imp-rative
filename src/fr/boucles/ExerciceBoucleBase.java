package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		 
		/* Affichez tous les nombres de 1 à 10 */
		System.out.println("Affichez tous les nombres de 1 à 10");
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("");
		/* Affichez 20 fois votre nom et votre prénom */
		System.out.println("Affichez 20 fois votre nom et votre prénom");
		System.out.println("Solution 1:");
		String [][] chaines = new String[20][2];
		for (int i=0; i<20; i++) {
			chaines[i][0] = "Haned";
			chaines[i][1] = "Abderrahmane";
			System.out.println(i+1 +": " +chaines[i][0] +" " +chaines[i][1]);
		}
		System.out.println("");
		/* Affichez 20 fois votre nom et votre prénom */
		System.out.println("Affichez 20 fois votre nom et votre prénom");
		System.out.println("Solution 2:");
		String nom = "Haned";
		String prenom = "Abderrahmane";
		for (int i=1; i<=20; i++) {
			System.out.println(i +": " +nom +" " +prenom);
		}
		
		System.out.println("");
		/* Affichez les éléments pairs de 2 à 100 */
		System.out.println("Affichez les éléments pairs de 2 à 100");
		for (int i=2; i<=50; i++) {
			 System.out.println(i*2);
		}
		
		System.out.println("");
		/* Affichez les éléments impairs de 1 à 99 */
		System.out.println("Affichez les éléments impairs de 1 à 99");
		for (int i=2; i<=50; i++) {
			 System.out.println((i*2)-1);
		}
	}

}
