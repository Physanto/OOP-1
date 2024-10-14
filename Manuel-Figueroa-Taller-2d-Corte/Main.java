/*
 * author Manuel Figueroa
 */

public class Main{

    public static void main(String [] args){

        informacionAutoMovil();
        System.out.println("\n*****************************************************************\n");
        informacionMaestro();
    }

    public static void informacionAutoMovil(){

        Automovil autoUno = new Automovil("ZDU-142", "Honda", "Civic", "Rojo");

        System.out.println("ESPECIFICACIONES DEL AUTOMOVIL 1\n");
        autoUno.especificacionesCompletasAuto();

        autoUno.acelerarAutomovil();

        Automovil autoDos = new Automovil("XAD-432", "Chevrolet", "Captiva", "Verde");
    
        System.out.println("\nESPECIFICACIONES DEL AUTOMOVIL 2\n");
        autoDos.especificacionesCompletasAuto();

        autoDos.girarAutomovil();
    }

    public static void informacionMaestro(){

        Maestro maestroUno = new Maestro("1234", "Javier", "3216759089", "Popayan");
        
        Maestro maestroDos = new Maestro("4123", "Jaime", "3216721559", "Cali");

        System.out.println("\nDATOS DEL MAESTRO 1\n");

        maestroUno.mostrarDatosMaestro();

        System.out.println("\nDATOS MAESTRO 2\n");

        maestroDos.mostrarDatosMaestro();
    }
}
