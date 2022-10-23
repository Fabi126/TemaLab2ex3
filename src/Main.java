import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Sammy’s makes it fun in the sun");
        int ore;
        int min;
        int pret;
        int pretminut;
        int total;
        System.out.println("Introduceti numarul de ore de inchiriere:");
        Scanner inputDevice = new Scanner(System.in);
         ore = inputDevice.nextInt();
        System.out.println("Introduceti numarul de minute extra:");
         min = pret=40;
         pretminut=1;
         total=(ore*pret)+(min*pretminut);
        System.out.println("Numarul de ore este : " + ore);
        System.out.println("Numarul de minute este : "+ min );
        System.out.println("Pretul total este de: "+ total +"dolari")  ;
    }
}