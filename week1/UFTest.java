import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UFTest {
    public static void main(String[] args) {
        File file = new File("./UFtestfile.txt");
        UF uf;
        try {
            Scanner scan = new Scanner(file);
            uf = new UF(scan.nextInt());
            while (scan.hasNext()) {
                uf.quickUnion(scan.nextInt(), scan.nextInt());
            }
            System.out.println(uf.isConnected(1, 2)); // true
            System.out.println(uf.isConnected(1, 3)); // true
            System.out.println(uf.isConnected(3, 5)); // false
            System.out.println(uf.isConnected(1, 9)); // false
            System.out.println(uf.isConnected(8, 9)); // true
            System.out.println(uf.isConnected(7, 2)); // false
            System.out.println(uf.isConnected(6, 5)); // true

        } catch (FileNotFoundException e) {

        }
    }
}
