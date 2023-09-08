
/*
 * El codigo funciona mayormente con ifs, ademas de que se agregaron scanner para que
 * el usuario ingrese piedra, papel o tijera, ademas de que se agrego un int
 * resultado que es equivalente a 0
 * 
 * */
import java.util.Scanner;

public class revision4 {
	
	public static void main(String[] args) { //se agrego el public
        Scanner scanner = new Scanner(System.in); //se cambio el nombre de scanner y se agreggo el system.in

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String player1 = scanner.nextLine();// se ajustaron los nombres 

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        Scanner scannerPlayer2 = new Scanner(System.in); // se ajustaron los nombres, se agrego otro scanner
        String player2 = scannerPlayer2.nextLine();

        int resultado = 0; //se agrega el valor del resuñtado

        switch (player1) { //modifique todo el swirch
            case "piedra":
                if (player2.equals("tijeras")) {
                    resultado =1;
                }
                break;

            case "papel":
                if (player2.equals("piedra")) {
                    resultado =1;
                }
                break;

            case "tijeras":
                if (player2.equals("papel")) {
                    resultado =1;
                }
                break;
            default:
        }
 
        if (resultado == 1) {
            System.out.println("Haz ganado");
        } else if (resultado == 2) {
            System.out.println("Empate");
        } else {
            System.out.println("Gana el jugador 2");
        }
    }
}

	  


