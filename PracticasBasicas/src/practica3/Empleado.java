
package practica3;

import java.util.Scanner;

public class Empleado {
    
    private String nombre;
    private String puesto;
    private double pagoHora;
    private double horastrabajadasMes;
    private double salarioMensual;
    double extra;
    double impuesto;
    double resultante;
    
    public void capturar_datos_trabajador(){
        Scanner nombres = new Scanner(System.in);
        System.out.println("Ingresa el nombre");
        setNombre(nombres.nextLine());
        Scanner puestos = new Scanner(System.in);
        System.out.println("Ingresa el puesto");
        setPuesto(puestos.nextLine());
        Scanner phoras = new Scanner(System.in);
        System.out.println("Ingresa el salario por hora");
        setPagoHora(phoras.nextDouble());
        Scanner htrabajo = new Scanner(System.in);
        System.out.println("Ingresa las horas trabajadas en el Mes");
        setHorastrabajadasMes(htrabajo.nextDouble());
    }
    public double obtener_salario_mensual(){
        
        if(getHorastrabajadasMes()>=100 && getHorastrabajadasMes()<=200){
            extra=((pagoHora*horastrabajadasMes)*0.10);
        }
        if(getHorastrabajadasMes()>=201 && getHorastrabajadasMes()<=220){
          extra=((pagoHora*horastrabajadasMes)*0.20); 
        }
        if(getHorastrabajadasMes()>=221 || getHorastrabajadasMes()>230){
            extra=((pagoHora*horastrabajadasMes)*0.30); 
        }
            
    impuesto=((pagoHora* horastrabajadasMes+extra)*0.16);
    resultante=(pagoHora*horastrabajadasMes+extra-impuesto);
        
        return resultante;
    }
    public void imprimir_datos_trabajador(){
        obtener_salario_mensual();
        System.out.println("El nombre del introducido es: "+ getNombre());
        System.out.println("El puesto del trabajador es: " + getPuesto());
        System.out.println("El pago por Hora del trabajador es: " + getPagoHora());
        System.out.println("Las horas trabajadas en el mes fueron: " + getHorastrabajadasMes());
        System.out.println("El salario de este mes es: " + resultante );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getHorastrabajadasMes() {
        return horastrabajadasMes;
    }

    public void setHorastrabajadasMes(double horastrabajadasMes) {
        this.horastrabajadasMes = horastrabajadasMes;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
    
}
