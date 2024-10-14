/*
 * author Manuel Figueroa
 */

public class Maestro{

    private String id;
    private String nombre;
    private String cel;
    private String lugarTrabajo;

    public Maestro(){

    }

    public Maestro(String id, String nombre, String cel, String lugarTrabajo){

        this.id = id;
        this.nombre = nombre;
        this.cel = cel;
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCel(){
        return cel;
    }

    public void setCel(String cel){
        this.cel = cel;
    }

    public String getLugarTrabajo(){
        return lugarTrabajo;
    }
    
    public void setLugarTrabajo(String lugarTrabajo){
        this.lugarTrabajo = lugarTrabajo;
    }

    public void mostrarDatosMaestro(){
        System.out.println("El maestro " + getNombre() + " identificado con numero " + getId() + " y laborando en la ciudad de " + getLugarTrabajo());
    }
}

