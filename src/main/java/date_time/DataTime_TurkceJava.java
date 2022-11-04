package date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DataTime_TurkceJava {
    public static void main(String[] args) {
//        1) Ali'nin kaç gün yaşadığını bulan kodu yazınız.
//        Ali'nin doğum tarihi 12 Mayıs 2002'dir.
       LocalDate ali=LocalDate.of(2002,5,12);
      LocalDate myDate=LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(ali, myDate));//7469



//        3) Ali'nin doğum tarihi 4 Haziran 1997'dir. Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün
//        sonraki tam tarihi bulmak için kodu yazınız.
        LocalDate alidogum=LocalDate.of(1997,6,4);
        System.out.println(alidogum.plusYears(2).plusMonths(3).plusDays(12));//1999-09-16
        System.out.println(alidogum.equals(ali));

        //7) Belirli bir tarihte yılın son 2 hanesini alınız.
        LocalDate tarih = LocalDate.of(1985, 12, 9);
        int soniki = tarih.getYear() % 100;
        System.out.println(soniki);

        boolean artikyilmi=tarih.isLeapYear();//
        System.out.println("artikyilmi = " + artikyilmi);

        //9) İki farklı tarihin ay numaralarının toplamını bulunuz.

//        Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de
//        doğmuştur. Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark
//        nedir?

        /*Eğer saat
        i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
                ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
                iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
                iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.*/
//        Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de
//        doğmuştur. Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark
//        nedir?
        LocalDateTime alis=LocalDateTime.of(2015,2,5,10,00);
        ZonedDateTime yerelalis=alis.atZone(ZoneId.of("Europe/Istanbul"));
        LocalDateTime mark=LocalDateTime.of(2015,2,5,10,00);
      ZonedDateTime  markyeni= mark.atZone(ZoneId.of("America/New_York"));

        long dif=ChronoUnit.HOURS.between(yerelalis, markyeni);
        System.out.println("dif = " + dif);


    }
}
