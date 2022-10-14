package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		
		byte b = 12;
		short s = -15325;
		int i = 1250326;
		long l = 10000L;
		float f = 1.8F;
		double d = 1.8; // 1.8D
		char ch = 'a';
		String st = "Bonjour";
		boolean boo = true; // false
		
		//System.out.println(i);
		//System.out.println(l);
		
		String randomString = "Voici le résultat d'un calcul:"+'\n'+"1+5=6";
		//System.out.println(randomString);
		
		/* Quelles lignes ci-dessous sont correctes ? */
		int a = +2;
		//byte c = 128;
		long d1 = 10;
		long d2 = 10L;
		long d3 = 10l;
		long d4 = 100_000_000;
		//float e = 3,14;
		double ff = 3.14;
		float g = 2.1E-3F;
		double j = 127f;
		char k = 'A';
		char kk = '\u0043';
		
		//System.out.println(d1+","+d2+","+d3+","+d4);
		
		/* Quelles sont les lignes qui compilent ? */
		int $ = 0;
		float _0 = 1f;
		double $_$ = 2d;
		int v0 = 125;
		//int 0b = 2;
		//System.out.println(v0);
				
	}
	
}
