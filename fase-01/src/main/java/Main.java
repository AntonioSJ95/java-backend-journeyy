import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        temperaturas();

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

    public static void calificaciones(){
            String[] nombres = {"Antonio","Miguel","Salvador","Raul","Jorge"};
            Double[] calificaciones = {50.55,10.00,70.10,40.22,70.52};
            double totalCalificaciones = 0.0;
            double promedio;
            double masAlta = calificaciones[0];
            double masBaja = calificaciones[0];
            StringBuilder reporte = new StringBuilder();
            for(int i = 0; i < calificaciones.length; i++){
                totalCalificaciones += calificaciones[i];
            }
            for (int i = 0; i < nombres.length; i++){
                masAlta = Math.max(masAlta, calificaciones[i]);
                masBaja = Math.min(masBaja, calificaciones[i]);
                if (calificaciones[i] >= 60.00){
                    reporte.append(nombres[i] + " " + calificaciones[i] + " APROBADO").append("\n");

                }else{
                    reporte.append(nombres[i] + " " + calificaciones[i] + " REPROBADO").append("\n");
                }
            }

            promedio = totalCalificaciones / calificaciones.length;
            System.out.println(String.format("El promedio total de las calificaciones es de %.2f", promedio));
            System.out.println(reporte);
            System.out.println(String.format("La calificacion mas alta es de %.2f", masAlta));
            System.out.println(String.format("La calificacion mas baja es de %.2f", masBaja));
    }

    public static void temperaturas(){
        double[][] temperaturas = {
                {25.0,24.0,41.0},
                {22.0,25.0,21.0},
                {42.0,26.0,15.0},
                {25.0,21.0,14.0},
                {22.0,24.0,12.0},
                {26.0,26.0,11.0},
                {21.0,19.0,10.0},
        };
        String nombreDia = "";
        String momentoDia = "";
        double totalMomento = 0.0;
        double promedio;
        double diaCaluroso = temperaturas[0][0];
        double diaFrio = temperaturas[0][0];


        for (int dia = 0; dia < 7; dia++){


            switch(dia){
                case 0: nombreDia = "Lunes"; break;
                case 1: nombreDia = "Martes"; break;
                case 2: nombreDia = "Miercoles"; break;
                case 3: nombreDia = "Jueves"; break;
                case 4: nombreDia = "Viernes"; break;
                case 5: nombreDia = "Sabado"; break;
                case 6: nombreDia = "Domingo"; break;
            }
            for(int momento = 0; momento < 3; momento++){
                totalMomento += temperaturas[dia][momento];
                switch(momento){
                    case 0: momentoDia = "Amanecer"; break;
                    case 1: momentoDia = "Tarde"; break;
                    case 2: momentoDia = "Noche"; break;
                }
                System.out.println("Dia: " + nombreDia + " Momento del dia: " + momentoDia);
                System.out.println("Temperaturas: " + temperaturas[dia][momento]);
            }
            promedio = totalMomento / 3;
            System.out.println("Promedio de " + nombreDia + ": " + promedio);
            diaFrio = Math.min(diaFrio, promedio);
            diaCaluroso = Math.max(diaCaluroso, promedio);
            totalMomento = 0.0;
        };

        System.out.println("El dia mas caluroso es " + diaCaluroso);
        System.out.println("El dia mas frio es " + diaFrio);
    }
}
