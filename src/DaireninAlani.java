import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        /*
        *
        * Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanını bulan program.
        *
        * pi = 3.14
        *
        * A = (pi * (r*r) * a) / 360
        *
        * */
        Scanner input = new Scanner(System.in);
        double r, a, area;
        System.out.print("Yarıçap giriniz: ");
        r = input.nextDouble();
        System.out.print("Merkez açısını giriniz: ");
        a = input.nextDouble();
        area = (3.14 * (r * r) * a) / 360;
        System.out.print(area);
    }
}
