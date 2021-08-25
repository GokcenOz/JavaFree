package FreeExercises;

import java.util.Scanner;

public class mainKitap{
    static int secim;

    public static void main(String[] args) {
        KitapBilgileri k=new KitapBilgileri();
        Scanner scan=new Scanner(System.in);



        do {
        menu();
        switch (secim){
            case 1:
                k.kitapEkle();
                break;
            case 2:
                k.noIleGoruntule();
                break;

            case 3:
                k.bilgiIleGoruntule();
                break;
            case 4:
                k.KitapSil();
                break;
            case 5:
                k.KitapListele();
                break;
            case 6:
                System.out.println("iyi gunler");
                break;
        }

    }while (secim!=6);

    }

    public static void menu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("====ANA MENU====");
        System.out.println("1-Kitap eklemek icin \n2-Numara ile kitap görüntülemek icin \n3-Bilgi ile kitap görüntülemek icin \n4- Numara ile kitap sil" +
                "\n5-tum kitapları listele \n 6-CIKIS");


        System.out.println("Secimi giriniz");
        secim=scan.nextInt();
    }
}
