import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       propina();

    }

    public static void calentamiento(){
        String name = "Antonio";
        int cuenta = 12345;
        double saldo = 1250.50;
        boolean activa = true;

        String formattedString = String.format("Nombre: %s | Cuenta: %d | Saldo: $%.2f | Activa: %b" , name,cuenta,saldo,activa);
        System.out.println(formattedString);
    }

    public static void propina(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cuenta a pagar");
        int cuenta = sc.nextInt();
        System.out.println("Introduce la propia a agregar a la cuenta: 10, 15 o 20");
        int propina =  sc.nextInt();
        double totalPropina = (cuenta * (propina / 100.0));
        System.out.println(String.format("La propina es: $%.2f", totalPropina));
        System.out.println(String.format("Total a pagar: $%.2f", cuenta + totalPropina));
    }
}
