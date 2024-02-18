import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //degiskenleri tanimladi
        int sayi1 , sayi2 ,sonuc,islemNo;
        //veri girişi için scanner nesnesi tanimladik
            Scanner girdi = new Scanner(System.in);
            //kullanicidan girdi aldık
        System.out.print("Bir sayi giriniz: ");

            sayi1= girdi.nextInt();

        System.out.print("Bir sayi giriniz: ");

            sayi2= girdi.nextInt();;

        System.out.println("Toplama : 1\n"+"Çıkarma : 2\n"+"Çarpma : 3\n"+"Bölme : 4");
        System.out.print("İşlem numaranizi giriniz: ");

        islemNo= girdi.nextInt();
        //islem no ile kullanicinin girdigi sayıyı switch case ile kontrol ederek
            // eşit olan case durumundaki kod blogu calıstı
        switch(islemNo) {
            case 1 :
                sonuc=(sayi1+sayi2);
                System.out.println("İsleminizin sonucu : "+sonuc);
                break;
            case 2 :
                sonuc=(sayi1-sayi2);
                System.out.println("İsleminizin sonucu : "+sonuc);
                break;
            case 3 :
                sonuc=(sayi1*sayi2);
                System.out.println("İsleminizin sonucu : "+sonuc);
                break;
            case 4 :
                sonuc=(sayi1/sayi2);
                System.out.println("İsleminizin sonucu : "+sonuc);
                break;
            default:
                System.out.println("Geçersiz islem no : "+islemNo);
        }


    }
}