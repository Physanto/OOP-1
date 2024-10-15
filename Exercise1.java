import java.util.Scanner;

//git@github.com:Physanto/OOP-1.git
//https://github.com/Physanto/OOP-1.git

/*
 * author Manuel Figueroa
 */

public class Exercise1{

    static Scanner stdin = new Scanner(System.in);
    public static void main(String [] args){

        int[] numbers = new int[20];

        calculatePromedyNumbersParAndImp(numbers);
        calculateSumElementsParAndImp(numbers);
    }

    public static void calculatePromedyNumbersParAndImp(int[] numbers){

        int contNumbersPar = 0;
        float promedyNumbersPar = 0f;

        int contNumbersImp = 0;
        float promedyNumbersImp = 0f;

        for(int i = 0; i < numbers.length; i++){

            System.out.print("Ingresa el " + (i) + " numero: ");
            numbers[i] = stdin.nextInt();

            if(numbers[i] %2 ==0){
                contNumbersPar++;
                promedyNumbersPar += numbers[i];
            }
            
            else{
                contNumbersImp++;
                promedyNumbersImp += numbers[i];
            }
        }
        promedyNumbersPar = promedyNumbersPar / contNumbersPar;
        promedyNumbersImp = promedyNumbersImp /contNumbersImp;

        System.out.println("El promedio de los numeros pares: " + promedyNumbersPar);
        System.out.println("El promedio de los numeros impares: " + promedyNumbersImp);

    }

    public static void calculateSumElementsParAndImp(int[] numbers){

        int sumPositionPar = 0;
        int sumPositionImp = 0;

        for(int i = 0; i < numbers.length; i++){
            
            if(i % 2 ==0){
                sumPositionPar += numbers[i];
            }

            else{
                sumPositionImp += numbers[i];
            }
        }

        System.out.println("La suma de los elementos de las posiciones pares: " + (sumPositionPar -1));
        System.out.println("La suma de los elementos de las posiciones impares: " + sumPositionImp);
    }
}