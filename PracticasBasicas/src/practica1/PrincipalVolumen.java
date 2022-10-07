
package practica1;


public class PrincipalVolumen {
    
    public static void main(String[] args) {
        Figura objFigura1 = new Figura();
        
        objFigura1.leer_medida();
        objFigura1.imprimir_medidas();
        objFigura1.obtener_volumen(objFigura1.getVolumen());
    }
    
}
