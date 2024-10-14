/*
 * author Manuel Figueroa
 */

public class Automovil{

    private String placa;
    private String marca;
    private String modelo;
    private String color;

    public Automovil(){
        
    }

    public Automovil(String placa, String marca, String modelo, String color){

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getPlaca(){

        return placa;
    }

    public void setPlaca(String placa){

        this.placa = placa;
    }

    public String getMarca(){

        return marca;
    }

    public void setMarca(String marca){

        this.marca = marca;
    }

    public String getModelo(){

        return modelo;
    }

    public void setModelo(String modelo){

        this.modelo = modelo;
    }

    public String getColor(){
        
        return color;
    }

    public void setColor(String color){

        this.color = color;
    }

    public void acelerarAutomovil(){

        System.out.println("El " + marca + " color " + color + " acelera constantemente");
    }

    public void girarAutomovil(){

        System.out.println("El " + marca + " color" + color + " gira su direccion hasta 45 grados");
    } 
}        
