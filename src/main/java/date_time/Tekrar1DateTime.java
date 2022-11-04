package date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Tekrar1DateTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        LocalDateTime s=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(s);

        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate bugun=LocalDate.of(2022,10,22);
       LocalDate emeklitarih =bugun.plusDays(789);
        System.out.println("emeklitarih = " + emeklitarih);//emeklitarih = 2024-12-19

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate ali=LocalDate.of(2005,10,3);
        LocalDate vali=LocalDate.of(2009,9,10);
        System.out.println(ChronoUnit.DAYS.between(ali, vali));

        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate dogumGunu = LocalDate.of(1985, 11, 27);
        int day= dogumGunu.getDayOfMonth();
        int  ay=dogumGunu.getMonthValue();
        if(day<21&&ay==12||day<20&&ay==11){}

        //Example 1: Java'dan aldiginiz Date'i "ay/gun/yil" olarak yaziniz
        LocalDate currentDate=LocalDate.now();
        System.out.println("currentDate = " + currentDate);//2022-12-22

       DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MMMM/d/yyyy");
       String formattDtae1= dtf1.format(currentDate);

       // //Example 2: Java dan aldiginiz time'in formatini degistiriniz
        LocalTime zaman=LocalTime.now();
        System.out.println("zaman = " + zaman);
        DateTimeFormatter yenistil=DateTimeFormatter.ofPattern("hh:mm a");
        String zamanformat=yenistil.format(zaman);
        System.out.println("zamanformat = " + zamanformat);

        ////Example 1: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz
        LocalTime japan=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime france=LocalTime.now(ZoneId.of("Europe/Berlin"));
        Long fark=ChronoUnit.HOURS.between(france,japan);
        System.out.println("fark = " + fark);

        //Example 2: Sabit bir tarih olusturunuz
        LocalDate simdi=LocalDate.of(2022, Month.JANUARY,11);

        Sehirler sehir=Sehirler.Istanbul;
        switch (sehir){

            case Istanbul:
                System.out.println("guzel");
        }







    }
}
