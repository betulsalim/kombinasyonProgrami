import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n,i,total=1,r,j,total1=1,b,k,total3=1,sonuc;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayıyı giriniz: ");
        n = input.nextInt();

        System.out.println("Sayıyı giriniz: ");
        r = input.nextInt();
       for (i=1; i<= n ; i++){
           total = total * i;

       }
        System.out.println("n!: "+total);

       for (j=1;j<=r;j++){
           total1 =total1 *j;
       }
    System.out.println("r!: "+total1);
        b=n-r;
        for (k=1;k<=b;k++){
            total3 =total3 * k;
        }
        System.out.println("(n-r)!: "+total3);


        sonuc =(total) / ((total1)*total3);
        System.out.println("Kombinasyon sonucu: "+sonuc);
    }



}
