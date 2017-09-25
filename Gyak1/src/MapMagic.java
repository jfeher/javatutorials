import java.util.HashMap;

public class MapMagic {
	public static void main(String[] args) {
		//Egy HashMap-ben kulcs ertek parokat lehet tarolni
		//A legegyszerubb ha elore meghatarozzuk mi legyen a kulcs es a tarolando ertek tipusa
		//Ebben az esetben peldaul a kulcs egy String lesz, a csoki neve, a mellette tarolando ertek pedig Integer a raktarkeszlet
		//Az Integer abban kulonbozik az int tipustol, hogy az Integer egy objektum es vannak ra elore definialt fuggvenyek,
		//azonban szerencsere automatikusan atkonvertalja a HashMap put fuggvenye objektumma ha siman int-kent adjuk meg az erteket. 
		//Rogton objektumkent 120 helyett pl new Integer(120)-at kene irni.
		//A put fuggvennyel lehet uj kulcs ertek part betenni
		//A get fuggvennyel lehet egy kulcs alapjan megkapni a tarolt erteket
		HashMap<String,Integer> raktarkeszlet = new HashMap<String,Integer>();

		raktarkeszlet.put("Mars", 120);
		raktarkeszlet.put("Bounty", 500);
		raktarkeszlet.put("Twix", 243);
		System.out.println("Twix raktarkeszlet: " + raktarkeszlet.get("Twix"));

		//Mar letezo kulcs eseten a put fuggveny felulirja a korabba nbeirt erteket, nem fog 2x bekerulni ugyanaz a kulcs kulonbozo ertekkel!
		raktarkeszlet.put("Twix", 250);
		System.out.println("Twix raktarkeszlet: " + raktarkeszlet.get("Twix"));
		//Ez nem mukodik!!!!
		//raktarkeszlet.get("Twix")=25
		//puttal lehet csak felulirni az erteket
		
		//Barmilyen tipust tarolhatunk HasMap-ben akar altalunk irt osztalyokat is
		//A berakando objektumot letrehozhatjuk elore is, vagy akar a put fuggvenyen belul
		HashMap<String,Doge> kutyak = new HashMap<String,Doge>();
		Doge kutya1=new Doge(3, 2, "Margarita");
		kutyak.put("Cunci", new Doge(1, 4, "Cunci"));
		kutyak.put(kutya1.kutyanev, kutya1);
		kutyak.put("Roti", new Doge(2, 3, "Roti"));
		
		//Ez viszont mukodik
		//Azert mert itt nem kozvetlenul a kulcs-ertek par erteket irjuk felul, hanem az erteknek egy valtozojat
		System.out.println("Cunci ehseg: " + kutyak.get("Cunci").ehseg);
		kutyak.get("Cunci").ehseg=2;
		System.out.println("Cunci ehseg: " + kutyak.get("Cunci").ehseg);
		
		//Tehat a kozvetlen ertek atirasa tovabbra sem mukodne, az csak puttal megy.
		//kutyak.get("Cunci")=new Doge(2,2,"Cunci");
		kutyak.put("Cunci", new Doge(3, 4, "Cunci"));
		System.out.println("Cunci ehseg: " + kutyak.get("Cunci").ehseg);
		
		//De azert egy fokkal szebb igy csinalni
		kutyak.get("Cunci").eszik();
		System.out.println("Cunci ehseg: " + kutyak.get("Cunci").ehseg);
	}
	
	public static class Doge {
		int ehseg;
		int almossag;
		String kutyanev;

		// konstruktor
		public Doge(int v1, int v2, String v3) {
			ehseg = v1;
			almossag = v2;
			kutyanev = v3;
		}
		
		public void eszik() {
			ehseg--;
		}

	}

}
