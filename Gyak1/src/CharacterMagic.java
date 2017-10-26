import java.util.Scanner;

public class CharacterMagic {

	public static void main(String[] args) {
		// Ahogy int es Integer eseteben ugy karaktereknel is van primitiv tipus es hozza tartozo (wrapper) osztaly
		// a primitiv tipus chat. Az osztaly neve pedig Character
		// Amig a stringeket "" kozott lehet letrehozni, addig a karaktereket '' kozott.
		
		char x='c';
		
		//unicode-al is definialhato
		char x1='\u0063';
		
		System.out.println("karakter: " + x);
		System.out.println("unicode-al definialt karakter: " + x1);

		//Character osztaly
		Character x2 = new Character('c');
		//vagy kozvetlenul char tipusbol is letrehozhato (errol tobb kesobb az autoboxingnal)
		Character x3 = 'c';
		
		System.out.println("Character osztaly: " + x2);
		System.out.println("Character osztaly char tipusbol: " + x3);
		
		// A \ (escape) egy special karakter, a fordito maskepp fogja ertelmezni azt ami ezutan kovetkezik. 
		// Peldaul ezzel lehet a kovetkezo specialis karaktereket letrehozni:
		// \n uj sor
		// \t tab
		// \" idezojelet ezzel lehet szovegbe irni
		// \' mint a "-nel csak '-re
		// \\ backslash szovegbe irasa
		
		System.out.println("Itt egy idezojel \" .");
		System.out.println("\t Ez a sor beljebb kezdodik.");
		System.out.print("Ennek a sornak nincs \\n a vegen.");
		System.out.print("Ezert ez is ugyanabban a sorban folytatodik");
		System.out.print("\nDe ez mar uj sorban van.");
		System.out.println();
		
		// A Character osztallyal sok beepitett fuggvenyt is kapunk, nehany pelda:
		
		System.out.println("Betu-e x2: " + Character.isLetter(x2));
		System.out.println("Szam-e x2: " + Character.isDigit(x2));
		System.out.println("Kisbetu-e x2: " + Character.isLowerCase(x2));
		System.out.println("Nagybetu-e x2: " + Character.isUpperCase(x2));
		System.out.println("Szam-e '5': " + Character.isDigit('5'));
		
		// A cast-olas azaz egyik tipusbol a masikba alakitas gyakori problema
		// Minden objektumnak letezik toString fuggvenye (nem feltetlenul azzal a logikaval alakit a bonyolultabb objektumoknal amit varnal, de itt jol mukodik)
		String charToString= x2.toString();
		System.out.println("charToString: " + charToString);
		
		// Forditva mar bonyolultabb a helyzet, mert egy string tobb karakterbol is allhat. De peldaul vehetjuk egyesevel az elemeit a charAt fuggvennyel,
		// ami char-al ter vissza.
		String s1 = "c";
		char stringToChar = s1.charAt(0);
		System.out.println("stringToChar: " + stringToChar);

		// Bizonyos tipusokra javaban ertelmezett a castolas. Azaz amikor zarojelben a valtozo ele irjuk a tipust, es ezaltal atkonvertaljuk arra a tipusra
		// Peldaul mukodik int-rol char-ra
		int a = 1;
		char c = (char) a;
		
		//De forditva is
		
		char c1 = '5';
		int a1 = (int) c1;
		
		// Feladat:
		// Irj egy fuggvenyt, ami vegigmegy egy stringen betunkent. Ha karaktert lat akkor, kisbetubol nagybetuve alakitja, es nagybol kicsive.
		// Ha pedig egy szamjegyet lat, akkor 1-el noveli az adott szamot. 9 eseten ne 10 hanem 0 legyen. (Elozo leckebol % segithet ;) )
		// Vegul visszater a modositott stringel
		
		
	}

}
