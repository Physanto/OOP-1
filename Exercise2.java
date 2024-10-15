import java.util.Scanner;

/*
 * author Manuel Figueroa
 */

public class Exercise2{
    
    static Scanner stdin = new Scanner(System.in);

    static final byte LENGTH_ARRAY = 5;
    
    public static void main(String[] args){

        float[] numbers = new float[LENGTH_ARRAY];

        getNumbers(numbers);

        showNumbersEntered(numbers);

        float promedy = calculatePromedy(numbers);

        byte upPromedy = calculateUpPromedy(promedy,numbers);

        byte downPromedy = calculateDownPromedy(promedy, numbers);

        showPromedy(promedy);

        showHightLargest(upPromedy);
        showHightSmallest(downPromedy);

    }
    
    public static float[] getNumbers(float[] numbers){

        for(byte i = 0; i < LENGTH_ARRAY; i++){

            System.out.print("Ingresa la " + (i + 1) + " altura de la persona en cm: ");
            numbers[i] = stdin.nextFloat();
        }

        return numbers;
    }

    public static void showPromedy(float promedy){

        System.out.println("El promedio de edad es: " + promedy);
    }


    public static float calculatePromedy(float[] numbers){
        
        float promedy = 0;

        for(byte i = 0; i < LENGTH_ARRAY; i++){

            promedy += numbers[i];
        }

        promedy = promedy / LENGTH_ARRAY;

        return promedy;
    }

    public static void showNumbersEntered(float[] numbers){

        for(byte i = 0; i < LENGTH_ARRAY; i++){

            System.out.println("Altura " + (i + 1) + ": " + numbers[i]);
        }
    }

    public static void showHightLargest(byte upPromedy){

        System.out.println("Los mayores al promedio de edades son: " + upPromedy);
    }


    public static void showHightSmallest(byte downPromedy){

        System.out.println("Los menores al promedio de edades son: " + downPromedy);
    }

    public static byte calculateUpPromedy(float promedy, float[] numbers){

        byte upPromedy = 0;

        for(float number: numbers){
            
            if(number > promedy){
                upPromedy++;
            }
            
        }
        return upPromedy;
    }

    public static byte calculateDownPromedy(float promedy, float[] numbers){

        byte downPromedy = 0;

        for(float number: numbers){
            
            if(number < promedy){
                downPromedy++;
            }
            
        }
        return downPromedy;
    }

}
