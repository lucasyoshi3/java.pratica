package EstruturaDeDados;

import java.util.*;
public class ex03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Insira o valor de N");
        int n=sc.nextInt();
        System.out.println(n+"!= ");
        System.out.println(fat(n));
    }
    public static int fat(int n){
        if (n>1){
            n=n*fat(n-1);
            return n;
        }
        return 1;
    }
}
