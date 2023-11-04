//El número secreto
import java.util.Scanner;
public class Resuelta3_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numSecreto = (int)(Math.random() * 100 + 1);
        System.out.println("Introduzca un número: ");
        int num = sc.nextInt();
        while (num != numSecreto && num != -1){
            if (numSecreto < num){
                System.out.println("Es mayor al número secreto." );
            }else{
                System.out.println("Es menor al número secreto.");
            }
            System.out.println("Introduzca otro número: ");
            num = sc.nextInt();
        }
        if (num == numSecreto){
            System.out.println("El número secreto era: " + num);
        } else {
            System.out.println("El número secreto era: " + numSecreto + ". Otra vez será...");
        }
    }
}
