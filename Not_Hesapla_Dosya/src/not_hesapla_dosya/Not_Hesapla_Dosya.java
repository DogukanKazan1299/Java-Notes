package not_hesapla_dosya;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Not_Hesapla_Dosya {

    private static String harfNotuHesapla(String isim, int vize1, int vize2, int finalNotu) {

        String cikti = "";
        double ortalama = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalNotu * 4 / 10.0);

        if (ortalama >= 90) {
            System.out.println(isim + " dersten AA aldı");

        } else if (ortalama >= 80) {
            System.out.println(isim + " dersten BA aldı");
        } else if (ortalama >= 70) {
            System.out.println(isim + " dersten BB aldı");
        } else if (ortalama >= 65) {
            System.out.println(isim + " dersten CB aldı");
        } else if (ortalama >= 57) {
            System.out.println(isim + " dersten CC aldı");
        } else if (ortalama >= 55) {
            System.out.println(isim + " dersten DC aldı");
        } else {
            System.out.println(isim + " dersten FF aldı");
        }

        return cikti;

    }

    public static void main(String[] args) {

        try(Scanner s = new Scanner(new FileReader("dosya.txt"));
                FileWriter writer = new FileWriter("hartnotları.txt")){
            
            while(s.hasNextLine()){
                String ogrenciBilgileri = s.nextLine();
                
                String[] ogrenciArray=ogrenciBilgileri.split(",");
                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalNotu = Integer.valueOf(ogrenciArray[3]);
                
                String yaz = harfNotuHesapla(ogrenciArray[0], vize1, vize2, finalNotu);
                writer.write(yaz + "\n");
            }

        } catch(FileNotFoundException e){
            System.out.println("hATA");
        } catch (IOException ex) {
            System.out.println("Ioexception hatası....");
        }
        }

    }
