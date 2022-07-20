import java.util.Scanner;
import java.util.SortedMap;

public class main {
    public static void main(String[] args) {
        int age,yTipi;
        double distance,price,toplam,discount,tPrice;
        boolean isError = false;
        price =0.10;
        Scanner input =new Scanner(System.in);

        System.out.print("Mesafe Giriniz (KM) : ");
        distance=input.nextDouble();
        System.out.print("Yaşınızı Giriniz : ");
        age=input.nextInt();
        System.out.print("1- Tek Yön \n 2- Gidiş-Dönüş \n Yolculuk Tipini Seçiniz : ");
        yTipi=input.nextInt();

        if ((distance>0) && (age >=0 && age <= 180) && (yTipi>0 && yTipi <=2)) {
            toplam = distance * price;
            System.out.println("Toplam Tutar = " + toplam + " TL");

            if (age < 12){
                if (yTipi == 1){
                    discount = (toplam*50)/100;
                    tPrice=toplam - discount;
                    if (tPrice > 0){
                        System.out.println("İndirim Tutarı :"+discount + " TL");
                        System.out.println("İn.Tutar = "+tPrice + " TL");
                    }else {
                        isError=true;
                    }
                }else{
                    discount = ((toplam*50)/100) + ((toplam*20)/100);
                    tPrice=toplam - discount;
                    if (tPrice > 0){
                        System.out.println("İndirim Tutarı :"+discount + " TL");
                        System.out.println("İn.Tutar = "+tPrice + " TL");
                    }else {
                        isError=true;
                    }

                }

            } else if (age >= 12 && age <= 24) {
                if (yTipi == 1){
                    discount = (toplam*10)/100;
                    tPrice=toplam - discount;
                    if (tPrice > 0){
                        System.out.println("İndirim Tutarı :"+discount + " TL");
                        System.out.println("İn.Tutar = "+tPrice + " TL");
                    }else {
                        isError=true;
                    }
                }else{
                    discount = ((toplam*10)/100) + ((toplam*20)/100);
                    tPrice=toplam - discount;
                    if (tPrice > 0){
                        System.out.println("İndirim Tutarı :"+discount + " TL");
                        System.out.println("İn.Tutar = "+tPrice + " TL");
                    }else {
                        isError=true;
                    }

                }
            }else if (age > 65){

                if (yTipi == 1){
                    discount = (toplam*30)/100;
                    tPrice=toplam - discount;
                    if (tPrice > 0){
                        System.out.println("İndirim Tutarı :"+discount + " TL");
                        System.out.println("İn.Tutar = "+tPrice + " TL");
                    }else {
                        isError=true;
                    }
                }else{
                    discount = ((toplam*30)/100) + ((toplam*20)/100);
                    tPrice=toplam - discount;
                    if (tPrice > 0){
                        System.out.println("İndirim Tutarı :"+discount + " TL");
                        System.out.println("İn.Tutar = "+tPrice + " TL");
                    }else {
                        isError=true;
                    }

                }
            }else {
                if (yTipi == 2){
                    discount = ((toplam*20)/100);
                    tPrice=toplam - discount;
                    if (tPrice > 0){
                        System.out.println("İndirim Tutarı :"+discount + " TL");
                        System.out.println("İn.Tutar = "+tPrice + " TL");
                    }else {
                        isError=true;
                    }
                }
            }

        }else {
            isError=true;
        }

        if (isError){
            System.out.println("Hatalı Giriş Yaptınız...");
        }



    }
}
