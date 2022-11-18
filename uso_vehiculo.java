
import java.util.Scanner;
public class uso_vehiculo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
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
                        System.out.println("\n\tRegistro de Vehículos\n");
                        System.out.println("Ingrese los datos de sus vehículos");
                        for(int i = 0; i < carros.length; i++){

                            System.out.print("Ingrese la marca: ");
                            String marca = entrada.nextLine();

                            System.out.print("Ingrese el modelo: ");
                            String modelo = entrada.nextLine();

                            System.out.print("Ingrese la placa: ");
                            String placa = entrada.nextLine();


                            System.out.print("Ingrese el año: ");
                            int anio = entrada.nextInt();
                            while(anio <= 0){
                                System.out.println("Año inválido, inténtelo de nuevo");
                                System.out.print("Ingrese el año: ");
                                 anio = entrada.nextInt();
                            }

                            System.out.print("Ingrese el número de puertas: ");
                            int puertas = entrada.nextInt();
                            while(puertas < 0){
                                System.out.println("Número inválido, inténtelo de nuevo");
                                System.out.print("Ingrese el número de puertas: ");
                                puertas = entrada.nextInt();
                            }

                            System.out.print("Ingrese el precio: ");
                            double precio = entrada.nextDouble();
                            while(precio < 0){
                                System.out.println("Precio inválido, inténtelo de nuevo");
                                System.out.print("Ingrese el precio: ");
                                precio = entrada.nextDouble();
                            }
                            entrada.nextLine();

                            carros[i].setMarca(marca);
                            carros[i].setModelo(modelo);
                            carros[i].setPlaca(placa);
                            carros[i].setAnio(anio);
                            carros[i].setN_puertas(puertas);
                            carros[i].setPrecio(precio);

                            System.out.println("\n\n*******************************************\n\n");

                        }

                    }
                    break;


                    case 2:{
                        System.out.println("\n\tDatos de los Vehículos");
                        for(int i = 0; i < carros.length; i++){
                            carros[i].mostrar_datos_carro();
                        }
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

            System.out.println("\n\n\n");
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
