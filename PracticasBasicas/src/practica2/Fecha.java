
package practica2;

import java.util.Scanner;


public class Fecha {
    private int dia;
    private int mes;
    private int año;
    String name;
    int fecha;
    public void leer_fecha(){
        Scanner dias = new Scanner(System.in);
        System.out.println("Ingresa el dia");
        setDia(dias.nextInt());
        Scanner meses = new Scanner(System.in);
        System.out.println("Ingresa el mes");
        setMes(meses.nextInt());
        Scanner años = new Scanner(System.in);
        System.out.println("Ingresa el año");
        setAño(años.nextInt());
        
    }
    public int validar_fecha(){
 
        do{
        leer_fecha();
                int numeroDias=-1;
        
            switch(mes){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numeroDias=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numeroDias=30;
                    break;
                case 2:
                    if((getAño() % 4 == 0) && ((getAño() % 100 != 0) || (getAño() % 400 == 0))){
                        numeroDias=29;
                    }else{
                        numeroDias=28;
                    }
                break;
            }
        if(getDia()>31 || getDia()<1){
            fecha=0;
            System.out.println("El dia es Incorrecto");
            }
                else if(getMes()<1 || getMes()>12){
            System.out.println("El mes es incorrecto");
            fecha=0;
            }
                else if(getAño()<1){
            System.out.println("El año es incorrecto");
            fecha=0;
            }
                else if((getAño() % 4 == 0) && ((getAño() % 100 != 0) || (getAño() % 400 == 0)) && getMes()==2 && getDia()>29){
            System.out.println("El año introducido es bisiesto febrero tiene 29 dias");
                fecha=0;
                }
                else if(getDia()>=29 && getMes()==2 && numeroDias==28){
                    System.out.println("El año no es bisiesto Febrero solo puede tener 28 dias");
                fecha=0;
                }
                       else if(numeroDias==31 && getDia()>31){
                    System.out.println("Este Mes solo puede tener 31 dias");
                fecha=0;
                }
                            else if(numeroDias==30 && getDia()>30){
                    System.out.println("Este Mes solo puede tener 30 dias");
                fecha=0;
                }
                            else{
                                fecha=1;
                            }
}
        while(fecha==0);
        return fecha;
    }
    
    public void imprimir_fecha_corta(){
        System.out.println(getDia() + "/"+ getMes() + "/" + getAño());
    }
    
    public void imprimir_fecha_larga(){
        
            
            
            switch(mes){
            case 1:
                name="Enero";
                break;
            case 2:
                name="Febrero";
                break;
            case 3:
                name="Marzo";
                break;
            case 4:
                name="Abril";
                break;
            case 5:
                name="Mayo";
                break;
            case 6:
                name="Junio";
                break;
            case 7:
                name="Julio";
                break;
            case 8:
                name="Agosto";
                break;
            case 9:
                name="Septiembre";
                break;
            case 10:
                name="Octubre";
                break;
            case 11:
                name="Noviembre";
                break;
            case 12:
                name="Diciembre";
                break;
         
        }
       System.out.println(getDia() + " de " + name + " del " + getAño());
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    
}
