
package practica1;

import java.util.Scanner;


public class Figura {
    private double largo;
    private double ancho;
    private double alto;
    private double volumen;
    
    public void leer_medida(){
        Scanner largos = new Scanner(System.in);
        System.out.println("Ingresa el largo de la figura");
        setLargo(largos.nextDouble());
        Scanner anchos = new Scanner(System.in);
        System.out.println("Ingresa el ancho de la figura");
        setAncho(anchos.nextDouble());
        Scanner altos = new Scanner(System.in);
        System.out.println("Ingresa el alto de la figura");
        setAlto(altos.nextDouble());
    }
    public void imprimir_medidas(){
        System.out.println("Este es el largo: " + getLargo());
        System.out.println("Este es su ancho: " + getAncho());
        System.out.println("Este es su alto: " + getAlto());
        
    }
    public double obtener_volumen(double volumen){
        this. volumen= volumen;
        setVolumen((getLargo() * getAncho() * getAlto()));
        System.out.println("Este es el volumen de la figura: " + getVolumen() + " unidades cubicas");
        return volumen;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
    
    
}
