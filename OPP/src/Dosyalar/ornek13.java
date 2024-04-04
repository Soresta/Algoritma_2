package Dosyalar;

import java.io.File;
import java.io.FileWriter;

public class ornek13 {
    public static void main(String[] args) throws Exception {
        // •  Örnek 12de veli.txt dosyasına yazılan verileri silmeden güncelleme işlemi yaparak bilgi ekleme!
        //FileWriter
        File dosya = new File("veli.txt");
        FileWriter yazici = new FileWriter(dosya, true);//2 parametre true olması dosyanın üzeirne yazmadan
        //güncelleme işlemi olarak devamına yazma işlemi yapmak istersek veririz!
        yazici.write("Güncelleme işlemi yapıldı var olan bilgiler silinmeden!");
        yazici.close();
        //not: FileWriter true ifadesini guncelleme işlemini desteklerken printWriter desteklemez
        //ve printWriter println özeliiğini destekler! (file writerde bir sornaki satıra yazmak istersek /n kaçış ifadesi yazılmalı).
    }
}
