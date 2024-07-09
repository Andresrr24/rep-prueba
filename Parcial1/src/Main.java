import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Producto producto = new Producto("Nike", 20);

        String opcion;

        do {

            System.out.println("Elija una opción:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar disponibilidad");
            System.out.println("3. Mostrar datos del producto");
            System.out.println("4. Salir");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Agregar producto");

                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Inventario: ");
                    int inventario = scanner.nextInt();
                    scanner.nextLine();

                    if (inventario >= 1){
                        System.out.println("Se puede realizar una venta");
                    } else {
                        System.out.print("No se puede realizar una venta, rellenando inventario");
                        inventario += producto.getInventario() * 2;
                    }
                    producto.setModelo(modelo);
                    producto.setInventario(inventario);

                    System.out.println("Producto agregado: " + producto.getModelo());
                    break;
                case "2":
                    System.out.println("Disponibilidad");

                    System.out.println("Inventario actual: " + producto.getInventario());
                    break;
                case "3":
                    System.out.println("Datos actualizados");

                    System.out.println("Modelo: " + producto.getModelo());
                    System.out.println("Inventario: " + producto.getInventario());
                    break;
                case "4":
                    System.out.println("Inventario inicial: " + producto.getInventario());
                    break;
                case "5":
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (!opcion.equals("4"));

        scanner.close();
    }
}

class Producto {
    private String modelo;
    private int inventario;

    public Producto(String modelo, int inventario) {
        this.modelo = modelo;
        this.inventario = inventario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;

    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
}