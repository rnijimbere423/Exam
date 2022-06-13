import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> prodList = new ArrayList<>();
        prodList.add(new Computers("Lenovo","intel",2245,3));
        prodList.add(new Printers("HP ScanJet","HP",1145,3));
        prodList.add(new Scanners("CanoScan","lsla",3234,3));
        prodList.add(new Printers("Xerox","lsla",1634,3));
        prodList.add(new Computers("MacBook","Apple",1454,3));
        prodList.add(new Scanners("Fujitsu","lsla",12634,3));
        prodList.add(new Printers("Panasonic","lsla",11234,3));
        prodList.add(new Computers("HP","lsla",5634,3));
        prodList.add(new Scanners("HP","lsla",5634,3));
        prodList.add(new Printers("Lexmark","lsla",2134,3));


        for (Product prod:prodList){
            System.out.println(prod);
        }
    }
}
