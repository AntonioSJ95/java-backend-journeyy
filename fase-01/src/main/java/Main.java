import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        analizarLetras();

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

    public static void triangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce longitud de lado A");
        int ladoA = sc.nextInt();
        System.out.println("Introduce longitud de lado B");
        int ladoB = sc.nextInt();
        System.out.println("Introduce longitud de lado C");
        int ladoC = sc.nextInt();

        String tipoTriangulo = "";

        if(ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA ){
            System.out.println("Esto es un triangulo");

        }else {
            System.out.println("Esto no es un triangulo");
            return;
        }

        if(ladoA == ladoB && ladoB==ladoC && ladoC==ladoA){
           tipoTriangulo = "Equilatero";
        } else if (ladoA != ladoB && ladoB!=ladoC && ladoC!=ladoA){
           tipoTriangulo = "Escaleno";
        } else if (ladoA == ladoB || ladoB==ladoC || ladoC==ladoA) {
           tipoTriangulo = "Isoseles";
        }

        String escalaTriangulo = switch(tipoTriangulo){
            case "Equilatero" -> "Equilatero";
            case "Escaleno" -> "Escaleno";
            case "Isoseles" -> "Isoseles";
            default -> "No es un triangulo";

        };

        System.out.println(escalaTriangulo);

    }

    public static void tablaMultiplicar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero a multiplicar");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            int mult = (i * num);
            System.out.println(String.format("%5d x %5d = %5d",num,i,mult));
        }
    }

    public static void analizarLetras(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String palabra = sc.nextLine().toLowerCase();
        int total = 0;
        int totalVocales = 0;
        StringBuilder sb = new StringBuilder("");


        for (int i = 0; i < palabra.length(); i++){
            if(palabra.charAt(i) != ' '){
                total++;
                sb.append(palabra.charAt(i));
            }
            if(palabra.charAt(i) == 'a' || (palabra.charAt(i) == 'e' || (palabra.charAt(i) == 'i' || (palabra.charAt(i) == 'o' || (palabra.charAt(i) == 'u'))))) {
                totalVocales++;
            }
        }
        StringBuilder reversesb = new StringBuilder(sb);
        reversesb.reverse();
        if(sb.toString().equals(reversesb.toString())){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }

        System.out.println(sb);
        System.out.println(reversesb);
        System.out.println(String.format("Total de letras de la palabra: %5d",total));
        System.out.println(String.format("Total de vocales de la palabra: %5d",totalVocales));
        System.out.println("Palabra en mayusculas: " + palabra.toUpperCase());
        System.out.println("Palabra en minusculas: " + palabra.toLowerCase());

    }
}
