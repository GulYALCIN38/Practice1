package exeptionnn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exeption04 {
    public static void main(String[] args) {
        // bir metnin 3. satirini oku
        dosyaokuma();
    }
    public static void dosyaokuma(){

        try {
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ASUS\\IdeaProjects\\JawaDersleri\\Practice1\\src\\main\\java\\exeptionnn\\dosya"));
        String line=br.readLine();
        int i=1;
        while(line!=null){
            i++;
            line=br.readLine();
            if(i==3){
            System.out.println(line);
            break;
            }

        }

        } catch (FileNotFoundException e) {
            System.out.println("dosta silinmis olabilir ya da adres yok");
        } catch (IOException e) {
            System.out.println("tanimsiz karakter var");
        }
    }
}
