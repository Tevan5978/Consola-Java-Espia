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
                } else if (edad <= 17) {
                    System.out.println("Puedes ser detective junior");
                } else if (edad <= 59) {
                    System.out.println("¡Bienvenido al equipo de detectives!");
                } else {
                    System.out.println("Detective senior con experiencia");
                }
            }
        }

        System.out.println("\nCuantas pistas iniciales tienes:");
        int pistas = teclado.nextInt();

        if (pistas > 5) {
            System.out.println("¡Eres un detective legendario!");
        } else if (pistas == 5) {
            System.out.println("Eres un detective EXPERTO!\nPuedes resolver el caso.");
        } else if (pistas >= 2) {
            System.out.println("Buen trabajo, detective.\nNecesitas unas pistas mas.");
        } else if (pistas == 1) {
            System.out.println("Vas por buen camino...\nSigue investigando!");
        } else {
            System.out.println("No tienes pistas o el valor es inválido.");
        }

        int opcion;
        boolean casoResuelto = false;
        int puntaje = 0;

        String[] sospechososArr = {
            "James Barnes", 
            "Aurelio Vásquez", 
            "Victoria Reyes", 
            "Bruno Quiroga"
        };

        do {
            System.out.println("\nPuntaje actual: " + puntaje);

            System.out.println("\n--- MENÚ DEL DETECTIVE ---");
            System.out.println("1. Buscar pistas en la escena");
            System.out.println("2. Interrogar sospechosos");
            System.out.println("3. Resolver el caso");
            System.out.print("Elige una opción (1-3): ");
            opcion = teclado.nextInt();
            teclado.nextLine(); 
            
            switch (opcion) {
                case 1:
                    System.out.println("\n BUSCANDO PISTAS...");
                    String[] evidencias = {
                        "Huella digital en la ventana", 
                        "Copa de vino con residuos", 
                        "Nota rasgada en el escritorio", 
                        "Cuchillo en la cocina"
                    };
                    
                    if (pistas >= evidencias.length) {
                        System.out.println(">> ¡Ya has encontrado todas las pistas disponibles!");
                    } else {
                        int i = 0;
                        while (i < evidencias.length) {
                            System.out.println(" Pista encontrada: " + evidencias[i]);
                            i++;
                        }
                        pistas = evidencias.length;
                        System.out.println(">> ¡Has recolectado todas las pistas!");
                    }

                    puntaje += 10;
                    System.out.println("Total de pistas actuales: " + pistas);
                    break;
                    
                case 2:
                    System.out.println("\n INTERROGATORIOS");
                    
                    for (int s = 0; s < sospechososArr.length; s++) {
                        System.out.println(" Interrogando a: " + sospechososArr[s]);
                        System.out.println(" Dice que es inocente...");
                    }

                    puntaje += 5;
                    System.out.println(" Todos los sospechosos han sido interrogados.");
                    break;
                        
                case 3:
                    System.out.println("\n RESOLUCIÓN DEL CASO");

                    if (pistas >= 3) {
                        System.out.println(" ¡Tienes suficientes pistas!");

                        System.out.println("¿A quién acusas?");
                        for (int i = 0; i < sospechososArr.length; i++) {
                            System.out.println((i + 1) + ". " + sospechososArr[i]);
                        }

                        System.out.print("Elige una opción: ");
                        int eleccion = teclado.nextInt();

                        if (eleccion < 1 || eleccion > sospechososArr.length) {
                            System.out.println("Opción inválida.");
                            break;
                        }

                        String culpable = sospechososArr[eleccion - 1];

                        System.out.println(" Has acusado a: " + culpable);
                        System.out.println(" ¡El culpable es: " + culpable + "!");
                        System.out.println(" ¡CASO RESUELTO, detective " + nombre + "!");

                        puntaje += 20;
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
        
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Puntaje total: " + puntaje);

        if (puntaje >= 40) {
            System.out.println("Rango: Detective Legendario");
        } else if (puntaje >= 25) {
            System.out.println("Rango: Detective Experto");
        } else if (puntaje >= 10) {
            System.out.println("Rango: Detective en entrenamiento");
        } else {
            System.out.println("Rango: Novato");
        }

        System.out.println("\nGracias por jugar, " + nombre + ". Caso cerrado.");
        teclado.close();
    }
}
