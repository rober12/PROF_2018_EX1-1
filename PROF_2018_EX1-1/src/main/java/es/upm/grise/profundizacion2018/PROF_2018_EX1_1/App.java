package es.upm.grise.profundizacion2018.PROF_2018_EX1_1;



import es.upm.grise.profundizacion2018.PROF_2018_EX1_1.App;

/**
 * Hello world!
 *
 */
public class App 
{
	String a = "Hola";
	String b = "Hola";
	String t = "Hola Hola";
//	public static void main( String[] args )
//	{
//		System.out.println( "Hello World!" );
//	}

	public int MyString(String a, String b){
		int result = compareTo(a,b);
		return result;
	}

	private static int compareTo(String a2, String b2) {
		//Nodo1
		if (a2 == b2){
			return 0;
		}else {
			//Nodo 2
			return -1;
		}
	}
	

}
