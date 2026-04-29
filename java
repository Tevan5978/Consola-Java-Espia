import java.util.Scanner;

public class CasoDetective { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("================================");
        System.out.println(" DESPACHO HOLMES & ASOCIADOS ");
        System.out.println(" Caso #1: HIDDEN ");
        System.out.println("================================");
        
        System.out.print("Cual es tu nombre? ");
        String nombre = teclado.nextLine();

        
        int edad = 0;
        boolean edadValida = false;
        
        while (!edadValida) {
            System.out.println("Cuantos años tienes:");
            edad = teclado.nextInt();
            
            if (edad <= 0) {
                System.out.println("Error: No es un número valido. Intentalo de nuevo.");
            } else {
                edadValida = true; 
                
                if (edad < 12) {
                    System.out.println("Eres muy joven para ser detective");
                } else if (edad >= 12 && edad <= 17) {
                    System.out.println("Puedes ser detective junior");
                } else if (edad >= 18 && edad <= 59) {
                    System.out.println("¡Bienvenido al equipo de detectives!");
                } else {
                    System.out.println("Detective senior con experiencia");
                }
            }
        }

        System.out.println("\nCuantas pistas iniciales tienes:");
        int pistas = teclado.nextInt();

        // Evaluación inicial de pistas.
        if (pistas > 5) {
            System.out.println("¡Eres un detective legendario!");
        } else if (pistas == 5) {
            System.out.println("Eres un detective EXPERTO!\nPuedes resolver el caso.");
        } else if (pistas >= 2 && pistas < 5) {
            System.out.println("Buen trabajo, detective.\nNecesitas unas pistas mas.");
        } else if (pistas == 1) {
            System.out.println("Vas por buen camino...\nSigue investigando!");
        } else {
            System.out.println("No tienes pistas o el valor es inválido.");
        }

        int opcion;
        boolean casoResuelto = false;
        

        // Aqui nos pedían hacer un Reto A: que consiste en poner un do-while en lugar de while. 
        do {
            System.out.println("\n--- MENÚ DEL DETECTIVE ---");
            System.out.println("1. Buscar pistas en la escena");
            System.out.println("2. Interrogar sospechosos");
            System.out.println("3. Resolver el caso");
            System.out.print("Elige una opción (1-3): ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1:
                    // En este Reto B: Nos pedían cambiar el for por un while en lugar de for para recorrer las pistas.
                    
                    System.out.println("\n BUSCANDO PISTAS...");
                    String[] evidencias = {
                        "Huella digital en la ventana", 
                        "Copa de vino con residuos", 
                        "Nota rasgada en el escritorio", 
                        "Cuchillo en la cocina"
                    };
                    
                    if (pistas >= evidencias.length) {
                        System.out.println(">> ¡Ya has encontrado todas las pistas disponibles en la escena!");
                    } else {
                        int i = 0; 
                        while (i < evidencias.length) { 
                            System.out.println(" Pista encontrada: " + evidencias[i]);
                            i++; 
                        }
                        pistas = evidencias.length; 
                        System.out.println(">> ¡Has recolectado todas las pistas de la escena!");
                    }
                    System.out.println("Total de pistas actuales: " + pistas);
                    break;
                    
                case 2:
                    // En este Reto C: En esta parte nos pedían poner el for en lugar de while para interrogar sospechosos.
                    
                    System.out.println("\n INTERROGATORIOS");
                    String[] sospechososArr = {"James Barnes", "Aurelio Vásquez", "Victoria Reyes", "Bruno Quiroga"};
                    
                    for (int s = 0; s < sospechososArr.length; s++) {
                        System.out.println(" Interrogando a: " + sospechososArr[s]);
                        System.out.println(" Dice que es inocente...");
                    }
                    System.out.println(" Todos los sospechosos han sido interrogados.");
                    break;
                        
                case 3:
                    System.out.println("\n RESOLUCIÓN DEL CASO");
                    if (pistas >= 3) {
                        System.out.println(" ¡Tienes suficientes pistas!");
                        System.out.println(" El culpable es: Aurelio Vásquez");
                        System.out.println(" ¡CASO RESUELTO, detective " + nombre + "!");
                        casoResuelto = true;
                    } else {
                        System.out.println(" Tienes " + pistas + " pista(s). Necesitas al menos 3.");
                        System.out.println(" Regresa al menú y busca más pistas.");
                    }
                    break;
                            
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            
        } while (!casoResuelto); 
        
        System.out.println("\nGracias por jugar, " + nombre + ". Caso cerrado.");
        teclado.close();
    }
}
