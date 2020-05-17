import maszyny.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maszyny
{
    public static void main(String[] args) 
    {
        // Zadanie 1
        Maszyna maszyna = new Maszyna("Samsung","RF24FSEDBSR", 1500);
        System.out.println(maszyna.toString());
        
        Lodowka lodowka = new Lodowka("Samsung", "RF24FSEDBSR", 1500, 348,"w dolnej części urządzenia");
        System.out.println(lodowka.toString());
        
        Kuchenka kuchenka = new Kuchenka("BEKO", "CSM 67300 GX", 1000, "Elektryczna", 4);
        System.out.println(kuchenka.toString());
        
        // Zadanie 1: Konstruktor klasy bazowej wykonuje się w pierwszej kolejności.

        //Aby uruchomić zadanie drugie należy usunąć "//" przed poniższą metodą.:

        //Z2();

        //Aby uruchomić zadanie trzecie należy usunąć "//" przed poniższą metodą.:

        //Z3();

        //Zadanie 3: Mimo typu obiektu klasy bazowej wywołują się metody z klas podrzędnych przypisane do obiektów.
    }
    
    static void Z2()
    {
        List<Maszyna> maszyny = new ArrayList<>();

        maszyny.add(new Kuchenka("BEKO", "CSM 67300 GX", 1200, "Elektryczna", 4));
        maszyny.add(new Kuchenka("BEKO", "CSM 67300 GX", 1000, "Elektryczna", 4));
        maszyny.add(new Kuchenka("BEKO", "CSM 67300 GX", 1500, "Elektryczna", 4));

        //Sortowanie po cenie w górę:
        Collections.sort(maszyny);
        
        for (Maszyna maszyna : maszyny)
            System.out.println(maszyna.toString());
        //Sortowanie po cenie w dół:
        Collections.reverse(maszyny);
        
        for (Maszyna maszyna : maszyny)
            System.out.println(maszyna.toString());
    }
    static void Z3()
    {
        Maszyna maszyna1 = new Maszyna("Samsung","RF24FSEDBSR", 1500);
        System.out.println(maszyna1.toString());

        Maszyna lodowka1 = new Lodowka("Samsung", "RF24FSEDBSR", 1500, 348,"w dolnej części urządzenia");
        System.out.println(lodowka1.toString());

        Maszyna kuchenka1 = new Kuchenka("BEKO", "CSM 67300 GX", 1000, "Elektryczna", 4);
        System.out.println(kuchenka1.toString());
    }
}