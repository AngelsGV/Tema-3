import java.util.Scanner;
public class Resuelta3_5 {
    public static void main(String[] args){
        int operando1, operando2, resultado;
        int numeroOperaciones = 0;
        do{
            operando1 = (int)(Math.random()*100+1);
            operando2 = (int)(Math.random()*100+1);
            System.out.println(operando1 + "+" + operando2 + " = ");
            resultado = new Scanner(System.in).nextInt();
            numeroOperaciones ++;
        } while (resultado==operando1+operando2);
        System.out.println("Ha conseguido realizar: " + (numeroOperaciones -1) + " sumas consecutivas.");

        }
    }

