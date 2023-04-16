import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayısını Girimiz : ");
        int a1= input.nextInt();

        System.out.print("n2 Sayısını Girimiz : ");
        int a2= input.nextInt();
        int n1,n2;
        if (a1>a2){
            n1=a2;
            n2=a1;
        }else{
            n1=a1;
            n2=a2;
        }
        int ebob =1;
        int ekok ;
        /*for (int k =n1 ; 1<k;k--){
            if (n1%k==0 && n2%k==0){
                ebob =k;
                System.out.println("En Büyük Ortak Bölen : " + ebob);
                break;
            }
        }
        for (int i =1; i<=(n1*n2);i++){
            if (i%n1==0 && i%n2==0){
                System.out.println("En Küçük Ortak Bölen " +i);
                break;
            }
        }*/

        int k=n1;
        while (1<k){
            if (n1%k==0 && n2%k==0){
                ebob =k;
                System.out.println("En Büyük Ortak Bölen : " + ebob);
                break;
            }
            k--;
        }
        int i =1;
        while (i<=(n1*n2)){
            if (i%n1==0 && i%n2==0){
                System.out.println("En Küçük Ortak Bölen " +i);
                break;
            }
            i++;
        }


    }
}













