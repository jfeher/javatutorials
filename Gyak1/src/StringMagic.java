import java.util.Scanner;

public class StringMagic {

	//Nezd vegig az elore leirt beepitett string fuggvenyeket, ha gondold probalgasd ki, hogy atirsz bennuk ertekeket, 
	//es utana old meg a feladatot.
	//A String tipusnak rengeteg beepitett fuggvenye van itt csak nehanyat mutatok meg, ami eleg rengeteg problema megoldasara.
	
	//Feladat:
	//Fejezd be a fuggvenyt ami beolvas egy mondatot es utana kiirja ugy, hogy az elso szo csupa nagybetuvel legyen.
	//
	//Elso lepesben eleg ha csak siman az elso szot irja ki csupa nagybetuvel, 
	//masodik lepesben pedig irja ki a teljes mondatot ugy, hogy csak az elso szot konvertalta csupa nagybetuve. 
	//(az nem baj ha alapbol is voltak extra nagybetuk a mondatban, azok maradhatnak)
	static void firstWordToUpperCase() {
		//Egy sor beolvasasa
		Scanner sc = new Scanner(System.in);
		String sentence=sc.nextLine();
		sc.close();
		//Megoldas
		System.out.println("Meg nem oldottad meg a feladatot");
		
		
	}
	
	//Eddig tart a feladat ez alatt csak a bevezeto van, ide nem kell irnod csak ha probalgatnad az itt leirt string fuggvenyeket
	//A feladathoz tartozo fuggveny mar meg van hivva a main fuggveny vegen, tehat futtataskor fog varni inputot
		
	public static void main(String[] args) {
		String palindrom="Geza kek az eg";
		
		System.out.println(palindrom);
		
		//string hossza
		System.out.println("length: " + palindrom.length());
		
		//a 0. indexen levo karakter, ez nem stringgel hanem char tipussal ter vissza!
		System.out.println("charAt(0): " + palindrom.charAt(0));
		
		//a 6. indexen levo karakter, ez nem stringgel hanem char tipussal ter vissza!
		System.out.println("charAt(6): " + palindrom.charAt(6));
		
		//az 5. indextol kezdodo resz string
		System.out.println("substring(5): " + palindrom.substring(5));
		
		//a 0. indextol kezdodo es 4. elott vegzodo resz string (tehat a 3. index az utolso)
		System.out.println("substring(0,4): " + palindrom.substring(0,4));
		
		//a string csupa nagybetuvel
		System.out.println("toUpperCase: " + palindrom.toUpperCase());
		
		//a string csupa kisbetuvel
		System.out.println("toLowerCase: " + palindrom.toLowerCase());
		
		//A string feldarabolasa a szokozok menten es 0.,1.,2.,3. indexu elemenek kiirasa.
		//A split fuggveny egy tombbel fog visszaterni, amiben stringek vannak.
		//Azert van \ a stringen belul a macskakormok elott mert ezzel jelzem, hogy ez egy karakter lesz a stringben,
		//nem pedig a string lezarasa.
		//A legtobb specialis karakter elott kell \ ilyenkor, ezt hivjak ugy, hogy a character escape-elese.
		System.out.println("split(\" \")[0]: " + palindrom.split(" ")[0]);
		System.out.println("split(\" \")[1]: " + palindrom.split(" ")[1]);
		System.out.println("split(\" \")[2]: " + palindrom.split(" ")[2]);
		System.out.println("split(\" \")[3]: " + palindrom.split(" ")[3]);
		
		firstWordToUpperCase();
		
	}

}
