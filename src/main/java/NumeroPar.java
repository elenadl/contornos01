import java.util.*;


public class NumeroPar {
    public static boolean ePar(int numero){
        boolean resposta=false;
        if (numero%2==0){
            resposta=true;
        }else{
            resposta=false;
        }
        return resposta;
    }
 
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Primera línea añadida ");
        System.out.println("Segunda línea añadida ");
        System.out.println("Introduce un número: ");
        int num=in.nextInt();
        System.out.println(ePar(num));
    }
}
