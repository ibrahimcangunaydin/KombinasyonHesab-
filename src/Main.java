import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r;
        int facN=1, facR=1,facNR=1;
        double combination;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz: ");
        n = inp.nextInt();
        System.out.print("Oluşturumak istenen alt kümelerin eleman sayısını giriniz: ");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            facN *=i;
        }
        for(int k=1;k<=r;k++){
            facR *=k;
        }
        for(int l=1;l<=(n-r);l++){
            facNR*=l;
        }

        combination = facN/(facR*facNR);

        System.out.println("C("+n+","+r+") kombinasyon değeri: "+combination);
    }
}
