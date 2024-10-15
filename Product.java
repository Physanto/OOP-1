import java.util.Scanner;
/*
 * author Manuel Figueroa
 */

public class Product{

    private int code;
    private String name;
    private double price;

    public Product(){
        this(000, "Desconocido", 0.0);
    }

    public Product(int code, String name, double price){

        this.code = (code != 0) ? code : 000;
        this.name = (name != null && !name.isEmpty()) ? name: "Desconocido";
        this.price = (price != 0) ? price : 0.0;
    }

    public int getCode(){
       
        return code;
    }

    public void setCode(int code){

        this.code = code;
    }

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    public double getPrice(){

        return price;
    }

    public void setPrice(double price){
        
        this.price = price;
    }

    public double calculateDiscountTotal(){

        double discountTotal = price * 0.10;

        return discountTotal;
    }
    
    public void getDataProduct(Scanner stdin){

        System.out.print("Ingresa el codigo del producto: ");
        int codeProduct = stdin.nextInt();
        setCode(codeProduct);
        stdin.nextLine(); 

        System.out.print("Ingresa el nombre del producto: ");
        String nameProduct = stdin.nextLine();
        setName(nameProduct);

        System.out.print("Ingresa el precio del producto: ");
        double priceProduct = stdin.nextDouble();
        setPrice(priceProduct);

    }
}
