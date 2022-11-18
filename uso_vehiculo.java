import javax.swing.JOptionPane;
import java.util.Scanner;
public class uso_vehiculo {

    public static void main(String[] args) {

        int opcion = 1;
        Vehiculo[] carros = new Vehiculo[5];
        //inicializamos el array de objetos con el constructor
        for(int i = 0; i < carros.length; i++){
            carros[i] = new Vehiculo();
        }


        while(opcion != 3){

                opcion = Menu();

                switch (opcion){

                    case 1:{
                        System.out.println("\n\tRegistro de Vehículos");
                    }
                    break;


                    case 2:{
                        System.out.println("\n\tDatos de los Vehículos");
                    }
                    break;


                    case 3:{
                        System.out.println("\tGRACIAS POR SU PREFERENCIA");
                        System.out.println("Desarrollado por super compumundo "+
                                "hipermega red");
                    }
                    break;


                    default:{
                        System.out.println("Algo ha salido muy mal");
                    }
                    break;

                }//fin del switch principal


        }//fin del while principal


    }//FIN DEL MÉTODO DE MAIN




    public static int Menu(){
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\tMENÚ DE REGISTRO VEHICULAR");
        System.out.println("1) Registrar Vehículos");
        System.out.println("2) Mostrar Vehículos");
        System.out.println("3) Salir");
        System.out.print(">");    opcion = entrada.nextInt();

        while(opcion < 1 || opcion > 3){
            System.out.println("Ingrese una opción válida");
            System.out.print(">");
            opcion = entrada.nextInt();
        }
        System.out.println();

        return opcion;
    }//fin del método menú


}
