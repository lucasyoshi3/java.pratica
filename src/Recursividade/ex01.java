package Recursividade;

import java.util.*;
public class ex01{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(somatoria(n));
    }
    public static int somatoria(int n){
        if(n<0){
            return 0;
        }
        if(n!=1){
            n=n+somatoria(n-1);
            return n;
        }
        return 1;
    }
}