
public class contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicio = 1;
		contador(inicio);
	}
	
	
	// funcion que genera los numeros del 1 al 1000
	public static int contador(int num) {
		int max=1000;
		if (num == max) {
			tipoNumero(num);
			return num;
		}
		else {
			tipoNumero(num);
			return contador(num+1);			
		}

	}
	
	// Funcion que identifica el tipo de numero
	public static void tipoNumero(int num) {
		if (num%2== 0)
			System.out.println(num + " es par");
		else {
			if (num%5 == 0)
				System.out.println(num + " numero ordinal");
			else {
				if (primo(num) == true)
					System.out.println(num + " es primo");
				else 
					System.out.println(num);
			}
		}
	}
	
	
	// funcion que indica si un numero es primo 
	public static boolean primo(int num) {
		if (num == 0 || num == 1 || num == 4) {
			return false;
		}
		for (int j=2; j < num/2; j++) {
			if (num%j == 0)
				return false;
		}
		return true;
	}

}
