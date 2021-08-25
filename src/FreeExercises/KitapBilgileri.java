package FreeExercises;

import java.util.*;

public class KitapBilgileri {

    /*
    kitap no 1000 den baslıcak
    kitapno,adı,yazaradı,kitapfiatı
    prg baslayınca menu methodu calıssın kulacıyıa sorsun
    "1-kitap ekle
    numara ile kitap goruntule
    3-bilgi ile kıtap goruntule
    4-numara ile kitap sil
    5-tum kıtapları listele
     */

    static List<String> bookNameList=new ArrayList();
    static List<Integer> bookNoList=new ArrayList();
    static List<String> author=new ArrayList();
    static List<Double> bookPrice=new ArrayList();
    int counter=1003;
    String cvp="";
    static Scanner scan=new Scanner(System.in);

    static {
        bookNoList.addAll(Arrays.asList(1000,1001,1002));
        bookNameList.addAll(Arrays.asList("aaa","hhh","kkk"));
        bookPrice.addAll(Arrays.asList(22.4,33.5,44.2));
        author.addAll(Arrays.asList("mmm","mkkjh","llll"));


    }

    public String kitapEkle(){

        do {


        System.out.println("kitap adı giriniz");
            scan.next();
        String kitap=scan.nextLine();

        System.out.println("kitap yazar adı giriniz");
        String yazar=scan.nextLine();
        System.out.println("kitap fiyatını giriniz");
        Double price=scan.nextDouble();

        bookNoList.add(counter++);
        bookNameList.add(kitap);
        author.add(yazar);
        bookPrice.add(price);

        System.out.println("KİTAP NO\t KİTAP ADI\t YAZAR ADI\t KİTAP FİYATI ");
        System.out.println("****************************************************");
        System.out.println(counter+"\t\t\t"+kitap+"\t\t\t"+yazar+"\t\t\t"+price);
        System.out.println("****************************************************");

        System.out.println("kitabı basarı ile kaydettiniz");
        System.out.println("baska kayıt yapmak istiyor musunuz? : (E/H)");
        cvp=scan.next();
    }while (cvp.equalsIgnoreCase("E"));

        System.out.println("ana menuye ulasmak icin bir tusa basınız");

        return scan.next();

    }

        public String noIleGoruntule(){

        do {


            System.out.println("görüntülemek istediğiniz kitap no giriniz");
            int no=scan.nextInt();
           for (int w=0;w<bookNoList.size();w++){
               if (no==bookNoList.get(w)){
                   System.out.println(bookNameList.get(w)+"**** "+author.get(w)+"**** "+bookPrice.get(w));
               }
           }
            System.out.println("devam etmek istiyor musunuz (e/h)");
            String cvp=scan.next();
        }while (cvp.equalsIgnoreCase("e"));

            System.out.println("ana menuye donmek icin bir tusa basın");

            return scan.next();
        }

        public String  bilgiIleGoruntule(){
        do {


        System.out.println("icerisinde hangi ifadenin gectigi kayıtları goruntulemek istiyorsunuz?");
        Scanner scanner=new Scanner(System.in);
        String ifade=scanner.nextLine();
            for (int i=0;i<bookNameList.size();i++){
                if (bookNameList.get(i).contains(ifade)||author.get(i).contains(ifade)){
                    System.out.println(bookNoList.get(i)+" "+bookNameList.get(i)+" "+author.get(i)+" "+bookPrice.get(i));
                }
            }

            System.out.println("devam etmek istiyor musunuz (e/h)");
            cvp=scan.next();

        }while (cvp.equalsIgnoreCase("e"));

            System.out.println("ana menuye donmek icin bir tusa basın");

            return scan.next();
        }


        public String  KitapSil(){

        do {
            System.out.println("Silmek istediginiz kitabın numarasını girin");
            Scanner scanner=new Scanner(System.in);
            int num=scanner.nextInt();
            for (int i=0;i<bookNoList.size();i++){
                if(num==bookNoList.get(i)){
                    bookNoList.remove(bookNoList.get(i));
                }
            }
            System.out.println("devam etmek istiyor musunuz (e/h)");
            cvp=scan.next();

        }while (cvp.equalsIgnoreCase("e"));

            System.out.println("ana menuye donmek icin bir tusa basın");

            return scan.next();
            }

            public String KitapListele(){
        do {


                for (int i=0;i<bookNameList.size();i++){
                    System.out.println(bookNameList.get(i)+"  "+bookNoList.get(i)+"  "+author.get(i)+"  "+bookPrice.get(i));
                }

            System.out.println("devam etmek istiyor musunuz (e/h)");
            cvp=scan.next();
            }while (cvp.equalsIgnoreCase("e"));
                System.out.println("ana menuye donmek icin bir tusa basın");
                return scan.next();

            }

}
