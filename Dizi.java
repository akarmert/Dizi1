
import java.util.Scanner;


public class Dizi {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz: ");
        int N = input.nextInt();
        int[] tamsayi = new int[N];
        int toplam = 0;
        int carpim = 1;
        for (int i = 0; i <= tamsayi.length - 1; i++) {
            System.out.print(i + " Indisli eleman: ");
            tamsayi[i] = input.nextInt();
            toplam = toplam + tamsayi[i];
            carpim *= tamsayi[i];
        }
        double ortalama = (double) toplam / tamsayi.length; // int'i int'e bölersek küsüratlı soonuc elde edemeyiz bu yüzden (double) yazıyolurz
        int min = tamsayi[0];
        int max = tamsayi[0];
        for (int i = 1; i <= tamsayi.length - 1; i++) {
            if (min > tamsayi[i]) {
                 min = tamsayi[i];
            }
            if (max < tamsayi[i]) {
                 max = tamsayi[i];
            }
        }
        int ortanca = tamsayi.length/2;
        // elemanları kucukten buyuge sıralama
        
        
        System.out.println("Ortadaki eleman = " +ortanca);
        System.out.println("Ortanca indis " +ortanca);
        System.out.println("En buyuk tamsayi = " +max);
        System.out.println("En kucuk tamsayi = " +min);
        System.out.println("Indislerin toplami = " +toplam);
        System.out.println("Dizideki eleman sayisi = " +tamsayi.length);
        System.out.println("Ortalama = " +ortalama);
        System.out.println("Carpimlari = " +carpim);
        
    }
    
}
