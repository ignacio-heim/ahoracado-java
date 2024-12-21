package ahorcado;

public class Eleccionpalabra {
	
	public int numeroAzaz() {
		int index = (int) (Math.random()*102);
		
		return index;
	}	
	
	public String[] words() {
		
		String[] palabras = {"banana","moneda","minuto","sombra","amargo","barrio","motivo","animal","madera","frijol","jazmin","rapido","amargo",
				"humano","morder","herido","manada","marmol","mascar","manjar","rayado","tabaco","tamaño","tambor","teatro","tanque",
				"tenaza","tierno","tirano","timido","textil","salida","salado","sabado","saliva","sabana","saludo","salmon","sacado",
				"bajada","balada","batido","bebida","belico","labial","ladera","ladron","lamina","lanzar","lavado","nacion","nacido","galope",
				"gancho","pactar","padron","activa","azucar","acabar","eficaz","emerge","empleo","encima","faceta","fabril",
				"factor","famoso","vaciar","vacuna","vaiven","valido","cabala","cabeza","rabino","raices","radial","rastro","resaca",
				"rebote","roedor","rodaje","rodado","regalo","remate","rigido","romano","bailar","basura","balcon","bufalo","barato","bonito",
				"bodega","palido","paloma","pileta","paleta","parque","peluca","petalo"};
		
		return palabras;
	}
	
	public String palabraAzar(int num) {					
		Eleccionpalabra elec = new Eleccionpalabra();		
		
		String[] palabras = elec.words();
		
		return palabras[num];
	}
	
	public int longitud() {
		Eleccionpalabra elec = new Eleccionpalabra();
		
		String[] palabras = elec.words();
		
		return palabras.length;
	}
	/*
	public int index(int num) {
		
		return num;
	}
	*/
	
	public static void main(String[] args) {
		//Eleccionpalabra ele = new Eleccionpalabra();
		
		
		//int num = ele.numeroAzaz();
		
		//System.out.println(num);
		
		//String[] palabrasAhor = ele.words();
		
		//System.out.println(palabrasAhor[10]);
				
		//String palabra = ele.palabraAzar();
		//int num = eleW.index();
		
		
		//System.out.println(palabra);
		
		//System.out.println(num);
		
		
	}
	
	
}
