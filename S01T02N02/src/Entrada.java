import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public Entrada() {
		
	}
	
	public static Byte llegirByte(String missatge) {
		byte byteEntrada = 0;
		boolean isCorrect = false;
		
		while(!isCorrect) {
			System.out.println(missatge);
			try {
				byteEntrada = scanner.nextByte();
				System.out.println("Correcte!");
				isCorrect = true;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Valor introduït incorrecte.");
				scanner.next();
			}
		}
		
		return byteEntrada;
		
	}
	
	public static int llegirInt(String missatge) {
		int intEntrada = 0;
		boolean isCorrect = false;
		
		while(!isCorrect) {
			System.out.println(missatge);
			try {
				intEntrada = scanner.nextInt();
				System.out.println("Correcte!");
				isCorrect = true;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Valor introduït incorrecte.");
				scanner.next();
			}
		}
		
		return intEntrada;
		
	}
	
	public static float llegirFloat(String missatge) {
		float fEntrada = 0;
		boolean isCorrect = false;
		
		while(!isCorrect) {
			System.out.println(missatge);
			try {
				fEntrada = scanner.nextFloat();
				System.out.println("Correcte!");
				isCorrect = true;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Valor introduït incorrecte.");
				scanner.next();
			}
		}
		
		return fEntrada;
		
	}
	
	public static double llegirDouble(String missatge) {
		double dEntrada = 0.0D;
		boolean isCorrect = false;
		
		while(!isCorrect) {
			System.out.println(missatge);
			try {
				dEntrada = scanner.nextDouble();
				System.out.println("Correcte!");
				isCorrect = true;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Valor introduït incorrecte.");
				scanner.next();
			}
		}
		
		return dEntrada;
		
	}
	
	public static char llegirChar(String missatge) {
		char charEntrada = 0;
		boolean isCorrect = false;
		
		while(!isCorrect) {
			System.out.println(missatge);
			try {
				charEntrada = scanner.next().charAt(0);
				System.out.println("Correcte!");
				isCorrect = true;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Valor introduït incorrecte.");
				scanner.next();
			}
		}
		
		return charEntrada;
		
	}
	
	public static String llegirString(String missatge) {
		String strEntrada = "";
		boolean isCorrect = false;
		
		while(!isCorrect) {
			System.out.println(missatge);
			try {
				strEntrada = scanner.next();
				System.out.println("Correcte!");
				isCorrect = true;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Valor introduït incorrecte.");
				scanner.next();
			}
		}
		
		return strEntrada;
		
	}
	
	public static boolean llegirSiNo(String missatge) {
		char charEntrada = 0;
		boolean isCorrect = false;
		boolean falseTrue = false;
		
		while(!isCorrect) {
			System.out.println(missatge);
			try {
				charEntrada = scanner.next().toLowerCase().charAt(0);
				if(charEntrada == 's') {
					falseTrue = true;
					isCorrect = true;
					System.out.println("Correcte.!");
				}else if(charEntrada == 'n') {
					//System.out.println("no");
					System.out.println("Correcte!");
					isCorrect = true;
				}else {
					System.out.println("Valor introduït incorrecte.");
					//scanner.next();
				}
				
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Valor introduït incorrecte.");
				
			}
		}
		
		
		
		return falseTrue;
		
	}

}
