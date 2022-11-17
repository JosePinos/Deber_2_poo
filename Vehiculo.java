public class Vehiculo {

    /*Atributos*/
    String marca;
    String placa;
    String modelo;
    int anio;
    int n_puertas;
    double precio;




    /*Constructor*/
    public Vehiculo(){
        marca = "Tesla";
        modelo = "S";
        placa = "PIJK-1593";
        anio = 2016;
        n_puertas = 4;
        precio = 78459.03;
    }


    /*Métodos*/
    public void Acelerar() {};
    public void Frenar() {};
    public void Girar() {};

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getN_puertas() {
        return n_puertas;
    }

    public void setN_puertas(int n_puertas) {
        this.n_puertas = n_puertas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public void mostrar_datos_carro(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Año: " + getAnio());
        System.out.println("Número de Puertas: " + getN_puertas());
        System.out.println("Precio: " + getPrecio());
    }

}//fin de la clase Vehiculo
