import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Edad del visitante: ");
        int edad = scanner.nextInt();

        System.out.print("Visitas realizadas el lunes: ");
        int visitasLunes = scanner.nextInt();
        System.out.print("Tiempo total de estadia (en minutos): ");
        double tiempoLunes = scanner.nextInt();

        System.out.print("Visitas realizadas el martes: ");
        int visitasMartes = scanner.nextInt();
        System.out.print("Tiempo total de estadia (en minutos): ");
        double tiempoMartes = scanner.nextInt();

        System.out.print("Visitas realizadas el miercoles: ");
        int visitasMiercoles = scanner.nextInt();
        System.out.print("Tiempo total de estadia (en minutos): ");
        double tiempoMiercoles = scanner.nextInt();

        System.out.print("Visitas realizadas el jueves: ");
        int visitasJueves = scanner.nextInt();
        System.out.print("Tiempo total de estadia (en minutos): ");
        double tiempoJueves = scanner.nextInt();

        System.out.print("Visitas realizadas el viernes: ");
        int visitasViernes = scanner.nextInt();
        System.out.print("Tiempo total de estadia (en minutos): ");
        double tiempoViernes = scanner.nextInt();

        System.out.print("Visitas realizadas el sabado: ");
        int visitasSabado = scanner.nextInt();
        System.out.print("Tiempo total de estadia (en minutos): ");
        double tiempoSabado = scanner.nextInt();

        System.out.print("Visitas realizadas el domingo: ");
        int visitasDomingo = scanner.nextInt();
        System.out.print("Tiempo total de estadia (en minutos): ");
        double tiempoDomingo = scanner.nextInt();

        int totalVisitas = visitasLunes + visitasMartes + visitasMiercoles +
                visitasJueves + visitasViernes + visitasSabado + visitasDomingo;
        System.out.println("Total de visitas: " + totalVisitas);

        double promedioVisitas = (tiempoLunes + tiempoMartes + tiempoMiercoles +
                tiempoJueves + tiempoViernes + tiempoSabado + tiempoDomingo) / 7;
        System.out.println("Promedio: " + promedioVisitas);

        if (edad < 18) {
            System.out.println("El visitante es menor de edad");
        } else {
            System.out.println("El visitante es mayor de edad");
        }
    }
}