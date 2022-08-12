import java.util.Scanner;

public class Main {

    static void asal(int a){

        int sayac=0;

        for(int i=1 ; i<=a ; i++){

            if(a % i ==0){

                sayac++;
            }
        }
        if(sayac==2){

            System.out.println(a +" Asal sayıdır.");
        }
        else{
            System.out.println(a + " Asal sayı değildir.");
        }

    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int number=input.nextInt();

        asal(number);

    }

}