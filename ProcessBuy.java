import java.util.Scanner;

/*
 * author Manuel Figueroa
 */

public class ProcessBuy {

    private int idBuy = 1;
    private byte typeBuy;
    private int amountUnity;

    Client client = new Client();
    Product product = new Product();

    public ProcessBuy(){

    }

    public ProcessBuy(int idBuy, byte typeBuy, int amountUnity){

        this.idBuy = idBuy;
        this.typeBuy = typeBuy;
        this.amountUnity = amountUnity;
    }

    public int getIdBuy() {
        return idBuy;
    }

    public void setIdBuy(int idBuy) {
        this.idBuy = idBuy;
    }

    public byte getTypeBuy() {
        return typeBuy;
    }

    public void setTypeBuy(byte typeBuy) {
        this.typeBuy = typeBuy;
    }

    public int getAmountUnity() {
        return amountUnity;
    }

    public void setAmountUnity(int amountUnity) {
        this.amountUnity = amountUnity;
    }

    public double calculateTotalBuy(int amount){

        double amountTotal = product.getPrice() * amount;
        
        return amountTotal;
    }

    public void doBuy(Scanner stdin){

        System.out.println("\nINGRESAR LA INFORMACION DEL CLIENTE\n");
        client.getDataClient(stdin);

        System.out.println("\nINGRESAR LA INFORMACION DEL PRODUCTO\n");
        product.getDataProduct(stdin);

        System.out.print("Ingresa la cantidad a comprar del producto: ");
        int amountProduct = stdin.nextInt();
        setAmountUnity(amountProduct);
    }

    public void showSummaryBuy(){

        System.out.println("RESUMEN DE COMPRA\n");
        System.out.println("Numero de compra: " + getIdBuy());
        System.out.println("Cliente: " + client.getName());
        System.out.println("Producto comprado: " + product.getName());
        System.out.println("Cantidad de productos comprados: " + getAmountUnity() + " unidades");
        System.out.println("Valor total de compra: $" + calculateTotalBuy(amountUnity));
    }
}
