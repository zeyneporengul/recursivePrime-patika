package org.example;
import java.util.Scanner;
public class Main {

    static boolean isPrime(int val,int i){
        if(val<=2) {
            if (val == 2) {
                return true;
            }else{
                return false;
            }
        }
        if(val % i == 0){
            return false;
        }
        if(i*i > val){
            return true;
        }
        return(isPrime(val, i+1));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        int val = input.nextInt();

        if(isPrime(val,2)){
            System.out.println(val + " asaldır");
        } else{
            System.out.println(val + " asal değildir");
        }
    }
}