package studentclass.seyma;

public class Array2 {
    /*
               Verilen diziler ile:
            String [] names = {"Anna", "Nancy", "Sarah"};
             int [] scores = {90, 75, 80};
             char [] grades = new char[names.length];
         1. öğrencilerin notlarını notlar adlı dizide saklayabilecek bir program yazınız.
         2. Her öğrencinin not raporunu ayrı satırlarda yazdırın
             Ex:
                Anna'nın puanı 90 ve notu A
    */

    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        for (int i=0; i< names.length;i++){
            String name=names[i];
            int scor=scores[i];
            String not="";
            if(scor<=100&&scor>=90){
                 not="A";

            }else if(scor>=80){
                 not="B";
            }else if(scor>=65){
                not="c";
            }
            System.out.println(name+"in puan= "+scor+"  sonucu= "+ not);
            System.out.println();
        }

    }

}
