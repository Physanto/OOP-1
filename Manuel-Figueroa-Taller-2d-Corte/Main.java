/*
 * author Manuel Figueroa
 */

public class Main{

    public static void main(String [] args){

        Automovil autoUno = new Automovil("ZDU-142", "Honda", "Civic", "Rojo");

        System.out.println("ESPECIFICACIONES DEL AUTOMOVIL 1\n");
        
        System.out.println("Marca: " + autoUno.getMarca() + "\nModelo: " + autoUno.getModelo() + "\nColor: " + autoUno.getColor() + "\nPlaca: " + autoUno.getPlaca());
        
        autoUno.acelerarAutomovil();

        Automovil autoDos = new Automovil("XAD-432", "Chevrolet", "Captiva", "Verde");
        
        System.out.println("\nESPECIFICACIONES DEL AUTOMOVIL 2\n");

        System.out.println("Marca: " + autoDos.getMarca() + "\nModelo: " + autoDos.getModelo() + "\nColor: " + autoDos.getColor() + "\nPlaca: " + autoDos.getPlaca());

        autoUno.girarAutomovil();

    }
}
