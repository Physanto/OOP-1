import java.util.Scanner;

/*
 * author Manuel Figueroa
 */

public class Client{

    private String name;
    private String phone;
    private String adress;

    public Client(){
        this("Consumidor Final", "000-000-0000", "Desconocida");
    }

    public Client(String name, String phone, String adress){

        this.name = (name != null && !name.isEmpty()) ? name : "Consumidor Final";
        this.phone = (phone != null && !phone.isEmpty()) ? phone : "000-000-0000";
        this.adress = (adress != null && !adress.isEmpty()) ? adress : "Desconocida";
    }

    public String getName(){
        
        return name;
    }

    public void setName(String name){
        
        this.name = name;
    }
   
    public String getPhone(){
        
        return phone;
    }

     public void setPhone(String phone){
        
        this.phone = phone;
    }

    public String getAdress(){
        
        return adress;
    }
    
    public void setAdresss(String adress){
        
        this.adress = adress;
    }

    public void getDataClient(Scanner stdin){
        
        System.out.print("Ingresa el nombre del cliente: ");
        String nameClient = stdin.nextLine();
        setName(nameClient);

        System.out.print("Ingresa el numero de telefono del cliente: ");
        String phoneClient = stdin.nextLine();
        setPhone(phoneClient);

        System.out.print("Ingresa la direccion del cliente: ");
        String adressClient = stdin.nextLine();
        setAdresss(adressClient);   
    }
}
