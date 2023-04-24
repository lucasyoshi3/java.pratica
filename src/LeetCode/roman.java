/* Given a roman numeral, convert it to an integer. */
package LeetCode;

import java.util.*;
public class roman {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            System.out.println(romanToInt(s));
        }
        public static int romanToInt(String s) {
            char [] roman = null;
            roman=s.toCharArray();
            int limit=0;
            int sum=0,j;
            int []number=new int[roman.length];
            String str;
            for(j=0;j<=roman.length-1;j++){
                str=String.valueOf(roman[j]);
                switch(str){
                    case "I":
                        number[j]=1; break;
                    case "V":
                        number[j]=5; break;
                    case "X":
                        number[j]=10; break;
                    case "L":
                        number[j]=50; break;
                    case "C":
                        number[j]=100; break;
                    case "D":
                        number[j]=500; break;
                    case "M":
                        number[j]=1000; break;
                }
            }
            sum=number[0];
            if(roman.length-1>0){
                if(number[0]<number[1]){
                    sum=number[1]-number[0];
                    limit=1;
                }
                for(j=roman.length-1;j>limit;j--){
                    if(number[j]<=number[j-1]){
                        sum=sum+number[j];
                    }
                    if(number[j-1]<number[j]){
                        sum=sum+(number[j]-number[j-1]);
                        j=j-1;
                    }
                }
                return sum;
            }
            return sum;
        }
}
