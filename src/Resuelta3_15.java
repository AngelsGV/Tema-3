//Triangulo
import java.util.Scanner;
public class Resuelta3_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba n: ");
        int n = sc.nextInt();
        for (int fila = 1; fila <= n; fila++){
            for (int cool = fila; cool <= n; cool ++);{
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
