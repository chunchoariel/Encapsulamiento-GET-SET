package com.open_bootcamp;

public class Main {

    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo(); //Creacion de instancia
        coche.setTipo("Coupe");
        coche.setVelocidadMaxima(120);
        coche.setRapido(true);

        Vehiculo moto = new Vehiculo(); //Creacion de instancia
        moto.setTipo("Scotter");
        moto.setVelocidadMaxima(50);
        moto.setRapido(false);

        System.out.println(coche.getTipo());
        System.out.println(coche.getVelocidadMaxima());
        System.out.println(coche.isRapido());
        System.out.println(moto.getTipo() + " " + moto.getVelocidadMaxima());
        System.out.println(moto.isRapido());
    }
}
class Vehiculo { //creacion de clase
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }

    public boolean isRapido () {
        return this.rapido;
    }

    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public void setTipo(String tipo) { //crear funcion publica (SET)
        //if (this.estado == 0 ) {  //como la variable privada estado no se va a utilizar fuera de la clase, sino que se
            this.tipo = tipo;     //va a utilizar unicamente dentro de un metodo de la clase, no se debe crear un set o
        //}                         //get, para propiedades que se van a utilizar dentro de nuestra clase
    }

    public String getTipo() {  //No tiene parametros, porque no modificada nada solo obtiene datos
        return this.tipo;
    }
}