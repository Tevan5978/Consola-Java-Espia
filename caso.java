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

        int opcion;
        boolean casoResuelto = false;
        int puntaje = 0;
        int intentos = 0;

        String historial = "";

        String[] sospechososArr = {
            "James Barnes", 
            "Aurelio Vásquez", 
            "Victoria Reyes", 
            "Bruno Quiroga"
        };

        String[] personalidad = {
            "Nervioso, evita el contacto visual.",
            "Muy seguro, habla con firmeza.",
            "Tranquila pero misteriosa.",
            "Agresivo, responde de mala gana."
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
                    
                    for (int i = 0; i < evidencias.length; i++) {
                        System.out.println(" Pista encontrada: " + evidencias[i]);
                    }

                    pistas = evidencias.length;
                    puntaje += 10;
                    historial += "Buscó pistas\n";

                    System.out.println("Total de pistas: " + pistas);
                    break;
                    
                case 2:
                    System.out.println("\n INTERROGATORIOS");
                    
                    for (int s = 0; s < sospechososArr.length; s++) {
                        System.out.println(" Interrogando a: " + sospechososArr[s]);
                        System.out.println(" Personalidad: " + personalidad[s]);
                        System.out.println(" Dice: 'Soy inocente'\n");
                    }

                    puntaje += 5;
                    historial += "Interrogó sospechosos\n";
                    break;
                        
                case 3:
                    System.out.println("\n RESOLUCIÓN DEL CASO");

                    if (pistas >= 3) {
                        intentos++;
                        historial += "Intentó resolver el caso\n";

                        System.out.println("¿A quién acusas?");
                        for (int i = 0; i < sospechososArr.length; i++) {
                            System.out.println((i + 1) + ". " + sospechososArr[i]);
                        }

                        int eleccion = teclado.nextInt();

                        if (eleccion < 1 || eleccion > sospechososArr.length) {
                            System.out.println("Opción inválida.");
                            break;
                        }

                        String culpable = sospechososArr[eleccion - 1];

                        System.out.println(" Has acusado a: " + culpable);
                        System.out.println(" ¡El culpable es: " + culpable + "!");
                        System.out.println(" ¡CASO RESUELTO!");

                        puntaje += 20;
                        casoResuelto = true;

                    } else {
                        System.out.println("Necesitas más pistas.");
                    }
                    break;
                            
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            
        } while (!casoResuelto); 
        
        // RESULTADOS FINALES
        System.out.println("\n--- HISTORIAL DE ACCIONES ---");
        System.out.println(historial);

        System.out.println("--- RESULTADO FINAL ---");
        System.out.println("Puntaje: " + puntaje);
        System.out.println("Intentos: " + intentos);

        // FINALES MÚLTIPLES
        if (puntaje >= 40 && intentos == 1) {
            System.out.println("FINAL PERFECTO: Eres un detective legendario.");
        } else if (puntaje >= 30) {
            System.out.println("FINAL BUENO: Caso resuelto con éxito.");
        } else if (puntaje >= 15) {
            System.out.println("FINAL REGULAR: Resolviste el caso, pero con dudas.");
        } else {
            System.out.println("FINAL MALO: Caso resuelto de manera cuestionable.");
        }

        System.out.println("\nGracias por jugar, " + nombre + ". Caso cerrado.");
        teclado.close();
    }
}
