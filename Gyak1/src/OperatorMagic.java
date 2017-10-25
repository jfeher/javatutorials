
public class OperatorMagic {

	public static void main(String[] args) {
		//Alapveto aritmetikai operatorok
		// + - * /
		// modulus %
		System.out.println("15 mod 10 = " + 15 % 10);
		System.out.println("------------------------------------------------------------------");
		
		// 1-el noveles ++. lehet a valtozo elott es mogott is
		// ++x eloszor noveli a valtozot es csak utana hasznalja a megnovelt erteket
		// x++ eloszor hasznalja a valtozot es csak utana noveli az erteket
		int x = 10;
		System.out.println("x++: " + x++);
		System.out.println("x jelenlegi erteke: " + x);
		System.out.println("++x: " + ++x);
		System.out.println("------------------------------------------------------------------");
		
		// 1-el csokkentes ugyanaz a logika alapjan --
		int y = 10;
		System.out.println("y--: " + y--);
		System.out.println("y jelenlegi erteke: " + y);
		System.out.println("--y: " + --y);
		System.out.println("------------------------------------------------------------------");
		
		//Valtozo helyben ertekadasa
		// +=; -=; *=; /=
		int h = 1;
		System.out.println("h+=5: " + (h+=5));
		System.out.println("h-=5: " + (h-=5));
		System.out.println("h*=5: " + (h*=5));
		System.out.println("h/=5: " + (h/=5));
		
		//Logikai operatorok
		//true-val vagy false-al ternek vissza
		//Foleg if-ek es while-ok felteteleiben vannak hasznalva
		//A feltetelek es (&&) es vagy (||) operatorokkal osszekothetoek 
		//egyenlo ==
		//nem egyenlo !=
		//relaciok <=; >=; <; >
		
		int a=10;
		int b=10;
		int c=11;
		//Itt azert kell zarojelbe tenni az a==b-t, hogy ez elobb legyen kiertekelve, mint a + ami ebben az esetben az osszefuzest jelenti
		System.out.println("a==b: " + (a == b));
		System.out.println("a==c: " + (a == c));
		System.out.println("a!=b: " + (a != b));
		System.out.println("a!=c: " + (a != c));
		System.out.println("------------------------------------------------------------------");
		
		//boolean tipusban lehet a true es false erteket eltarolni, ezzel ternek vissza
		//booleanokra && es || vagy es ! not van definialva
		//igazsag tablak az operatorokra: 0 (false) 1 (true) bemenetek eseten mi a kimenet
		//
		// && - AND igazsag tablaja, akkor igaz ha mindket bemenet igaz 
		//
		// && | 0 | 1 |
		// ------------
		//  0 | 0 | 0 |
		// ------------
		//  1 | 0 | 1 |
		//
		// || - OR igazsag tablaja, akkor igaz ha legalabb az egyik bemenet igaz
		//
		// || | 0 | 1 |
		// ------------
		//  0 | 0 | 1 |
		// ------------
		//  1 | 1 | 1 |
		
		boolean t=true;
		boolean f=false;
		
		System.out.println("t && f: " + (t && f));
		System.out.println("t && t: " + (t && t));
		System.out.println("f && f: " + (f && f));
		System.out.println("t || f: " + (t || f));
		System.out.println("t || t: " + (t || t));
		System.out.println("f || f: " + (f || f));
		System.out.println("!t: " + !t);
		System.out.println("!f: " + !f);
		
		//Feladat
		//De morgan azonossagok (venn diagrammal a bizonyitasuk https://en.wikipedia.org/wiki/De_Morgan%27s_laws#/media/File:Demorganlaws.svg)
		//!(b1 || b2) == !b1 && !b2
		//!(b1 && b2) == !b1 || !b2
		//Irj egy kodot ami tetszoleges b1 es b2 boolean bemenetre ellenorzi mindket de morgan azonossagot, hogy igaz-e.
		
	}

}
