import java.util.Scanner;

/*
 * author Manuel Figueroa
 */

public class RunProgram{

    static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args){
        
        Scanner stdin = new Scanner(System.in);

        ProcessBuy processBuy = new ProcessBuy();

        processBuy.doBuy(stdin);
        processBuy.showSummaryBuy();
    }
}
