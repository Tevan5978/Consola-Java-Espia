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

    public Policia(int id, String nombre, int edad, String experiencia,
                   String especialidad, String rango,
                   String comisaria, String area,
                   String categoria, String patrulla) {
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

    public Forense(int id, String nombre, int edad, String experiencia,
                   String especialidad, String turno,
                   String laboratorioAsignado,
                   String estadoDisponibilidad,
                   String nivelAcceso,
                   String institucion) {
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
// CLASE PRINCIPAL
// ============================================================
public class Main {
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
        System.out.print("ID: ");
        int idPolicia = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Nombre: ");
        String nombrePolicia = teclado.nextLine();

        System.out.print("Edad: ");
        int edadPolicia = teclado.nextInt();
        teclado.nextLine();

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

        Policia policia = new Policia(idPolicia, nombrePolicia, edadPolicia, experienciaPolicia,
                                     especialidadPolicia, rango, comisaria, area, categoria, patrulla);

        // ====================================================
        // REGISTRO FORENSE
        // ====================================================
        System.out.println("\n====== REGISTRO DEL FORENSE ======");
        System.out.print("ID: ");
        int idForense = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Nombre: ");
        String nombreForense = teclado.nextLine();

        System.out.print("Edad: ");
        int edadForense = teclado.nextInt();
        teclado.nextLine();

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

        Forense forense = new Forense(idForense, nombreForense, edadForense, experienciaForense,
                                      especialidadForense, turno, laboratorio, disponibilidad, acceso, institucion);

        // ====================================================
        // MOSTRAR INFORMACIÓN
        // ====================================================
        policia.mostrarPolicia();
        policia.accionesPolicia();

        forense.mostrarForense();
        forense.accionesForense();

        // ====================================================
        // MINI JUEGO
        // ====================================================
        int pistas = 0;
        int opcion;
        boolean casoResuelto = false;

        do {
            System.out.println("\n=========== MENÚ ==========");
            System.out.println("1. Buscar pistas");
            System.out.println("2. Interrogar sospechosos");
            System.out.println("3. Resolver caso");
            System.out.println("4. Salir");
            System.out.print("Seleccione opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
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
                    System.out.println("Total de pistas encontradas: " + pistas);
                    break;

                case 2:
                    System.out.println("\n--- INTERROGATORIOS ---");
                    String[] sospechosos = {
                        "James Barnes",
                        "Aurelio Vásquez",
                        "Victoria Reyes"
                    };

                    for (String sospechoso : sospechosos) {
                        System.out.println("Interrogando a: " + sospechoso);
                    }
                    break;

                case 3:
                    System.out.println("\n--- RESOLUCIÓN DEL CASO ---");
                    if (pistas >= 3) {
                        System.out.println("¡CASO RESUELTO!");
                        System.out.println("Gracias a las pistas y el análisis del equipo de Holmes & Asociados,");
                        System.out.println("el culpable ha sido identificado como: Aurelio Vásquez.");
                        casoResuelto = true;
                    } else {
                        System.out.println("No hay suficientes evidencias aún para acusar a nadie.");
                        System.out.println("Sigue buscando pistas.");
                    }
                    break;

                case 4:
                    System.out.println("Cerrando sesión en el sistema del despacho...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4 && !casoResuelto);

        teclado.close();
        System.out.println("Fin del programa.");
    }
}
