package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		/* Déclarez un tableau d’entiers contenant tous les 
		 * entiers de 1 à 10 */
		int[] entiers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		/* Affichez le premier élément du tableau */
		System.out.println("Le premier élément du tableau est: " 
		                    +entiers[0]);
		
		/* Affichez la longueur du tableau en utilisant la 
		 * propriété length */
		System.out.println("La longueur du tableau est: " 
						   +entiers.length);
		
		/* Affichez le dernier élément du tableau en utilisant 
		 * la propriété length */
		System.out.println("Le dernier élément du tableau est: " 
                +entiers[entiers.length-1]);
		
		/* Modifiez la valeur de l’élément d’index 4 et donnez 
		 * lui la valeur 80 */
		entiers[4] = 80;
		System.out.println("La nouvelle valeur de l’élément "
				+ "d’index 4 est: " +entiers[4]);
		
	}

}
