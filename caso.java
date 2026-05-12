import java.util.Scanner;

// ============================================================
// CLASE AGENTE
// ============================================================
class Agente {

    protected int id;
    protected String nombre;
    protected int edad;
    protected String experiencia;

    public Agente(int id, String nombre, int edad, String experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.experiencia = experiencia;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Experiencia: " + experiencia);
    }
}

// ============================================================
// CLASE POLICIA
// ============================================================
class Policia extends Agente {

    private String especialidad;
    private String rango;
    private String comisaria;
    private String area;
    private String categoria;
    private String patrulla;

    public Policia(
            int id,
            String nombre,
            int edad,
            String experiencia,
            String especialidad,
            String rango,
            String comisaria,
            String area,
            String categoria,
            String patrulla
    ) {
        super(id, nombre, edad, experiencia);
        this.especialidad = especialidad;
        this.rango = rango;
        this.comisaria = comisaria;
        this.area = area;
        this.categoria = categoria;
        this.patrulla = patrulla;
    }

    public void mostrarPolicia() {
        System.out.println("\n===== INFORMACIÓN DEL POLICÍA =====");
        mostrarInfo();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Rango: " + rango);
        System.out.println("Comisaría: " + comisaria);
        System.out.println("Área: " + area);
        System.out.println("Categoría: " + categoria);
        System.out.println("Patrulla: " + patrulla);
    }

    public void accionesPolicia() {
        System.out.println("\nACCIONES DEL POLICÍA:");
        System.out.println("- Interrogar");
        System.out.println("- Investigar");
        System.out.println("- Analizar registros");
        System.out.println("- Documentar");
        System.out.println("- Deducir");
        System.out.println("- Vigilar");
        System.out.println("- Registrar archivos");
        System.out.println("- Solicitar refuerzos");
        System.out.println("- Auxiliar");
    }
}

// ============================================================
// CLASE FORENSE
// ============================================================
class Forense extends Agente {

    private String especialidad;
    private String turno;
    private String laboratorioAsignado;
    private String estadoDisponibilidad;
    private String nivelAcceso;
    private String institucion;

    public Forense(
            int id,
            String nombre,
            int edad,
            String experiencia,
            String especialidad,
            String turno,
            String laboratorioAsignado,
            String estadoDisponibilidad,
            String nivelAcceso,
            String institucion
    ) {
        super(id, nombre, edad, experiencia);
        this.especialidad = especialidad;
        this.turno = turno;
        this.laboratorioAsignado = laboratorioAsignado;
        this.estadoDisponibilidad = estadoDisponibilidad;
        this.nivelAcceso = nivelAcceso;
        this.institucion = institucion;
    }

    public void mostrarForense() {
        System.out.println("\n===== INFORMACIÓN DEL FORENSE =====");
        mostrarInfo();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Turno: " + turno);
        System.out.println("Laboratorio asignado: " + laboratorioAsignado);
        System.out.println("Estado disponibilidad: " + estadoDisponibilidad);
        System.out.println("Nivel de acceso: " + nivelAcceso);
        System.out.println("Institución: " + institucion);
    }

    public void accionesForense() {
        System.out.println("\nACCIONES DEL FORENSE:");
        System.out.println("- Realizar autopsia");
        System.out.println("- Recolectar muestras");
        System.out.println("- Redactar informe");
        System.out.println("- Analizar toxicología");
        System.out.println("- Identificar pistas");
        System.out.println("- Testificar");
        System.out.println("- Fotografiar");
        System.out.println("- Solicitar estudios");
        System.out.println("- Intervenir escenas");
    }
}
// ============================================================
// CLASE ESPIA
// ============================================================
class Espia {

    // Atributos de la clase
    String nombreClave;
    int agentesProtegidos;
    int amenazasNeutralizadas;

    // Constructor
    public Espia(
            String nombreClave,
            int agentesProtegidos,
            int amenazasNeutralizadas
    ) {
        this.nombreClave = nombreClave;
        this.agentesProtegidos = agentesProtegidos;
        this.amenazasNeutralizadas = amenazasNeutralizadas;
    }

    // Método solicitado
    public void informarContravigilancia() {
        System.out.println(
                "El agente " + nombreClave +
                " protege " + agentesProtegidos +
                " agentes y ha neutralizado " +
                amenazasNeutralizadas + " amenazas"
        );
    }
}

// ============================================================
// CLASE PRINCIPAL
// ============================================================
public class Main {

    // ========================================================
    // MÉTODO PARA VALIDAR ENTEROS
    // ========================================================
    public static int leerEntero(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);

            if (teclado.hasNextInt()) {
                int numero = teclado.nextInt();
                teclado.nextLine(); // limpiar buffer
                return numero;
            } else {
                System.out.println("Dato inválido. Inténtalo nuevamente.");
                teclado.nextLine();
            }
        }
    }

    // ========================================================
    // MAIN
    // ========================================================
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" DESPACHO HOLMES & ASOCIADOS ");
        System.out.println(" Caso #1: HIDDEN ");
        System.out.println("=================================");

        // ====================================================
        // REGISTRO POLICÍA
        // ====================================================
        System.out.println("\n====== REGISTRO DEL POLICÍA ======");

        int idPolicia = leerEntero(teclado, "ID: ");

        System.out.print("Nombre: ");
        String nombrePolicia = teclado.nextLine();

        int edadPolicia = leerEntero(teclado, "Edad: ");

        System.out.print("Experiencia: ");
        String experienciaPolicia = teclado.nextLine();

        System.out.print("Especialidad: ");
        String especialidadPolicia = teclado.nextLine();

        System.out.print("Rango: ");
        String rango = teclado.nextLine();

        System.out.print("Comisaría: ");
        String comisaria = teclado.nextLine();

        System.out.print("Área: ");
        String area = teclado.nextLine();

        System.out.print("Categoría: ");
        String categoria = teclado.nextLine();

        System.out.print("Patrulla: ");
        String patrulla = teclado.nextLine();

        Policia policia = new Policia(
                idPolicia,
                nombrePolicia,
                edadPolicia,
                experienciaPolicia,
                especialidadPolicia,
                rango,
                comisaria,
                area,
                categoria,
                patrulla
        );

        // ====================================================
        // REGISTRO FORENSE
        // ====================================================
        System.out.println("\n====== REGISTRO DEL FORENSE ======");

        int idForense = leerEntero(teclado, "ID: ");

        System.out.print("Nombre: ");
        String nombreForense = teclado.nextLine();

        int edadForense = leerEntero(teclado, "Edad: ");

        System.out.print("Experiencia: ");
        String experienciaForense = teclado.nextLine();

        System.out.print("Especialidad: ");
        String especialidadForense = teclado.nextLine();

        System.out.print("Turno: ");
        String turno = teclado.nextLine();

        System.out.print("Laboratorio asignado: ");
        String laboratorio = teclado.nextLine();

        System.out.print("Estado disponibilidad: ");
        String disponibilidad = teclado.nextLine();

        System.out.print("Nivel de acceso: ");
        String acceso = teclado.nextLine();

        System.out.print("Institución: ");
        String institucion = teclado.nextLine();

        Forense forense = new Forense(
                idForense,
                nombreForense,
                edadForense,
                experienciaForense,
                especialidadForense,
                turno,
                laboratorio,
                disponibilidad,
                acceso,
                institucion
        );

        // ====================================================
        // MOSTRAR INFORMACIÓN
        // ====================================================
        policia.mostrarPolicia();
        policia.accionesPolicia();

        forense.mostrarForense();
        forense.accionesForense();
        // ====================================================
    // REGISTRO DEL ESPIA
    Espia faroApagado = new Espia("Faro Apagado", 15, 8);

    // Mostrar información de contra-vigilancia
    System.out.println("\n===== INFORMACIÓN DEL ESPIA =====");
    faroApagado.informarContravigilancia();

        // ====================================================
        // VARIABLES DEL JUEGO
        // ====================================================
        int pistas = 0;
        int opcion;
        boolean casoResuelto = false;
        int puntaje = 0;
        int intentos = 0;
        String historial = "";

        String[] sospechosos = {
                "James Barnes",
                "Aurelio Vásquez",
                "Victoria Reyes",
                "Bruno Quiroga"
        };

        String[] personalidad = {
                "Nervioso y evita mirar a los ojos.",
                "Muy seguro y habla con firmeza.",
                "Tranquila pero misteriosa.",
                "Agresivo y responde de mala gana."
        };

        // ====================================================
        // MENÚ PRINCIPAL
        // ====================================================
        do {
            System.out.println("\n=========== MENÚ ==========");
            System.out.println("1. Buscar pistas");
            System.out.println("2. Interrogar sospechosos");
            System.out.println("3. Resolver caso");
            System.out.println("4. Ver historial");
            System.out.println("5. Salir");
            System.out.println("Puntaje actual: " + puntaje);

            opcion = leerEntero(teclado, "Seleccione opción: ");

            switch (opcion) {

                // ====================================================
                // BUSCAR PISTAS
                // ====================================================
                case 1:
                    System.out.println("\n--- BUSCANDO PISTAS ---");

                    String[] evidencias = {
                            "Huella dactilar",
                            "Copa con veneno",
                            "Nota anónima",
                            "Cuchillo ensangrentado"
                    };

                    for (String evidencia : evidencias) {
                        System.out.println("Pista encontrada: " + evidencia);
                    }

                    pistas = evidencias.length;
                    puntaje += 10;
                    historial += "- El detective buscó pistas.\n";

                    System.out.println("Total de pistas encontradas: " + pistas);
                    break;

                // ====================================================
                // INTERROGATORIOS
                // ====================================================
                case 2:
                    System.out.println("\n--- INTERROGATORIOS ---");

                    for (int i = 0; i < sospechosos.length; i++) {
                        System.out.println("\nInterrogando a: " + sospechosos[i]);
                        System.out.println("Personalidad: " + personalidad[i]);
                        System.out.println("Dice: 'Soy inocente detective.'");
                    }

                    puntaje += 5;
                    historial += "- Se interrogaron sospechosos.\n";
                    break;

                // ====================================================
                // RESOLVER CASO
                // ====================================================
                case 3:
                    System.out.println("\n--- RESOLUCIÓN DEL CASO ---");

                    if (pistas >= 3) {
                        intentos++;
                        historial += "- Intentó resolver el caso.\n";

                        System.out.println("¿A quién deseas acusar?\n");

                        for (int i = 0; i < sospechosos.length; i++) {
                            System.out.println((i + 1) + ". " + sospechosos[i]);
                        }

                        int eleccion = leerEntero(
                                teclado,
                                "\nSeleccione sospechoso: "
                        );

                        if (eleccion < 1 || eleccion > sospechosos.length) {
                            System.out.println("Opción inválida.");
                            break;
                        }

                        String culpable = sospechosos[eleccion - 1];

                        System.out.println("\nHas acusado a: " + culpable);
                        System.out.println(
                                "Gracias a las pistas y el análisis del equipo de Holmes & Asociados,"
                        );
                        System.out.println(
                                "el culpable ha sido identificado como: " + culpable
                        );

                        System.out.println("\n¡¡CASO RESUELTO!!");

                        puntaje += 20;
                        historial += "- El culpable fue: " + culpable + "\n";
                        casoResuelto = true;

                    } else {
                        System.out.println(
                                "No hay suficientes evidencias aún para acusar a nadie."
                        );
                        System.out.println("Sigue buscando pistas.");
                    }
                    break;

                // ====================================================
                // VER HISTORIAL
                // ====================================================
                case 4:
                    System.out.println("\n====== HISTORIAL ======");

                    if (historial.equals("")) {
                        System.out.println("No hay acciones registradas.");
                    } else {
                        System.out.println(historial);
                    }
                    break;

                // ====================================================
                // SALIR
                // ====================================================
                case 5:
                    System.out.println("\nCerrando sesión...");
                    historial += "- El jugador salió del sistema.\n";
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5 && !casoResuelto);

        // ====================================================
        // RESULTADOS FINALES
        // ====================================================
        System.out.println("\n=================================");
        System.out.println(" RESULTADO FINAL ");
        System.out.println("=================================");
        System.out.println("Puntaje final: " + puntaje);
        System.out.println("Intentos realizados: " + intentos);

        // ====================================================
        // FINALES MÚLTIPLES
        // ====================================================
        if (puntaje >= 40 && intentos == 1) {
            System.out.println("\nFINAL PERFECTO:");
            System.out.println("Eres un detective legendario.");

        } else if (puntaje >= 30) {
            System.out.println("\nFINAL BUENO:");
            System.out.println("El caso fue resuelto exitosamente.");

        } else if (puntaje >= 15) {
            System.out.println("\nFINAL REGULAR:");
            System.out.println("Resolviste el caso, pero quedaron dudas.");

        } else {
            System.out.println("\nFINAL MALO:");
            System.out.println("El caso se resolvió de forma cuestionable.");
        }

        System.out.println(
                "\nGracias por utilizar el sistema de Holmes & Asociados."
        );
        System.out.println(
                "\nEste proyecto está siendo realizado por:\n" +
                "1. Estevan Gonzalez\n" +
                "2. Juan José Quinchia"
        );

        teclado.close();
    }
}
