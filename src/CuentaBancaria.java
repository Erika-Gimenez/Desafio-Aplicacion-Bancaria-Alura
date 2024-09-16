import java.util.Scanner;

public class CuentaBancaria {

    /*PROYECTO DE PRACTICA CUENTA BANCARIA DE TONY STARK


    PASOS
- [x] Datos del cliente
- [x] Menu de opciones
- [x] Visualizar saldo
- [x] Hacer deposito
- [x] Hacer retiro
- [x] Opcion de salida

    Datos del cliente:
    nombre del cliente
    tipo de cuenta
    saldo disponicle
    Muestra de datos

    Operaciones dentro del menu
    suma y cuanto quedo
    resta y cuanto quedo o si no tiene
    muestra de saldo:
    cuanto le quedo o si le es insuficiente

    NOTAS DESPUES DE VER LOS VIDEOS:
    utiliza
    \n para los saltos de linea
    string text block
    investiga como seguir optimizando el code
    */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        //variables
        String nombreDelCLiente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        double retirar = 0;
        double depositar = 0;
        int opc = 0;
        char signoPeso = '$';

        //muestra de datos
        System.out.println("********************************************************************");
        System.out.println(" ");
        System.out.println("Nombre del Cliente: " + nombreDelCLiente);
        System.out.println("Tipo de Cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + saldo + signoPeso);
        System.out.println(" ");
        //System.out.println("********************************************************************");

        //menu

        while (true) {
            System.out.println("********************************************************************");
            System.out.println("** Escriba el número de la opción deseada **");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Deposita");
            System.out.println("9 - Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:

                    System.out.println(" ");

                    if (saldo == 0) {
                        System.out.println("Sos re croto amigo llora!!! igual yo pero no me gusta llorar");
                    } else {
                        System.out.println("Su saldo es: " + saldo + signoPeso);
                    }

                    System.out.println(" ");

                    break;

                case 2:

                    System.out.println("¿Cuanto dinero desea retirar?");
                    retirar = leer.nextDouble();

                    System.out.println(" ");

                    if(saldo<retirar){
                        System.out.println("SALDO INSUFICIENTE");
                    }else {
                        System.out.println("Su saldo actual es: " + (saldo -= retirar) + signoPeso);
                    }

                    System.out.println(" ");

                    break;

                case 3:

                    System.out.println("¿Cuanto dinero desea depositar?");
                    depositar = leer.nextDouble();

                    System.out.println(" ");

                    System.out.println("Su saldo actual es: " + (saldo += depositar) + signoPeso);

                    System.out.println(" ");

                    break;

                case 9:

                        return;

                default:

                    System.out.println(" ");
                    System.out.println("El número ingresado es INCORRECTO intente nuevamente");
                    System.out.println(" ");

                 break;


            }
        }
    }
}
