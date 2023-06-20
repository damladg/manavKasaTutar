import java.util.Scanner;

public class manavKasaTutar {
    public static void main(String[] args) {
        //Kullanıcıların manavdan almış oldukları ürünlerin
        //kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        //Meyveler ve KG Fiyatları:
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL

        double armut = 2.14;
        double elma= 3.67;
        double domates = 1.11;
        double muz= 0.95;
        double patlican= 5.00;

        Scanner scan = new Scanner(System.in);

        System.out.print("Armut kaç kilogram : ");
        armut = scan.nextDouble();

        System.out.print("Elma kaç kilogram : ");
        elma = scan.nextDouble();

        System.out.print("Domates kaç kilogram :");
        domates = scan.nextDouble();

        System.out.print("Muz kaç kilogram : ");
        muz = scan.nextDouble();

        System.out.print("Patlıcan kaç kilogram :");
        patlican = scan.nextDouble();

        double toplam = (armut*2.14 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5.00);
        System.out.println("Toplam Tutar: "+ toplam + "TL");





    }
}
