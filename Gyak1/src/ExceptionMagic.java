
public class ExceptionMagic {

	public static void main(String[] args) {
		//A programom belul egy exception az, amikor egy nemvart esemeny kovetkezik be
		//Ez lehet peldaul egy nemletezo file beolvasasa, egy nullaval osztas vagy egy tomb tulindexelese.
		//Ahelyett, hogy hagynank, hogy a program elszalljon kezelhetjuk ezeket az exceptionoket es visszajelezhetunk a felhasznalonak
		//aki ezek utan megfeleloen kijavithatja a bemenetet. Amennyiben pedig nem allitjuk le a programot vegig fog futni a 
		//maradek kod is hacsak nem akadunk uj kezeletlen exceptionbe
		
		// Az Exceptionok is objektumkent jelennek meg a programban.
		// Amikor a program a hibas pontra er, akkor "dob" egy Exception-t es amennyiben ezt semmi sem kapja el
		// a kod futasa leall es kiirja a leallas okat.
		// A kovetkezo sorokat kikommentelve a program kiirja az Exceptionok pontos osztalyat.
		
		// int a=50/0;
		
		//String s=null;  
		//System.out.println(s.length());
		
		//String s="abc";  
		//int i=Integer.parseInt(s);
		
		//int array1[]=new int[5];  
		//array1[10]=50;
		
		// Ahhoz, hogy elkaphassunk egy exception-t a kodreszletet ami potencialisan el fogja dobni egy try catch blockba kell tenni.
		// A try blockba kerul az ami a dobja, a catchben pedig definialjuk, hogy milyen fajta Exception-t kapunk el, es azzal mit akarunk
		// csinalni (Exception Handling)
		
		try {
			int b=30/0;
		} 
		catch (Exception e) {
			System.out.println("Catch blockban elkaptuk az exceptiont. Az uzenete: " + e.getMessage());
		}
		
		// Minden exception az Exception osztalybol szarmazik. Lehet ennel specifikusabb, mint a fenti peldaban lattuk, de 
		// a sima Exception osztaly mindent megfog. Az egyik legtipikusabb amit ilyenkor szokas kiirni az exception uzenetet,
		// ezzel segitjuk a fejlesztot/felhasznalot ertelmezni, hogy mitol szallt el a kod.
		
		// Mivel ez egy ArithmeticException volt ezert csak vele vagy a szulojevel (Exception-el) lehet elkapni. 
		// Mast hasznalva pl NullpointerException-t nem lehet lekapni ezt a fejta exception-t. Kommenteld ki es nezd meg, hogy fut le.
		
		//try {
		//	int c=30/0;
		//} 
		//catch (NullPointerException e) {
		//	System.out.println("Catch blockban elkaptuk az exceptiont. Az uzenete: " + e.getMessage());
		//}
		
		// Tobbfele catch-et is irhatunk egy try utan, ha a kulonbozo exceptionoket kulonbozokeppen szeretnenk kezelni
		// Probald ki, hogy atirva a try blockot kulonbozo exceptionoket generalva mi lesz a kimenet
		
		try {
			//int d = 30/0;
			int e = 10/5;
			int[] array = new int[10];
			array[10] = e;
			//array[0] = e;
			
		} 
		catch (ArithmeticException e) {
			System.out.println("Szamolasi hiba: " + e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Tomb tulcimzese: " + e.getMessage());
		}
		
		//Feladat: Irj egy programot, ami beker a felhasznalotol egy stringet (mindegy, hogy egy szo vagy mondat) es egy szamot,
		//es ird ki a charAt() fuggvennyel a kapott szamu indexen levo karaktert. Tedd az egeszet try catch bolckba arra az esetre ha
		//tul nagy lenne az index. (StringIndexOutOfBoundsException) Es egy megfelelo uzenetet irj ki a felhasznalonak.

	}

}
